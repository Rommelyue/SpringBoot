package com.zkr.Service;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import com.zkr.Mapper.UserMapper;
import com.zkr.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;



/**
 * @author Rommelyue
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Resource
	private RedisTemplate<String, User> redisTemplate;
	
	@Override
	public User findById(Integer id) {
		String key="user";
		boolean hasKey = redisTemplate.hasKey(key);
		if (hasKey) {
			// 从缓存中取
            User user = redisTemplate.opsForValue().get(key);
            System.out.println("获得了用户从缓存中!!!");
            return user;
        }
		User user=userMapper.findById(id);
		redisTemplate.opsForValue().set(key, user, 600, TimeUnit.SECONDS);
		return user;
	}

}

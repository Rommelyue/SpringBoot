package com.zkr.Service;


import com.zkr.Pojo.User;

public interface UserService {
//    public UserResult find();

      /**
       * 通过id寻找用户
       * @param id
       * @return
       */
      public User findById(Integer id);
}

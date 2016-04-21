/**
 * 
 */
package com.hhit.basetrain.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hhit.basetrain.dao.UserDao;
import com.hhit.basetrain.entity.Result;
import com.hhit.basetrain.entity.User;
import com.hhit.basetrain.service.UserService;

/**
 * @author Jiya
 * @date 2016-4-17t����01:40:24
 * TODO
 */
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;

	/* (non-Javadoc)
	 * @see com.hhit.basetrain.service.UserService#ckeckIn(java.lang.String, java.lang.String)
	 */
	public Result ckeckIn(String username, String password) {

		Result result = new Result();
		User user = userDao.findByName(username);
		
		if(user == null){
			
			result.setMsg("���û������ڣ�");
			result.setStatus(0);
			return result;
			
		}else if(!user.getUpwd().equals(password)){
			
			result.setMsg("�������");
			result.setStatus(1);
			return result;
			
		}else{
			result.setMsg("��½�ɹ���");
			result.setStatus(2);
			result.setData(user);
			return result;
		}
	}

}

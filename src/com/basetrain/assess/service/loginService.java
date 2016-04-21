/**
 * 
 */
package com.basetrain.assess.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

/**
 *@author hulijie
 * @date 2016-4-13t下午03:08:36
 * TODO
 */
@Service
public class loginService {

	/**
	 * @param loginPageUrl
	 * @param successPageUrl
	 * @param uname
	 * @param upasswd
	 * @return
	 */
	public ModelAndView doLogin(String loginPageUrl, String successPageUrl,
			String uname, String upasswd) {
		if(uname == null || "".equals(uname)){
			return new ModelAndView(loginPageUrl,"error","用户名不能为空！");
		}
		if(upasswd == null || "".equals(upasswd)){
			return new ModelAndView(loginPageUrl,"error","密码不能为空！");
		}
		if(uname.equals("admin")&& upasswd.equals("123")){
			return new ModelAndView(successPageUrl);
		}
		return new ModelAndView(loginPageUrl,"error","用户名或密码错误!");
		
	}

}

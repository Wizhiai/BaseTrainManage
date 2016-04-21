/**
 * 
 */
package com.BaseTrainManage.assess;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.basetrain.assess.service.loginService;

/**
 *@author hulijie
 * @date 2016-4-13tÏÂÎç01:27:47
 * TODO
 */
@Controller
public class LoginController {
	@Resource
	loginService service;
	
	@Resource
	HttpServletRequest request;
	
	@RequestMapping("index")
	
	public ModelAndView toLoginPage(){
		return new ModelAndView("jsp/Login.jsp");
	}
	
	@RequestMapping("login.do")
	
	public ModelAndView doLogin(){
	
	String loginPageUrl = "jsp/Login.jsp";
	String successPageUrl = "jsp/success.jsp";
	
	String uname = request.getParameter("uname");
	String upasswd = request.getParameter("upasswd");
		return service.doLogin(loginPageUrl, successPageUrl, uname, upasswd);
	}
	
}

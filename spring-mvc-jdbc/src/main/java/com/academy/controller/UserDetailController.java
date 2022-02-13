package com.academy.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.academy.model.UserDetail;
import com.academy.service.UserDetailService;

/**
 * 
 * Controller Class. The @Controller annotation is used to indicate that this
 * class serves the role of controller. It marks the class as a web request
 * handler.
 *
 */

@Controller
//@RequestMapping Annotation used to map web requests onto specific handler classes and/or handler methods.
@RequestMapping("/")
public class UserDetailController {

	@Autowired
	private UserDetailService userDetailService;

	/*
	 * This method will display the data of a particular user based on the id of the
	 * user that is being passed in the URI in the user.jsp page (Due
	 * to @PathVariable annotation being used in the method)
	 */
	@RequestMapping()
	public String getUserDetail() {
		
		return "user";
	}

	/*
	 * This method will display the details of all users present in the table in the
	 * users.jsp page
	 */
	
	public String getUsersDetails(ModelMap userModel) {
		userModel.addAttribute("userDetail", userDetailService.getAllUserDetail());
		return "users";
	}

	/*
	 * This method will simply go the add.jsp page when we put /addUser in the URL
	 */
	@RequestMapping()
	public String addPage() {
		return "add";
	}

	/*
	 * add.jsp have a form with POST action and the RequestParam can map the values
	 */
	@RequestMapping(, method =)
	public String addUser(, ModelMap userModel) {
		
		int resp = userDetailService;
		if (resp > 0) {
			userModel.addAttribute("msg", "User with id : " + resp + " added successfully.");
			userModel.addAttribute("userDetail", userDetailService.getAllUserDetail());
			return "users";
		} else {
		
			return "add";
		}
	}

	/*
	 * This method will delete a user that is selected based on the user's id.
	 * Following deletion, the users.jsp page is displayed and the appropriate msg
	 * will be displayed (Whether deletion is successful or not)
	 */
	@RequestMapping()
	public String deleteUser(@PathVariable("id") int id, ModelMap userModel) {
		
		return "users";
	}

	/*
	 * This method will load the update.jsp page where the details of the user who
	 * will be updated is displayed
	 */
	@RequestMapping()
	public String updatePage(@PathVariable("id") int id, ModelMap userModel) {
		
		return "update";
	}

	/*
	 * This method will update the details of the user based on the modification
	 * being done on the update.jsp page (@RequestParam annotation being used: read
	 * the form data and bind it automatically to the parameter present in the
	 * provided method.) If update is successful, the page users.jsp is displayed
	 * with a msg saying "updated successfully" If update failed, the page
	 * update.jsp is displayed with a msg saying "update failed"
	 */
	@RequestMapping()
	public String updateUser() {
		
	}

	/**
	 * Exception Handling method
	 * 
	 */
	@ExceptionHandler(IllegalArgumentException.class)
	  

}
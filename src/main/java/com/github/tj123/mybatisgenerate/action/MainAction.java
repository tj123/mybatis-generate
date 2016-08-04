package com.github.tj123.mybatisgenerate.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by TJ on 2016/8/4.
 */
@Controller
@RequestMapping
public class MainAction {
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
}

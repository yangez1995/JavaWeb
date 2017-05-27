package com.ucs.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ucs.model.OrdinaryUser;
import com.ucs.service.IOrdinaryUserSelectService;

@Controller
public class OrdinaryUserSelectController {
	@Autowired
	private IOrdinaryUserSelectService ordianryUserSelectService;
}

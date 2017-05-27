package com.ucs.security;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class AccessDeniedHandlerImpl implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest req, HttpServletResponse resp, AccessDeniedException reason)
			throws IOException, ServletException {
		boolean isAjax = "XMLHttpRequest".equals(req.getHeader("X-Requested-With"));
		if(isAjax) {
			String json = "{\"what\":403,\"object\":\"AUTHORITY_ERROR\"}";
			resp.setContentType("application/json");
			PrintWriter out = resp.getWriter();
			out.print(json);
			out.flush();
			out.close();
			return;
		} else {
			resp.sendRedirect(req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + req.getContextPath() + "/noAuth");
		}

	}

}

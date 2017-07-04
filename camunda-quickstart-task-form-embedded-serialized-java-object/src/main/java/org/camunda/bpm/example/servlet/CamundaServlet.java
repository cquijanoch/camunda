package org.camunda.bpm.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.engine.ProcessEngine;

public class CamundaServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter  out = res.getWriter();
		
		String param = req.getParameter("id");
		
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("name", "John");
		
		ProcessEngine processEngine2 = BpmPlatform.getProcessEngineService().getProcessEngine("default");
	   
	    processEngine2.getRuntimeService().startProcessInstanceByKey(param, variables);
	    out.println("<HTML><HEAD><TITLE>Leyendo parámetros</TITLE></HEAD>");
	    out.println("<BODY BGCOLOR=\"#CCBBAA\">");
	    out.println("Proceso: " + param + " has been started successfully");
	    out.println("</BODY></HTML>");
		out.close();
		
	}
	
}

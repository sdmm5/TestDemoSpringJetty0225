package com.ptteng.controller;

import com.ptteng.dao.EmployeeDao;
import com.ptteng.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by maweijiang on 2017/2/25.
 */
@Controller
public class EmployeeController {

    @Resource
    private EmployeeDao dao;

    @RequestMapping(value = "/check",method = RequestMethod.GET)
    public String getAllEmployee(ModelMap modelMap) throws Exception {
        List<Employee> employees = dao.getAllEmployee();
        modelMap.addAttribute("employees",employees);
        return "check";
    }

    @RequestMapping(value="/date",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getDate(HttpServletResponse response) throws IOException{
        SimpleDateFormat temp = new SimpleDateFormat("yyyy-MM-dd");
        String datetime = temp.format(new java.util.Date());
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("date:",datetime);
        return map;
    }

    @RequestMapping(value = "/getAllStudent",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getAllStudent(HttpServletResponse response) throws IOException{
        List<Employee> employees = dao.getAllEmployee();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("date",employees);
        return map;
    }

}

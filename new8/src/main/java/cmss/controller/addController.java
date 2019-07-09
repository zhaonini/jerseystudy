package cmss.controller;

import cmss.dao.DepartmentDao;
import cmss.dao.EmployeeDao;

import cmss.model.Department;
import cmss.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("add")
public class addController {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String addHtml() {
        employeeDao.save(new Employee(1001, "E-AA", "aa@163.com", 1, new Department(101, "D-AA")));
        System.out.print(employeeDao.getAll());
        return "<html> " + "<title>" + "Hello Jersey" + "</title>"+ "<body><h1>" + "add success" + "</body></h1>" + "</html> ";
    }
}
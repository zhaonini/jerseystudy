package cmss.controller;

import cmss.dao.DepartmentDao;
import cmss.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ser")
public class searchcontroller {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String searHtml() {
        System.out.print(employeeDao.get(1003));
        return "<html> " + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + "search success" + "</body></h1>" + "</html> ";
    }
}
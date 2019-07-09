package cmss.controller;

import cmss.dao.DepartmentDao;
import cmss.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("del")
public class deletecontroller {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String delHtml() {
        employeeDao.delete(1001);
        System.out.print(employeeDao.getAll());
        return "<html> " + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + "del success" + "</body></h1>" + "</html> ";
    }
}

package myApp;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Path: http://localhost:8080/j3moduleServer/rest/modules
 * @Path: http://localhost:8080/j3moduleServer/rest/modules/{moduleID}
 */
@Path("/modules")
public class ModuleResource {

	@GET
	@Produces( {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON} )
	public List<Module> getModules(){
		return ModuleDAO.instance.getModules();
	}
	
	@GET
	@Produces( {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON} )
	@Path("/{id}")
	public Module getModule(@PathParam("id") int id){
		return ModuleDAO.instance.getModule(id);
	}

	// POST needs to Produce (give) and Consume (take) 
	@POST
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Module addModule(Module m) {
		// Normally add data to db but we will only print data atm
		System.out.println(m);
		return m;
	}
}

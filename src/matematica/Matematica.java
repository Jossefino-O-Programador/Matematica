package matematica;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


 
@Path("/matematica")
public class Matematica {
 
	
 
	@GET
	@Path("/subtrair")
	public String subtrair(
			@QueryParam("primeiro") int primeiro,
			@QueryParam("segundo") int segundo) {
		int resultado = primeiro - segundo;
		return Integer.toString(resultado);	
	}

	@GET
	@Path("/adicionar")
	public String adicionar(
			@QueryParam("primeiro") int primeiro,
			@QueryParam("segundo") int segundo) {
		int resultado = primeiro + segundo;
		return Integer.toString(resultado);	
	}
}
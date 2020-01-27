package com.Company;
import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
//http://localhost:8081/rest/save/student?name=Dashti&vaheds=pishrafte
@Path("/save")
public class SimRest {
    @Path("/student")
    @GET
    @Produces("text/plain")
    public String sum (@QueryParam("name") String x ,@QueryParam("vaheds") String y)
    {
        System.out.println("save executed in server");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",x);
        jsonObject.put("vaheds",y);


        return "name:"+x+"\n"+"vahed ha:"+y;
    }
}
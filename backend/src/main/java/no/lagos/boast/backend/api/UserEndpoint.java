package no.lagos.boast.backend.api;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

import no.lagos.boast.backend.MyBean;

/**
 * Created by Johannes D. Lagos $today
 */

@Api(name = "boast", version = "v1",
namespace = @ApiNamespace(ownerDomain = "backend.boast.lagos.no",
ownerName = "backend.boast.lagos.no",
packagePath = ""))
public class UserEndpoint {
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);

        return response;
    }

}

package io.fabric8.quickstarts.cxf.jaxrs;

import io.swagger.annotations.Api;

@Api("/bigMachineTest")
public class BigMachineImpl implements BigMachineService {

    public String welcome() {
        return "Hola servicios openshift";
    }

}

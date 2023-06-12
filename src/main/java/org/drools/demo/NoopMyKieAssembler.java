package org.drools.demo;

import org.kie.api.internal.assembler.KieAssemblerService;
import org.kie.api.io.ResourceType;

public class NoopMyKieAssembler implements KieAssemblerService {

    @Override
    public ResourceType getResourceType() {
        return ResourceType.BPMN2;
    }
    
}

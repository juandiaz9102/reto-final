package com.nttdata.model.tmf621;

public interface NamedNodeTO {

    @javax.validation.constraints.NotNull
    String getId();

    @javax.validation.constraints.NotNull
    String getName();
}

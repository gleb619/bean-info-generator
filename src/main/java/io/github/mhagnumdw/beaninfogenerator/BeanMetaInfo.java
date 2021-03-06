package io.github.mhagnumdw.beaninfogenerator;

import java.io.Serializable;

/**
 * Armazena as informações de metadados.
 */
public class BeanMetaInfo implements Serializable {

    private static final long serialVersionUID = -415621717904168964L;

    private String name;

    public BeanMetaInfo(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

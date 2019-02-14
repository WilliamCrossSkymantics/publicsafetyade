package org.publicsafety.walker;

import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.util.walker.GMLWalker;

public class PublicSafetyGMLWalker implements ADEWalker<GMLWalker> {
    private GMLWalker walker;

    public PublicSafetyGMLWalker() {
    }

    public void setParentWalker(GMLWalker walker) {
        this.walker = walker;
    }
}

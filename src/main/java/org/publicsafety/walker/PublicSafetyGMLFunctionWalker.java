
package org.publicsafety.walker;

import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.util.walker.GMLFunctionWalker;

public class PublicSafetyGMLFunctionWalker<T> implements ADEWalker<GMLFunctionWalker<T>> {
    private GMLFunctionWalker<T> walker;

    public PublicSafetyGMLFunctionWalker() {
    }

    public void setParentWalker(GMLFunctionWalker<T> walker) {
        this.walker = walker;
    }
}

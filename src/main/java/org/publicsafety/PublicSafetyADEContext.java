package org.publicsafety;

import java.util.Collections;
import java.util.List;
import org.citygml4j.model.citygml.ade.binding.ADEContext;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.util.walker.FeatureFunctionWalker;
import org.citygml4j.util.walker.FeatureWalker;
import org.citygml4j.util.walker.GMLFunctionWalker;
import org.citygml4j.util.walker.GMLWalker;
import org.publicsafety.bind.PublicSafetyADEMarshaller;
import org.publicsafety.bind.PublicSafetyADEUnmarshaller;
import org.publicsafety.model.module.PublicSafetyADEModule;
import org.publicsafety.walker.PublicSafetyFeatureFunctionWalker;
import org.publicsafety.walker.PublicSafetyFeatureWalker;
import org.publicsafety.walker.PublicSafetyGMLFunctionWalker;
import org.publicsafety.walker.PublicSafetyGMLWalker;

public class PublicSafetyADEContext implements ADEContext {
    private final List<ADEModule> modules;

    public PublicSafetyADEContext() {
        this.modules = Collections.singletonList(PublicSafetyADEModule.v1_0);
    }

    public List<ADEModule> getADEModules() {
        return this.modules;
    }

    public List<String> getModelPackageNames() {
        return Collections.singletonList("org.citygml.ade.publicsafety.model");
    }

    public ADEMarshaller createADEMarshaller() {
        return new PublicSafetyADEMarshaller();
    }

    public ADEUnmarshaller createADEUnmarshaller() {
        return new PublicSafetyADEUnmarshaller();
    }

    public ADEWalker<FeatureWalker> createDefaultFeatureWalker() {
        return new PublicSafetyFeatureWalker();
    }

    public ADEWalker<GMLWalker> createDefaultGMLWalker() {
        return new PublicSafetyGMLWalker();
    }

    public <T> ADEWalker<FeatureFunctionWalker<T>> createDefaultFeatureFunctionWalker() {
        return new PublicSafetyFeatureFunctionWalker();
    }

    public <T> ADEWalker<GMLFunctionWalker<T>> createDefaultGMLFunctionWalker() {
        return new PublicSafetyGMLFunctionWalker();
    }
}

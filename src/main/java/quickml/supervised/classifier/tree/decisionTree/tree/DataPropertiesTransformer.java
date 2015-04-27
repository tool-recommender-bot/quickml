package quickml.supervised.classifier.tree.decisionTree.tree;

import quickml.data.InstanceWithAttributesMap;
import quickml.supervised.classifier.DataProperties;
import quickml.supervised.classifier.tree.treeConfig.TreeConfig;

import java.util.List;

/**
 * Created by alexanderhawk on 3/22/15.
 */
public interface DataPropertiesTransformer<T extends InstanceWithAttributesMap, S extends DataForTheAssessmentOfSplitValidity, D extends DataProperties> {
    InitializedTreeConfig<T, S, D> createForestConfig(List<T> instances, TreeConfig<T,S, D> configBuilder);
    DataPropertiesTransformer<T, S, D> copy();
}
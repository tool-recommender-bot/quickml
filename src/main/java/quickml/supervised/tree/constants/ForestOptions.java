package quickml.supervised.tree.constants;

/**
 * Created by alexanderhawk on 3/20/15.
 */
public enum ForestOptions {
    BAGGING(),
    DOWNSAMPLING_TARGET_MINORITY_PROPORTION(),
    PRUNING_STRATEGY(),
    SCORER(),
    MAX_DEPTH(),
    MIN_SCORE(),
    MIN_LEAF_INSTANCES(),
    MIN_SLPIT_FRACTION(),
    IMBALANCE_PENALTY_POWER(),
    NUM_TREES(),
    ATTRIBUTE_VALUE_THRESHOLD_OBSERVATIONS(),
    PENALIZE_CATEGORICAL_SPLITS(),
    ATTRIBUTE_IGNORING_STRATEGY(),
    ATTRIBUTE_VALUE_IGNORING_STRATEGY(),
    ATTRIBUTE_VALUE_IGNORING_STRATEGY_BUILDER(),
    DEGREE_OF_GAIN_RATIO_PENALTY(),
    BINS_FOR_NUMERIC_SPLITS(),
    NUM_SAMPLES_PER_NUMERIC_BIN(),
    NUM_NUMERIC_BINS(),
    SAMPLES_PER_BIN(),
    BRANCH_FINDER_BUILDERS(),
    NUMERIC_BRANCH_BUILDER(),
    CATEGORICAL_BRANCH_BUILDER(),
    LEAF_BUILDER(),
    BOOLEAN_BRANCH_BUILDER(),
    BRANCHING_CONDITIONS(),
    TREE_FACTORY(),
    DATA_PROPERTIES_TRANSFORMER(),
    MIN_ATTRIBUTE_OCCURRENCES(),
    EXEMPT_ATTRIBUTES;
}

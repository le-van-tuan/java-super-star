package vn.sps.design_pattern.creational.abstract_factory.factory;

import vn.sps.design_pattern.creational.abstract_factory.product.Chair;

public abstract class ChairCreator {
    protected abstract Chair createChair();
}

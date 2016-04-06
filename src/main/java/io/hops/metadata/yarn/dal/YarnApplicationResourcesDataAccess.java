package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

public interface YarnApplicationResourcesDataAccess<T> extends EntityDataAccess {

    void add(T YarnApplicationResources) throws StorageException;
}

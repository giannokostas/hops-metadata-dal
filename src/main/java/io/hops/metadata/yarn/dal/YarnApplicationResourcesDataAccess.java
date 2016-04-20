package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.YarnApplicationResources;

import java.util.Map;

public interface YarnApplicationResourcesDataAccess<T> extends EntityDataAccess {

    void add(T YarnApplicationResources) throws StorageException;

    void addAll(Map<String, YarnApplicationResources> toBeAdded) throws StorageException;

    void removeAll(Map<String, YarnApplicationResources> toBeRemoved)
            throws StorageException;

    YarnApplicationResources findById(String appId) throws StorageException;

    Map<String, T> getAll() throws StorageException;

    void update(String appId, int addMemory, int addVcores) throws StorageException;
}
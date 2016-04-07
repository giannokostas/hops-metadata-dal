package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.YarnApplicationResources;

import java.util.Collection;
import java.util.Map;

public interface YarnApplicationResourcesDataAccess<T> extends EntityDataAccess {

    void add(T YarnApplicationResources) throws StorageException;

    void addAll(Collection<YarnApplicationResources> toBeAdded) throws StorageException;

    void removeAll(Collection<YarnApplicationResources> killed)
            throws StorageException;

    YarnApplicationResources findById(int inodeID) throws StorageException;

    Map<Integer, T> getAll() throws StorageException;
}

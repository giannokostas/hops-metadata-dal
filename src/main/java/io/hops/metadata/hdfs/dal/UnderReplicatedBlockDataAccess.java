/*
 * Copyright (C) 2015 hops.io.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

public interface UnderReplicatedBlockDataAccess<T> extends EntityDataAccess {

  T findByPk(long blockId, int inodeId) throws StorageException;

  List<T> findByINodeId(int inodeId) throws StorageException;
  
  List<T> findByINodeIds(int[] inodeIds) throws StorageException;
  
  List<T> findAll() throws StorageException;
  
  List<T> findByLevel(int level) throws StorageException;
  
  List<T> findByLevel(int level, int offset, int count) throws StorageException;
  
  void prepare(Collection<T> removed, Collection<T> newed,
      Collection<T> modified) throws StorageException;

  void removeAll() throws StorageException;

  int countAll() throws StorageException;

  int countByLevel(int level) throws StorageException;

  int countLessThanALevel(int level) throws StorageException;
}

/*
 * Copyright 2011 the original author or authors.
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
package org.gradle.cache.internal;

import org.gradle.messaging.serialize.Serializer;

import java.io.File;

public class PersistentIndexedCacheParameters<K, V> {
    private final File cacheFile;
    private final Serializer<K> keySerializer;
    private final Serializer<V> valueSerializer;

    public PersistentIndexedCacheParameters(File cacheFile, Serializer<K> keySerializer, Serializer<V> valueSerializer) {
        this.cacheFile = cacheFile;
        this.keySerializer = keySerializer;
        this.valueSerializer = valueSerializer;
    }

    public File getCacheFile() {
        return cacheFile;
    }

    public Serializer<K> getKeySerializer() {
        return keySerializer;
    }

    public Serializer<V> getValueSerializer() {
        return valueSerializer;
    }
}

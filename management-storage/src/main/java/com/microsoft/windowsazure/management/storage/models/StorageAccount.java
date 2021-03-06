/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.storage.models;

import com.microsoft.windowsazure.core.LazyHashMap;
import java.net.URI;
import java.util.HashMap;

/**
* A Storage Service associated with your subscription.
*/
public class StorageAccount {
    private HashMap<String, String> extendedProperties;
    
    /**
    * Optional. Represents the name of an extended storage account property.
    * Each extended property must have both a defined name and a value. You
    * can have a maximum of 50 extended property name/value pairs. The maximum
    * length of the Name element is 64 characters, only alphanumeric
    * characters and underscores are valid in the Name, and the name must
    * start with a letter. Attempting to use other characters, starting the
    * Name with a non-letter character, or entering a name that is identical
    * to that of another extended property owned by the same storage account,
    * will result in a status code 400 (Bad Request) error. Each extended
    * property value has a maximum length of 255 characters.
    * @return The ExtendedProperties value.
    */
    public HashMap<String, String> getExtendedProperties() {
        return this.extendedProperties;
    }
    
    /**
    * Optional. Represents the name of an extended storage account property.
    * Each extended property must have both a defined name and a value. You
    * can have a maximum of 50 extended property name/value pairs. The maximum
    * length of the Name element is 64 characters, only alphanumeric
    * characters and underscores are valid in the Name, and the name must
    * start with a letter. Attempting to use other characters, starting the
    * Name with a non-letter character, or entering a name that is identical
    * to that of another extended property owned by the same storage account,
    * will result in a status code 400 (Bad Request) error. Each extended
    * property value has a maximum length of 255 characters.
    * @param extendedPropertiesValue The ExtendedProperties value.
    */
    public void setExtendedProperties(final HashMap<String, String> extendedPropertiesValue) {
        this.extendedProperties = extendedPropertiesValue;
    }
    
    private String name;
    
    /**
    * Optional. The name of the storage account. This name is the DNS prefix
    * name and can be used to access blobs, queues, and tables in the storage
    * account. For example, if the service name is MyStorageAccount, you could
    * access the blob containers by calling:
    * http://MyStorageAccount.blob.core.windows.net/mycontainer/.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. The name of the storage account. This name is the DNS prefix
    * name and can be used to access blobs, queues, and tables in the storage
    * account. For example, if the service name is MyStorageAccount, you could
    * access the blob containers by calling:
    * http://MyStorageAccount.blob.core.windows.net/mycontainer/.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private StorageAccountProperties properties;
    
    /**
    * Optional. Details about the storage account.
    * @return The Properties value.
    */
    public StorageAccountProperties getProperties() {
        return this.properties;
    }
    
    /**
    * Optional. Details about the storage account.
    * @param propertiesValue The Properties value.
    */
    public void setProperties(final StorageAccountProperties propertiesValue) {
        this.properties = propertiesValue;
    }
    
    private URI uri;
    
    /**
    * Optional. The Service Management API request URI used to perform Get
    * Storage Account Properties requests against the storage account.
    * @return The Uri value.
    */
    public URI getUri() {
        return this.uri;
    }
    
    /**
    * Optional. The Service Management API request URI used to perform Get
    * Storage Account Properties requests against the storage account.
    * @param uriValue The Uri value.
    */
    public void setUri(final URI uriValue) {
        this.uri = uriValue;
    }
    
    /**
    * Initializes a new instance of the StorageAccount class.
    *
    */
    public StorageAccount() {
        this.setExtendedProperties(new LazyHashMap<String, String>());
    }
}

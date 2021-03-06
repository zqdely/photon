/*
 *
 *  Copyright 2015 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package com.netflix.imflibrary.st0377.header;

import com.netflix.imflibrary.KLVPacket;
import com.netflix.imflibrary.annotations.MXFProperty;
import com.netflix.imflibrary.st0377.CompoundDataTypes;

/**
 * Object model corresponding to GenericDescriptor structural metadata set defined in st377-1:2011
 */
public abstract class GenericDescriptor extends InterchangeObject
{

    public abstract static class GenericDescriptorBO extends InterchangeObjectBO {
        /**
         * Collection of subdescriptors.
         */
        @MXFProperty(size = 0, depends = true) protected final CompoundDataTypes.MXFCollections.MXFCollection<StrongRef> subdescriptors = null;

        /**
         * Instantiates a new Generic descriptor ByteObject.
         *
         * @param header the header
         */
        GenericDescriptorBO(final KLVPacket.Header header) {
            super(header);
        }

        /**
         * Accessor for the SubDescriptors in the EssenceDescriptor
         * @return list of references to subdescriptors
         */
        public CompoundDataTypes.MXFCollections.MXFCollection<StrongRef> getSubdescriptors(){
            return this.subdescriptors;
        }
    }
}

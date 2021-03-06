// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package com.cloud.agent.api;

public class UpdateLogicalSwitchPortCommand extends Command {
    private String _logicalSwitchUuid;
    private String _logicalSwitchPortUuid;
    private String _attachmentUuid;
    private String _ownerName;
    private String _nicName;
    
    public UpdateLogicalSwitchPortCommand(String logicalSwitchPortUuid, String logicalSwitchUuid, String attachmentUuid, String ownerName, String nicName) {
        this._logicalSwitchUuid = logicalSwitchUuid;
        this._logicalSwitchPortUuid = logicalSwitchPortUuid;
        this._attachmentUuid = attachmentUuid;
        this._ownerName = ownerName;
        this._nicName = nicName;
    }
    
    
    public String getLogicalSwitchUuid() {
        return _logicalSwitchUuid;
    }


    public String getLogicalSwitchPortUuid() {
        return _logicalSwitchPortUuid;
    }


    public String getAttachmentUuid() {
        return _attachmentUuid;
    }


    public String getOwnerName() {
        return _ownerName;
    }


    public String getNicName() {
        return _nicName;
    }


    @Override
    public boolean executeInSequence() {
        return false;
    }

}

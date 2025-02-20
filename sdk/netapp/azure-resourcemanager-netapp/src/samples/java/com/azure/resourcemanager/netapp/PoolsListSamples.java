// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp;

import com.azure.core.util.Context;

/** Samples for Pools List. */
public final class PoolsListSamples {
    /*
     * operationId: Pools_List
     * api-version: 2021-06-01
     * x-ms-examples: Pools_List
     */
    /**
     * Sample code: Pools_List.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void poolsList(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.pools().list("myRG", "account1", Context.NONE);
    }
}

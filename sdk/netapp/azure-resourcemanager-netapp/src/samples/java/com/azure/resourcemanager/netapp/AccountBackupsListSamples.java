// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp;

import com.azure.core.util.Context;

/** Samples for AccountBackups List. */
public final class AccountBackupsListSamples {
    /*
     * operationId: AccountBackups_List
     * api-version: 2021-06-01
     * x-ms-examples: AccountBackups_List
     */
    /**
     * Sample code: AccountBackups_List.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void accountBackupsList(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.accountBackups().list("myRG", "account1", Context.NONE);
    }
}

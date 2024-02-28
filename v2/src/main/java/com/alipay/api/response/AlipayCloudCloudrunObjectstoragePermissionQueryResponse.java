package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.permission.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-18 13:51:43
 */
public class AlipayCloudCloudrunObjectstoragePermissionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3893963421145211755L;

	/** 
	 * 实例的读权限
	 */
	@ApiField("read_permission")
	private String readPermission;

	public void setReadPermission(String readPermission) {
		this.readPermission = readPermission;
	}
	public String getReadPermission( ) {
		return this.readPermission;
	}

}

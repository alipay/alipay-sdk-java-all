package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.permission.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-22 12:02:23
 */
public class AnttechOceanbaseObglobalPermissionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8556125797276763873L;

	/** 
	 * 是否含有权限
	 */
	@ApiField("auth_flag")
	private Boolean authFlag;

	public void setAuthFlag(Boolean authFlag) {
		this.authFlag = authFlag;
	}
	public Boolean getAuthFlag( ) {
		return this.authFlag;
	}

}

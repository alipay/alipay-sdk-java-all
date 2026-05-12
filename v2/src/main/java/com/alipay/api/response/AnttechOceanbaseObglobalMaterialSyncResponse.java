package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.material.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-15 15:57:46
 */
public class AnttechOceanbaseObglobalMaterialSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1135963652989674163L;

	/** 
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

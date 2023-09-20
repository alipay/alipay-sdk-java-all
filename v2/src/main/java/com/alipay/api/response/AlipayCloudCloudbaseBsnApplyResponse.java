package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.bsn.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-14 14:36:44
 */
public class AlipayCloudCloudbaseBsnApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5231866912615924566L;

	/** 
	 * 备案服务码
	 */
	@ApiField("bsn")
	private String bsn;

	public void setBsn(String bsn) {
		this.bsn = bsn;
	}
	public String getBsn( ) {
		return this.bsn;
	}

}

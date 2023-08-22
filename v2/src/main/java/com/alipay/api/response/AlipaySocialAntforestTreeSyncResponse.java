package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.tree.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 06:06:46
 */
public class AlipaySocialAntforestTreeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1688119838591636644L;

	/** 
	 * 同步是否成功
	 */
	@ApiField("synced")
	private Boolean synced;

	public void setSynced(Boolean synced) {
		this.synced = synced;
	}
	public Boolean getSynced( ) {
		return this.synced;
	}

}

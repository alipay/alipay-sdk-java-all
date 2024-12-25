package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.tree.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 19:28:39
 */
public class AlipaySocialAntforestTreeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6223364512483154473L;

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

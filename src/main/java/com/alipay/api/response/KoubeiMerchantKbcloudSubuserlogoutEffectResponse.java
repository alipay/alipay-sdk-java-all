package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.kbcloud.subuserlogout.effect response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-19 18:09:20
 */
public class KoubeiMerchantKbcloudSubuserlogoutEffectResponse extends AlipayResponse {

	private static final long serialVersionUID = 6766128893828661998L;

	/** 
	 * 是否登出成功
	 */
	@ApiField("flag")
	private Boolean flag;

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	public Boolean getFlag( ) {
		return this.flag;
	}

}

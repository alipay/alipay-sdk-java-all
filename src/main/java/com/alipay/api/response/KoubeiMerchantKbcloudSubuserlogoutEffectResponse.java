package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.kbcloud.subuserlogout.effect response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMerchantKbcloudSubuserlogoutEffectResponse extends AlipayResponse {

	private static final long serialVersionUID = 7638474273455757176L;

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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻授权参数
 *
 * @author auto create
 * @since 1.0, 2021-11-25 11:52:49
 */
public class ZmAuthParams extends AlipayObject {

	private static final long serialVersionUID = 3841455366827679718L;

	/**
	 * 商户在芝麻端申请的appId
	 */
	@ApiField("buckle_app_id")
	private String buckleAppId;

	/**
	 * 商户在芝麻端申请的merchantId
	 */
	@ApiField("buckle_merchant_id")
	private String buckleMerchantId;

	public String getBuckleAppId() {
		return this.buckleAppId;
	}
	public void setBuckleAppId(String buckleAppId) {
		this.buckleAppId = buckleAppId;
	}

	public String getBuckleMerchantId() {
		return this.buckleMerchantId;
	}
	public void setBuckleMerchantId(String buckleMerchantId) {
		this.buckleMerchantId = buckleMerchantId;
	}

}

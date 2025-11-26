package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ApplePay开卡接口(用于压测)
 *
 * @author auto create
 * @since 1.0, 2020-05-29 10:22:53
 */
public class AlipayUserApplepayProvisioningbundleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5142835382457112658L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_identifier")
	private String alipayUserIdentifier;

	public String getAlipayUserIdentifier() {
		return this.alipayUserIdentifier;
	}
	public void setAlipayUserIdentifier(String alipayUserIdentifier) {
		this.alipayUserIdentifier = alipayUserIdentifier;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ApplePay开卡接口(用于压测)
 *
 * @author auto create
 * @since 1.0, 2020-04-03 13:20:24
 */
public class AlipayUserApplepayProvisioningbundleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7218557987488675774L;

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

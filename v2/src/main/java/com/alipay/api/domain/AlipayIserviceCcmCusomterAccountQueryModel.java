package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过来电手机号查询UID
 *
 * @author auto create
 * @since 1.0, 2024-05-15 15:41:48
 */
public class AlipayIserviceCcmCusomterAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7778825143887182382L;

	/**
	 * 符合中国区域的手机号，不需要+86
	 */
	@ApiField("mobile_number")
	private String mobileNumber;

	public String getMobileNumber() {
		return this.mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}

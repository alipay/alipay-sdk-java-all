package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户相关隐私信息
 *
 * @author auto create
 * @since 1.0, 2023-11-23 10:24:24
 */
public class PrivateInfo extends AlipayObject {

	private static final long serialVersionUID = 2647449176761568988L;

	/**
	 * 用户身份证号码
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 用户手机号码
	 */
	@ApiField("phone_no")
	private String phoneNo;

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}

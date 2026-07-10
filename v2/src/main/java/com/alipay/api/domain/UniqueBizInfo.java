package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-10 11:37:55
 */
public class UniqueBizInfo extends AlipayObject {

	private static final long serialVersionUID = 6473779725743717757L;

	/**
	 * 子业务单号对应的子使用人手机号
	 */
	@ApiField("sub_phone_no")
	private String subPhoneNo;

	/**
	 * 子业务单号
	 */
	@ApiField("sub_unique_biz_no")
	private String subUniqueBizNo;

	public String getSubPhoneNo() {
		return this.subPhoneNo;
	}
	public void setSubPhoneNo(String subPhoneNo) {
		this.subPhoneNo = subPhoneNo;
	}

	public String getSubUniqueBizNo() {
		return this.subUniqueBizNo;
	}
	public void setSubUniqueBizNo(String subUniqueBizNo) {
		this.subUniqueBizNo = subUniqueBizNo;
	}

}

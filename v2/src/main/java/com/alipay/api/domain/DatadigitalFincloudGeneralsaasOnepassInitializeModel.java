package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 本机校验初始化
 *
 * @author auto create
 * @since 1.0, 2023-09-13 17:58:55
 */
public class DatadigitalFincloudGeneralsaasOnepassInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 2618331161544598656L;

	/**
	 * 客户业务单据号。
	 */
	@ApiField("outer_order_no")
	private String outerOrderNo;

	/**
	 * 待校验的手机号。
	 */
	@ApiField("phone")
	private String phone;

	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}
	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}

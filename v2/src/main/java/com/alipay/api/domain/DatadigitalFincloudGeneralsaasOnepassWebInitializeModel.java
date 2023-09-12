package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * H5本机校验初始化
 *
 * @author auto create
 * @since 1.0, 2023-07-26 09:40:34
 */
public class DatadigitalFincloudGeneralsaasOnepassWebInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 6642235687423915349L;

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

	/**
	 * 用于指定接入平台类型
	 */
	@ApiField("platform")
	private String platform;

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

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

}

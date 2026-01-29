package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-05 17:46:54
 */
public class ObjectTaskStatus extends AlipayObject {

	private static final long serialVersionUID = 2493611474753175221L;

	/**
	 * 业务对象编号，如 69?
	 */
	@ApiField("biz_object_no")
	private String bizObjectNo;

	/**
	 *  业务对象序号，从 1 开始
	 */
	@ApiField("number")
	private String number;

	/**
	 * 业务对象状态，具体参考枚举值
	 */
	@ApiField("status")
	private String status;

	public String getBizObjectNo() {
		return this.bizObjectNo;
	}
	public void setBizObjectNo(String bizObjectNo) {
		this.bizObjectNo = bizObjectNo;
	}

	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

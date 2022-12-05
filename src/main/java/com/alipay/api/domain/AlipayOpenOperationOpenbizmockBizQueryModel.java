package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放基础业务模拟查询接口
 *
 * @author auto create
 * @since 1.0, 2022-11-08 16:39:53
 */
public class AlipayOpenOperationOpenbizmockBizQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4434444614684397838L;

	/**
	 * 业务编码
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * aa
	 */
	@ApiField("number")
	private String number;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

}

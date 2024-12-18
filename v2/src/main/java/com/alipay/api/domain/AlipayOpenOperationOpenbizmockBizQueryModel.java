package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放基础业务模拟查询接口
 *
 * @author auto create
 * @since 1.0, 2023-07-17 15:26:09
 */
public class AlipayOpenOperationOpenbizmockBizQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3292462752227635947L;

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

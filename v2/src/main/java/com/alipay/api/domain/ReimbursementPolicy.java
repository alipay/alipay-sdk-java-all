package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报销政策的类型
 *
 * @author auto create
 * @since 1.0, 2024-09-30 01:14:33
 */
public class ReimbursementPolicy extends AlipayObject {

	private static final long serialVersionUID = 1815658848191524274L;

	/**
	 * 航段编号（-1为打包说明）
	 */
	@ApiField("airline_no")
	private String airlineNo;

	/**
	 * 文字描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 1：行程单
2：发票
	 */
	@ApiField("type")
	private String type;

	public String getAirlineNo() {
		return this.airlineNo;
	}
	public void setAirlineNo(String airlineNo) {
		this.airlineNo = airlineNo;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

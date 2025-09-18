package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 托运政策
 *
 * @author auto create
 * @since 1.0, 2024-09-30 01:14:33
 */
public class LuggagePolicy extends AlipayObject {

	private static final long serialVersionUID = 3765727291195475771L;

	/**
	 * 航段编号
	 */
	@ApiField("airline_no")
	private String airlineNo;

	/**
	 * 行李手提/托运的描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 1：托运
2：手提
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

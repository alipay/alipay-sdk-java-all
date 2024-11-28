package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机票的售卖条件组合
 *
 * @author auto create
 * @since 1.0, 2024-09-30 01:14:32
 */
public class SaleControl extends AlipayObject {

	private static final long serialVersionUID = 4134769487331665814L;

	/**
	 * 如果是多航段打包规则，传入一个：-1，否则的话，根据数字来判断是第几个航段
	 */
	@ApiField("airline_no")
	private String airlineNo;

	/**
	 * 机票售卖的策略描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 售卖限制的详情
	 */
	@ApiField("detail")
	private SaleControlDetail detail;

	/**
	 * 售卖限制的类型
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

	public SaleControlDetail getDetail() {
		return this.detail;
	}
	public void setDetail(SaleControlDetail detail) {
		this.detail = detail;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

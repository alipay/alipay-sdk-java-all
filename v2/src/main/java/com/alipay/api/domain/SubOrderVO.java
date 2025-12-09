package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子订单列表
 *
 * @author auto create
 * @since 1.0, 2025-10-16 14:04:43
 */
public class SubOrderVO extends AlipayObject {

	private static final long serialVersionUID = 3539337236397135231L;

	/**
	 * 应付保费，单位为分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 若请求没有该入参，则通过格式为：被保人姓名|证件类型|证件号码
	 */
	@ApiField("sub_order_no")
	private String subOrderNo;

	/**
	 * 总保费，单位为分
	 */
	@ApiField("total_premium")
	private Long totalPremium;

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public String getSubOrderNo() {
		return this.subOrderNo;
	}
	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}

	public Long getTotalPremium() {
		return this.totalPremium;
	}
	public void setTotalPremium(Long totalPremium) {
		this.totalPremium = totalPremium;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户订单信息列表
 *
 * @author auto create
 * @since 1.0, 2026-10-22 15:36:08
 */
public class OrderList extends AlipayObject {

	private static final long serialVersionUID = 4641617613255478394L;

	/**
	 * 订单金额列表
	 */
	@ApiListField("order_amount_list")
	@ApiField("string")
	private List<String> orderAmountList;

	/**
	 * 收款商户的pid信息
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 商户风险等级
	 */
	@ApiField("risk_level")
	private String riskLevel;

	public List<String> getOrderAmountList() {
		return this.orderAmountList;
	}
	public void setOrderAmountList(List<String> orderAmountList) {
		this.orderAmountList = orderAmountList;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

}

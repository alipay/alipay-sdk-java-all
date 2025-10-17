package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 提前回购接口
 *
 * @author auto create
 * @since 1.0, 2025-08-19 15:25:19
 */
public class AlipayCommerceRentRoyaltyEarlyBuyModel extends AlipayObject {

	private static final long serialVersionUID = 2263816988468679273L;

	/**
	 * 表示本次操作的类型
	 */
	@ApiField("execute_scene")
	private String executeScene;

	/**
	 * 资方pid
	 */
	@ApiField("invest_id")
	private String investId;

	/**
	 * 操作人类型
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 交易组件订单id列表
	 */
	@ApiListField("order_list")
	@ApiField("string")
	private List<String> orderList;

	/**
	 * 商户pid
	 */
	@ApiField("seller_id")
	private String sellerId;

	public String getExecuteScene() {
		return this.executeScene;
	}
	public void setExecuteScene(String executeScene) {
		this.executeScene = executeScene;
	}

	public String getInvestId() {
		return this.investId;
	}
	public void setInvestId(String investId) {
		this.investId = investId;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public List<String> getOrderList() {
		return this.orderList;
	}
	public void setOrderList(List<String> orderList) {
		this.orderList = orderList;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

}

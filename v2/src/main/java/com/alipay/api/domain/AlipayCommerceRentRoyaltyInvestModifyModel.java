package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资方调整分账计划
 *
 * @author auto create
 * @since 1.0, 2024-07-17 15:28:49
 */
public class AlipayCommerceRentRoyaltyInvestModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2418722948385998947L;

	/**
	 * 2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息; 其中buyer_id与buyer_open_id不能同时为空
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 交易组件的业务订单Id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 代表第几阶段的还款计划，要配合royalty_stage锁定第几期还款计划
	 */
	@ApiField("royalty_period")
	private Long royaltyPeriod;

	/**
	 * 分账金额，单位：元，精确到小数点后两位
	 */
	@ApiField("royalty_price")
	private String royaltyPrice;

	/**
	 * 代表某一个阶段的第几期的还款计划，要结合royalty_period进行锁定某一期计划
	 */
	@ApiField("royalty_stage")
	private Long royaltyStage;

	/**
	 * 分账计划对应资金类型
	 */
	@ApiField("royalty_type")
	private String royaltyType;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getRoyaltyPeriod() {
		return this.royaltyPeriod;
	}
	public void setRoyaltyPeriod(Long royaltyPeriod) {
		this.royaltyPeriod = royaltyPeriod;
	}

	public String getRoyaltyPrice() {
		return this.royaltyPrice;
	}
	public void setRoyaltyPrice(String royaltyPrice) {
		this.royaltyPrice = royaltyPrice;
	}

	public Long getRoyaltyStage() {
		return this.royaltyStage;
	}
	public void setRoyaltyStage(Long royaltyStage) {
		this.royaltyStage = royaltyStage;
	}

	public String getRoyaltyType() {
		return this.royaltyType;
	}
	public void setRoyaltyType(String royaltyType) {
		this.royaltyType = royaltyType;
	}

}

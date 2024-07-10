package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资方确认租赁订单关系
 *
 * @author auto create
 * @since 1.0, 2024-05-16 16:00:17
 */
public class AlipayCommerceRentOrderInvestConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 7499495564163319779L;

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
	 * 资方确认结果
	 */
	@ApiField("confirm_result")
	private String confirmResult;

	/**
	 * 订单、分账确认类型
	 */
	@ApiField("confirm_type")
	private String confirmType;

	/**
	 * 交易组件的业务订单Id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 代表第几阶段的还款计划，要配合royalty_stage锁定第几期还款计划，royalty_type=BUYOUT的情况下，可不填
	 */
	@ApiField("royalty_period")
	private Long royaltyPeriod;

	/**
	 * 代表某一个阶段的第几期的还款计划，要结合royalty_period进行锁定某一期计划，royalty_type=BUYOUT的情况下，可不填
	 */
	@ApiField("royalty_stage")
	private Long royaltyStage;

	/**
	 * 分账计划类型，目前只支持RENT、DEPOSIT、BUYOUT三种类型
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

	public String getConfirmResult() {
		return this.confirmResult;
	}
	public void setConfirmResult(String confirmResult) {
		this.confirmResult = confirmResult;
	}

	public String getConfirmType() {
		return this.confirmType;
	}
	public void setConfirmType(String confirmType) {
		this.confirmType = confirmType;
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

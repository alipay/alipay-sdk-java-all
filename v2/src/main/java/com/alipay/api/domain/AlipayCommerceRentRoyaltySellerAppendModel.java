package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家补分账
 *
 * @author auto create
 * @since 1.0, 2025-04-28 17:32:01
 */
public class AlipayCommerceRentRoyaltySellerAppendModel extends AlipayObject {

	private static final long serialVersionUID = 3852198111727828995L;

	/**
	 * 16位纯数字，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息;其中buyer_id与buyer_open_id不能同时为空
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 执行场景为支付发生在资商订单确认前
	 */
	@ApiField("execute_scene")
	private String executeScene;

	/**
	 * 交易组件的业务订单Id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 填入当前期数
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 分账计划类型
	 */
	@ApiField("royalty_type")
	private String royaltyType;

	/**
	 * 填入当前阶段数
	 */
	@ApiField("stage")
	private Long stage;

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

	public String getExecuteScene() {
		return this.executeScene;
	}
	public void setExecuteScene(String executeScene) {
		this.executeScene = executeScene;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

	public String getRoyaltyType() {
		return this.royaltyType;
	}
	public void setRoyaltyType(String royaltyType) {
		this.royaltyType = royaltyType;
	}

	public Long getStage() {
		return this.stage;
	}
	public void setStage(Long stage) {
		this.stage = stage;
	}

}

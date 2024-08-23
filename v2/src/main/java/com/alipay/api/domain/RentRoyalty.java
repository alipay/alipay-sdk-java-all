package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁分账计划
 *
 * @author auto create
 * @since 1.0, 2024-08-13 17:48:14
 */
public class RentRoyalty extends AlipayObject {

	private static final long serialVersionUID = 4296325445325727373L;

	/**
	 * 订单id
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 本期对应的买断分账金
	 */
	@ApiField("current_buyout_price")
	private String currentBuyoutPrice;

	/**
	 * 代表某一个阶段的第几期的还款计划，要结合stage进行锁定某一期计划
	 */
	@ApiField("period")
	private String period;

	/**
	 * 改账中的分账金额，单位：元，精确到小数点后两位
	 */
	@ApiField("royalty_after_price")
	private String royaltyAfterPrice;

	/**
	 * 分账金额，单位：元，精确到小数点后两位
	 */
	@ApiField("royalty_price")
	private String royaltyPrice;

	/**
	 * 分账计划的状态
	 */
	@ApiField("royalty_status")
	private String royaltyStatus;

	/**
	 * 分账完成时间
	 */
	@ApiField("royalty_time")
	private String royaltyTime;

	/**
	 * 代表第几阶段的还款计划，要配合period锁定第几期还款计划
	 */
	@ApiField("stage")
	private String stage;

	/**
	 * 分账成功之后对应的交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 租金类型
	 */
	@ApiField("type")
	private String type;

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

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

	public String getCurrentBuyoutPrice() {
		return this.currentBuyoutPrice;
	}
	public void setCurrentBuyoutPrice(String currentBuyoutPrice) {
		this.currentBuyoutPrice = currentBuyoutPrice;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getRoyaltyAfterPrice() {
		return this.royaltyAfterPrice;
	}
	public void setRoyaltyAfterPrice(String royaltyAfterPrice) {
		this.royaltyAfterPrice = royaltyAfterPrice;
	}

	public String getRoyaltyPrice() {
		return this.royaltyPrice;
	}
	public void setRoyaltyPrice(String royaltyPrice) {
		this.royaltyPrice = royaltyPrice;
	}

	public String getRoyaltyStatus() {
		return this.royaltyStatus;
	}
	public void setRoyaltyStatus(String royaltyStatus) {
		this.royaltyStatus = royaltyStatus;
	}

	public String getRoyaltyTime() {
		return this.royaltyTime;
	}
	public void setRoyaltyTime(String royaltyTime) {
		this.royaltyTime = royaltyTime;
	}

	public String getStage() {
		return this.stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

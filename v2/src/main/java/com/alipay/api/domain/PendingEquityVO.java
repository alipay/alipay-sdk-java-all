package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 待领权益集合
 *
 * @author auto create
 * @since 1.0, 2023-09-15 16:56:47
 */
public class PendingEquityVO extends AlipayObject {

	private static final long serialVersionUID = 7481474886443511277L;

	/**
	 * 预算类型
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * 海豚活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 主单据号
	 */
	@ApiField("camp_order_id")
	private String campOrderId;

	/**
	 * 发奖渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 展示信息
	 */
	@ApiField("display_info")
	private String displayInfo;

	/**
	 * 证券营销活动id
	 */
	@ApiField("interest_id")
	private String interestId;

	/**
	 * 奖励金额, 以分为单位
	 */
	@ApiField("prize_amount")
	private String prizeAmount;

	/**
	 * 具体奖励类型
	 */
	@ApiField("prize_biz_type")
	private String prizeBizType;

	/**
	 * 奖品ID
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 奖品定价策略
	 */
	@ApiField("prize_strategy_type")
	private String prizeStrategyType;

	/**
	 * 发奖单据号
	 */
	@ApiField("send_order_id")
	private String sendOrderId;

	/**
	 * 券模板id
	 */
	@ApiField("voucher_template_id")
	private String voucherTemplateId;

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getCampOrderId() {
		return this.campOrderId;
	}
	public void setCampOrderId(String campOrderId) {
		this.campOrderId = campOrderId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDisplayInfo() {
		return this.displayInfo;
	}
	public void setDisplayInfo(String displayInfo) {
		this.displayInfo = displayInfo;
	}

	public String getInterestId() {
		return this.interestId;
	}
	public void setInterestId(String interestId) {
		this.interestId = interestId;
	}

	public String getPrizeAmount() {
		return this.prizeAmount;
	}
	public void setPrizeAmount(String prizeAmount) {
		this.prizeAmount = prizeAmount;
	}

	public String getPrizeBizType() {
		return this.prizeBizType;
	}
	public void setPrizeBizType(String prizeBizType) {
		this.prizeBizType = prizeBizType;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizeStrategyType() {
		return this.prizeStrategyType;
	}
	public void setPrizeStrategyType(String prizeStrategyType) {
		this.prizeStrategyType = prizeStrategyType;
	}

	public String getSendOrderId() {
		return this.sendOrderId;
	}
	public void setSendOrderId(String sendOrderId) {
		this.sendOrderId = sendOrderId;
	}

	public String getVoucherTemplateId() {
		return this.voucherTemplateId;
	}
	public void setVoucherTemplateId(String voucherTemplateId) {
		this.voucherTemplateId = voucherTemplateId;
	}

}

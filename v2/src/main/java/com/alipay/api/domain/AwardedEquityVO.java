package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 已领权益集合
 *
 * @author auto create
 * @since 1.0, 2023-09-15 16:56:47
 */
public class AwardedEquityVO extends AlipayObject {

	private static final long serialVersionUID = 5862555769495759135L;

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
	 * 是否是存量权益
	 */
	@ApiField("exists_equity")
	private Boolean existsEquity;

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
	 * 券创建时间
	 */
	@ApiField("voucher_gmt_create")
	private Date voucherGmtCreate;

	/**
	 * 券过期时间
	 */
	@ApiField("voucher_gmt_expired")
	private Date voucherGmtExpired;

	/**
	 * 券变更时间
	 */
	@ApiField("voucher_gmt_modified")
	private Date voucherGmtModified;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券状态
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

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

	public Boolean getExistsEquity() {
		return this.existsEquity;
	}
	public void setExistsEquity(Boolean existsEquity) {
		this.existsEquity = existsEquity;
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

	public Date getVoucherGmtCreate() {
		return this.voucherGmtCreate;
	}
	public void setVoucherGmtCreate(Date voucherGmtCreate) {
		this.voucherGmtCreate = voucherGmtCreate;
	}

	public Date getVoucherGmtExpired() {
		return this.voucherGmtExpired;
	}
	public void setVoucherGmtExpired(Date voucherGmtExpired) {
		this.voucherGmtExpired = voucherGmtExpired;
	}

	public Date getVoucherGmtModified() {
		return this.voucherGmtModified;
	}
	public void setVoucherGmtModified(Date voucherGmtModified) {
		this.voucherGmtModified = voucherGmtModified;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

	public String getVoucherTemplateId() {
		return this.voucherTemplateId;
	}
	public void setVoucherTemplateId(String voucherTemplateId) {
		this.voucherTemplateId = voucherTemplateId;
	}

}

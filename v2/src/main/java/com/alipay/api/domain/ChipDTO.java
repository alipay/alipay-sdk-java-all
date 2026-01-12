package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * poker的筹码model
 *
 * @author auto create
 * @since 1.0, 2025-12-03 17:26:16
 */
public class ChipDTO extends AlipayObject {

	private static final long serialVersionUID = 3767334554981132944L;

	/**
	 * 筹码数量，单位个
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 生效时间
	 */
	@ApiField("begin_time")
	private Date beginTime;

	/**
	 * poker活动code
	 */
	@ApiField("campaign_code")
	private String campaignCode;

	/**
	 * poker活动ID
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 筹码的主键ID
	 */
	@ApiField("chip_id")
	private String chipId;

	/**
	 * 失效时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 筹码兑换状态
	 */
	@ApiField("exchange_status")
	private String exchangeStatus;

	/**
	 * 筹码发放时间
	 */
	@ApiField("issue_time")
	private Date issueTime;

	/**
	 * 筹码发放参数
	 */
	@ApiField("param")
	private Kv param;

	/**
	 * 筹码触发时间
	 */
	@ApiField("trigger_time")
	private Date triggerTime;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Date getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public String getCampaignCode() {
		return this.campaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getChipId() {
		return this.chipId;
	}
	public void setChipId(String chipId) {
		this.chipId = chipId;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExchangeStatus() {
		return this.exchangeStatus;
	}
	public void setExchangeStatus(String exchangeStatus) {
		this.exchangeStatus = exchangeStatus;
	}

	public Date getIssueTime() {
		return this.issueTime;
	}
	public void setIssueTime(Date issueTime) {
		this.issueTime = issueTime;
	}

	public Kv getParam() {
		return this.param;
	}
	public void setParam(Kv param) {
		this.param = param;
	}

	public Date getTriggerTime() {
		return this.triggerTime;
	}
	public void setTriggerTime(Date triggerTime) {
		this.triggerTime = triggerTime;
	}

}

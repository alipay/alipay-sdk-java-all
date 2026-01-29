package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * poker筹码发放
 *
 * @author auto create
 * @since 1.0, 2025-12-03 17:26:16
 */
public class AntfortuneStockPokerChipSendModel extends AlipayObject {

	private static final long serialVersionUID = 7722183317589718548L;

	/**
	 * 筹码数值，单位个
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * poker活动ID
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * poker筹码code
	 */
	@ApiField("chip_code")
	private String chipCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务单号，幂等用
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 参数列表，用来控制筹码发放的内容
	 */
	@ApiListField("param")
	@ApiField("kv")
	private List<Kv> param;

	/**
	 * 触发时间
	 */
	@ApiField("trigger_time")
	private Date triggerTime;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getChipCode() {
		return this.chipCode;
	}
	public void setChipCode(String chipCode) {
		this.chipCode = chipCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<Kv> getParam() {
		return this.param;
	}
	public void setParam(List<Kv> param) {
		this.param = param;
	}

	public Date getTriggerTime() {
		return this.triggerTime;
	}
	public void setTriggerTime(Date triggerTime) {
		this.triggerTime = triggerTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

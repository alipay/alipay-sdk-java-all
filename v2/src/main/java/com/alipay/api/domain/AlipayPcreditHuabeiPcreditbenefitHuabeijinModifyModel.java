package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 冻结花呗金金额修改
 *
 * @author auto create
 * @since 1.0, 2026-07-14 14:37:11
 */
public class AlipayPcreditHuabeiPcreditbenefitHuabeijinModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2752733654875282764L;

	/**
	 * hbmt_53434343434花呗商户活动
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动单据流水
	 */
	@ApiField("activity_order_id")
	private String activityOrderId;

	/**
	 * 123为1.23元单位为分
	 */
	@ApiField("actual_amount")
	private Long actualAmount;

	/**
	 * change_reason
	 */
	@ApiField("change_reason")
	private String changeReason;

	/**
	 * 行业场景标识,依赖双方约定
	 */
	@ApiField("industry_value")
	private String industryValue;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * operation_seq_id表示商家侧操作流水，表示本次操作是唯一性的操作
	 */
	@ApiField("operation_seq_id")
	private String operationSeqId;

	/**
	 * 外部订单号，同活动下要唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityOrderId() {
		return this.activityOrderId;
	}
	public void setActivityOrderId(String activityOrderId) {
		this.activityOrderId = activityOrderId;
	}

	public Long getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(Long actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getChangeReason() {
		return this.changeReason;
	}
	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	public String getIndustryValue() {
		return this.industryValue;
	}
	public void setIndustryValue(String industryValue) {
		this.industryValue = industryValue;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperationSeqId() {
		return this.operationSeqId;
	}
	public void setOperationSeqId(String operationSeqId) {
		this.operationSeqId = operationSeqId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

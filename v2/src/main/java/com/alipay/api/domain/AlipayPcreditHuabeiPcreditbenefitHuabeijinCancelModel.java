package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 冻结花呗金取消
 *
 * @author auto create
 * @since 1.0, 2026-07-14 14:37:10
 */
public class AlipayPcreditHuabeiPcreditbenefitHuabeijinCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3628524115728943622L;

	/**
	 * hbmt_53434343434商户活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动流水单据
	 */
	@ApiField("activity_order_id")
	private String activityOrderId;

	/**
	 * 任意字符串，如aaaa，但是会提供几个原因选择做映射
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 时间
	 */
	@ApiField("cancel_time")
	private Date cancelTime;

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
	 * 操作流水，本次操作唯一
	 */
	@ApiField("operation_seq_id")
	private String operationSeqId;

	/**
	 * 业务订单号，业务活动级别的唯一订单
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝订单需要下支付单
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

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public Date getCancelTime() {
		return this.cancelTime;
	}
	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
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

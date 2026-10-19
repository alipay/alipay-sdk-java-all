package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户退款驱动回收花呗金
 *
 * @author auto create
 * @since 1.0, 2026-10-09 17:06:26
 */
public class AlipayPcreditHuabeiPcreditbenefitHuabeijinRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8314359491233946264L;

	/**
	 * 花呗商户活动
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * activity_order_id和out_biz_no至少需要传一个：如果商家传入activity_order_id，则以activity_order_id为准；如果没有传，则以out_biz_no为准
	 */
	@ApiField("activity_order_id")
	private String activityOrderId;

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
	 * 20250613000206020000130052099451要保障修改某类权益的唯一性，需要进行mideng处理
	 */
	@ApiField("operation_seq_id")
	private String operationSeqId;

	/**
	 * 20250613000206020000130052099451需要和发放接口的out_biz_no保持一致，如果不传activity_order_id的时候
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 123为1.23元，单位为分
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 用于描述追回已发放花呗金的原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 标准日期格式，如2020-01-01 00:00:01 退款实际发生时间
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * 支付宝交易订单号
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

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
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

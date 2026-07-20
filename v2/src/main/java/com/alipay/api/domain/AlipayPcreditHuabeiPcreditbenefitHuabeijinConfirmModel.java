package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 冻结花呗金确认入账
 *
 * @author auto create
 * @since 1.0, 2026-07-14 14:37:11
 */
public class AlipayPcreditHuabeiPcreditbenefitHuabeijinConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 8159365531458762197L;

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
	 * 123为1.23元，单位为分
	 */
	@ApiField("actual_amount")
	private Long actualAmount;

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

	public Long getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(Long actualAmount) {
		this.actualAmount = actualAmount;
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

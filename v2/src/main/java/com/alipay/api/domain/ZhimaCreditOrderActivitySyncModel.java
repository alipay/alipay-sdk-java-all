package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用订单活动信息同步
 *
 * @author auto create
 * @since 1.0, 2026-10-26 15:57:59
 */
public class ZhimaCreditOrderActivitySyncModel extends AlipayObject {

	private static final long serialVersionUID = 4626952164877714441L;

	/**
	 * 活动标识，必须命中当前服务对应的活动配置
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 格式建议北京时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expected_deduct_time")
	private String expectedDeductTime;

	/**
	 * 中签为 true，未中签为 false
	 */
	@ApiField("lottery_result")
	private String lotteryResult;

	/**
	 * 用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 原预授权下单的外部单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getExpectedDeductTime() {
		return this.expectedDeductTime;
	}
	public void setExpectedDeductTime(String expectedDeductTime) {
		this.expectedDeductTime = expectedDeductTime;
	}

	public String getLotteryResult() {
		return this.lotteryResult;
	}
	public void setLotteryResult(String lotteryResult) {
		this.lotteryResult = lotteryResult;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

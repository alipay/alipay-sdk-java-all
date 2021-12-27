package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改支付券基本信息
 *
 * @author auto create
 * @since 1.0, 2021-08-18 14:22:28
 */
public class AlipayMarketingActivityVoucherModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3194597792644755968L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 外部业务单号，用作幂等控制。 幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券发放结束时间。

格式为：yyyy-MM-dd HH:mm:ss

限制：
1、券发放结束时间publish_end_time 与 券发放开始时间publish_start_time 间隔必须小于等于180天
2、修改发放结束时间，只能延长，不允许缩短。
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 券核销规则
	 */
	@ApiField("voucher_use_rule")
	private PaymentVoucherUseRuleModify voucherUseRule;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Date getPublishEndTime() {
		return this.publishEndTime;
	}
	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	public PaymentVoucherUseRuleModify getVoucherUseRule() {
		return this.voucherUseRule;
	}
	public void setVoucherUseRule(PaymentVoucherUseRuleModify voucherUseRule) {
		this.voucherUseRule = voucherUseRule;
	}

}

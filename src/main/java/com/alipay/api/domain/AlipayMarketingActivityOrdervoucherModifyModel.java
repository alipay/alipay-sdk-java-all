package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单券修改
 *
 * @author auto create
 * @since 1.0, 2021-12-29 15:08:37
 */
public class AlipayMarketingActivityOrdervoucherModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6335775642485341837L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 引导用户配置。该值为空表示不修改。
	 */
	@ApiField("customer_guide")
	private CustomerGuideModify customerGuide;

	/**
	 * 外部业务单号，用作幂等控制。

幂等作用：
参数不变的情况下，再次请求返回与上一次相同的结果。
外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券发放结束时间。该值为空表示不修改

格式为：yyyy-MM-dd HH:mm:ss

限制：
1、券发放结束时间publish_end_time 与 券发放开始时间publish_start_time 间隔必须小于等于180天
2、修改发放结束时间，只能延长，不允许缩短。
3、活动已到期或已停止修改结束时间不会生效
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 券展示信息。该值为空表示不修改。
	 */
	@ApiField("voucher_display_info")
	private VoucherDisplayInfoModify voucherDisplayInfo;

	/**
	 * 券使用规则。该值为空表示不修改。
	 */
	@ApiField("voucher_use_rule")
	private VoucherUseRuleModify voucherUseRule;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public CustomerGuideModify getCustomerGuide() {
		return this.customerGuide;
	}
	public void setCustomerGuide(CustomerGuideModify customerGuide) {
		this.customerGuide = customerGuide;
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

	public VoucherDisplayInfoModify getVoucherDisplayInfo() {
		return this.voucherDisplayInfo;
	}
	public void setVoucherDisplayInfo(VoucherDisplayInfoModify voucherDisplayInfo) {
		this.voucherDisplayInfo = voucherDisplayInfo;
	}

	public VoucherUseRuleModify getVoucherUseRule() {
		return this.voucherUseRule;
	}
	public void setVoucherUseRule(VoucherUseRuleModify voucherUseRule) {
		this.voucherUseRule = voucherUseRule;
	}

}

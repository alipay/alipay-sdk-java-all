package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建支付券
 *
 * @author auto create
 * @since 1.0, 2021-09-07 23:08:31
 */
public class AlipayMarketingActivityVoucherCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6311981379489621968L;

	/**
	 * 活动名称。 不对用户进行展示，仅供商家在后台管理活动使用。
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 归属商户信息，默认归属商户为当前请求商户
	 */
	@ApiField("belong_merchant_info")
	private PaymentVoucherBelongMerchantInfo belongMerchantInfo;

	/**
	 * 外部业务单号，用作幂等控制。

幂等作用：
参数不变的情况下，再次请求返回与上一次相同的结果。

外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券发放结束时间。 格式为：yyyy-MM-dd HH:mm:ss 限制： 券发放结束时间 publish_end_time 与 券发放开始时间 publish_start_time 间隔必须小于等于180天
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 券发放开始时间。 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 营销资金预算
	 */
	@ApiField("voucher_budget_info")
	private PaymentVoucherBudgetInfo voucherBudgetInfo;

	/**
	 * 券详情页
	 */
	@ApiField("voucher_display_info")
	private PaymentVoucherDisplayInfo voucherDisplayInfo;

	/**
	 * 券发放规则
	 */
	@ApiField("voucher_send_rule")
	private PaymentVoucherSendRule voucherSendRule;

	/**
	 * 优惠类型

枚举值：
FIX_VOUCHER：固定面额满减券
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 券核销规则
	 */
	@ApiField("voucher_use_rule")
	private PaymentVoucherUseRule voucherUseRule;

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public PaymentVoucherBelongMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(PaymentVoucherBelongMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
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

	public Date getPublishStartTime() {
		return this.publishStartTime;
	}
	public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

	public PaymentVoucherBudgetInfo getVoucherBudgetInfo() {
		return this.voucherBudgetInfo;
	}
	public void setVoucherBudgetInfo(PaymentVoucherBudgetInfo voucherBudgetInfo) {
		this.voucherBudgetInfo = voucherBudgetInfo;
	}

	public PaymentVoucherDisplayInfo getVoucherDisplayInfo() {
		return this.voucherDisplayInfo;
	}
	public void setVoucherDisplayInfo(PaymentVoucherDisplayInfo voucherDisplayInfo) {
		this.voucherDisplayInfo = voucherDisplayInfo;
	}

	public PaymentVoucherSendRule getVoucherSendRule() {
		return this.voucherSendRule;
	}
	public void setVoucherSendRule(PaymentVoucherSendRule voucherSendRule) {
		this.voucherSendRule = voucherSendRule;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

	public PaymentVoucherUseRule getVoucherUseRule() {
		return this.voucherUseRule;
	}
	public void setVoucherUseRule(PaymentVoucherUseRule voucherUseRule) {
		this.voucherUseRule = voucherUseRule;
	}

}

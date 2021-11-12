package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PaymentVoucherBelongMerchantInfo;
import com.alipay.api.domain.VoucherSummary;
import com.alipay.api.domain.PaymentVoucherBudgetInfo;
import com.alipay.api.domain.PaymentVoucherDisplayInfo;
import com.alipay.api.domain.PaymentVoucherSendRule;
import com.alipay.api.domain.PaymentVoucherUseRuleDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-03 15:55:31
 */
public class AlipayMarketingActivityVoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7224921999832391971L;

	/** 
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 活动名称。 不对用户进行展示，仅供商家在后台管理活动使用。
	 */
	@ApiField("activity_name")
	private String activityName;

	/** 
	 * 活动状态
枚举值：
INIT 未激活 
ACTIVE：已激活
FINISHED：已停止 
如果该值为空，说明活动还未创建成功。
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/** 
	 * 归属商户信息
	 */
	@ApiField("belong_merchant_info")
	private PaymentVoucherBelongMerchantInfo belongMerchantInfo;

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
	 * 券汇总信息
	 */
	@ApiField("summary")
	private VoucherSummary summary;

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
	 * 支付券核销规则
	 */
	@ApiField("voucher_use_rule")
	private PaymentVoucherUseRuleDetail voucherUseRule;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityName( ) {
		return this.activityName;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}
	public String getActivityStatus( ) {
		return this.activityStatus;
	}

	public void setBelongMerchantInfo(PaymentVoucherBelongMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}
	public PaymentVoucherBelongMerchantInfo getBelongMerchantInfo( ) {
		return this.belongMerchantInfo;
	}

	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}
	public Date getPublishEndTime( ) {
		return this.publishEndTime;
	}

	public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}
	public Date getPublishStartTime( ) {
		return this.publishStartTime;
	}

	public void setSummary(VoucherSummary summary) {
		this.summary = summary;
	}
	public VoucherSummary getSummary( ) {
		return this.summary;
	}

	public void setVoucherBudgetInfo(PaymentVoucherBudgetInfo voucherBudgetInfo) {
		this.voucherBudgetInfo = voucherBudgetInfo;
	}
	public PaymentVoucherBudgetInfo getVoucherBudgetInfo( ) {
		return this.voucherBudgetInfo;
	}

	public void setVoucherDisplayInfo(PaymentVoucherDisplayInfo voucherDisplayInfo) {
		this.voucherDisplayInfo = voucherDisplayInfo;
	}
	public PaymentVoucherDisplayInfo getVoucherDisplayInfo( ) {
		return this.voucherDisplayInfo;
	}

	public void setVoucherSendRule(PaymentVoucherSendRule voucherSendRule) {
		this.voucherSendRule = voucherSendRule;
	}
	public PaymentVoucherSendRule getVoucherSendRule( ) {
		return this.voucherSendRule;
	}

	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}
	public String getVoucherType( ) {
		return this.voucherType;
	}

	public void setVoucherUseRule(PaymentVoucherUseRuleDetail voucherUseRule) {
		this.voucherUseRule = voucherUseRule;
	}
	public PaymentVoucherUseRuleDetail getVoucherUseRule( ) {
		return this.voucherUseRule;
	}

}

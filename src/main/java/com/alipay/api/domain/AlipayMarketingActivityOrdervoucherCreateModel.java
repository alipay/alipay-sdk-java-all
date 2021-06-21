package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建订单券
 *
 * @author auto create
 * @since 1.0, 2021-05-12 23:07:51
 */
public class AlipayMarketingActivityOrdervoucherCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3569613664117425263L;

	/**
	 * 活动名称。

不对用户进行展示，仅供商家在后台管理活动使用。
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 商家券活动归属的商户信息。

说明：
如果该复杂对象不填。则默认为该商家券活动的归属者是调用者本人。
如果填写，则认为该商家券活动的归属者是该商户。
	 */
	@ApiField("belong_merchant_info")
	private BelongMerchantInfo belongMerchantInfo;

	/**
	 * 码模式。

枚举值：
MERCHANT_UPLOAD：商户上传自定义code，发券时系统随机选取上传的券code发放
	 */
	@ApiField("code_mode")
	private String codeMode;

	/**
	 * 用户引导相关配置
	 */
	@ApiField("customer_guide")
	private CustomerGuide customerGuide;

	/**
	 * 外部业务单号，用作幂等控制。

幂等作用：
参数不变的情况下，再次请求返回与上一次相同的结果。

外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券发放结束时间。



格式为：yyyy-MM-dd HH:mm:ss



限制：

券发放结束时间

publish_end_time 与 券发放开始时间

publish_start_time 间隔必须小于等于180天
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 券发放开始时间。

格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 券展示信息
	 */
	@ApiField("voucher_display_info")
	private VoucherDisplayInfo voucherDisplayInfo;

	/**
	 * 券发放规则
	 */
	@ApiField("voucher_send_rule")
	private VoucherSendRuleDetail voucherSendRule;

	/**
	 * 券类型。

枚举值：
FIX_VOUCHER：满减券。
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 券核销规则
	 */
	@ApiField("voucher_use_rule")
	private VoucherUseRule voucherUseRule;

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public BelongMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(BelongMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public String getCodeMode() {
		return this.codeMode;
	}
	public void setCodeMode(String codeMode) {
		this.codeMode = codeMode;
	}

	public CustomerGuide getCustomerGuide() {
		return this.customerGuide;
	}
	public void setCustomerGuide(CustomerGuide customerGuide) {
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

	public Date getPublishStartTime() {
		return this.publishStartTime;
	}
	public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

	public VoucherDisplayInfo getVoucherDisplayInfo() {
		return this.voucherDisplayInfo;
	}
	public void setVoucherDisplayInfo(VoucherDisplayInfo voucherDisplayInfo) {
		this.voucherDisplayInfo = voucherDisplayInfo;
	}

	public VoucherSendRuleDetail getVoucherSendRule() {
		return this.voucherSendRule;
	}
	public void setVoucherSendRule(VoucherSendRuleDetail voucherSendRule) {
		this.voucherSendRule = voucherSendRule;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

	public VoucherUseRule getVoucherUseRule() {
		return this.voucherUseRule;
	}
	public void setVoucherUseRule(VoucherUseRule voucherUseRule) {
		this.voucherUseRule = voucherUseRule;
	}

}

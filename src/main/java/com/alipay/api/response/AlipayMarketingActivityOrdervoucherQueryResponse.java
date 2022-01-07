package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BelongMerchantInfo;
import com.alipay.api.domain.CustomerGuide;
import com.alipay.api.domain.VoucherSummary;
import com.alipay.api.domain.VoucherDisplayInfo;
import com.alipay.api.domain.VoucherSendRuleDetail;
import com.alipay.api.domain.VoucherUseRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-08 20:36:41
 */
public class AlipayMarketingActivityOrdervoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2276497598886972325L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 活动名称。

不对用户进行展示，仅供商家在后台管理活动使用。
	 */
	@ApiField("activity_name")
	private String activityName;

	/** 
	 * 活动操作状态



CREATING：创建中



MODIFYING：修改中



APPENDING：追加中



FINISHEING：停止中



如果该值为空，说明活动当前没有正在执行中的操作。
	 */
	@ApiField("activity_operation_status")
	private String activityOperationStatus;

	/** 
	 * 活动状态，状态枚举：



ACTIVE：已激活



FINISHED：已停止



如果该值为空，说明活动还未创建成功。可以使用

activity_operation_status字段判断活动是否处于CREATING状态。
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/** 
	 * 活动所属的商户信息。
如果为空.则是因为创建时未传入，默认为活动归属于接口的调用者。
	 */
	@ApiField("belong_merchant_info")
	private BelongMerchantInfo belongMerchantInfo;

	/** 
	 * 商家券业务标签，影响商家券对C端用户的展示形式。 枚举值 兑换券团购场景 GROUP_BUY_EXCHANGE_VOUCHER 兑换券代金场景 FIX_EXCHANGE_VOUCHER
	 */
	@ApiField("biz_tag")
	private String bizTag;

	/** 
	 * 用户引导相关配置
	 */
	@ApiField("customer_guide")
	private CustomerGuide customerGuide;

	/** 
	 * 券发放结束时间。

格式为：yyyy-MM-dd HH:mm:ss
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
	 * 券汇总信息
	 */
	@ApiField("summary")
	private VoucherSummary summary;

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
 枚举值： FIX_VOUCHER：固定面额满减券 EXCHANGE_VOUCHER: 兑换券
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/** 
	 * 券使用规则
	 */
	@ApiField("voucher_use_rule")
	private VoucherUseRule voucherUseRule;

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

	public void setActivityOperationStatus(String activityOperationStatus) {
		this.activityOperationStatus = activityOperationStatus;
	}
	public String getActivityOperationStatus( ) {
		return this.activityOperationStatus;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}
	public String getActivityStatus( ) {
		return this.activityStatus;
	}

	public void setBelongMerchantInfo(BelongMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}
	public BelongMerchantInfo getBelongMerchantInfo( ) {
		return this.belongMerchantInfo;
	}

	public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
	}
	public String getBizTag( ) {
		return this.bizTag;
	}

	public void setCustomerGuide(CustomerGuide customerGuide) {
		this.customerGuide = customerGuide;
	}
	public CustomerGuide getCustomerGuide( ) {
		return this.customerGuide;
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

	public void setVoucherDisplayInfo(VoucherDisplayInfo voucherDisplayInfo) {
		this.voucherDisplayInfo = voucherDisplayInfo;
	}
	public VoucherDisplayInfo getVoucherDisplayInfo( ) {
		return this.voucherDisplayInfo;
	}

	public void setVoucherSendRule(VoucherSendRuleDetail voucherSendRule) {
		this.voucherSendRule = voucherSendRule;
	}
	public VoucherSendRuleDetail getVoucherSendRule( ) {
		return this.voucherSendRule;
	}

	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}
	public String getVoucherType( ) {
		return this.voucherType;
	}

	public void setVoucherUseRule(VoucherUseRule voucherUseRule) {
		this.voucherUseRule = voucherUseRule;
	}
	public VoucherUseRule getVoucherUseRule( ) {
		return this.voucherUseRule;
	}

}

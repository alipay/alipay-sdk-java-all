package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CommonVoucherDisplayInfo;
import com.alipay.api.domain.CommonVoucherSendRule;
import com.alipay.api.domain.CommonVoucherUseRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-20 20:10:39
 */
public class AlipayMarketingActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5541567441495131767L;

	/** 
	 * 活动id
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
ACTIVE:活动已激活，表示活动已经生效，等到活动开始(publish_start_time)之后用户就可以参与活动。
PAUSE:活动已暂停，表示商户临时暂停该活动，该状态下用户不能参与活动
FINISHED:活动已结束，表示商户主动停止活动或活动到期结束(publish_end_time)不能再进行领取或修改等操作。
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/** 
	 * 归属商户PID
	 */
	@ApiField("belong_merchant_id")
	private String belongMerchantId;

	/** 
	 * 券发放结束时间。 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/** 
	 * 券发放开始时间。 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/** 
	 * 券展示信息
	 */
	@ApiField("voucher_display_info")
	private CommonVoucherDisplayInfo voucherDisplayInfo;

	/** 
	 * 券发放规则
	 */
	@ApiField("voucher_send_rule")
	private CommonVoucherSendRule voucherSendRule;

	/** 
	 * 券类型。 
枚举值： 
FIX_VOUCHER：满减券； 
DISCOUNT_VOUCHER：折扣券；
SPECIAL_VOUCHER：特价券；
EXCHANGE_VOUCHER: 兑换券；
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/** 
	 * 券核销规则
	 */
	@ApiField("voucher_use_rule")
	private CommonVoucherUseRule voucherUseRule;

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

	public void setBelongMerchantId(String belongMerchantId) {
		this.belongMerchantId = belongMerchantId;
	}
	public String getBelongMerchantId( ) {
		return this.belongMerchantId;
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

	public void setVoucherDisplayInfo(CommonVoucherDisplayInfo voucherDisplayInfo) {
		this.voucherDisplayInfo = voucherDisplayInfo;
	}
	public CommonVoucherDisplayInfo getVoucherDisplayInfo( ) {
		return this.voucherDisplayInfo;
	}

	public void setVoucherSendRule(CommonVoucherSendRule voucherSendRule) {
		this.voucherSendRule = voucherSendRule;
	}
	public CommonVoucherSendRule getVoucherSendRule( ) {
		return this.voucherSendRule;
	}

	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}
	public String getVoucherType( ) {
		return this.voucherType;
	}

	public void setVoucherUseRule(CommonVoucherUseRule voucherUseRule) {
		this.voucherUseRule = voucherUseRule;
	}
	public CommonVoucherUseRule getVoucherUseRule( ) {
		return this.voucherUseRule;
	}

}

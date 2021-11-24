package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ActivityDisplayInfo;
import com.alipay.api.domain.ActivitySendRule;
import com.alipay.api.domain.ActivityUseRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-17 10:15:32
 */
public class AlipayMarketingActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1269698792534384996L;

	/** 
	 * 券展示信息
	 */
	@ApiField("activity_display_info")
	private ActivityDisplayInfo activityDisplayInfo;

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
	 * 券发放规则
	 */
	@ApiField("activity_send_rule")
	private ActivitySendRule activitySendRule;

	/** 
	 * 活动状态 枚举值： INIT 未激活 ACTIVE：已激活 FINISHED：已停止 如果该值为空，说明活动还未创建成功。
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/** 
	 * 核销规则
	 */
	@ApiField("activity_use_rule")
	private ActivityUseRule activityUseRule;

	/** 
	 * 归属商户PID
	 */
	@ApiField("belong_merchant_id")
	private String belongMerchantId;

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
	 * 优惠类型 枚举值： FIX_VOUCHER：固定面额满减券
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public void setActivityDisplayInfo(ActivityDisplayInfo activityDisplayInfo) {
		this.activityDisplayInfo = activityDisplayInfo;
	}
	public ActivityDisplayInfo getActivityDisplayInfo( ) {
		return this.activityDisplayInfo;
	}

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

	public void setActivitySendRule(ActivitySendRule activitySendRule) {
		this.activitySendRule = activitySendRule;
	}
	public ActivitySendRule getActivitySendRule( ) {
		return this.activitySendRule;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}
	public String getActivityStatus( ) {
		return this.activityStatus;
	}

	public void setActivityUseRule(ActivityUseRule activityUseRule) {
		this.activityUseRule = activityUseRule;
	}
	public ActivityUseRule getActivityUseRule( ) {
		return this.activityUseRule;
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

	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}
	public String getVoucherType( ) {
		return this.voucherType;
	}

}

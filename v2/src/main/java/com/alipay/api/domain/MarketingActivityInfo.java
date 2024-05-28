package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销活动模型
 *
 * @author auto create
 * @since 1.0, 2020-12-28 20:27:32
 */
public class MarketingActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 8786242938528593731L;

	/**
	 * 活动结束时间，即券可领取结束时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("activity_end_time")
	private String activityEndTime;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动开始时间，即券可领取开始时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("activity_start_time")
	private String activityStartTime;

	/**
	 * 活动状态：
草稿(INIT),已提交审核(P_AUDIT),已审核(AUDIT),待激活(WAIT_ACTIVE),激活(ACTIVE),暂停(PAUSE),已结束(FINISHED),已废弃(DISCARD)
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/**
	 * 商户logo
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 券模板列表
	 */
	@ApiListField("voucher_template_list")
	@ApiField("voucher_template")
	private List<VoucherTemplate> voucherTemplateList;

	public String getActivityEndTime() {
		return this.activityEndTime;
	}
	public void setActivityEndTime(String activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityStartTime() {
		return this.activityStartTime;
	}
	public void setActivityStartTime(String activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

	public String getActivityStatus() {
		return this.activityStatus;
	}
	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	public String getMerchantLogo() {
		return this.merchantLogo;
	}
	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public List<VoucherTemplate> getVoucherTemplateList() {
		return this.voucherTemplateList;
	}
	public void setVoucherTemplateList(List<VoucherTemplate> voucherTemplateList) {
		this.voucherTemplateList = voucherTemplateList;
	}

}

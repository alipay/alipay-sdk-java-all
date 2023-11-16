package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销活动信息
 *
 * @author auto create
 * @since 1.0, 2021-07-19 15:26:24
 */
public class MarketActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 8762211943415579345L;

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
	 * 活动发起方LOGO
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 活动发起方名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 发放结束时间. 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private String publishEndTime;

	/**
	 * 发放开始时间. 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private String publishStartTime;

	/**
	 * 活动状态; 
ACTIVE: 已经发布, 
PAUSE:已经暂停,
FINISHED: 已结束
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券列表
	 */
	@ApiListField("voucher_infos")
	@ApiField("voucher_template_info")
	private List<VoucherTemplateInfo> voucherInfos;

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

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getPublishEndTime() {
		return this.publishEndTime;
	}
	public void setPublishEndTime(String publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	public String getPublishStartTime() {
		return this.publishStartTime;
	}
	public void setPublishStartTime(String publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<VoucherTemplateInfo> getVoucherInfos() {
		return this.voucherInfos;
	}
	public void setVoucherInfos(List<VoucherTemplateInfo> voucherInfos) {
		this.voucherInfos = voucherInfos;
	}

}

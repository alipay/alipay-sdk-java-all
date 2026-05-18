package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义藏品活动创建
 *
 * @author auto create
 * @since 1.0, 2026-04-14 16:27:46
 */
public class AnttechNftSkuCampaignCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5498159145245522145L;

	/**
	 * 活动业务类型 
	 */
	@ApiField("camp_biz_type")
	private String campBizType;

	/**
	 * 活动名称
	 */
	@ApiField("camp_name")
	private String campName;

	/**
	 * 必填，string时间类型，格式为“年月日时分秒”
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 人群ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * sku的id
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 必填，string时间类型，格式为“年月日时分秒”
	 */
	@ApiField("start_time")
	private String startTime;

	public String getCampBizType() {
		return this.campBizType;
	}
	public void setCampBizType(String campBizType) {
		this.campBizType = campBizType;
	}

	public String getCampName() {
		return this.campName;
	}
	public void setCampName(String campName) {
		this.campName = campName;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}

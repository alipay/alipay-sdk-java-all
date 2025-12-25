package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告素材创建接口
 *
 * @author auto create
 * @since 1.0, 2025-12-16 15:47:42
 */
public class AlipayCommerceRetailBenefitmaterialCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7536347613434568592L;

	/**
	 * 素材feeds版URL，feeds已废弃
	 */
	@ApiField("activity_material_feeds_url")
	private String activityMaterialFeedsUrl;

	/**
	 * 素材来源
	 */
	@ApiField("activity_material_type")
	private String activityMaterialType;

	/**
	 * 素材URL
	 */
	@ApiField("activity_material_url")
	private String activityMaterialUrl;

	/**
	 * 素材名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 素材规则
	 */
	@ApiField("activity_rule")
	private String activityRule;

	/**
	 * 活动分类
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 素材所属的活动ID
	 */
	@ApiField("advertised_activity_id")
	private String advertisedActivityId;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 链接信息
	 */
	@ApiField("en_info")
	private String enInfo;

	/**
	 * 开始时间，传关联的权益（广告）活动的【结束时间】
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 业务来源.业务来源+幂等号确保唯一
	 */
	@ApiField("material_source")
	private String materialSource;

	/**
	 * 操作员信息
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 幂等号. 业务来源+幂等号确保唯一
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 投放优先级
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 开始时间，传关联的权益（广告）活动的【开始时间】
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 跳转链接地址
	 */
	@ApiField("url")
	private String url;

	/**
	 * 目标地址类型
	 */
	@ApiField("url_type")
	private String urlType;

	public String getActivityMaterialFeedsUrl() {
		return this.activityMaterialFeedsUrl;
	}
	public void setActivityMaterialFeedsUrl(String activityMaterialFeedsUrl) {
		this.activityMaterialFeedsUrl = activityMaterialFeedsUrl;
	}

	public String getActivityMaterialType() {
		return this.activityMaterialType;
	}
	public void setActivityMaterialType(String activityMaterialType) {
		this.activityMaterialType = activityMaterialType;
	}

	public String getActivityMaterialUrl() {
		return this.activityMaterialUrl;
	}
	public void setActivityMaterialUrl(String activityMaterialUrl) {
		this.activityMaterialUrl = activityMaterialUrl;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityRule() {
		return this.activityRule;
	}
	public void setActivityRule(String activityRule) {
		this.activityRule = activityRule;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getAdvertisedActivityId() {
		return this.advertisedActivityId;
	}
	public void setAdvertisedActivityId(String advertisedActivityId) {
		this.advertisedActivityId = advertisedActivityId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getEnInfo() {
		return this.enInfo;
	}
	public void setEnInfo(String enInfo) {
		this.enInfo = enInfo;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMaterialSource() {
		return this.materialSource;
	}
	public void setMaterialSource(String materialSource) {
		this.materialSource = materialSource;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlType() {
		return this.urlType;
	}
	public void setUrlType(String urlType) {
		this.urlType = urlType;
	}

}

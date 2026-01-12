package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告权益修改接口
 *
 * @author auto create
 * @since 1.0, 2025-12-16 15:47:41
 */
public class AlipayCommerceRetailBenefitSaveModel extends AlipayObject {

	private static final long serialVersionUID = 3339512315397583552L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * Feeds素材url
	 */
	@ApiField("activity_material_feeds_url")
	private String activityMaterialFeedsUrl;

	/**
	 * 默认
	 */
	@ApiField("activity_material_type")
	private String activityMaterialType;

	/**
	 * 素材地址
	 */
	@ApiField("activity_material_url")
	private String activityMaterialUrl;

	/**
	 * 活动名称，当该字段不传时默认不修改
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动规则
	 */
	@ApiField("activity_rule")
	private String activityRule;

	/**
	 * null
	 */
	@ApiListField("activity_scope_list")
	@ApiField("string")
	private List<String> activityScopeList;

	/**
	 * 活动来源，当该字段不传时默认不修改
	 */
	@ApiField("activity_source")
	private String activitySource;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 广告ID
	 */
	@ApiField("advert_id")
	private String advertId;

	/**
	 * 品牌权益图片
	 */
	@ApiField("brand_image")
	private String brandImage;

	/**
	 * 品牌logo图片
	 */
	@ApiField("brand_logo_image")
	private String brandLogoImage;

	/**
	 * 品牌名称，当该字段不传时默认不修改
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 信息
	 */
	@ApiField("en_info")
	private String enInfo;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 操作员信息
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 投放优先级
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * null
	 */
	@ApiListField("prize_infos")
	@ApiField("string")
	private List<String> prizeInfos;

	/**
	 * 备注字段
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 开始时间，当该字段不传时默认不修改
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 端内外url链接
	 */
	@ApiField("url")
	private String url;

	/**
	 * url类型
	 */
	@ApiField("url_type")
	private String urlType;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

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

	public List<String> getActivityScopeList() {
		return this.activityScopeList;
	}
	public void setActivityScopeList(List<String> activityScopeList) {
		this.activityScopeList = activityScopeList;
	}

	public String getActivitySource() {
		return this.activitySource;
	}
	public void setActivitySource(String activitySource) {
		this.activitySource = activitySource;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getAdvertId() {
		return this.advertId;
	}
	public void setAdvertId(String advertId) {
		this.advertId = advertId;
	}

	public String getBrandImage() {
		return this.brandImage;
	}
	public void setBrandImage(String brandImage) {
		this.brandImage = brandImage;
	}

	public String getBrandLogoImage() {
		return this.brandLogoImage;
	}
	public void setBrandLogoImage(String brandLogoImage) {
		this.brandLogoImage = brandLogoImage;
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

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public List<String> getPrizeInfos() {
		return this.prizeInfos;
	}
	public void setPrizeInfos(List<String> prizeInfos) {
		this.prizeInfos = prizeInfos;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
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

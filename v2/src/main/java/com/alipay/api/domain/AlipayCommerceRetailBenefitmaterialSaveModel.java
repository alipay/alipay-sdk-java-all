package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告素材编辑接口
 *
 * @author auto create
 * @since 1.0, 2025-12-16 15:47:42
 */
public class AlipayCommerceRetailBenefitmaterialSaveModel extends AlipayObject {

	private static final long serialVersionUID = 8626574376219828934L;

	/**
	 * 素材feeds版URL，字段为空意味着不修改该字段
	 */
	@ApiField("activity_material_feeds_url")
	private String activityMaterialFeedsUrl;

	/**
	 * 素材来源，字段为空意味着不修改该字段
	 */
	@ApiField("activity_material_type")
	private String activityMaterialType;

	/**
	 * 素材URL，字段为空意味着不修改该字段
	 */
	@ApiField("activity_material_url")
	private String activityMaterialUrl;

	/**
	 * 素材名称， 字段为空意味着不修改该字段
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 素材规则
	 */
	@ApiField("activity_rule")
	private String activityRule;

	/**
	 * 活动类型，不定传MATERIAL_ADVERTISEMENT
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 品牌名称，字段为空意味着不修改该字段
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 链接信息，字段为空意味着不修改该字段
	 */
	@ApiField("en_info")
	private String enInfo;

	/**
	 * 结束时间，字段为空意味着不修改该字段
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 素材id
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 业务来源
	 */
	@ApiField("material_source")
	private String materialSource;

	/**
	 * 操作者信息
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 优先级， 字段为空意味着不修改该字段
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 备注字段，描述本次修改的内容
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 开始时间，字段为空意味着不修改该字段
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 目标地址，字段为空意味着不修改该字段
	 */
	@ApiField("url")
	private String url;

	/**
	 * 目标地址类型， 字段为空意味着不修改该字段
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

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
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

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
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

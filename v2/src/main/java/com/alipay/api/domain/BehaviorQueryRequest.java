package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行为分析查询参数
 *
 * @author auto create
 * @since 1.0, 2023-01-17 11:13:59
 */
public class BehaviorQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 8244532368779136397L;

	/**
	 * 查询访问用户 30 天内访问频次（次）和时长（天）（scene_code=vis_features）、查询会员用户 30 天内支付频次（次）和支付客单（元）（scene_code=mem_features）、以及查询支付用户 30 天内支付频次（次）、支付客单（元）和支付距今天数（天）（scene_code=pay_user_features）时必填。
	 */
	@ApiField("feature")
	private String feature;

	/**
	 * 关系对象主体类型id，即资产关系是建立在什么对象id上的，如小程序appid、生活号id、直播间id、卡模板id等。
	 */
	@ApiField("object_id")
	private String objectId;

	/**
	 * 关系对象主体类型，即资产关系是建立在什么对象上的。查询用户来源分布（scene_code=all_users_distribution）、查询访问用户 30 天内访问频次（次）和时长（天）（scene_code=vis_features）、查询支付用户 30 天内支付频次（次）、支付客单（元）和支付距今天数（天）（scene_code=pay_user_features）时必填。
	 */
	@ApiField("object_type")
	private String objectType;

	/**
	 * 用户资产关系类型，查询用户来源分布（scene_code=all_users_distribution）时必填。
	 */
	@ApiField("relation_type")
	private String relationType;

	/**
	 * 数据日期，格式yyyyMMdd。
	 */
	@ApiField("report_date")
	private String reportDate;

	public String getFeature() {
		return this.feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getObjectId() {
		return this.objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getObjectType() {
		return this.objectType;
	}
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}

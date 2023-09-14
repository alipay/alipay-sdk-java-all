package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物体分类智能识别
 *
 * @author auto create
 * @since 1.0, 2020-10-12 16:13:43
 */
public class AlipayIserviceCognitiveClassificationObjectQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3885486394215616561L;

	/**
	 * 业务编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 图片地址
	 */
	@ApiField("cognition_content")
	private String cognitionContent;

	/**
	 * 识别类型
	 */
	@ApiField("cognition_type")
	private String cognitionType;

	/**
	 * 图片组id 适用于一组拍摄多张图片，后续模型训练使用
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 测试请求，会过滤掉，不会落库并进行数据标注
	 */
	@ApiField("test_query")
	private Boolean testQuery;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCognitionContent() {
		return this.cognitionContent;
	}
	public void setCognitionContent(String cognitionContent) {
		this.cognitionContent = cognitionContent;
	}

	public String getCognitionType() {
		return this.cognitionType;
	}
	public void setCognitionType(String cognitionType) {
		this.cognitionType = cognitionType;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public Boolean getTestQuery() {
		return this.testQuery;
	}
	public void setTestQuery(Boolean testQuery) {
		this.testQuery = testQuery;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

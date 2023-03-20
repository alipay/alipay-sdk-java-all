package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ai open search热搜接口
 *
 * @author auto create
 * @since 1.0, 2022-11-25 11:46:14
 */
public class AlipayOpenMiniCloudAoshotQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8693287865213746492L;

	/**
	 * 用户当前城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 客户端环境
	 */
	@ApiField("client_env")
	private String clientEnv;

	/**
	 * 用户设备id
	 */
	@ApiField("device_id")
	private String deviceId;

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
	 * 商家在蚂蚁搜索引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 可以关联到用户的标识信息，用于关联用户的特征。例如手机号、设备号、邮箱等。格式为：“类型#sha256(值）”，类型枚举有：PHONE（手机号）、DEVICE（设备号）、EMAIL（邮箱）等，具体的值是用sha256进行哈希之后的hex表示，多个标识信息用,分割
	 */
	@ApiField("relevant_id")
	private String relevantId;

	/**
	 * 期待返回的热搜结果数量，返回的热搜条数，默认10，最多50
	 */
	@ApiField("size")
	private Long size;

	/**
	 * default：默认热搜结果，pv：查询pv最高的热搜，uv：查询uv最高的热搜
	 */
	@ApiField("sort_type")
	private String sortType;

	/**
	 * 用户唯一标识id，可以是支付宝userid、商家自定义的userid等
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户id的类型，可选值：ALIPAY（支付宝userid）、CUSTOM（商家自定义的userid）
	 */
	@ApiField("user_id_type")
	private String userIdType;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getClientEnv() {
		return this.clientEnv;
	}
	public void setClientEnv(String clientEnv) {
		this.clientEnv = clientEnv;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
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

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getRelevantId() {
		return this.relevantId;
	}
	public void setRelevantId(String relevantId) {
		this.relevantId = relevantId;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public String getSortType() {
		return this.sortType;
	}
	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdType() {
		return this.userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

}

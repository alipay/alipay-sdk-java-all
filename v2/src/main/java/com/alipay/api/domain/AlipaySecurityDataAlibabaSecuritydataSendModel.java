package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送阿里集团风控数据到蚂蚁
 *
 * @author auto create
 * @since 1.0, 2022-11-14 11:59:57
 */
public class AlipaySecurityDataAlibabaSecuritydataSendModel extends AlipayObject {

	private static final long serialVersionUID = 1717814948132786748L;

	/**
	 * 业务描述信息
	 */
	@ApiField("biz_content_value")
	private String bizContentValue;

	/**
	 * 业务数据唯一标识，可以是traceId
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 数据平台数据接入名称
	 */
	@ApiField("ingest_name")
	private String ingestName;

	/**
	 * 数据主体类型
	 */
	@ApiField("main_target_type")
	private String mainTargetType;

	/**
	 * 数据主体值
	 */
	@ApiField("main_target_value")
	private String mainTargetValue;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 一级属性
	 */
	@ApiField("property")
	private String property;

	/**
	 * 二级属性
	 */
	@ApiField("property_second")
	private String propertySecond;

	/**
	 * 三级属性
	 */
	@ApiField("property_third")
	private String propertyThird;

	/**
	 * 风险类型
	 */
	@ApiField("risk_type")
	private String riskType;

	/**
	 * 数据使用范围，security或者其他范围
	 */
	@ApiField("scope")
	private String scope;

	/**
	 * 数据来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 数据发送方系统名称
	 */
	@ApiField("system_name")
	private String systemName;

	/**
	 * 安全数据平台资产表名
	 */
	@ApiField("table_name")
	private String tableName;

	/**
	 * 数据产生时间
	 */
	@ApiField("time")
	private String time;

	/**
	 * 数据使用范围，security或者其他范围
	 */
	@ApiField("use_scope")
	private String useScope;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizContentValue() {
		return this.bizContentValue;
	}
	public void setBizContentValue(String bizContentValue) {
		this.bizContentValue = bizContentValue;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getIngestName() {
		return this.ingestName;
	}
	public void setIngestName(String ingestName) {
		this.ingestName = ingestName;
	}

	public String getMainTargetType() {
		return this.mainTargetType;
	}
	public void setMainTargetType(String mainTargetType) {
		this.mainTargetType = mainTargetType;
	}

	public String getMainTargetValue() {
		return this.mainTargetValue;
	}
	public void setMainTargetValue(String mainTargetValue) {
		this.mainTargetValue = mainTargetValue;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProperty() {
		return this.property;
	}
	public void setProperty(String property) {
		this.property = property;
	}

	public String getPropertySecond() {
		return this.propertySecond;
	}
	public void setPropertySecond(String propertySecond) {
		this.propertySecond = propertySecond;
	}

	public String getPropertyThird() {
		return this.propertyThird;
	}
	public void setPropertyThird(String propertyThird) {
		this.propertyThird = propertyThird;
	}

	public String getRiskType() {
		return this.riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSystemName() {
		return this.systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getTableName() {
		return this.tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getUseScope() {
		return this.useScope;
	}
	public void setUseScope(String useScope) {
		this.useScope = useScope;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

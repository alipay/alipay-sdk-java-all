package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询DB访问慢日志汇总
 *
 * @author auto create
 * @since 1.0, 2024-05-28 11:33:37
 */
public class AlipayCloudCloudbaseDatabaseSlowsqlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7629723197365898172L;

	/**
	 * 应用ID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境ID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 客户端ip地址
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 集合名称
	 */
	@ApiField("collection_name")
	private String collectionName;

	/**
	 * 结束时间
	 */
	@ApiField("end")
	private String end;

	/**
	 * 过滤类型
 - literal_or
 - not_literal_or
 - wildcard
 - regexp
 - not_regexp_match
 - literal
 - not_literal
	 */
	@ApiField("filter_type")
	private String filterType;

	/**
	 * 函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 指标
 - total
 - cost
	 */
	@ApiField("metric")
	private String metric;

	/**
	 * 开始时间
	 */
	@ApiField("start")
	private String start;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getCollectionName() {
		return this.collectionName;
	}
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public String getEnd() {
		return this.end;
	}
	public void setEnd(String end) {
		this.end = end;
	}

	public String getFilterType() {
		return this.filterType;
	}
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getMetric() {
		return this.metric;
	}
	public void setMetric(String metric) {
		this.metric = metric;
	}

	public String getStart() {
		return this.start;
	}
	public void setStart(String start) {
		this.start = start;
	}

}

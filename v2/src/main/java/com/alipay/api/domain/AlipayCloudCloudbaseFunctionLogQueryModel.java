package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询云函数日志
 *
 * @author auto create
 * @since 1.0, 2023-08-21 20:49:54
 */
public class AlipayCloudCloudbaseFunctionLogQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3268295869949231613L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 是否倒序
	 */
	@ApiField("desc")
	private Boolean desc;

	/**
	 * 结束时间
	 */
	@ApiField("end")
	private String end;

	/**
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 是否显示系统日志
	 */
	@ApiField("show_system_log")
	private Boolean showSystemLog;

	/**
	 * 开始时间
	 */
	@ApiField("start")
	private String start;

	/**
	 * trace ID
	 */
	@ApiField("trace_id")
	private String traceId;

	/**
	 * 查询参数
	 */
	@ApiField("user_query")
	private String userQuery;

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

	public Boolean getDesc() {
		return this.desc;
	}
	public void setDesc(Boolean desc) {
		this.desc = desc;
	}

	public String getEnd() {
		return this.end;
	}
	public void setEnd(String end) {
		this.end = end;
	}

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Boolean getShowSystemLog() {
		return this.showSystemLog;
	}
	public void setShowSystemLog(Boolean showSystemLog) {
		this.showSystemLog = showSystemLog;
	}

	public String getStart() {
		return this.start;
	}
	public void setStart(String start) {
		this.start = start;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getUserQuery() {
		return this.userQuery;
	}
	public void setUserQuery(String userQuery) {
		this.userQuery = userQuery;
	}

}

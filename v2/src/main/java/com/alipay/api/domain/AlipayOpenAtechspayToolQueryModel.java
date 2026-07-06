package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付问题诊断
 *
 * @author auto create
 * @since 1.0, 2026-05-14 16:16:28
 */
public class AlipayOpenAtechspayToolQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4898779525983195121L;

	/**
	 * 查询结束时间，格式 yyyy-MM-dd HH:mm:ss。不传时默认取当前时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 环境标识。sandbox：沙箱环境；online：线上环境
	 */
	@ApiField("env")
	private String env;

	/**
	 * 排查关键词
	 */
	@ApiField("keyword")
	private String keyword;

	/**
	 * 查询起始时间，格式 yyyy-MM-dd HH:mm:ss。不传时默认取当前时间前推7天
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 诊断工具标识。
	 */
	@ApiField("tool")
	private String tool;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getKeyword() {
		return this.keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTool() {
		return this.tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}

}

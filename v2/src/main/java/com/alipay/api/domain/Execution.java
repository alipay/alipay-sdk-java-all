package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云函数执行记录信息
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:27:17
 */
public class Execution extends AlipayObject {

	private static final long serialVersionUID = 3681559723875144435L;

	/**
	 * 耗时（毫秒）
	 */
	@ApiField("cost")
	private Long cost;

	/**
	 * 环境id
	 */
	@ApiField("env_id")
	private String envId;

	/**
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 执行状态
 - SUCCESS
 - FAIL
 - DOING
	 */
	@ApiField("status")
	private String status;

	/**
	 * 执行时间
	 */
	@ApiField("time")
	private String time;

	/**
	 * trace ID
	 */
	@ApiField("trace_id")
	private String traceId;

	public Long getCost() {
		return this.cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}

	public String getEnvId() {
		return this.envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 引擎检测结果同步
 *
 * @author auto create
 * @since 1.0, 2020-02-20 00:41:41
 */
public class AlipayEbppInspectNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3215698526651541979L;

	/**
	 * 引擎函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 任务id
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 检测日志链接
	 */
	@ApiField("log_url")
	private String logUrl;

	/**
	 * 引擎检测结果
	 */
	@ApiField("result")
	private String result;

	/**
	 * 任务执行状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 时间节点描述
	 */
	@ApiField("timing")
	private String timing;

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getLogUrl() {
		return this.logUrl;
	}
	public void setLogUrl(String logUrl) {
		this.logUrl = logUrl;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTiming() {
		return this.timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}

}

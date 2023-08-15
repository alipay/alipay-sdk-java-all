package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序压测平台心跳接口
 *
 * @author auto create
 * @since 1.0, 2021-11-18 19:30:29
 */
public class AlipayEbppStressHeartbeatUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2267562711423536985L;

	/**
	 * 引擎错误原因
	 */
	@ApiField("exception")
	private String exception;

	/**
	 * 压测实例的唯一标识
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 机器状态
	 */
	@ApiField("machine_status")
	private String machineStatus;

	/**
	 * json 格式的上报信息详情列表
	 */
	@ApiListField("report_detail")
	@ApiField("stress_request_item")
	private List<StressRequestItem> reportDetail;

	/**
	 * 上报时间
	 */
	@ApiField("report_time")
	private Date reportTime;

	/**
	 * 压测任务的唯一标识
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 请求页面的总时间，单位是 ms
	 */
	@ApiField("total_time")
	private String totalTime;

	public String getException() {
		return this.exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getMachineStatus() {
		return this.machineStatus;
	}
	public void setMachineStatus(String machineStatus) {
		this.machineStatus = machineStatus;
	}

	public List<StressRequestItem> getReportDetail() {
		return this.reportDetail;
	}
	public void setReportDetail(List<StressRequestItem> reportDetail) {
		this.reportDetail = reportDetail;
	}

	public Date getReportTime() {
		return this.reportTime;
	}
	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTotalTime() {
		return this.totalTime;
	}
	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}

}

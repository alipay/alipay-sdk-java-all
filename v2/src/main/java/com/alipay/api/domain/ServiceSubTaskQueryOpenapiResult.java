package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大出行智能平台-服务子任务查询结果
 *
 * @author auto create
 * @since 1.0, 2020-09-04 15:20:15
 */
public class ServiceSubTaskQueryOpenapiResult extends AlipayObject {

	private static final long serialVersionUID = 2279557152588252976L;

	/**
	 * 子任务结束时间，处理完成或处理失败前为空（yyyy-MM-dd HH24:mi:ss）
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 扩展信息，json格式，由双方约定取值
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 子任务结果码，发生异常时非空
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 子任务结果信息，发生异常时非空
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/**
	 * 子任务开始时间，开始处理之前为空（yyyy-MM-dd HH24:mi:ss）
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 子任务ID
	 */
	@ApiField("sub_task_id")
	private String subTaskId;

	/**
	 * 子任务状态（INIT-初始，PROCESSING-处理中，SUCCESS-成功，FAILED-失败）
	 */
	@ApiField("sub_task_status")
	private String subTaskStatus;

	/**
	 * 子任务类型
	 */
	@ApiField("sub_task_type")
	private String subTaskType;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return this.resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getSubTaskId() {
		return this.subTaskId;
	}
	public void setSubTaskId(String subTaskId) {
		this.subTaskId = subTaskId;
	}

	public String getSubTaskStatus() {
		return this.subTaskStatus;
	}
	public void setSubTaskStatus(String subTaskStatus) {
		this.subTaskStatus = subTaskStatus;
	}

	public String getSubTaskType() {
		return this.subTaskType;
	}
	public void setSubTaskType(String subTaskType) {
		this.subTaskType = subTaskType;
	}

}

package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceSubTaskQueryOpenapiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.intelligentize.servicetask.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-09 13:30:26
 */
public class AlipayCommerceTransportIntelligentizeServicetaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4511143479927419768L;

	/** 
	 * 服务任务结束时间，处理完成或处理失败前为空（yyyy-MM-dd HH24:mi:ss）
	 */
	@ApiField("end_time")
	private String endTime;

	/** 
	 * 扩展信息，json格式，由双方约定取值
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 服务任务结果码，发生异常时非空
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 服务任务结果信息，发生异常时非空
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 服务任务ID
	 */
	@ApiField("service_task_id")
	private String serviceTaskId;

	/** 
	 * 服务任务执行结果，尚未处理成功或处理失败时为空
	 */
	@ApiField("service_task_result")
	private String serviceTaskResult;

	/** 
	 * 服务任务状态（INIT-初始，PROCESSING-处理中，SUCCESS-成功，FAILED-失败）
	 */
	@ApiField("service_task_status")
	private String serviceTaskStatus;

	/** 
	 * 服务任务类型
	 */
	@ApiField("service_task_type")
	private String serviceTaskType;

	/** 
	 * 服务任务开始时间，开始处理之前为空（yyyy-MM-dd HH24:mi:ss）
	 */
	@ApiField("start_time")
	private String startTime;

	/** 
	 * 子任务集合
	 */
	@ApiListField("sub_task_list")
	@ApiField("service_sub_task_query_openapi_result")
	private List<ServiceSubTaskQueryOpenapiResult> subTaskList;

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime( ) {
		return this.endTime;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setServiceTaskId(String serviceTaskId) {
		this.serviceTaskId = serviceTaskId;
	}
	public String getServiceTaskId( ) {
		return this.serviceTaskId;
	}

	public void setServiceTaskResult(String serviceTaskResult) {
		this.serviceTaskResult = serviceTaskResult;
	}
	public String getServiceTaskResult( ) {
		return this.serviceTaskResult;
	}

	public void setServiceTaskStatus(String serviceTaskStatus) {
		this.serviceTaskStatus = serviceTaskStatus;
	}
	public String getServiceTaskStatus( ) {
		return this.serviceTaskStatus;
	}

	public void setServiceTaskType(String serviceTaskType) {
		this.serviceTaskType = serviceTaskType;
	}
	public String getServiceTaskType( ) {
		return this.serviceTaskType;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime( ) {
		return this.startTime;
	}

	public void setSubTaskList(List<ServiceSubTaskQueryOpenapiResult> subTaskList) {
		this.subTaskList = subTaskList;
	}
	public List<ServiceSubTaskQueryOpenapiResult> getSubTaskList( ) {
		return this.subTaskList;
	}

}

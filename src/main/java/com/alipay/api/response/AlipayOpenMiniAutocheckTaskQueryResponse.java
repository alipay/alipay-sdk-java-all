package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OneStopCheckTaskDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.autocheck.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-27 09:21:52
 */
public class AlipayOpenMiniAutocheckTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4571389259875275837L;

	/** 
	 * 任务执行状态
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/** 
	 * 云测 报告详情
	 */
	@ApiField("express_task_detail")
	private String expressTaskDetail;

	/** 
	 * SLM 报告详情
	 */
	@ApiListField("task_detail_vos")
	@ApiField("one_stop_check_task_detail_d_t_o")
	private List<OneStopCheckTaskDetailDTO> taskDetailVos;

	/** 
	 * 任务ID
	 */
	@ApiField("task_id")
	private Long taskId;

	/** 
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}
	public String getBizStatus( ) {
		return this.bizStatus;
	}

	public void setExpressTaskDetail(String expressTaskDetail) {
		this.expressTaskDetail = expressTaskDetail;
	}
	public String getExpressTaskDetail( ) {
		return this.expressTaskDetail;
	}

	public void setTaskDetailVos(List<OneStopCheckTaskDetailDTO> taskDetailVos) {
		this.taskDetailVos = taskDetailVos;
	}
	public List<OneStopCheckTaskDetailDTO> getTaskDetailVos( ) {
		return this.taskDetailVos;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	public Long getTaskId( ) {
		return this.taskId;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskName( ) {
		return this.taskName;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家任务模型
 *
 * @author auto create
 * @since 1.0, 2020-09-11 10:45:21
 */
public class AbnTaskInfo extends AlipayObject {

	private static final long serialVersionUID = 6272258515394118483L;

	/**
	 * 任务扩展信息，json格式字符串，不同的task_type对应不同的扩展信息。
	 */
	@ApiField("extens_info")
	private String extensInfo;

	/**
	 * 创建时间，yyyy-MM-dd HH:mm:ss格式字符串
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 修改时间，yyyy-MM-dd HH:mm:ss格式字符串
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 处理人id，多个时使用英文逗号","分隔
	 */
	@ApiField("handler_id")
	private String handlerId;

	/**
	 * 处理人昵称，多个时使用英文逗号","分隔
	 */
	@ApiField("handler_nick")
	private String handlerNick;

	/**
	 * 任务描述
	 */
	@ApiField("task_desc")
	private String taskDesc;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 任务级别：
紧急、高、中、低
	 */
	@ApiField("task_level")
	private String taskLevel;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务操作记录集合
	 */
	@ApiListField("task_operation_logs")
	@ApiField("task_operation_log")
	private List<TaskOperationLog> taskOperationLogs;

	/**
	 * 任务状态:
CREATED：待响应，
RESPONSED：处理中
DEALED：已完成
	 */
	@ApiField("task_status")
	private String taskStatus;

	/**
	 * 任务类型
MERCHANT_TRADE_DROPZERO：商户交易跌零任务
	 */
	@ApiField("task_type")
	private String taskType;

	public String getExtensInfo() {
		return this.extensInfo;
	}
	public void setExtensInfo(String extensInfo) {
		this.extensInfo = extensInfo;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getHandlerId() {
		return this.handlerId;
	}
	public void setHandlerId(String handlerId) {
		this.handlerId = handlerId;
	}

	public String getHandlerNick() {
		return this.handlerNick;
	}
	public void setHandlerNick(String handlerNick) {
		this.handlerNick = handlerNick;
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskLevel() {
		return this.taskLevel;
	}
	public void setTaskLevel(String taskLevel) {
		this.taskLevel = taskLevel;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public List<TaskOperationLog> getTaskOperationLogs() {
		return this.taskOperationLogs;
	}
	public void setTaskOperationLogs(List<TaskOperationLog> taskOperationLogs) {
		this.taskOperationLogs = taskOperationLogs;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

}

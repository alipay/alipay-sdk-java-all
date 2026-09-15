package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建外呼任务
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:09
 */
public class DatadigitalAicsDevinTaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1439836761887914447L;

	/**
	 * 扩展信息(JSON字符串) 最大并发机器数=CC_MAX_LIMIT；振铃未接挂断时长（单位：秒）= outCallRingingTimeLimit；发起调用时的超时时间= LAUNCH_CALL_TIMEOUT
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 主叫号码
	 */
	@ApiField("outbound_caller")
	private String outboundCaller;

	/**
	 * 任务code
	 */
	@ApiField("task_code")
	private String taskCode;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务规则code
	 */
	@ApiField("task_rules_code")
	private String taskRulesCode;

	/**
	 * 任务初始运行状态：0-启用 1-暂停
	 */
	@ApiField("task_status")
	private Long taskStatus;

	/**
	 * 坐席=TRANSFER_AGENT；技能组=TRANSFER_SKILL_GROUP
	 */
	@ApiField("task_transfer_type")
	private String taskTransferType;

	/**
	 * 任务类型自动外呼=AUTO_CALL；手动外呼=OUTBOUND_CALL；IVR外呼=IVR_CALL；默认传递=BOOT_CALL
	 */
	@ApiField("task_type")
	private String taskType;

	/**
	 * 租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 转接编码（坐席/技能组/IVR code）
	 */
	@ApiField("transfer_code")
	private String transferCode;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutboundCaller() {
		return this.outboundCaller;
	}
	public void setOutboundCaller(String outboundCaller) {
		this.outboundCaller = outboundCaller;
	}

	public String getTaskCode() {
		return this.taskCode;
	}
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskRulesCode() {
		return this.taskRulesCode;
	}
	public void setTaskRulesCode(String taskRulesCode) {
		this.taskRulesCode = taskRulesCode;
	}

	public Long getTaskStatus() {
		return this.taskStatus;
	}
	public void setTaskStatus(Long taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskTransferType() {
		return this.taskTransferType;
	}
	public void setTaskTransferType(String taskTransferType) {
		this.taskTransferType = taskTransferType;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTransferCode() {
		return this.transferCode;
	}
	public void setTransferCode(String transferCode) {
		this.transferCode = transferCode;
	}

}

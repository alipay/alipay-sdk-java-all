package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外呼任务修改
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:10
 */
public class DatadigitalAicsDevinTaskModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7347661116121418271L;

	/**
	 * 获取状态
	 */
	@ApiField("acquire_status")
	private String acquireStatus;

	/**
	 * 扩展信息(JSON字符串)
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 上次获取状态
	 */
	@ApiField("last_acquire_status")
	private String lastAcquireStatus;

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
	 * 任务操作：1-暂停 2-继续 4-终止
	 */
	@ApiField("task_status")
	private Long taskStatus;

	/**
	 * 租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 转接编码
	 */
	@ApiField("transfer_code")
	private String transferCode;

	/**
	 * 版本号(乐观锁)
	 */
	@ApiField("version_on")
	private String versionOn;

	public String getAcquireStatus() {
		return this.acquireStatus;
	}
	public void setAcquireStatus(String acquireStatus) {
		this.acquireStatus = acquireStatus;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getLastAcquireStatus() {
		return this.lastAcquireStatus;
	}
	public void setLastAcquireStatus(String lastAcquireStatus) {
		this.lastAcquireStatus = lastAcquireStatus;
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

	public String getVersionOn() {
		return this.versionOn;
	}
	public void setVersionOn(String versionOn) {
		this.versionOn = versionOn;
	}

}

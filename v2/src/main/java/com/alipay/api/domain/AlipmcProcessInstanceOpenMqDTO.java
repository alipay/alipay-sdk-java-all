package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * bpms流程实例
 *
 * @author auto create
 * @since 1.0, 2024-06-25 14:22:28
 */
public class AlipmcProcessInstanceOpenMqDTO extends AlipayObject {

	private static final long serialVersionUID = 2855766993272399478L;

	/**
	 * appKey
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 业务系统ID
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 标记是否删除
	 */
	@ApiField("deleted_flag")
	private Boolean deletedFlag;

	/**
	 * 是否依赖动态流程定义
	 */
	@ApiField("dynamic_process_flag")
	private Boolean dynamicProcessFlag;

	/**
	 * 完成时间
	 */
	@ApiField("finish_time")
	private String finishTime;

	/**
	 * 流程实例主键id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 修改时间
	 */
	@ApiField("modify_time")
	private String modifyTime;

	/**
	 * 发起者id
	 */
	@ApiField("originator_id")
	private String originatorId;

	/**
	 * 发起人JOB
	 */
	@ApiField("originator_job")
	private String originatorJob;

	/**
	 * 实例完成结果
	 */
	@ApiField("out_result")
	private String outResult;

	/**
	 * 直系父流程实例id
	 */
	@ApiField("parent_process_instance_id")
	private String parentProcessInstanceId;

	/**
	 * 流程定义代号
	 */
	@ApiField("process_code")
	private String processCode;

	/**
	 * 流程定义id
	 */
	@ApiField("process_id")
	private String processId;

	/**
	 * 流程实例id
	 */
	@ApiField("process_instance_id")
	private String processInstanceId;

	/**
	 * 流程状态
	 */
	@ApiField("process_instance_status")
	private String processInstanceStatus;

	/**
	 * 流程版本
	 */
	@ApiField("process_version")
	private String processVersion;

	/**
	 * 根父流程实例id
	 */
	@ApiField("root_parent_process_instance_id")
	private String rootParentProcessInstanceId;

	/**
	 * 子流程实例id
	 */
	@ApiField("super_process_instance_id")
	private String superProcessInstanceId;

	/**
	 * 流程标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 流程英文标题
	 */
	@ApiField("title_en")
	private String titleEn;

	/**
	 * 是否已执行url转卡片
	 */
	@ApiField("url_card_flag")
	private Boolean urlCardFlag;

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Boolean getDeletedFlag() {
		return this.deletedFlag;
	}
	public void setDeletedFlag(Boolean deletedFlag) {
		this.deletedFlag = deletedFlag;
	}

	public Boolean getDynamicProcessFlag() {
		return this.dynamicProcessFlag;
	}
	public void setDynamicProcessFlag(Boolean dynamicProcessFlag) {
		this.dynamicProcessFlag = dynamicProcessFlag;
	}

	public String getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getOriginatorId() {
		return this.originatorId;
	}
	public void setOriginatorId(String originatorId) {
		this.originatorId = originatorId;
	}

	public String getOriginatorJob() {
		return this.originatorJob;
	}
	public void setOriginatorJob(String originatorJob) {
		this.originatorJob = originatorJob;
	}

	public String getOutResult() {
		return this.outResult;
	}
	public void setOutResult(String outResult) {
		this.outResult = outResult;
	}

	public String getParentProcessInstanceId() {
		return this.parentProcessInstanceId;
	}
	public void setParentProcessInstanceId(String parentProcessInstanceId) {
		this.parentProcessInstanceId = parentProcessInstanceId;
	}

	public String getProcessCode() {
		return this.processCode;
	}
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getProcessId() {
		return this.processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}
	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessInstanceStatus() {
		return this.processInstanceStatus;
	}
	public void setProcessInstanceStatus(String processInstanceStatus) {
		this.processInstanceStatus = processInstanceStatus;
	}

	public String getProcessVersion() {
		return this.processVersion;
	}
	public void setProcessVersion(String processVersion) {
		this.processVersion = processVersion;
	}

	public String getRootParentProcessInstanceId() {
		return this.rootParentProcessInstanceId;
	}
	public void setRootParentProcessInstanceId(String rootParentProcessInstanceId) {
		this.rootParentProcessInstanceId = rootParentProcessInstanceId;
	}

	public String getSuperProcessInstanceId() {
		return this.superProcessInstanceId;
	}
	public void setSuperProcessInstanceId(String superProcessInstanceId) {
		this.superProcessInstanceId = superProcessInstanceId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleEn() {
		return this.titleEn;
	}
	public void setTitleEn(String titleEn) {
		this.titleEn = titleEn;
	}

	public Boolean getUrlCardFlag() {
		return this.urlCardFlag;
	}
	public void setUrlCardFlag(Boolean urlCardFlag) {
		this.urlCardFlag = urlCardFlag;
	}

}

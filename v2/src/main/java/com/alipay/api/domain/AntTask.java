package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 任务实体类
 *
 * @author auto create
 * @since 1.0, 2023-09-18 22:05:12
 */
public class AntTask extends AlipayObject {

	private static final long serialVersionUID = 7747273739427479533L;

	/**
	 * 节点ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 实际执行人
	 */
	@ApiField("actual_work_id")
	private String actualWorkId;

	/**
	 * 应用的key
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 是否允许移动审批
	 */
	@ApiField("approve_enabled")
	private Boolean approveEnabled;

	/**
	 * 流程发起者工号，需要6位工号，不足6位需补0
	 */
	@ApiField("assignee_work_id")
	private String assigneeWorkId;

	/**
	 * body,可以进行检索
	 */
	@ApiField("body")
	private String body;

	/**
	 * 任务外部组合id
	 */
	@ApiField("component_id")
	private ComponentId componentId;

	/**
	 * 任务创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 流程发起者工号，需要6位工号，不足6位需补0
	 */
	@ApiField("creator_work_id")
	private String creatorWorkId;

	/**
	 * 流程实例所属部门
	 */
	@ApiField("dept_id")
	private String deptId;

	/**
	 * 任务希望完成时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 任务实际完成、取消等终止状态操作后的时间
	 */
	@ApiField("finished_time")
	private Date finishedTime;

	/**
	 * 任务内部id，外部仅做展示即可
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 业务索引1
	 */
	@ApiField("index_1")
	private String index1;

	/**
	 * 业务索引2
	 */
	@ApiField("index_2")
	private String index2;

	/**
	 * 业务索引3
	 */
	@ApiField("index_3")
	private String index3;

	/**
	 * 业务索引4
	 */
	@ApiField("index_4")
	private String index4;

	/**
	 * 任务内部包id
	 */
	@ApiField("internal_package_id")
	private Long internalPackageId;

	/**
	 * 最近的更新时间
	 */
	@ApiField("last_update_time")
	private Date lastUpdateTime;

	/**
	 * 代理任务对应的主任务id
	 */
	@ApiField("main_task_id")
	private String mainTaskId;

	/**
	 * 移动端url
	 */
	@ApiField("mobile_url")
	private String mobileUrl;

	/**
	 * 工号，不足6位，需要在前面补0
	 */
	@ApiField("original_work_id")
	private String originalWorkId;

	/**
	 * 下次超时发送时间
	 */
	@ApiField("overdue_send_next_time")
	private Date overdueSendNextTime;

	/**
	 * 超时时间
	 */
	@ApiField("overdue_time")
	private Date overdueTime;

	/**
	 * 任务所属人
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 任务id
	 */
	@ApiField("package_id")
	private String packageId;

	/**
	 * 任务的父包id
	 */
	@ApiField("parent_package_id")
	private String parentPackageId;

	/**
	 * 流程Code，按需使用
	 */
	@ApiField("process_code")
	private String processCode;

	/**
	 * 代理任务Id集合，查询任务时使用
	 */
	@ApiListField("proxy_task_id_list")
	@ApiField("string")
	private List<String> proxyTaskIdList;

	/**
	 * 是否允许快捷审批 1是 0否
	 */
	@ApiField("quick_approval")
	private Long quickApproval;

	/**
	 * 移动端地址
	 */
	@ApiField("real_mobile_url")
	private String realMobileUrl;

	/**
	 * 是否发送审批助手 1:发送  0:不发送
	 */
	@ApiField("send_card")
	private Long sendCard;

	/**
	 * 超时发送次数
	 */
	@ApiField("send_count")
	private Long sendCount;

	/**
	 * 接入任务中心时，填写的source_id
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 系统二级分类名称
	 */
	@ApiField("source_name")
	private String sourceName;

	/**
	 * 系统二级分类名称英文
	 */
	@ApiField("source_name_en")
	private String sourceNameEn;

	/**
	 * 任务开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 任务标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 标题英文
	 */
	@ApiField("subject_en")
	private String subjectEn;

	/**
	 * 接入任务中心时，填写的system_type
	 */
	@ApiField("system_type")
	private String systemType;

	/**
	 * 任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 任务状态，0新建 1取消 2已完成 3暂停 4忽视
	 */
	@ApiField("task_status")
	private String taskStatus;

	/**
	 * 任务类型
	 */
	@ApiField("task_type")
	private String taskType;

	/**
	 * 置顶时间
	 */
	@ApiField("top_time")
	private Date topTime;

	/**
	 * 催签次数
	 */
	@ApiField("urge_num")
	private Long urgeNum;

	/**
	 * PC端审批地址
	 */
	@ApiField("url")
	private String url;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActualWorkId() {
		return this.actualWorkId;
	}
	public void setActualWorkId(String actualWorkId) {
		this.actualWorkId = actualWorkId;
	}

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public Boolean getApproveEnabled() {
		return this.approveEnabled;
	}
	public void setApproveEnabled(Boolean approveEnabled) {
		this.approveEnabled = approveEnabled;
	}

	public String getAssigneeWorkId() {
		return this.assigneeWorkId;
	}
	public void setAssigneeWorkId(String assigneeWorkId) {
		this.assigneeWorkId = assigneeWorkId;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public ComponentId getComponentId() {
		return this.componentId;
	}
	public void setComponentId(ComponentId componentId) {
		this.componentId = componentId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreatorWorkId() {
		return this.creatorWorkId;
	}
	public void setCreatorWorkId(String creatorWorkId) {
		this.creatorWorkId = creatorWorkId;
	}

	public String getDeptId() {
		return this.deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getFinishedTime() {
		return this.finishedTime;
	}
	public void setFinishedTime(Date finishedTime) {
		this.finishedTime = finishedTime;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getIndex1() {
		return this.index1;
	}
	public void setIndex1(String index1) {
		this.index1 = index1;
	}

	public String getIndex2() {
		return this.index2;
	}
	public void setIndex2(String index2) {
		this.index2 = index2;
	}

	public String getIndex3() {
		return this.index3;
	}
	public void setIndex3(String index3) {
		this.index3 = index3;
	}

	public String getIndex4() {
		return this.index4;
	}
	public void setIndex4(String index4) {
		this.index4 = index4;
	}

	public Long getInternalPackageId() {
		return this.internalPackageId;
	}
	public void setInternalPackageId(Long internalPackageId) {
		this.internalPackageId = internalPackageId;
	}

	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public String getMainTaskId() {
		return this.mainTaskId;
	}
	public void setMainTaskId(String mainTaskId) {
		this.mainTaskId = mainTaskId;
	}

	public String getMobileUrl() {
		return this.mobileUrl;
	}
	public void setMobileUrl(String mobileUrl) {
		this.mobileUrl = mobileUrl;
	}

	public String getOriginalWorkId() {
		return this.originalWorkId;
	}
	public void setOriginalWorkId(String originalWorkId) {
		this.originalWorkId = originalWorkId;
	}

	public Date getOverdueSendNextTime() {
		return this.overdueSendNextTime;
	}
	public void setOverdueSendNextTime(Date overdueSendNextTime) {
		this.overdueSendNextTime = overdueSendNextTime;
	}

	public Date getOverdueTime() {
		return this.overdueTime;
	}
	public void setOverdueTime(Date overdueTime) {
		this.overdueTime = overdueTime;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPackageId() {
		return this.packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getParentPackageId() {
		return this.parentPackageId;
	}
	public void setParentPackageId(String parentPackageId) {
		this.parentPackageId = parentPackageId;
	}

	public String getProcessCode() {
		return this.processCode;
	}
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public List<String> getProxyTaskIdList() {
		return this.proxyTaskIdList;
	}
	public void setProxyTaskIdList(List<String> proxyTaskIdList) {
		this.proxyTaskIdList = proxyTaskIdList;
	}

	public Long getQuickApproval() {
		return this.quickApproval;
	}
	public void setQuickApproval(Long quickApproval) {
		this.quickApproval = quickApproval;
	}

	public String getRealMobileUrl() {
		return this.realMobileUrl;
	}
	public void setRealMobileUrl(String realMobileUrl) {
		this.realMobileUrl = realMobileUrl;
	}

	public Long getSendCard() {
		return this.sendCard;
	}
	public void setSendCard(Long sendCard) {
		this.sendCard = sendCard;
	}

	public Long getSendCount() {
		return this.sendCount;
	}
	public void setSendCount(Long sendCount) {
		this.sendCount = sendCount;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceName() {
		return this.sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getSourceNameEn() {
		return this.sourceNameEn;
	}
	public void setSourceNameEn(String sourceNameEn) {
		this.sourceNameEn = sourceNameEn;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubjectEn() {
		return this.subjectEn;
	}
	public void setSubjectEn(String subjectEn) {
		this.subjectEn = subjectEn;
	}

	public String getSystemType() {
		return this.systemType;
	}
	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
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

	public Date getTopTime() {
		return this.topTime;
	}
	public void setTopTime(Date topTime) {
		this.topTime = topTime;
	}

	public Long getUrgeNum() {
		return this.urgeNum;
	}
	public void setUrgeNum(Long urgeNum) {
		this.urgeNum = urgeNum;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}

package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询任务类
 *
 * @author auto create
 * @since 1.0, 2023-09-18 13:37:35
 */
public class TaskQuery extends AlipayObject {

	private static final long serialVersionUID = 5233732374888716165L;

	/**
	 * appKeys 应用列表
	 */
	@ApiListField("app_keys")
	@ApiField("string")
	private List<String> appKeys;

	/**
	 * 是否移动审批,默认为false
	 */
	@ApiField("approve_enabled")
	private Boolean approveEnabled;

	/**
	 * 任务执行者工号，需要6位工号，不足6位需要补0
	 */
	@ApiField("assignee_work_id")
	private String assigneeWorkId;

	/**
	 * body,可以进行检索
	 */
	@ApiField("body")
	private String body;

	/**
	 * 流程发起者工号，需要6位工号，不足6位需要补0
	 */
	@ApiField("creator_work_id")
	private String creatorWorkId;

	/**
	 * 排序方式，默认：DESC
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 开始时间
	 */
	@ApiField("from_date")
	private Date fromDate;

	/**
	 * 是否按包id分组
	 */
	@ApiField("group_by_package")
	private Boolean groupByPackage;

	/**
	 * 是否包含代理，默认为true
	 */
	@ApiField("include_agent_task")
	private Boolean includeAgentTask;

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
	 * 是否催签
	 */
	@ApiField("is_urge")
	private Boolean isUrge;

	/**
	 * 语言(获取分组信息时可以根据语言得到对应的数据)
	 */
	@ApiField("language")
	private String language;

	/**
	 * 实例ID
	 */
	@ApiField("package_id")
	private String packageId;

	/**
	 * 分页index
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 分页size，默认值为20
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 流程Code，按需使用
	 */
	@ApiField("process_code")
	private String processCode;

	/**
	 * 流程Code集合，不是所有业务方都需要
	 */
	@ApiListField("process_codes")
	@ApiField("string")
	private List<String> processCodes;

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
	 * 系统二级分类名称英文
	 */
	@ApiListField("source_name_en_list")
	@ApiField("string")
	private List<String> sourceNameEnList;

	/**
	 * 系统二级分类名称
	 */
	@ApiListField("source_name_list")
	@ApiField("string")
	private List<String> sourceNameList;

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
	 * 分组ID
	 */
	@ApiField("task_category_uuid")
	private String taskCategoryUuid;

	/**
	 * 组合id
	 */
	@ApiListField("task_source_query_infos")
	@ApiField("component_id")
	private List<ComponentId> taskSourceQueryInfos;

	/**
	 * 任务状态，0新建 1取消 2已完成 3暂停 4忽视
	 */
	@ApiField("task_status")
	private String taskStatus;

	/**
	 * 任务状态集合
	 */
	@ApiListField("task_status_list")
	@ApiField("number")
	private List<Long> taskStatusList;

	/**
	 * 结束时间
	 */
	@ApiField("to_date")
	private Date toDate;

	public List<String> getAppKeys() {
		return this.appKeys;
	}
	public void setAppKeys(List<String> appKeys) {
		this.appKeys = appKeys;
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

	public String getCreatorWorkId() {
		return this.creatorWorkId;
	}
	public void setCreatorWorkId(String creatorWorkId) {
		this.creatorWorkId = creatorWorkId;
	}

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Date getFromDate() {
		return this.fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Boolean getGroupByPackage() {
		return this.groupByPackage;
	}
	public void setGroupByPackage(Boolean groupByPackage) {
		this.groupByPackage = groupByPackage;
	}

	public Boolean getIncludeAgentTask() {
		return this.includeAgentTask;
	}
	public void setIncludeAgentTask(Boolean includeAgentTask) {
		this.includeAgentTask = includeAgentTask;
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

	public Boolean getIsUrge() {
		return this.isUrge;
	}
	public void setIsUrge(Boolean isUrge) {
		this.isUrge = isUrge;
	}

	public String getLanguage() {
		return this.language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPackageId() {
		return this.packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getProcessCode() {
		return this.processCode;
	}
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public List<String> getProcessCodes() {
		return this.processCodes;
	}
	public void setProcessCodes(List<String> processCodes) {
		this.processCodes = processCodes;
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

	public List<String> getSourceNameEnList() {
		return this.sourceNameEnList;
	}
	public void setSourceNameEnList(List<String> sourceNameEnList) {
		this.sourceNameEnList = sourceNameEnList;
	}

	public List<String> getSourceNameList() {
		return this.sourceNameList;
	}
	public void setSourceNameList(List<String> sourceNameList) {
		this.sourceNameList = sourceNameList;
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

	public String getTaskCategoryUuid() {
		return this.taskCategoryUuid;
	}
	public void setTaskCategoryUuid(String taskCategoryUuid) {
		this.taskCategoryUuid = taskCategoryUuid;
	}

	public List<ComponentId> getTaskSourceQueryInfos() {
		return this.taskSourceQueryInfos;
	}
	public void setTaskSourceQueryInfos(List<ComponentId> taskSourceQueryInfos) {
		this.taskSourceQueryInfos = taskSourceQueryInfos;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public List<Long> getTaskStatusList() {
		return this.taskStatusList;
	}
	public void setTaskStatusList(List<Long> taskStatusList) {
		this.taskStatusList = taskStatusList;
	}

	public Date getToDate() {
		return this.toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}

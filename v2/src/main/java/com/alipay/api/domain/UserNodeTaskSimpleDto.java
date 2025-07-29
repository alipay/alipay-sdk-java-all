package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文体行业用户任务简单对象的子节点
 *
 * @author auto create
 * @since 1.0, 2023-07-11 19:55:06
 */
public class UserNodeTaskSimpleDto extends AlipayObject {

	private static final long serialVersionUID = 7236428765965896215L;

	/**
	 * 服务商额外配置信息
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 用户任务完成的北京时间。格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("completed_time")
	private String completedTime;

	/**
	 * 用户任务外部ID
	 */
	@ApiField("out_user_task_id")
	private String outUserTaskId;

	/**
	 * 数字越小越靠前，默认为0
	 */
	@ApiField("sort")
	private Long sort;

	/**
	 * 任务周期，YEAR - 年，MONTH - 月，WEEK -周，DAILY -日，NO_CYCLE -无周期,DYNAMIC_DAYS -动态天
	 */
	@ApiField("task_cycle")
	private String taskCycle;

	/**
	 * 任务周期内可完成的次数,默认1,0代表周期内可完成无数次
	 */
	@ApiField("task_cycle_complete_count")
	private Long taskCycleCompleteCount;

	/**
	 * 任务周期内动态周期数值。动态天周期就代表动态几天
	 */
	@ApiField("task_cycle_dynamic_count")
	private Long taskCycleDynamicCount;

	/**
	 * 任务描述
	 */
	@ApiField("task_desc")
	private String taskDesc;

	/**
	 * 任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 任务图片链接
	 */
	@ApiField("task_image_url")
	private String taskImageUrl;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务节点。NONE：普通节点，PARENT：父节点，CHILD：子节点
	 */
	@ApiField("task_node")
	private String taskNode;

	/**
	 * 任务去完成的跳转链接
	 */
	@ApiField("task_url")
	private String taskUrl;

	/**
	 * 用户任务ID
	 */
	@ApiField("user_task_id")
	private String userTaskId;

	/**
	 * 用户任务权益列表
	 */
	@ApiListField("user_task_rights_list")
	@ApiField("user_task_rights_simple_dto")
	private List<UserTaskRightsSimpleDto> userTaskRightsList;

	/**
	 * NOT_APPLY：任务未领取 TODO：任务未完成 COMPLETED：任务已完成 RECEIVED：任务权益已领取，STOPED：已终止
	 */
	@ApiField("user_task_status")
	private String userTaskStatus;

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getCompletedTime() {
		return this.completedTime;
	}
	public void setCompletedTime(String completedTime) {
		this.completedTime = completedTime;
	}

	public String getOutUserTaskId() {
		return this.outUserTaskId;
	}
	public void setOutUserTaskId(String outUserTaskId) {
		this.outUserTaskId = outUserTaskId;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

	public String getTaskCycle() {
		return this.taskCycle;
	}
	public void setTaskCycle(String taskCycle) {
		this.taskCycle = taskCycle;
	}

	public Long getTaskCycleCompleteCount() {
		return this.taskCycleCompleteCount;
	}
	public void setTaskCycleCompleteCount(Long taskCycleCompleteCount) {
		this.taskCycleCompleteCount = taskCycleCompleteCount;
	}

	public Long getTaskCycleDynamicCount() {
		return this.taskCycleDynamicCount;
	}
	public void setTaskCycleDynamicCount(Long taskCycleDynamicCount) {
		this.taskCycleDynamicCount = taskCycleDynamicCount;
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

	public String getTaskImageUrl() {
		return this.taskImageUrl;
	}
	public void setTaskImageUrl(String taskImageUrl) {
		this.taskImageUrl = taskImageUrl;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskNode() {
		return this.taskNode;
	}
	public void setTaskNode(String taskNode) {
		this.taskNode = taskNode;
	}

	public String getTaskUrl() {
		return this.taskUrl;
	}
	public void setTaskUrl(String taskUrl) {
		this.taskUrl = taskUrl;
	}

	public String getUserTaskId() {
		return this.userTaskId;
	}
	public void setUserTaskId(String userTaskId) {
		this.userTaskId = userTaskId;
	}

	public List<UserTaskRightsSimpleDto> getUserTaskRightsList() {
		return this.userTaskRightsList;
	}
	public void setUserTaskRightsList(List<UserTaskRightsSimpleDto> userTaskRightsList) {
		this.userTaskRightsList = userTaskRightsList;
	}

	public String getUserTaskStatus() {
		return this.userTaskStatus;
	}
	public void setUserTaskStatus(String userTaskStatus) {
		this.userTaskStatus = userTaskStatus;
	}

}

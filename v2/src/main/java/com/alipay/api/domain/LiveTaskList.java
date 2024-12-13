package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 任务列表对象
 *
 * @author auto create
 * @since 1.0, 2024-08-22 15:42:33
 */
public class LiveTaskList extends AlipayObject {

	private static final long serialVersionUID = 3774622551293641991L;

	/**
	 * 任务日期（月份）
	 */
	@ApiField("date")
	private String date;

	/**
	 * 日期格式
	 */
	@ApiField("date_formate")
	private String dateFormate;

	/**
	 * 子任务列表
	 */
	@ApiListField("live_sub_task_list")
	@ApiField("live_sub_task_list")
	private List<LiveSubTaskList> liveSubTaskList;

	/**
	 * 月度任务状态，状态: COMPLETED（已完成）、UNCOMPLETED（未完成）、IN_PROGRESS（进行中）
	 */
	@ApiField("task_status")
	private String taskStatus;

	/**
	 * 任务类型：直播（LIVE）
	 */
	@ApiField("task_type")
	private String taskType;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getDateFormate() {
		return this.dateFormate;
	}
	public void setDateFormate(String dateFormate) {
		this.dateFormate = dateFormate;
	}

	public List<LiveSubTaskList> getLiveSubTaskList() {
		return this.liveSubTaskList;
	}
	public void setLiveSubTaskList(List<LiveSubTaskList> liveSubTaskList) {
		this.liveSubTaskList = liveSubTaskList;
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

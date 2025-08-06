package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 泛行业教培学习计划信息同步
 *
 * @author auto create
 * @since 1.0, 2025-07-24 10:54:25
 */
public class AlipayCommerceFhyeduLearnplanSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5696596912777249844L;

	/**
	 * 布置时间
	 */
	@ApiField("assign_time")
	private Date assignTime;

	/**
	 * 课后学习计划
	 */
	@ApiField("content")
	private String content;

	/**
	 * 截止时间
	 */
	@ApiField("dead_line_time")
	private Date deadLineTime;

	/**
	 * 作业id
	 */
	@ApiField("homework_id")
	private String homeworkId;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 学员id
	 */
	@ApiField("student_id")
	private String studentId;

	public Date getAssignTime() {
		return this.assignTime;
	}
	public void setAssignTime(Date assignTime) {
		this.assignTime = assignTime;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getDeadLineTime() {
		return this.deadLineTime;
	}
	public void setDeadLineTime(Date deadLineTime) {
		this.deadLineTime = deadLineTime;
	}

	public String getHomeworkId() {
		return this.homeworkId;
	}
	public void setHomeworkId(String homeworkId) {
		this.homeworkId = homeworkId;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getStudentId() {
		return this.studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}

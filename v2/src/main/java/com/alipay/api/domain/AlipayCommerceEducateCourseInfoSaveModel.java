package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建课程
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:58:54
 */
public class AlipayCommerceEducateCourseInfoSaveModel extends AlipayObject {

	private static final long serialVersionUID = 8614392118554871773L;

	/**
	 * 课程描述
	 */
	@ApiField("course_desc")
	private String courseDesc;

	/**
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 课程名称
	 */
	@ApiField("course_name")
	private String courseName;

	/**
	 * 每周天次
	 */
	@ApiField("day_of_week")
	private Long dayOfWeek;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 适用组织节点ID列表
	 */
	@ApiListField("node_id_list")
	@ApiField("string")
	private List<String> nodeIdList;

	/**
	 * 课时节次列表
	 */
	@ApiListField("period_no_list")
	@ApiField("number")
	private List<Long> periodNoList;

	/**
	 * 教室外部唯一编号
	 */
	@ApiField("place_out_biz_no")
	private String placeOutBizNo;

	/**
	 * 学期ID
	 */
	@ApiField("semester_id")
	private String semesterId;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 课程教师学工号
	 */
	@ApiField("teacher_employee_no")
	private String teacherEmployeeNo;

	/**
	 * 学期周次列表，即课程在本学期的哪些周上课
	 */
	@ApiListField("week_list")
	@ApiField("number")
	private List<Long> weekList;

	public String getCourseDesc() {
		return this.courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Long getDayOfWeek() {
		return this.dayOfWeek;
	}
	public void setDayOfWeek(Long dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public List<String> getNodeIdList() {
		return this.nodeIdList;
	}
	public void setNodeIdList(List<String> nodeIdList) {
		this.nodeIdList = nodeIdList;
	}

	public List<Long> getPeriodNoList() {
		return this.periodNoList;
	}
	public void setPeriodNoList(List<Long> periodNoList) {
		this.periodNoList = periodNoList;
	}

	public String getPlaceOutBizNo() {
		return this.placeOutBizNo;
	}
	public void setPlaceOutBizNo(String placeOutBizNo) {
		this.placeOutBizNo = placeOutBizNo;
	}

	public String getSemesterId() {
		return this.semesterId;
	}
	public void setSemesterId(String semesterId) {
		this.semesterId = semesterId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTeacherEmployeeNo() {
		return this.teacherEmployeeNo;
	}
	public void setTeacherEmployeeNo(String teacherEmployeeNo) {
		this.teacherEmployeeNo = teacherEmployeeNo;
	}

	public List<Long> getWeekList() {
		return this.weekList;
	}
	public void setWeekList(List<Long> weekList) {
		this.weekList = weekList;
	}

}

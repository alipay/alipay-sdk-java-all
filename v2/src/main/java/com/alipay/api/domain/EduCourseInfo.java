package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 课程信息
 *
 * @author auto create
 * @since 1.0, 2025-05-27 18:49:03
 */
public class EduCourseInfo extends AlipayObject {

	private static final long serialVersionUID = 7818778729573134272L;

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
	 * 每周天次，用1-7分别表示周一到周日
	 */
	@ApiField("day_of_week")
	private Long dayOfWeek;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 课程适用组织节点列表。
	 */
	@ApiListField("node_list")
	@ApiField("edu_node_info")
	private List<EduNodeInfo> nodeList;

	/**
	 * 课时信息
	 */
	@ApiField("period_info")
	private EduPeriodInfo periodInfo;

	/**
	 * 课时节次，即每天第几节课，与课时配置保持一致
	 */
	@ApiListField("period_no_list")
	@ApiField("number")
	private List<Long> periodNoList;

	/**
	 * 教室位置ID
	 */
	@ApiField("place_id")
	private String placeId;

	/**
	 * 位置名称
	 */
	@ApiField("place_name")
	private String placeName;

	/**
	 * 学期ID
	 */
	@ApiField("semester_id")
	private String semesterId;

	/**
	 * 学期名称
	 */
	@ApiField("semester_name")
	private String semesterName;

	/**
	 * 教师花名册ID
	 */
	@ApiField("teacher_roster_id")
	private String teacherRosterId;

	/**
	 * 教师名称
	 */
	@ApiField("teacher_roster_name")
	private String teacherRosterName;

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

	public List<EduNodeInfo> getNodeList() {
		return this.nodeList;
	}
	public void setNodeList(List<EduNodeInfo> nodeList) {
		this.nodeList = nodeList;
	}

	public EduPeriodInfo getPeriodInfo() {
		return this.periodInfo;
	}
	public void setPeriodInfo(EduPeriodInfo periodInfo) {
		this.periodInfo = periodInfo;
	}

	public List<Long> getPeriodNoList() {
		return this.periodNoList;
	}
	public void setPeriodNoList(List<Long> periodNoList) {
		this.periodNoList = periodNoList;
	}

	public String getPlaceId() {
		return this.placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public String getPlaceName() {
		return this.placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getSemesterId() {
		return this.semesterId;
	}
	public void setSemesterId(String semesterId) {
		this.semesterId = semesterId;
	}

	public String getSemesterName() {
		return this.semesterName;
	}
	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public String getTeacherRosterId() {
		return this.teacherRosterId;
	}
	public void setTeacherRosterId(String teacherRosterId) {
		this.teacherRosterId = teacherRosterId;
	}

	public String getTeacherRosterName() {
		return this.teacherRosterName;
	}
	public void setTeacherRosterName(String teacherRosterName) {
		this.teacherRosterName = teacherRosterName;
	}

	public List<Long> getWeekList() {
		return this.weekList;
	}
	public void setWeekList(List<Long> weekList) {
		this.weekList = weekList;
	}

}

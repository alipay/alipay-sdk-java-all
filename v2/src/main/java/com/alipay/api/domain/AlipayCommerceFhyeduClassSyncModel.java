package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 泛行业教培上课信息
 *
 * @author auto create
 * @since 1.0, 2025-08-05 14:22:35
 */
public class AlipayCommerceFhyeduClassSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5151178269327266325L;

	/**
	 * 上课地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 班级
	 */
	@ApiField("class_name")
	private String className;

	/**
	 * 上课教室
	 */
	@ApiField("class_room_name")
	private String classRoomName;

	/**
	 * 课程id
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 授课课程名称
	 */
	@ApiField("course_name")
	private String courseName;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 预计消耗课时
	 */
	@ApiField("plan_consume_lessions")
	private String planConsumeLessions;

	/**
	 * 课次开始时间
	 */
	@ApiField("sched_begin_time")
	private Date schedBeginTime;

	/**
	 * 上课内容
	 */
	@ApiField("sched_content")
	private String schedContent;

	/**
	 * 课次结束时间
	 */
	@ApiField("sched_end_time")
	private Date schedEndTime;

	/**
	 * 课次id
	 */
	@ApiField("sched_id")
	private String schedId;

	/**
	 * 学员id
	 */
	@ApiField("student_id")
	private String studentId;

	/**
	 * null
	 */
	@ApiListField("teacher_list")
	@ApiField("edu_class_teacher")
	private List<EduClassTeacher> teacherList;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getClassName() {
		return this.className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassRoomName() {
		return this.classRoomName;
	}
	public void setClassRoomName(String classRoomName) {
		this.classRoomName = classRoomName;
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

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getPlanConsumeLessions() {
		return this.planConsumeLessions;
	}
	public void setPlanConsumeLessions(String planConsumeLessions) {
		this.planConsumeLessions = planConsumeLessions;
	}

	public Date getSchedBeginTime() {
		return this.schedBeginTime;
	}
	public void setSchedBeginTime(Date schedBeginTime) {
		this.schedBeginTime = schedBeginTime;
	}

	public String getSchedContent() {
		return this.schedContent;
	}
	public void setSchedContent(String schedContent) {
		this.schedContent = schedContent;
	}

	public Date getSchedEndTime() {
		return this.schedEndTime;
	}
	public void setSchedEndTime(Date schedEndTime) {
		this.schedEndTime = schedEndTime;
	}

	public String getSchedId() {
		return this.schedId;
	}
	public void setSchedId(String schedId) {
		this.schedId = schedId;
	}

	public String getStudentId() {
		return this.studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public List<EduClassTeacher> getTeacherList() {
		return this.teacherList;
	}
	public void setTeacherList(List<EduClassTeacher> teacherList) {
		this.teacherList = teacherList;
	}

}

package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 泛行业教培上课点名信息同步
 *
 * @author auto create
 * @since 1.0, 2025-08-29 14:32:38
 */
public class AlipayCommerceFhyeduRollcallSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8781685883194994624L;

	/**
	 * 到课：PRESENT
迟到：LATE
未到：ABSENT
请假：LEAVE
	 */
	@ApiField("attended_status")
	private String attendedStatus;

	/**
	 * 上课开始时间
	 */
	@ApiField("begin_time")
	private Date beginTime;

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
	 * 预计消耗课数量
	 */
	@ApiField("consumed_quantity")
	private String consumedQuantity;

	/**
	 * CLASS_HOUR：课时
DAY：天
MONTH：月
	 */
	@ApiField("consumed_unit")
	private String consumedUnit;

	/**
	 * 消耗Id
	 */
	@ApiField("consumption_target_id")
	private String consumptionTargetId;

	/**
	 * 课程名称、体验卡名称、体验卡名称
	 */
	@ApiField("consumption_target_name")
	private String consumptionTargetName;

	/**
	 * 课程: COURSE
充值账户余额: BALANCE
体验卡: TRIAL_CARD
会员卡: MEMBERSHIP_CARD
	 */
	@ApiField("consumption_way")
	private String consumptionWay;

	/**
	 * 上课内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 课程id
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 课程名称
	 */
	@ApiField("course_name")
	private String courseName;

	/**
	 * 上课结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 点名备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 超上数量
	 */
	@ApiField("over_quantity")
	private String overQuantity;

	/**
	 * 是否超上
	 */
	@ApiField("over_scheduled")
	private Boolean overScheduled;

	/**
	 * 超上单位
CLASS_HOUR：课时
DAY：天
MONTH：月
	 */
	@ApiField("over_unit")
	private String overUnit;

	/**
	 * 点名记录id，幂等用
	 */
	@ApiField("roll_call_id")
	private String rollCallId;

	/**
	 * 点名时间
	 */
	@ApiField("roll_call_time")
	private Date rollCallTime;

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
	 * 上课老师
	 */
	@ApiField("teacher_name")
	private String teacherName;

	public String getAttendedStatus() {
		return this.attendedStatus;
	}
	public void setAttendedStatus(String attendedStatus) {
		this.attendedStatus = attendedStatus;
	}

	public Date getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
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

	public String getConsumedQuantity() {
		return this.consumedQuantity;
	}
	public void setConsumedQuantity(String consumedQuantity) {
		this.consumedQuantity = consumedQuantity;
	}

	public String getConsumedUnit() {
		return this.consumedUnit;
	}
	public void setConsumedUnit(String consumedUnit) {
		this.consumedUnit = consumedUnit;
	}

	public String getConsumptionTargetId() {
		return this.consumptionTargetId;
	}
	public void setConsumptionTargetId(String consumptionTargetId) {
		this.consumptionTargetId = consumptionTargetId;
	}

	public String getConsumptionTargetName() {
		return this.consumptionTargetName;
	}
	public void setConsumptionTargetName(String consumptionTargetName) {
		this.consumptionTargetName = consumptionTargetName;
	}

	public String getConsumptionWay() {
		return this.consumptionWay;
	}
	public void setConsumptionWay(String consumptionWay) {
		this.consumptionWay = consumptionWay;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
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

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOverQuantity() {
		return this.overQuantity;
	}
	public void setOverQuantity(String overQuantity) {
		this.overQuantity = overQuantity;
	}

	public Boolean getOverScheduled() {
		return this.overScheduled;
	}
	public void setOverScheduled(Boolean overScheduled) {
		this.overScheduled = overScheduled;
	}

	public String getOverUnit() {
		return this.overUnit;
	}
	public void setOverUnit(String overUnit) {
		this.overUnit = overUnit;
	}

	public String getRollCallId() {
		return this.rollCallId;
	}
	public void setRollCallId(String rollCallId) {
		this.rollCallId = rollCallId;
	}

	public Date getRollCallTime() {
		return this.rollCallTime;
	}
	public void setRollCallTime(Date rollCallTime) {
		this.rollCallTime = rollCallTime;
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

	public String getTeacherName() {
		return this.teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

}

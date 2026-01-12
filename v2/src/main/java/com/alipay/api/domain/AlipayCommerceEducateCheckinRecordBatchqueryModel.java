package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询签到记录
 *
 * @author auto create
 * @since 1.0, 2025-08-29 19:41:25
 */
public class AlipayCommerceEducateCheckinRecordBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8478668788642762498L;

	/**
	 * 签到结束时间
	 */
	@ApiField("check_in_end_time")
	private Date checkInEndTime;

	/**
	 * 签到结果
	 */
	@ApiField("check_in_result")
	private String checkInResult;

	/**
	 * 签到开始时间
	 */
	@ApiField("check_in_start_time")
	private Date checkInStartTime;

	/**
	 * 签到状态
	 */
	@ApiField("check_in_status")
	private String checkInStatus;

	/**
	 * 签到类型，由学生签到时，匹配到的签到规则决定
	 */
	@ApiField("check_in_type")
	private String checkInType;

	/**
	 * 课程id列表
	 */
	@ApiListField("course_id_list")
	@ApiField("string")
	private List<String> courseIdList;

	/**
	 * 学号或工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 学生姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 组织部门节点id
	 */
	@ApiListField("node_id_list")
	@ApiField("string")
	private List<String> nodeIdList;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页面大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 签到记录所属位置Id列表
	 */
	@ApiListField("place_id_list")
	@ApiField("string")
	private List<String> placeIdList;

	/**
	 * 教师花名册id
	 */
	@ApiField("teacher_roster_id")
	private String teacherRosterId;

	public Date getCheckInEndTime() {
		return this.checkInEndTime;
	}
	public void setCheckInEndTime(Date checkInEndTime) {
		this.checkInEndTime = checkInEndTime;
	}

	public String getCheckInResult() {
		return this.checkInResult;
	}
	public void setCheckInResult(String checkInResult) {
		this.checkInResult = checkInResult;
	}

	public Date getCheckInStartTime() {
		return this.checkInStartTime;
	}
	public void setCheckInStartTime(Date checkInStartTime) {
		this.checkInStartTime = checkInStartTime;
	}

	public String getCheckInStatus() {
		return this.checkInStatus;
	}
	public void setCheckInStatus(String checkInStatus) {
		this.checkInStatus = checkInStatus;
	}

	public String getCheckInType() {
		return this.checkInType;
	}
	public void setCheckInType(String checkInType) {
		this.checkInType = checkInType;
	}

	public List<String> getCourseIdList() {
		return this.courseIdList;
	}
	public void setCourseIdList(List<String> courseIdList) {
		this.courseIdList = courseIdList;
	}

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getNodeIdList() {
		return this.nodeIdList;
	}
	public void setNodeIdList(List<String> nodeIdList) {
		this.nodeIdList = nodeIdList;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getPlaceIdList() {
		return this.placeIdList;
	}
	public void setPlaceIdList(List<String> placeIdList) {
		this.placeIdList = placeIdList;
	}

	public String getTeacherRosterId() {
		return this.teacherRosterId;
	}
	public void setTeacherRosterId(String teacherRosterId) {
		this.teacherRosterId = teacherRosterId;
	}

}

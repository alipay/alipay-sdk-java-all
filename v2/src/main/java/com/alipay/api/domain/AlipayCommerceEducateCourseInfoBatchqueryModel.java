package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分页查询课程列表
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:58:54
 */
public class AlipayCommerceEducateCourseInfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3163583796915785285L;

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
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 组织节点ID列表
	 */
	@ApiListField("node_id_list")
	@ApiField("string")
	private List<String> nodeIdList;

	/**
	 * 分页页数，默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量，默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 教室位置ID
	 */
	@ApiField("place_id")
	private String placeId;

	/**
	 * 学期ID
	 */
	@ApiField("semester_id")
	private String semesterId;

	/**
	 * 教师花名册ID
	 */
	@ApiField("teacher_roster_id")
	private String teacherRosterId;

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

	public String getPlaceId() {
		return this.placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public String getSemesterId() {
		return this.semesterId;
	}
	public void setSemesterId(String semesterId) {
		this.semesterId = semesterId;
	}

	public String getTeacherRosterId() {
		return this.teacherRosterId;
	}
	public void setTeacherRosterId(String teacherRosterId) {
		this.teacherRosterId = teacherRosterId;
	}

}

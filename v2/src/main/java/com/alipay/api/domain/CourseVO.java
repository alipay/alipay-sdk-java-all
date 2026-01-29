package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-14 10:57:43
 */
public class CourseVO extends AlipayObject {

	private static final long serialVersionUID = 1793845618292331653L;

	/**
	 * 行业审核状态
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 支付宝商品类目
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * null
	 */
	@ApiListField("category_id_list")
	@ApiField("number")
	private List<Long> categoryIdList;

	/**
	 * null
	 */
	@ApiListField("certificate_code_list")
	@ApiField("string")
	private List<String> certificateCodeList;

	/**
	 * 是否认证课程，默认true
	 */
	@ApiField("certification_course")
	private Boolean certificationCourse;

	/**
	 * null
	 */
	@ApiListField("city_code_list")
	@ApiField("string")
	private List<String> cityCodeList;

	/**
	 * 课程封面视频
生活号视频id,非URL。
	 */
	@ApiField("course_cover_video")
	private String courseCoverVideo;

	/**
	 * yyyy-MM-dd  格式时间
	 */
	@ApiField("course_end_date")
	private String courseEndDate;

	/**
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 单位为分，399元需填写的值为39900。courseMaxPrice和courseMinPrice都填写时, min<=max
	 */
	@ApiField("course_max_price")
	private Long courseMaxPrice;

	/**
	 * 单位为分，399元需填写的值为39900
	 */
	@ApiField("course_min_price")
	private Long courseMinPrice;

	/**
	 * 课程名称
	 */
	@ApiField("course_name")
	private String courseName;

	/**
	 * 课程须知
	 */
	@ApiField("course_notes")
	private String courseNotes;

	/**
	 * null
	 */
	@ApiListField("course_selling_points")
	@ApiField("string")
	private List<String> courseSellingPoints;

	/**
	 * yyyy-MM-dd  格式时间
	 */
	@ApiField("course_start_date")
	private String courseStartDate;

	/**
	 * DELISTING("已下架")
FREEZE("已冻结")
AVAILABLE("可售卖")
AUDITING("审核中")
AUDIT_REJECT("审核驳回")
	 */
	@ApiField("course_status")
	private String courseStatus;

	/**
	 * null
	 */
	@ApiListField("course_tags")
	@ApiField("course_tag_v_o")
	private List<CourseTagVO> courseTags;

	/**
	 * 课程描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * null
	 */
	@ApiListField("details_image_list")
	@ApiField("string")
	private List<String> detailsImageList;

	/**
	 * 是否试听，默认false
	 */
	@ApiField("has_trial")
	private Boolean hasTrial;

	/**
	 * null
	 */
	@ApiListField("head_image_list")
	@ApiField("string")
	private List<String> headImageList;

	/**
	 * 行业展示状态
	 */
	@ApiField("industry_show_status")
	private String industryShowStatus;

	/**
	 * 课程提交机构编码
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 外部课程ID
	 */
	@ApiField("out_course_id")
	private String outCourseId;

	/**
	 * 内部备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 培训服务URL
	 */
	@ApiField("service_url")
	private String serviceUrl;

	/**
	 * 学员要求
	 */
	@ApiField("student_requirement")
	private String studentRequirement;

	/**
	 * null
	 */
	@ApiListField("teacher_info")
	@ApiField("teacher_v_o")
	private List<TeacherVO> teacherInfo;

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public List<Long> getCategoryIdList() {
		return this.categoryIdList;
	}
	public void setCategoryIdList(List<Long> categoryIdList) {
		this.categoryIdList = categoryIdList;
	}

	public List<String> getCertificateCodeList() {
		return this.certificateCodeList;
	}
	public void setCertificateCodeList(List<String> certificateCodeList) {
		this.certificateCodeList = certificateCodeList;
	}

	public Boolean getCertificationCourse() {
		return this.certificationCourse;
	}
	public void setCertificationCourse(Boolean certificationCourse) {
		this.certificationCourse = certificationCourse;
	}

	public List<String> getCityCodeList() {
		return this.cityCodeList;
	}
	public void setCityCodeList(List<String> cityCodeList) {
		this.cityCodeList = cityCodeList;
	}

	public String getCourseCoverVideo() {
		return this.courseCoverVideo;
	}
	public void setCourseCoverVideo(String courseCoverVideo) {
		this.courseCoverVideo = courseCoverVideo;
	}

	public String getCourseEndDate() {
		return this.courseEndDate;
	}
	public void setCourseEndDate(String courseEndDate) {
		this.courseEndDate = courseEndDate;
	}

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public Long getCourseMaxPrice() {
		return this.courseMaxPrice;
	}
	public void setCourseMaxPrice(Long courseMaxPrice) {
		this.courseMaxPrice = courseMaxPrice;
	}

	public Long getCourseMinPrice() {
		return this.courseMinPrice;
	}
	public void setCourseMinPrice(Long courseMinPrice) {
		this.courseMinPrice = courseMinPrice;
	}

	public String getCourseName() {
		return this.courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseNotes() {
		return this.courseNotes;
	}
	public void setCourseNotes(String courseNotes) {
		this.courseNotes = courseNotes;
	}

	public List<String> getCourseSellingPoints() {
		return this.courseSellingPoints;
	}
	public void setCourseSellingPoints(List<String> courseSellingPoints) {
		this.courseSellingPoints = courseSellingPoints;
	}

	public String getCourseStartDate() {
		return this.courseStartDate;
	}
	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	public String getCourseStatus() {
		return this.courseStatus;
	}
	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}

	public List<CourseTagVO> getCourseTags() {
		return this.courseTags;
	}
	public void setCourseTags(List<CourseTagVO> courseTags) {
		this.courseTags = courseTags;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getDetailsImageList() {
		return this.detailsImageList;
	}
	public void setDetailsImageList(List<String> detailsImageList) {
		this.detailsImageList = detailsImageList;
	}

	public Boolean getHasTrial() {
		return this.hasTrial;
	}
	public void setHasTrial(Boolean hasTrial) {
		this.hasTrial = hasTrial;
	}

	public List<String> getHeadImageList() {
		return this.headImageList;
	}
	public void setHeadImageList(List<String> headImageList) {
		this.headImageList = headImageList;
	}

	public String getIndustryShowStatus() {
		return this.industryShowStatus;
	}
	public void setIndustryShowStatus(String industryShowStatus) {
		this.industryShowStatus = industryShowStatus;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOutCourseId() {
		return this.outCourseId;
	}
	public void setOutCourseId(String outCourseId) {
		this.outCourseId = outCourseId;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getStudentRequirement() {
		return this.studentRequirement;
	}
	public void setStudentRequirement(String studentRequirement) {
		this.studentRequirement = studentRequirement;
	}

	public List<TeacherVO> getTeacherInfo() {
		return this.teacherInfo;
	}
	public void setTeacherInfo(List<TeacherVO> teacherInfo) {
		this.teacherInfo = teacherInfo;
	}

}

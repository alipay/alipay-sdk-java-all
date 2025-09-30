package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CourseTagVO;
import com.alipay.api.domain.CourseItemRiskVO;
import com.alipay.api.domain.TeacherVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.course.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:17:36
 */
public class AlipayEbppIndustryCareertrainingCourseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6423966523154892565L;

	/** 
	 * 支付宝商品类目
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * null
	 */
	@ApiListField("certificate_code_list")
	@ApiField("string")
	private List<String> certificateCodeList;

	/** 
	 * null
	 */
	@ApiListField("city_code_list")
	@ApiField("string")
	private List<String> cityCodeList;

	/** 
	 * 课程封面视频
生活号视频id,非URL。获取方式见：<a href="https://adccloud.yuque.com/adccloud/abilitywarehouse/cggokr7us69cxxo8?singleDoc#" target="_blank">链接</a>
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
	 * null
	 */
	@ApiListField("head_image_list")
	@ApiField("string")
	private List<String> headImageList;

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
	 * 当前入参needEditVersion 为true, 且审核被驳回时, 此处显示驳回信息
	 */
	@ApiField("risk_info")
	private CourseItemRiskVO riskInfo;

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

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryId( ) {
		return this.categoryId;
	}

	public void setCertificateCodeList(List<String> certificateCodeList) {
		this.certificateCodeList = certificateCodeList;
	}
	public List<String> getCertificateCodeList( ) {
		return this.certificateCodeList;
	}

	public void setCityCodeList(List<String> cityCodeList) {
		this.cityCodeList = cityCodeList;
	}
	public List<String> getCityCodeList( ) {
		return this.cityCodeList;
	}

	public void setCourseCoverVideo(String courseCoverVideo) {
		this.courseCoverVideo = courseCoverVideo;
	}
	public String getCourseCoverVideo( ) {
		return this.courseCoverVideo;
	}

	public void setCourseEndDate(String courseEndDate) {
		this.courseEndDate = courseEndDate;
	}
	public String getCourseEndDate( ) {
		return this.courseEndDate;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseId( ) {
		return this.courseId;
	}

	public void setCourseMaxPrice(Long courseMaxPrice) {
		this.courseMaxPrice = courseMaxPrice;
	}
	public Long getCourseMaxPrice( ) {
		return this.courseMaxPrice;
	}

	public void setCourseMinPrice(Long courseMinPrice) {
		this.courseMinPrice = courseMinPrice;
	}
	public Long getCourseMinPrice( ) {
		return this.courseMinPrice;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseName( ) {
		return this.courseName;
	}

	public void setCourseNotes(String courseNotes) {
		this.courseNotes = courseNotes;
	}
	public String getCourseNotes( ) {
		return this.courseNotes;
	}

	public void setCourseSellingPoints(List<String> courseSellingPoints) {
		this.courseSellingPoints = courseSellingPoints;
	}
	public List<String> getCourseSellingPoints( ) {
		return this.courseSellingPoints;
	}

	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}
	public String getCourseStartDate( ) {
		return this.courseStartDate;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}
	public String getCourseStatus( ) {
		return this.courseStatus;
	}

	public void setCourseTags(List<CourseTagVO> courseTags) {
		this.courseTags = courseTags;
	}
	public List<CourseTagVO> getCourseTags( ) {
		return this.courseTags;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setDetailsImageList(List<String> detailsImageList) {
		this.detailsImageList = detailsImageList;
	}
	public List<String> getDetailsImageList( ) {
		return this.detailsImageList;
	}

	public void setHeadImageList(List<String> headImageList) {
		this.headImageList = headImageList;
	}
	public List<String> getHeadImageList( ) {
		return this.headImageList;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgCode( ) {
		return this.orgCode;
	}

	public void setOutCourseId(String outCourseId) {
		this.outCourseId = outCourseId;
	}
	public String getOutCourseId( ) {
		return this.outCourseId;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setRiskInfo(CourseItemRiskVO riskInfo) {
		this.riskInfo = riskInfo;
	}
	public CourseItemRiskVO getRiskInfo( ) {
		return this.riskInfo;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
	public String getServiceUrl( ) {
		return this.serviceUrl;
	}

	public void setStudentRequirement(String studentRequirement) {
		this.studentRequirement = studentRequirement;
	}
	public String getStudentRequirement( ) {
		return this.studentRequirement;
	}

	public void setTeacherInfo(List<TeacherVO> teacherInfo) {
		this.teacherInfo = teacherInfo;
	}
	public List<TeacherVO> getTeacherInfo( ) {
		return this.teacherInfo;
	}

}

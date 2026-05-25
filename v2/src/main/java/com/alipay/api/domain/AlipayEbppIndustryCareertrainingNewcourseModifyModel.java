package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改职业培训课程信息V2
 *
 * @author auto create
 * @since 1.0, 2026-04-07 10:51:36
 */
public class AlipayEbppIndustryCareertrainingNewcourseModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7283874698437949498L;

	/**
	 * null
	 */
	@ApiListField("applicable_population_list")
	@ApiField("string")
	private List<String> applicablePopulationList;

	/**
	 * 测评服务-名称
	 */
	@ApiField("as_custom_name")
	private String asCustomName;

	/**
	 * 测评服务-场次
	 */
	@ApiField("as_times")
	private Long asTimes;

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
	 * null
	 */
	@ApiListField("certificate_desc_list")
	@ApiField("string")
	private List<String> certificateDescList;

	/**
	 * null
	 */
	@ApiListField("city_code_list")
	@ApiField("string")
	private List<String> cityCodeList;

	/**
	 * 咨询钩子
	 */
	@ApiField("consultation_hook")
	private String consultationHook;

	/**
	 * null
	 */
	@ApiListField("container_type_list")
	@ApiField("string")
	private List<String> containerTypeList;

	/**
	 * 课程封面视频,生活号视频id
	 */
	@ApiField("course_cover_video")
	private String courseCoverVideo;

	/**
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 课程介绍
	 */
	@ApiField("course_introduction")
	private String courseIntroduction;

	/**
	 * 课程名称
	 */
	@ApiField("course_name")
	private String courseName;

	/**
	 * 课程类型
	 */
	@ApiField("course_type")
	private String courseType;

	/**
	 * 封面图片
	 */
	@ApiField("cover_image")
	private String coverImage;

	/**
	 * 课程描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 折扣方式
	 */
	@ApiField("discount_method")
	private String discountMethod;

	/**
	 * null
	 */
	@ApiListField("head_image_list")
	@ApiField("string")
	private List<String> headImageList;

	/**
	 * 学习资料-描述
	 */
	@ApiField("lm_description")
	private String lmDescription;

	/**
	 * 在线直播课-场次
	 */
	@ApiField("lsc_sessions")
	private Long lscSessions;

	/**
	 * 原价（分）
	 */
	@ApiField("market_price")
	private Long marketPrice;

	/**
	 * 线下课-课时,小时
	 */
	@ApiField("oc_hours")
	private Long ocHours;

	/**
	 * 线下课-每班人数
	 */
	@ApiField("oc_students_per_class")
	private Long ocStudentsPerClass;

	/**
	 * 实训课-课时,小时
	 */
	@ApiField("pt_hours")
	private Long ptHours;

	/**
	 * 实训课-是否提供场地与设备
	 */
	@ApiField("pt_provide_venue_and_equipment")
	private Boolean ptProvideVenueAndEquipment;

	/**
	 * 关联程度
	 */
	@ApiField("relation_degree")
	private String relationDegree;

	/**
	 * 内部备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 报价（分）
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 课程介绍 - 是否启用课程大纲
	 */
	@ApiField("separate_syllabus")
	private Boolean separateSyllabus;

	/**
	 * 课程介绍 - 是否启用课程大纲结构化
	 */
	@ApiField("separate_syllabus_structured")
	private Boolean separateSyllabusStructured;

	/**
	 * 小程序课程详情页URL
	 */
	@ApiField("service_url")
	private String serviceUrl;

	/**
	 * 课程大纲
	 */
	@ApiField("syllabus_rich_text")
	private String syllabusRichText;

	/**
	 * null
	 */
	@ApiListField("syllabus_structured")
	@ApiField("syllabus_structured_modify_v_o")
	private List<SyllabusStructuredModifyVO> syllabusStructured;

	/**
	 * null
	 */
	@ApiListField("teacher_info")
	@ApiField("teacher_v_o")
	private List<TeacherVO> teacherInfo;

	/**
	 * 视频课-时
	 */
	@ApiField("vc_hours")
	private Long vcHours;

	/**
	 * 视频课-分
	 */
	@ApiField("vc_minutes")
	private Long vcMinutes;

	/**
	 * 视频课-有效期单位，月或年
	 */
	@ApiField("vc_validity_unit")
	private String vcValidityUnit;

	/**
	 * 视频课-有效期，月或年，填0表示无限
	 */
	@ApiField("vc_validity_value")
	private Long vcValidityValue;

	public List<String> getApplicablePopulationList() {
		return this.applicablePopulationList;
	}
	public void setApplicablePopulationList(List<String> applicablePopulationList) {
		this.applicablePopulationList = applicablePopulationList;
	}

	public String getAsCustomName() {
		return this.asCustomName;
	}
	public void setAsCustomName(String asCustomName) {
		this.asCustomName = asCustomName;
	}

	public Long getAsTimes() {
		return this.asTimes;
	}
	public void setAsTimes(Long asTimes) {
		this.asTimes = asTimes;
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

	public List<String> getCertificateDescList() {
		return this.certificateDescList;
	}
	public void setCertificateDescList(List<String> certificateDescList) {
		this.certificateDescList = certificateDescList;
	}

	public List<String> getCityCodeList() {
		return this.cityCodeList;
	}
	public void setCityCodeList(List<String> cityCodeList) {
		this.cityCodeList = cityCodeList;
	}

	public String getConsultationHook() {
		return this.consultationHook;
	}
	public void setConsultationHook(String consultationHook) {
		this.consultationHook = consultationHook;
	}

	public List<String> getContainerTypeList() {
		return this.containerTypeList;
	}
	public void setContainerTypeList(List<String> containerTypeList) {
		this.containerTypeList = containerTypeList;
	}

	public String getCourseCoverVideo() {
		return this.courseCoverVideo;
	}
	public void setCourseCoverVideo(String courseCoverVideo) {
		this.courseCoverVideo = courseCoverVideo;
	}

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseIntroduction() {
		return this.courseIntroduction;
	}
	public void setCourseIntroduction(String courseIntroduction) {
		this.courseIntroduction = courseIntroduction;
	}

	public String getCourseName() {
		return this.courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseType() {
		return this.courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getCoverImage() {
		return this.coverImage;
	}
	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDiscountMethod() {
		return this.discountMethod;
	}
	public void setDiscountMethod(String discountMethod) {
		this.discountMethod = discountMethod;
	}

	public List<String> getHeadImageList() {
		return this.headImageList;
	}
	public void setHeadImageList(List<String> headImageList) {
		this.headImageList = headImageList;
	}

	public String getLmDescription() {
		return this.lmDescription;
	}
	public void setLmDescription(String lmDescription) {
		this.lmDescription = lmDescription;
	}

	public Long getLscSessions() {
		return this.lscSessions;
	}
	public void setLscSessions(Long lscSessions) {
		this.lscSessions = lscSessions;
	}

	public Long getMarketPrice() {
		return this.marketPrice;
	}
	public void setMarketPrice(Long marketPrice) {
		this.marketPrice = marketPrice;
	}

	public Long getOcHours() {
		return this.ocHours;
	}
	public void setOcHours(Long ocHours) {
		this.ocHours = ocHours;
	}

	public Long getOcStudentsPerClass() {
		return this.ocStudentsPerClass;
	}
	public void setOcStudentsPerClass(Long ocStudentsPerClass) {
		this.ocStudentsPerClass = ocStudentsPerClass;
	}

	public Long getPtHours() {
		return this.ptHours;
	}
	public void setPtHours(Long ptHours) {
		this.ptHours = ptHours;
	}

	public Boolean getPtProvideVenueAndEquipment() {
		return this.ptProvideVenueAndEquipment;
	}
	public void setPtProvideVenueAndEquipment(Boolean ptProvideVenueAndEquipment) {
		this.ptProvideVenueAndEquipment = ptProvideVenueAndEquipment;
	}

	public String getRelationDegree() {
		return this.relationDegree;
	}
	public void setRelationDegree(String relationDegree) {
		this.relationDegree = relationDegree;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public Boolean getSeparateSyllabus() {
		return this.separateSyllabus;
	}
	public void setSeparateSyllabus(Boolean separateSyllabus) {
		this.separateSyllabus = separateSyllabus;
	}

	public Boolean getSeparateSyllabusStructured() {
		return this.separateSyllabusStructured;
	}
	public void setSeparateSyllabusStructured(Boolean separateSyllabusStructured) {
		this.separateSyllabusStructured = separateSyllabusStructured;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getSyllabusRichText() {
		return this.syllabusRichText;
	}
	public void setSyllabusRichText(String syllabusRichText) {
		this.syllabusRichText = syllabusRichText;
	}

	public List<SyllabusStructuredModifyVO> getSyllabusStructured() {
		return this.syllabusStructured;
	}
	public void setSyllabusStructured(List<SyllabusStructuredModifyVO> syllabusStructured) {
		this.syllabusStructured = syllabusStructured;
	}

	public List<TeacherVO> getTeacherInfo() {
		return this.teacherInfo;
	}
	public void setTeacherInfo(List<TeacherVO> teacherInfo) {
		this.teacherInfo = teacherInfo;
	}

	public Long getVcHours() {
		return this.vcHours;
	}
	public void setVcHours(Long vcHours) {
		this.vcHours = vcHours;
	}

	public Long getVcMinutes() {
		return this.vcMinutes;
	}
	public void setVcMinutes(Long vcMinutes) {
		this.vcMinutes = vcMinutes;
	}

	public String getVcValidityUnit() {
		return this.vcValidityUnit;
	}
	public void setVcValidityUnit(String vcValidityUnit) {
		this.vcValidityUnit = vcValidityUnit;
	}

	public Long getVcValidityValue() {
		return this.vcValidityValue;
	}
	public void setVcValidityValue(Long vcValidityValue) {
		this.vcValidityValue = vcValidityValue;
	}

}

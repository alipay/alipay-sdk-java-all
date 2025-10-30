package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExamAttrsItemVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.exam.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-27 19:07:36
 */
public class AlipayEbppIndustryCareertrainingExamQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5781136518914486681L;

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
	 * 考试描述
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 考试详情文本
	 */
	@ApiField("details")
	private String details;

	/** 
	 * null
	 */
	@ApiListField("exam_attrs")
	@ApiField("exam_attrs_item_v_o")
	private List<ExamAttrsItemVO> examAttrs;

	/** 
	 * 评价id
	 */
	@ApiField("exam_id")
	private String examId;

	/** 
	 * 考试事项名称
	 */
	@ApiField("exam_name")
	private String examName;

	/** 
	 * 考试状态
	 */
	@ApiField("exam_status")
	private String examStatus;

	/** 
	 * 考试时间描述
	 */
	@ApiField("exam_time_notes")
	private String examTimeNotes;

	/** 
	 * null
	 */
	@ApiListField("head_image_list")
	@ApiField("string")
	private List<String> headImageList;

	/** 
	 * 考试定价(最大值)，单位分
maxPrice和minPrice都填写时, minPrice<=maxPrice
	 */
	@ApiField("max_price")
	private Long maxPrice;

	/** 
	 * 考试定价(最小值) ，单位分
非必填	
	 */
	@ApiField("min_price")
	private Long minPrice;

	/** 
	 * 考试提交机构
示例: G202507250000001
	 */
	@ApiField("org_code")
	private String orgCode;

	/** 
	 * 外部评价id
	 */
	@ApiField("out_exam_id")
	private String outExamId;

	/** 
	 * yyyy-MM-dd  格式时间
	 */
	@ApiField("registration_end_date")
	private String registrationEndDate;

	/** 
	 * 报考须知
	 */
	@ApiField("registration_notes")
	private String registrationNotes;

	/** 
	 * 报考要求
	 */
	@ApiField("registration_requirement")
	private String registrationRequirement;

	/** 
	 * yyyy-MM-dd  格式时间
	 */
	@ApiField("registration_start_date")
	private String registrationStartDate;

	/** 
	 * 报考流程
	 */
	@ApiField("registration_steps")
	private String registrationSteps;

	/** 
	 * 内部备注
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 考试详情URL
	 */
	@ApiField("service_url")
	private String serviceUrl;

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

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	public String getDetails( ) {
		return this.details;
	}

	public void setExamAttrs(List<ExamAttrsItemVO> examAttrs) {
		this.examAttrs = examAttrs;
	}
	public List<ExamAttrsItemVO> getExamAttrs( ) {
		return this.examAttrs;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}
	public String getExamId( ) {
		return this.examId;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getExamName( ) {
		return this.examName;
	}

	public void setExamStatus(String examStatus) {
		this.examStatus = examStatus;
	}
	public String getExamStatus( ) {
		return this.examStatus;
	}

	public void setExamTimeNotes(String examTimeNotes) {
		this.examTimeNotes = examTimeNotes;
	}
	public String getExamTimeNotes( ) {
		return this.examTimeNotes;
	}

	public void setHeadImageList(List<String> headImageList) {
		this.headImageList = headImageList;
	}
	public List<String> getHeadImageList( ) {
		return this.headImageList;
	}

	public void setMaxPrice(Long maxPrice) {
		this.maxPrice = maxPrice;
	}
	public Long getMaxPrice( ) {
		return this.maxPrice;
	}

	public void setMinPrice(Long minPrice) {
		this.minPrice = minPrice;
	}
	public Long getMinPrice( ) {
		return this.minPrice;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgCode( ) {
		return this.orgCode;
	}

	public void setOutExamId(String outExamId) {
		this.outExamId = outExamId;
	}
	public String getOutExamId( ) {
		return this.outExamId;
	}

	public void setRegistrationEndDate(String registrationEndDate) {
		this.registrationEndDate = registrationEndDate;
	}
	public String getRegistrationEndDate( ) {
		return this.registrationEndDate;
	}

	public void setRegistrationNotes(String registrationNotes) {
		this.registrationNotes = registrationNotes;
	}
	public String getRegistrationNotes( ) {
		return this.registrationNotes;
	}

	public void setRegistrationRequirement(String registrationRequirement) {
		this.registrationRequirement = registrationRequirement;
	}
	public String getRegistrationRequirement( ) {
		return this.registrationRequirement;
	}

	public void setRegistrationStartDate(String registrationStartDate) {
		this.registrationStartDate = registrationStartDate;
	}
	public String getRegistrationStartDate( ) {
		return this.registrationStartDate;
	}

	public void setRegistrationSteps(String registrationSteps) {
		this.registrationSteps = registrationSteps;
	}
	public String getRegistrationSteps( ) {
		return this.registrationSteps;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
	public String getServiceUrl( ) {
		return this.serviceUrl;
	}

}

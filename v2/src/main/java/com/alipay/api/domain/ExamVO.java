package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-08-18 14:12:34
 */
public class ExamVO extends AlipayObject {

	private static final long serialVersionUID = 6466952115329813687L;

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
	 * 考试id
	 */
	@ApiField("exam_id")
	private String examId;

	/**
	 * 浙江省xxx职业技能考试
	 */
	@ApiField("exam_name")
	private String examName;

	/**
	 * 必填	枚举: 
DELISTING("已下架")
AVAILABLE("可售卖")
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
	 * 考试定价最大值,单位:分
599元需填写的值为59900
maxPrice和minPrice都填写时, minPrice<=maxPrice
	 */
	@ApiField("max_price")
	private Long maxPrice;

	/**
	 * 考试定价(最小值) 单位:分
399元需填写的值为39900
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
	 * 外部考试id
	 */
	@ApiField("out_exam_id")
	private String outExamId;

	/**
	 * yyyy-MM-dd  格式时间
	 */
	@ApiField("registration_end_date")
	private String registrationEndDate;

	/**
	 * 富文本
	 */
	@ApiField("registration_notes")
	private String registrationNotes;

	/**
	 * 报考要求：大json，key/value 机构自己定
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
	 * 不对C表达，后台功能
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 只能传 alipays://xxx 形式的url
	 */
	@ApiField("service_url")
	private String serviceUrl;

	public List<String> getCertificateCodeList() {
		return this.certificateCodeList;
	}
	public void setCertificateCodeList(List<String> certificateCodeList) {
		this.certificateCodeList = certificateCodeList;
	}

	public List<String> getCityCodeList() {
		return this.cityCodeList;
	}
	public void setCityCodeList(List<String> cityCodeList) {
		this.cityCodeList = cityCodeList;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return this.details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

	public List<ExamAttrsItemVO> getExamAttrs() {
		return this.examAttrs;
	}
	public void setExamAttrs(List<ExamAttrsItemVO> examAttrs) {
		this.examAttrs = examAttrs;
	}

	public String getExamId() {
		return this.examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return this.examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getExamStatus() {
		return this.examStatus;
	}
	public void setExamStatus(String examStatus) {
		this.examStatus = examStatus;
	}

	public String getExamTimeNotes() {
		return this.examTimeNotes;
	}
	public void setExamTimeNotes(String examTimeNotes) {
		this.examTimeNotes = examTimeNotes;
	}

	public List<String> getHeadImageList() {
		return this.headImageList;
	}
	public void setHeadImageList(List<String> headImageList) {
		this.headImageList = headImageList;
	}

	public Long getMaxPrice() {
		return this.maxPrice;
	}
	public void setMaxPrice(Long maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Long getMinPrice() {
		return this.minPrice;
	}
	public void setMinPrice(Long minPrice) {
		this.minPrice = minPrice;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOutExamId() {
		return this.outExamId;
	}
	public void setOutExamId(String outExamId) {
		this.outExamId = outExamId;
	}

	public String getRegistrationEndDate() {
		return this.registrationEndDate;
	}
	public void setRegistrationEndDate(String registrationEndDate) {
		this.registrationEndDate = registrationEndDate;
	}

	public String getRegistrationNotes() {
		return this.registrationNotes;
	}
	public void setRegistrationNotes(String registrationNotes) {
		this.registrationNotes = registrationNotes;
	}

	public String getRegistrationRequirement() {
		return this.registrationRequirement;
	}
	public void setRegistrationRequirement(String registrationRequirement) {
		this.registrationRequirement = registrationRequirement;
	}

	public String getRegistrationStartDate() {
		return this.registrationStartDate;
	}
	public void setRegistrationStartDate(String registrationStartDate) {
		this.registrationStartDate = registrationStartDate;
	}

	public String getRegistrationSteps() {
		return this.registrationSteps;
	}
	public void setRegistrationSteps(String registrationSteps) {
		this.registrationSteps = registrationSteps;
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

}

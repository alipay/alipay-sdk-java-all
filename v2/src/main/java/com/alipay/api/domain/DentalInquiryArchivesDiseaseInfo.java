package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 诊后档案病症信息
 *
 * @author auto create
 * @since 1.0, 2025-05-27 17:09:03
 */
public class DentalInquiryArchivesDiseaseInfo extends AlipayObject {

	private static final long serialVersionUID = 1633785154575338279L;

	/**
	 * 用于描述病症的治疗阶段
	 */
	@ApiField("inquiry_status")
	private String inquiryStatus;

	/**
	 * 1：主诉
0：非主诉
	 */
	@ApiField("main_demands")
	private Long mainDemands;

	/**
	 * 商家提供的病症ID
	 */
	@ApiField("out_disease_id")
	private String outDiseaseId;

	/**
	 * 用于描述病症的基础症状
	 */
	@ApiField("question")
	private String question;

	/**
	 * 用于描述症状的严重程度
	 */
	@ApiField("question_level")
	private DentalInquiryArchivesDiseaseLevelInfo questionLevel;

	/**
	 * 用于记录牙位问题位置：全口、左上1~8、左下1~8...
	 */
	@ApiField("question_position")
	private String questionPosition;

	/**
	 * 描述病症存在的风险
	 */
	@ApiField("question_risk")
	private String questionRisk;

	/**
	 * 医生针对病症的建议列表
	 */
	@ApiListField("question_suggestion")
	@ApiField("string")
	private List<String> questionSuggestion;

	/**
	 * 记录病症的读取状态，用于C端病症卡片呈现样式
	 */
	@ApiField("read_status")
	private String readStatus;

	public String getInquiryStatus() {
		return this.inquiryStatus;
	}
	public void setInquiryStatus(String inquiryStatus) {
		this.inquiryStatus = inquiryStatus;
	}

	public Long getMainDemands() {
		return this.mainDemands;
	}
	public void setMainDemands(Long mainDemands) {
		this.mainDemands = mainDemands;
	}

	public String getOutDiseaseId() {
		return this.outDiseaseId;
	}
	public void setOutDiseaseId(String outDiseaseId) {
		this.outDiseaseId = outDiseaseId;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public DentalInquiryArchivesDiseaseLevelInfo getQuestionLevel() {
		return this.questionLevel;
	}
	public void setQuestionLevel(DentalInquiryArchivesDiseaseLevelInfo questionLevel) {
		this.questionLevel = questionLevel;
	}

	public String getQuestionPosition() {
		return this.questionPosition;
	}
	public void setQuestionPosition(String questionPosition) {
		this.questionPosition = questionPosition;
	}

	public String getQuestionRisk() {
		return this.questionRisk;
	}
	public void setQuestionRisk(String questionRisk) {
		this.questionRisk = questionRisk;
	}

	public List<String> getQuestionSuggestion() {
		return this.questionSuggestion;
	}
	public void setQuestionSuggestion(List<String> questionSuggestion) {
		this.questionSuggestion = questionSuggestion;
	}

	public String getReadStatus() {
		return this.readStatus;
	}
	public void setReadStatus(String readStatus) {
		this.readStatus = readStatus;
	}

}

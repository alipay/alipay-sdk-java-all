package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检测项具体检测结果分析实体
 *
 * @author auto create
 * @since 1.0, 2023-06-27 17:17:29
 */
public class ApmobileDetectItemDTO extends AlipayObject {

	private static final long serialVersionUID = 4814456279875573921L;

	/**
	 * 检测项结论
	 */
	@ApiField("detect_item_conclusion")
	private String detectItemConclusion;

	/**
	 * 检测项描述
	 */
	@ApiField("detect_item_desc")
	private String detectItemDesc;

	/**
	 * 检测步骤
	 */
	@ApiField("detect_item_step")
	private String detectItemStep;

	/**
	 * 检测项-子项目
	 */
	@ApiField("detect_item_sub_type")
	private String detectItemSubType;

	/**
	 * 证据项文本
	 */
	@ApiField("evidence_text")
	private String evidenceText;

	/**
	 * 检测项专家意见
	 */
	@ApiField("expert_opinion")
	private String expertOpinion;

	public String getDetectItemConclusion() {
		return this.detectItemConclusion;
	}
	public void setDetectItemConclusion(String detectItemConclusion) {
		this.detectItemConclusion = detectItemConclusion;
	}

	public String getDetectItemDesc() {
		return this.detectItemDesc;
	}
	public void setDetectItemDesc(String detectItemDesc) {
		this.detectItemDesc = detectItemDesc;
	}

	public String getDetectItemStep() {
		return this.detectItemStep;
	}
	public void setDetectItemStep(String detectItemStep) {
		this.detectItemStep = detectItemStep;
	}

	public String getDetectItemSubType() {
		return this.detectItemSubType;
	}
	public void setDetectItemSubType(String detectItemSubType) {
		this.detectItemSubType = detectItemSubType;
	}

	public String getEvidenceText() {
		return this.evidenceText;
	}
	public void setEvidenceText(String evidenceText) {
		this.evidenceText = evidenceText;
	}

	public String getExpertOpinion() {
		return this.expertOpinion;
	}
	public void setExpertOpinion(String expertOpinion) {
		this.expertOpinion = expertOpinion;
	}

}

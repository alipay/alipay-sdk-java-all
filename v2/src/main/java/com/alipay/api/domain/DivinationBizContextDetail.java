package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 求签业务上下文详情，在外部调用方调用支付回执动作的同时，将支付业务属性的内容也传输过来，端侧能够快速响应呈现，完成闭环
 *
 * @author auto create
 * @since 1.0, 2025-06-04 18:13:55
 */
public class DivinationBizContextDetail extends AlipayObject {

	private static final long serialVersionUID = 7712396772542793795L;

	/**
	 * 签文类别
	 */
	@ApiField("category")
	private String category;

	/**
	 * 签语
	 */
	@ApiField("conclusion")
	private String conclusion;

	/**
	 * 求签ID，由提供方生成
	 */
	@ApiField("divination_id")
	private String divinationId;

	/**
	 * 签文等级
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * 仙机
	 */
	@ApiField("insight")
	private String insight;

	/**
	 * 签文解释解曰
	 */
	@ApiField("interpretation")
	private String interpretation;

	/**
	 * 签文名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 签文内容诗曰，一般是四句话
	 */
	@ApiField("poem")
	private String poem;

	/**
	 * 引用的古人典故
	 */
	@ApiField("reference")
	private String reference;

	/**
	 * 序列号
	 */
	@ApiField("sequence_number")
	private String sequenceNumber;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getConclusion() {
		return this.conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getDivinationId() {
		return this.divinationId;
	}
	public void setDivinationId(String divinationId) {
		this.divinationId = divinationId;
	}

	public String getGrade() {
		return this.grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getInsight() {
		return this.insight;
	}
	public void setInsight(String insight) {
		this.insight = insight;
	}

	public String getInterpretation() {
		return this.interpretation;
	}
	public void setInterpretation(String interpretation) {
		this.interpretation = interpretation;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPoem() {
		return this.poem;
	}
	public void setPoem(String poem) {
		this.poem = poem;
	}

	public String getReference() {
		return this.reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getSequenceNumber() {
		return this.sequenceNumber;
	}
	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

}

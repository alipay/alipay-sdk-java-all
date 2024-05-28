package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支小助专家框架详情
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:34:37
 */
public class FinFrameworkDetail extends AlipayObject {

	private static final long serialVersionUID = 5199118781951491373L;

	/**
	 * 框架编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 评价标准
	 */
	@ApiField("evaluation_standard")
	private String evaluationStandard;

	/**
	 * 专家知识
	 */
	@ApiField("expert_knowledge")
	private String expertKnowledge;

	/**
	 * 表达要求
	 */
	@ApiField("expression_requirements")
	private String expressionRequirements;

	/**
	 * 解读思路
	 */
	@ApiField("interpretation_thoughts")
	private String interpretationThoughts;

	/**
	 * 框架介绍
	 */
	@ApiField("introduction")
	private String introduction;

	/**
	 * 框架名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 收集信息内容
	 */
	@ApiField("plan")
	private String plan;

	/**
	 * 框架顺序
	 */
	@ApiField("sort")
	private Long sort;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getEvaluationStandard() {
		return this.evaluationStandard;
	}
	public void setEvaluationStandard(String evaluationStandard) {
		this.evaluationStandard = evaluationStandard;
	}

	public String getExpertKnowledge() {
		return this.expertKnowledge;
	}
	public void setExpertKnowledge(String expertKnowledge) {
		this.expertKnowledge = expertKnowledge;
	}

	public String getExpressionRequirements() {
		return this.expressionRequirements;
	}
	public void setExpressionRequirements(String expressionRequirements) {
		this.expressionRequirements = expressionRequirements;
	}

	public String getInterpretationThoughts() {
		return this.interpretationThoughts;
	}
	public void setInterpretationThoughts(String interpretationThoughts) {
		this.interpretationThoughts = interpretationThoughts;
	}

	public String getIntroduction() {
		return this.introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPlan() {
		return this.plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

}

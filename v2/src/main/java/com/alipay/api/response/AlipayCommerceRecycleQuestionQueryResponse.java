package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecycleOptionConstraint;
import com.alipay.api.domain.RecycleQuetion;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.question.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-22 16:27:34
 */
public class AlipayCommerceRecycleQuestionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3353366291446216972L;

	/** 
	 * 问卷选项约束关系
	 */
	@ApiListField("option_constraint_relations")
	@ApiField("recycle_option_constraint")
	private List<RecycleOptionConstraint> optionConstraintRelations;

	/** 
	 * 问卷集合
	 */
	@ApiListField("questions")
	@ApiField("recycle_quetion")
	private List<RecycleQuetion> questions;

	public void setOptionConstraintRelations(List<RecycleOptionConstraint> optionConstraintRelations) {
		this.optionConstraintRelations = optionConstraintRelations;
	}
	public List<RecycleOptionConstraint> getOptionConstraintRelations( ) {
		return this.optionConstraintRelations;
	}

	public void setQuestions(List<RecycleQuetion> questions) {
		this.questions = questions;
	}
	public List<RecycleQuetion> getQuestions( ) {
		return this.questions;
	}

}

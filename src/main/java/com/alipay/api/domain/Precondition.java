package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 步骤前置条件
 *
 * @author auto create
 * @since 1.0, 2022-09-15 20:44:32
 */
public class Precondition extends AlipayObject {

	private static final long serialVersionUID = 8781256654497743297L;

	/**
	 * 等价关系
	 */
	@ApiField("equivalent_relation")
	private String equivalentRelation;

	/**
	 * 入参
	 */
	@ApiField("input_param")
	private String inputParam;

	/**
	 * 出参
	 */
	@ApiField("output_param")
	private String outputParam;

	public String getEquivalentRelation() {
		return this.equivalentRelation;
	}
	public void setEquivalentRelation(String equivalentRelation) {
		this.equivalentRelation = equivalentRelation;
	}

	public String getInputParam() {
		return this.inputParam;
	}
	public void setInputParam(String inputParam) {
		this.inputParam = inputParam;
	}

	public String getOutputParam() {
		return this.outputParam;
	}
	public void setOutputParam(String outputParam) {
		this.outputParam = outputParam;
	}

}

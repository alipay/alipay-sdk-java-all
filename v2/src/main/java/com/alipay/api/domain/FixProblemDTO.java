package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态协同平台，问题信息
 *
 * @author auto create
 * @since 1.0, 2020-03-25 17:02:20
 */
public class FixProblemDTO extends AlipayObject {

	private static final long serialVersionUID = 2114559474728583338L;

	/**
	 * 问题的唯一id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 问题类型的一级分类
	 */
	@ApiField("problem_level_1")
	private String problemLevel1;

	/**
	 * 问题类型的二级分类
	 */
	@ApiField("problem_level_2")
	private String problemLevel2;

	/**
	 * 问题类型的三级分类
	 */
	@ApiField("problem_level_3")
	private String problemLevel3;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getProblemLevel1() {
		return this.problemLevel1;
	}
	public void setProblemLevel1(String problemLevel1) {
		this.problemLevel1 = problemLevel1;
	}

	public String getProblemLevel2() {
		return this.problemLevel2;
	}
	public void setProblemLevel2(String problemLevel2) {
		this.problemLevel2 = problemLevel2;
	}

	public String getProblemLevel3() {
		return this.problemLevel3;
	}
	public void setProblemLevel3(String problemLevel3) {
		this.problemLevel3 = problemLevel3;
	}

}

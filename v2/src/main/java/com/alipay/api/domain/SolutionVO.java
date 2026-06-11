package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-25 19:42:46
 */
public class SolutionVO extends AlipayObject {

	private static final long serialVersionUID = 7887692484822234913L;

	/**
	 * 解决方案实例
	 */
	@ApiField("solution_code")
	private String solutionCode;

	/**
	 * 方案配置code
	 */
	@ApiField("solution_config_code")
	private String solutionConfigCode;

	/**
	 * 解决方案名称
	 */
	@ApiField("solution_name")
	private String solutionName;

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

	public String getSolutionConfigCode() {
		return this.solutionConfigCode;
	}
	public void setSolutionConfigCode(String solutionConfigCode) {
		this.solutionConfigCode = solutionConfigCode;
	}

	public String getSolutionName() {
		return this.solutionName;
	}
	public void setSolutionName(String solutionName) {
		this.solutionName = solutionName;
	}

}

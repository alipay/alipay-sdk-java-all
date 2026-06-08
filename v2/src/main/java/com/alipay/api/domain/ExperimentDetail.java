package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实验信息
 *
 * @author auto create
 * @since 1.0, 2026-05-26 14:02:48
 */
public class ExperimentDetail extends AlipayObject {

	private static final long serialVersionUID = 1828755456692818661L;

	/**
	 * 实验组名称，根据用户id分流结果获取达尔文平台上对应的实验组名称
	 */
	@ApiField("experiment_name")
	private String experimentName;

	/**
	 * 实验参数
	 */
	@ApiField("experiment_parameters")
	private String experimentParameters;

	public String getExperimentName() {
		return this.experimentName;
	}
	public void setExperimentName(String experimentName) {
		this.experimentName = experimentName;
	}

	public String getExperimentParameters() {
		return this.experimentParameters;
	}
	public void setExperimentParameters(String experimentParameters) {
		this.experimentParameters = experimentParameters;
	}

}

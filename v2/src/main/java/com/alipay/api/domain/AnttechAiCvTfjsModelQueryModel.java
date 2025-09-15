package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI认知服务端模型地址查询接口
 *
 * @author auto create
 * @since 1.0, 2020-02-17 15:03:19
 */
public class AnttechAiCvTfjsModelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3324917995349874846L;

	/**
	 * 模型服务code，模型服务唯一标示
	 */
	@ApiField("model_code")
	private String modelCode;

	/**
	 * 模型对应版本号
	 */
	@ApiField("model_version")
	private String modelVersion;

	public String getModelCode() {
		return this.modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getModelVersion() {
		return this.modelVersion;
	}
	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}

}

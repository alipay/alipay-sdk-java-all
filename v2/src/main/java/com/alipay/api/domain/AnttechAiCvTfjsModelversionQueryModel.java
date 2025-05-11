package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tfjs端模型最新版本号查询
 *
 * @author auto create
 * @since 1.0, 2020-02-12 10:40:18
 */
public class AnttechAiCvTfjsModelversionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5817965174722614111L;

	/**
	 * tfjs端模型code
	 */
	@ApiField("model_code")
	private String modelCode;

	public String getModelCode() {
		return this.modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

}

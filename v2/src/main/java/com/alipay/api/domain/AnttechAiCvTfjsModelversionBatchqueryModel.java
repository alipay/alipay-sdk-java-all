package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tfjs端模型最新版本号批量查询
 *
 * @author auto create
 * @since 1.0, 2020-04-26 20:46:16
 */
public class AnttechAiCvTfjsModelversionBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1779635347666867975L;

	/**
	 * tfjs端模型code，多个code之间用英文逗号分隔
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

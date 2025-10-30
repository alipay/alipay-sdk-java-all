package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI认知服务端模型地址批量查询接口	
 *
 * @author auto create
 * @since 1.0, 2020-04-26 20:46:05
 */
public class AnttechAiCvTfjsModelBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7316391343922311175L;

	/**
	 * 模型信息，包含模型code和版本号，单组模型code和版本通过英文分号(:)分隔，多组模型信息之间用英文分号(;)分隔
	 */
	@ApiField("model_info")
	private String modelInfo;

	public String getModelInfo() {
		return this.modelInfo;
	}
	public void setModelInfo(String modelInfo) {
		this.modelInfo = modelInfo;
	}

}

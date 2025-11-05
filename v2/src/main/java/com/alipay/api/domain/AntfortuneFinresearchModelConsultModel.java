package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财保开放智能体模型接口
 *
 * @author auto create
 * @since 1.0, 2024-08-21 10:48:28
 */
public class AntfortuneFinresearchModelConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2827529567595527195L;

	/**
	 * 模型code指定了需要流式调用的模型
	 */
	@ApiField("model_code")
	private String modelCode;

	/**
	 * qa模型入参，一般为一段文本。
	 */
	@ApiField("model_input")
	private String modelInput;

	/**
	 * 服务标识用于鉴权以及服务定向
	 */
	@ApiField("service_key")
	private String serviceKey;

	public String getModelCode() {
		return this.modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getModelInput() {
		return this.modelInput;
	}
	public void setModelInput(String modelInput) {
		this.modelInput = modelInput;
	}

	public String getServiceKey() {
		return this.serviceKey;
	}
	public void setServiceKey(String serviceKey) {
		this.serviceKey = serviceKey;
	}

}

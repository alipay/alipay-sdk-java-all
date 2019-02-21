package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * dmp通用接口
 *
 * @author auto create
 * @since 1.0, 2017-10-11 18:57:11
 */
public class AlipayDataDataserviceAntdacEasyserviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3677224453138764132L;

	/**
	 * 调用方法id＋询问antdac应用开发者获取＋每个方法id对应一个真实调用的接口
	 */
	@ApiField("method_id")
	private String methodId;

	/**
	 * 方法所需参数＋json字符串格式＋method_id接口所需的参数
	 */
	@ApiField("parameter_json")
	private String parameterJson;

	public String getMethodId() {
		return this.methodId;
	}
	public void setMethodId(String methodId) {
		this.methodId = methodId;
	}

	public String getParameterJson() {
		return this.parameterJson;
	}
	public void setParameterJson(String parameterJson) {
		this.parameterJson = parameterJson;
	}

}

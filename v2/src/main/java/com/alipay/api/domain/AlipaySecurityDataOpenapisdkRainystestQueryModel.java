package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型测试老流程SDK类接口创建01
 *
 * @author auto create
 * @since 1.0, 2024-12-03 18:43:14
 */
public class AlipaySecurityDataOpenapisdkRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1373849913214828566L;

	/**
	 * 测试
	 */
	@ApiField("input_param_01")
	private String inputParam01;

	/**
	 * 引用复杂类型
	 */
	@ApiField("ref_params")
	private RainyComplexTypesTheFirst refParams;

	public String getInputParam01() {
		return this.inputParam01;
	}
	public void setInputParam01(String inputParam01) {
		this.inputParam01 = inputParam01;
	}

	public RainyComplexTypesTheFirst getRefParams() {
		return this.refParams;
	}
	public void setRefParams(RainyComplexTypesTheFirst refParams) {
		this.refParams = refParams;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 复杂类型接口引用02
 *
 * @author auto create
 * @since 1.0, 2024-07-04 11:10:20
 */
public class AlipaySecurityProdComplextypeRainysQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2412759293283348497L;

	/**
	 * 引用同迭代的复杂类型
	 */
	@ApiField("references_test_a")
	private RainyComplexTypesTheSecond referencesTestA;

	public RainyComplexTypesTheSecond getReferencesTestA() {
		return this.referencesTestA;
	}
	public void setReferencesTestA(RainyComplexTypesTheSecond referencesTestA) {
		this.referencesTestA = referencesTestA;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 属性特征值
 *
 * @author auto create
 * @since 1.0, 2025-11-07 19:11:13
 */
public class FeatureMapVO extends AlipayObject {

	private static final long serialVersionUID = 8424463989143722381L;

	/**
	 * 1：属性为营养成分属性 其他：非营养成分属性
	 */
	@ApiField("nutritional_prop")
	private String nutritionalProp;

	public String getNutritionalProp() {
		return this.nutritionalProp;
	}
	public void setNutritionalProp(String nutritionalProp) {
		this.nutritionalProp = nutritionalProp;
	}

}

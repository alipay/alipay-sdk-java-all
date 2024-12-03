package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型测试校验复杂类型02
 *
 * @author auto create
 * @since 1.0, 2024-12-02 15:56:10
 */
public class AlipayDataDataserviceSchemacomplextwiceRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4381631849532618374L;

	/**
	 * 强引用复杂类型
	 */
	@ApiField("demo_strong_complextype")
	private RainyComplexTypesTheSecond demoStrongComplextype;

	/**
	 * 弱引用复杂
	 */
	@ApiField("demo_weak_complextype")
	private RainyComplexTypeRefWeakFirst demoWeakComplextype;

	public RainyComplexTypesTheSecond getDemoStrongComplextype() {
		return this.demoStrongComplextype;
	}
	public void setDemoStrongComplextype(RainyComplexTypesTheSecond demoStrongComplextype) {
		this.demoStrongComplextype = demoStrongComplextype;
	}

	public RainyComplexTypeRefWeakFirst getDemoWeakComplextype() {
		return this.demoWeakComplextype;
	}
	public void setDemoWeakComplextype(RainyComplexTypeRefWeakFirst demoWeakComplextype) {
		this.demoWeakComplextype = demoWeakComplextype;
	}

}

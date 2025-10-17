package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型测试校验复杂类型02
 *
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:31
 */
public class AlipayDataDataserviceSchemacomplextwiceRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1663671955227334651L;

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

	/**
	 * V1.3新增的
	 */
	@ApiField("weak_complextype")
	private RainyComplexTypeRefWeakSecond weakComplextype;

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

	public RainyComplexTypeRefWeakSecond getWeakComplextype() {
		return this.weakComplextype;
	}
	public void setWeakComplextype(RainyComplexTypeRefWeakSecond weakComplextype) {
		this.weakComplextype = weakComplextype;
	}

}

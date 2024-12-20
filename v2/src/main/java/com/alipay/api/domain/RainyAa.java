package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 是个啥呢
 *
 * @author auto create
 * @since 1.0, 2024-12-05 10:42:23
 */
public class RainyAa extends AlipayObject {

	private static final long serialVersionUID = 5313813553278912695L;

	/**
	 * 匿名复杂类型
	 */
	@ApiField("object_weak")
	private RainyAaA objectWeak;

	/**
	 * 强引用
	 */
	@ApiField("ref_strong")
	private RainyComplexTypesRefWeakFirst refStrong;

	public RainyAaA getObjectWeak() {
		return this.objectWeak;
	}
	public void setObjectWeak(RainyAaA objectWeak) {
		this.objectWeak = objectWeak;
	}

	public RainyComplexTypesRefWeakFirst getRefStrong() {
		return this.refStrong;
	}
	public void setRefStrong(RainyComplexTypesRefWeakFirst refStrong) {
		this.refStrong = refStrong;
	}

}

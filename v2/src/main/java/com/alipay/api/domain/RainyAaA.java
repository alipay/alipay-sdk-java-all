package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 匿名复杂类型
 *
 * @author auto create
 * @since 1.0, 2024-12-05 10:42:23
 */
public class RainyAaA extends AlipayObject {

	private static final long serialVersionUID = 8781758793792756712L;

	/**
	 * 弱引用
	 */
	@ApiField("ref_weak")
	private RainyWeakRefFourth refWeak;

	public RainyWeakRefFourth getRefWeak() {
		return this.refWeak;
	}
	public void setRefWeak(RainyWeakRefFourth refWeak) {
		this.refWeak = refWeak;
	}

}

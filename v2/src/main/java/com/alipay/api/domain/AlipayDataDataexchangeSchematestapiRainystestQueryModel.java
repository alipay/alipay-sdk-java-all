package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Schema模型openApi的测试接口260128
 *
 * @author auto create
 * @since 1.0, 2026-03-06 15:32:44
 */
public class AlipayDataDataexchangeSchematestapiRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6864244876292835189L;

	/**
	 * 321
	 */
	@ApiField("demo_ref")
	private RainyComplexTypesRefWeakFirst demoRef;

	/**
	 * null
	 */
	@ApiListField("demo_ref_no")
	@ApiField("rainy_complex_types_ref_weak_first")
	private List<RainyComplexTypesRefWeakFirst> demoRefNo;

	public RainyComplexTypesRefWeakFirst getDemoRef() {
		return this.demoRef;
	}
	public void setDemoRef(RainyComplexTypesRefWeakFirst demoRef) {
		this.demoRef = demoRef;
	}

	public List<RainyComplexTypesRefWeakFirst> getDemoRefNo() {
		return this.demoRefNo;
	}
	public void setDemoRefNo(List<RainyComplexTypesRefWeakFirst> demoRefNo) {
		this.demoRefNo = demoRefNo;
	}

}

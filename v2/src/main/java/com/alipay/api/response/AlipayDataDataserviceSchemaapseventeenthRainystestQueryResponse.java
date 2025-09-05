package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainysComplexRefFirst;
import com.alipay.api.domain.RainysComplexRefSecond;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schemaapseventeenth.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:18
 */
public class AlipayDataDataserviceSchemaapseventeenthRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5269652362422551958L;

	/** 
	 * 匿名复杂类型
	 */
	@ApiField("demo_ref")
	private RainysComplexRefFirst demoRef;

	/** 
	 * 弱引用
	 */
	@ApiField("demo_weak_ref")
	private RainysComplexRefSecond demoWeakRef;

	public void setDemoRef(RainysComplexRefFirst demoRef) {
		this.demoRef = demoRef;
	}
	public RainysComplexRefFirst getDemoRef( ) {
		return this.demoRef;
	}

	public void setDemoWeakRef(RainysComplexRefSecond demoWeakRef) {
		this.demoWeakRef = demoWeakRef;
	}
	public RainysComplexRefSecond getDemoWeakRef( ) {
		return this.demoWeakRef;
	}

}

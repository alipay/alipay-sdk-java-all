package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainysComplexRefThird;
import com.alipay.api.domain.RainyComplexTypesTheEighth;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schemaapisixteenth.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-07 18:47:25
 */
public class AlipayDataDataserviceSchemaapisixteenthRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7833825284691487141L;

	/** 
	 * 匿名复杂类型
	 */
	@ApiField("demo_object")
	private RainysComplexRefThird demoObject;

	/** 
	 * 强引用
	 */
	@ApiField("demo_weak")
	private RainyComplexTypesTheEighth demoWeak;

	public void setDemoObject(RainysComplexRefThird demoObject) {
		this.demoObject = demoObject;
	}
	public RainysComplexRefThird getDemoObject( ) {
		return this.demoObject;
	}

	public void setDemoWeak(RainyComplexTypesTheEighth demoWeak) {
		this.demoWeak = demoWeak;
	}
	public RainyComplexTypesTheEighth getDemoWeak( ) {
		return this.demoWeak;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainysComplexRefSixth;
import com.alipay.api.domain.RainyComplexTypesTheNinth;
import com.alipay.api.domain.RainysComplexRefSeventh;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schemaapininteenth.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:54
 */
public class AlipayDataDataserviceSchemaapininteenthRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4238147422982944887L;

	/** 
	 * 匿名复杂类型
	 */
	@ApiField("demo_object_1")
	private RainysComplexRefSixth demoObject1;

	/** 
	 * 强引用
	 */
	@ApiField("demo_strong")
	private RainyComplexTypesTheNinth demoStrong;

	/** 
	 * 弱引用
	 */
	@ApiField("demo_weak")
	private RainysComplexRefSeventh demoWeak;

	public void setDemoObject1(RainysComplexRefSixth demoObject1) {
		this.demoObject1 = demoObject1;
	}
	public RainysComplexRefSixth getDemoObject1( ) {
		return this.demoObject1;
	}

	public void setDemoStrong(RainyComplexTypesTheNinth demoStrong) {
		this.demoStrong = demoStrong;
	}
	public RainyComplexTypesTheNinth getDemoStrong( ) {
		return this.demoStrong;
	}

	public void setDemoWeak(RainysComplexRefSeventh demoWeak) {
		this.demoWeak = demoWeak;
	}
	public RainysComplexRefSeventh getDemoWeak( ) {
		return this.demoWeak;
	}

}

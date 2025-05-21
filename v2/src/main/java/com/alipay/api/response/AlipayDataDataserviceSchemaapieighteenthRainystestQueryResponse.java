package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainysComplexRefForth;
import com.alipay.api.domain.RainysComplexRefFifth;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schemaapieighteenth.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-07 17:08:00
 */
public class AlipayDataDataserviceSchemaapieighteenthRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7163752981496598596L;

	/** 
	 * 匿名复杂类型
	 */
	@ApiField("demo_object_1")
	private RainysComplexRefForth demoObject1;

	/** 
	 * 弱引用
	 */
	@ApiField("demo_weak")
	private RainysComplexRefFifth demoWeak;

	public void setDemoObject1(RainysComplexRefForth demoObject1) {
		this.demoObject1 = demoObject1;
	}
	public RainysComplexRefForth getDemoObject1( ) {
		return this.demoObject1;
	}

	public void setDemoWeak(RainysComplexRefFifth demoWeak) {
		this.demoWeak = demoWeak;
	}
	public RainysComplexRefFifth getDemoWeak( ) {
		return this.demoWeak;
	}

}

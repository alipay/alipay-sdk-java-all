package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainyComplexTypesRefWeakFifth;
import com.alipay.api.domain.RainyComplexTypesTheThirteen;
import com.alipay.api.domain.RainyComplexTypesTheFourteenOne;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataexchange.schemaapitwentythird.rainytest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-07 10:32:27
 */
public class AlipayDataDataexchangeSchemaapitwentythirdRainytestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2663744237528441165L;

	/** 
	 * 测试数据，匿名复杂类型示例
	 */
	@ApiField("demo_ref")
	private RainyComplexTypesRefWeakFifth demoRef;

	/** 
	 * 1.1版本新增的 测试数据
	 */
	@ApiField("demo_res")
	private String demoRes;

	/** 
	 * 测试数据，强引用复杂类型示例
	 */
	@ApiField("demo_strong_ref")
	private RainyComplexTypesTheThirteen demoStrongRef;

	/** 
	 * 测试数据，弱引用复杂类型示例
	 */
	@ApiField("demo_wink_ref")
	private RainyComplexTypesTheFourteenOne demoWinkRef;

	/** 
	 * 测试数据
	 */
	@ApiField("test")
	private RainyComplexTypesTheThirteen test;

	public void setDemoRef(RainyComplexTypesRefWeakFifth demoRef) {
		this.demoRef = demoRef;
	}
	public RainyComplexTypesRefWeakFifth getDemoRef( ) {
		return this.demoRef;
	}

	public void setDemoRes(String demoRes) {
		this.demoRes = demoRes;
	}
	public String getDemoRes( ) {
		return this.demoRes;
	}

	public void setDemoStrongRef(RainyComplexTypesTheThirteen demoStrongRef) {
		this.demoStrongRef = demoStrongRef;
	}
	public RainyComplexTypesTheThirteen getDemoStrongRef( ) {
		return this.demoStrongRef;
	}

	public void setDemoWinkRef(RainyComplexTypesTheFourteenOne demoWinkRef) {
		this.demoWinkRef = demoWinkRef;
	}
	public RainyComplexTypesTheFourteenOne getDemoWinkRef( ) {
		return this.demoWinkRef;
	}

	public void setTest(RainyComplexTypesTheThirteen test) {
		this.test = test;
	}
	public RainyComplexTypesTheThirteen getTest( ) {
		return this.test;
	}

}

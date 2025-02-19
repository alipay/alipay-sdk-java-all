package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainyComplexTypesTheSecond;
import com.alipay.api.domain.RainyComplexTypeRefWeakFirst;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schemacomplextwice.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-03 15:07:22
 */
public class AlipayDataDataserviceSchemacomplextwiceRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5763823982551246987L;

	/** 
	 * 强引用复杂类型
	 */
	@ApiField("demo_strong_complextype")
	private RainyComplexTypesTheSecond demoStrongComplextype;

	/** 
	 * V1.3版本引用
	 */
	@ApiField("demo_weak_complextype")
	private RainyComplexTypeRefWeakFirst demoWeakComplextype;

	public void setDemoStrongComplextype(RainyComplexTypesTheSecond demoStrongComplextype) {
		this.demoStrongComplextype = demoStrongComplextype;
	}
	public RainyComplexTypesTheSecond getDemoStrongComplextype( ) {
		return this.demoStrongComplextype;
	}

	public void setDemoWeakComplextype(RainyComplexTypeRefWeakFirst demoWeakComplextype) {
		this.demoWeakComplextype = demoWeakComplextype;
	}
	public RainyComplexTypeRefWeakFirst getDemoWeakComplextype( ) {
		return this.demoWeakComplextype;
	}

}

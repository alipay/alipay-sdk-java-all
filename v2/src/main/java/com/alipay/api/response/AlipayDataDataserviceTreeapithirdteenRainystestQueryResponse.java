package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainyComplexTypesTheThirteen;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.treeapithirdteen.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-23 16:30:20
 */
public class AlipayDataDataserviceTreeapithirdteenRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5883916587354148465L;

	/** 
	 * 引用复杂类型
	 */
	@ApiField("res_strong_ref")
	private RainyComplexTypesTheThirteen resStrongRef;

	public void setResStrongRef(RainyComplexTypesTheThirteen resStrongRef) {
		this.resStrongRef = resStrongRef;
	}
	public RainyComplexTypesTheThirteen getResStrongRef( ) {
		return this.resStrongRef;
	}

}

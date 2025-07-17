package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antdataassets.fixdata.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:49
 */
public class AlipayDataDataserviceAntdataassetsFixdataCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2786333644742183671L;

	/** 
	 * 补数据操作是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antdataassets.fixdata.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:39:39
 */
public class AlipayDataDataserviceAntdataassetsFixdataCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8635584858442239214L;

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

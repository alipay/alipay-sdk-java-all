package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antdataassets.fixdata.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 07:33:13
 */
public class AlipayDataDataserviceAntdataassetsFixdataCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7229613137558566667L;

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

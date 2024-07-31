package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayCodeRecoResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.code.reco response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:49
 */
public class AlipayDataDataserviceCodeRecoResponse extends AlipayResponse {

	private static final long serialVersionUID = 7674676682892986464L;

	/** 
	 * 识别结果
	 */
	@ApiField("result")
	private AlipayCodeRecoResult result;

	public void setResult(AlipayCodeRecoResult result) {
		this.result = result;
	}
	public AlipayCodeRecoResult getResult( ) {
		return this.result;
	}

}

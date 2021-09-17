package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayChinareModelResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.chinaremodel.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 16:29:50
 */
public class AlipayDataDataserviceChinaremodelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3866362627572496245L;

	/** 
	 * 中再核保模型查询结果
	 */
	@ApiField("result")
	private AlipayChinareModelResult result;

	public void setResult(AlipayChinareModelResult result) {
		this.result = result;
	}
	public AlipayChinareModelResult getResult( ) {
		return this.result;
	}

}

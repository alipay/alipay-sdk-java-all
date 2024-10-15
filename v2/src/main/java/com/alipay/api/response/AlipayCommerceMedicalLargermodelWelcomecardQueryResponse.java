package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CardContentDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.welcomecard.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-10 19:22:13
 */
public class AlipayCommerceMedicalLargermodelWelcomecardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7734723563116718566L;

	/** 
	 * 返回数据
	 */
	@ApiField("data")
	private CardContentDTO data;

	/** 
	 * 业务处理成功
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	public void setData(CardContentDTO data) {
		this.data = data;
	}
	public CardContentDTO getData( ) {
		return this.data;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

}

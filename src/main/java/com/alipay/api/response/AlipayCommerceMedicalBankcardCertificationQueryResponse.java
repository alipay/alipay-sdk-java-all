package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CommerceMedicalBankcardCertificationQueryData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.bankcard.certification.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-19 16:11:43
 */
public class AlipayCommerceMedicalBankcardCertificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2195371635338214688L;

	/** 
	 * 银行卡是否绑定查询的出参
	 */
	@ApiField("data")
	private CommerceMedicalBankcardCertificationQueryData data;

	/** 
	 * 业务处理结果描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 业务处理结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setData(CommerceMedicalBankcardCertificationQueryData data) {
		this.data = data;
	}
	public CommerceMedicalBankcardCertificationQueryData getData( ) {
		return this.data;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}

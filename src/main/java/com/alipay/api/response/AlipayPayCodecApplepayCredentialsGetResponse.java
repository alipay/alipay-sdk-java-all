package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PaymentCredential;
import com.alipay.api.domain.CredentialsResponseHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.codec.applepay.credentials.get response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-20 20:11:59
 */
public class AlipayPayCodecApplepayCredentialsGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4349734189948224895L;

	/** 
	 * 加密后的码列表。
{List of Credential objects}
	 */
	@ApiListField("credentials")
	@ApiField("payment_credential")
	private List<PaymentCredential> credentials;

	/** 
	 * 结果。 statusCode:Status code used to indicate an error. If omitted, assumed to be 200 (success);subStatusCode:Conveys failure codes from downstream entities or for more granular conveyance of specific error conditions;statusMessage:Not parsed programmatically. Example "Downstream system offline".
	 */
	@ApiField("response_header")
	private CredentialsResponseHeader responseHeader;

	public void setCredentials(List<PaymentCredential> credentials) {
		this.credentials = credentials;
	}
	public List<PaymentCredential> getCredentials( ) {
		return this.credentials;
	}

	public void setResponseHeader(CredentialsResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public CredentialsResponseHeader getResponseHeader( ) {
		return this.responseHeader;
	}

}

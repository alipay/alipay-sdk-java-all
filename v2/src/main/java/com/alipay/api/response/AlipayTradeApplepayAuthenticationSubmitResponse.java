package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiResponseHeader;
import com.alipay.api.domain.UpdatedAuthenticationDetails;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.applepay.authentication.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:06
 */
public class AlipayTradeApplepayAuthenticationSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7557228642587171938L;

	/** 
	 * 核身错误信息
	 */
	@ApiField("authentication_error")
	private String authenticationError;

	/** 
	 * 失败时的鉴权重试机制
	 */
	@ApiListField("fallback_authentication_mechanisms")
	@ApiField("string")
	private List<String> fallbackAuthenticationMechanisms;

	/** 
	 * applePay公用响应头
	 */
	@ApiField("response_header")
	private OpenApiResponseHeader responseHeader;

	/** 
	 * 鉴权重试机制
	 */
	@ApiListField("retry_authentication_mechanisms")
	@ApiField("string")
	private List<String> retryAuthenticationMechanisms;

	/** 
	 * base64之后的证书
	 */
	@ApiField("signing_certificate")
	private String signingCertificate;

	/** 
	 * 最新的鉴权明细信息
	 */
	@ApiField("updated_authentication_details")
	private UpdatedAuthenticationDetails updatedAuthenticationDetails;

	/** 
	 * 交易状态
	 */
	@ApiField("updated_transaction_status")
	private String updatedTransactionStatus;

	public void setAuthenticationError(String authenticationError) {
		this.authenticationError = authenticationError;
	}
	public String getAuthenticationError( ) {
		return this.authenticationError;
	}

	public void setFallbackAuthenticationMechanisms(List<String> fallbackAuthenticationMechanisms) {
		this.fallbackAuthenticationMechanisms = fallbackAuthenticationMechanisms;
	}
	public List<String> getFallbackAuthenticationMechanisms( ) {
		return this.fallbackAuthenticationMechanisms;
	}

	public void setResponseHeader(OpenApiResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public OpenApiResponseHeader getResponseHeader( ) {
		return this.responseHeader;
	}

	public void setRetryAuthenticationMechanisms(List<String> retryAuthenticationMechanisms) {
		this.retryAuthenticationMechanisms = retryAuthenticationMechanisms;
	}
	public List<String> getRetryAuthenticationMechanisms( ) {
		return this.retryAuthenticationMechanisms;
	}

	public void setSigningCertificate(String signingCertificate) {
		this.signingCertificate = signingCertificate;
	}
	public String getSigningCertificate( ) {
		return this.signingCertificate;
	}

	public void setUpdatedAuthenticationDetails(UpdatedAuthenticationDetails updatedAuthenticationDetails) {
		this.updatedAuthenticationDetails = updatedAuthenticationDetails;
	}
	public UpdatedAuthenticationDetails getUpdatedAuthenticationDetails( ) {
		return this.updatedAuthenticationDetails;
	}

	public void setUpdatedTransactionStatus(String updatedTransactionStatus) {
		this.updatedTransactionStatus = updatedTransactionStatus;
	}
	public String getUpdatedTransactionStatus( ) {
		return this.updatedTransactionStatus;
	}

}

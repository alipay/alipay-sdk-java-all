package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * applepay初始化获取到的获取付款码。
 *
 * @author auto create
 * @since 1.0, 2020-02-20 19:41:04
 */
public class PaymentCredential extends AlipayObject {

	private static final long serialVersionUID = 2766182823755323183L;

	/**
	 * 码过期时间。{UTC timestamp when the payment credential is no longer valid for payment. W3C’s definition of the ISO 8601 date and time format: yyyy-MM-dd'T'HH:mm:ss.SSSZ}
	 */
	@ApiField("expiration_timestamp")
	private String expirationTimestamp;

	/**
	 * 码的id。{Identifier for this credential}
	 */
	@ApiField("identifier")
	private String identifier;

	/**
	 * 码类型。{To enable QR code and barcode functionality}
	 */
	@ApiField("payment_credential_type")
	private String paymentCredentialType;

	/**
	 * 码值加密结果。{The encrypted credential value}
	 */
	@ApiField("value")
	private EncryptedPaymentCredential value;

	public String getExpirationTimestamp() {
		return this.expirationTimestamp;
	}
	public void setExpirationTimestamp(String expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
	}

	public String getIdentifier() {
		return this.identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getPaymentCredentialType() {
		return this.paymentCredentialType;
	}
	public void setPaymentCredentialType(String paymentCredentialType) {
		this.paymentCredentialType = paymentCredentialType;
	}

	public EncryptedPaymentCredential getValue() {
		return this.value;
	}
	public void setValue(EncryptedPaymentCredential value) {
		this.value = value;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 最新的鉴权机制
 *
 * @author auto create
 * @since 1.0, 2020-06-16 19:43:21
 */
public class UpdatedAuthenticationDetails extends AlipayObject {

	private static final long serialVersionUID = 5161933898425292617L;

	/**
	 * 鉴权机制
	 */
	@ApiListField("authentication_mechanisms")
	@ApiField("string")
	private List<String> authenticationMechanisms;

	/**
	 * 随机数
	 */
	@ApiField("nonce")
	private String nonce;

	/**
	 * 交易签名信息
	 */
	@ApiField("partial_transaction_details_signature")
	private String partialTransactionDetailsSignature;

	/**
	 * 6位密码或者长密码
	 */
	@ApiField("pin_format")
	private String pinFormat;

	/**
	 * 签名秘钥
	 */
	@ApiField("signing_key_material")
	private String signingKeyMaterial;

	public List<String> getAuthenticationMechanisms() {
		return this.authenticationMechanisms;
	}
	public void setAuthenticationMechanisms(List<String> authenticationMechanisms) {
		this.authenticationMechanisms = authenticationMechanisms;
	}

	public String getNonce() {
		return this.nonce;
	}
	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public String getPartialTransactionDetailsSignature() {
		return this.partialTransactionDetailsSignature;
	}
	public void setPartialTransactionDetailsSignature(String partialTransactionDetailsSignature) {
		this.partialTransactionDetailsSignature = partialTransactionDetailsSignature;
	}

	public String getPinFormat() {
		return this.pinFormat;
	}
	public void setPinFormat(String pinFormat) {
		this.pinFormat = pinFormat;
	}

	public String getSigningKeyMaterial() {
		return this.signingKeyMaterial;
	}
	public void setSigningKeyMaterial(String signingKeyMaterial) {
		this.signingKeyMaterial = signingKeyMaterial;
	}

}

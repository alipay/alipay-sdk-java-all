package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * applepay付款码获取
 *
 * @author auto create
 * @since 1.0, 2020-08-20 20:11:59
 */
public class AlipayPayCodecApplepayCredentialsGetModel extends AlipayObject {

	private static final long serialVersionUID = 2897419151313146514L;

	/**
	 * ECC算法、PKCS#7的签名。{Base 64 encoded signature from Apple authorizing the return of the credentials. PKCS#7 detached ECC signature covering the SHA 256 hash of the concatenation of the UTF-8 values of
provisioningBundleIdentifier ,
lastUsedCredentialIdentifier , numberToFetch and hasZeroQRCodes .}
	 */
	@ApiField("apple_signature")
	private String appleSignature;

	/**
	 * 加密证书hash值，用于证书验证。
The public key hash of the leaf certificate of the barcodeEncryptionCertChain to indicate the
public key that should be used for the encryption of payment credentials.
	 */
	@ApiField("encryption_public_key_hash")
	private String encryptionPublicKeyHash;

	/**
	 * 风控信息。 Fraud data provided by Apple as outlined in separate Fraud SIA document, if applicable
	 */
	@ApiField("fraud_data")
	private CredentialsFraudData fraudData;

	/**
	 * hasZeroQRCodes，本地已经没有付款码。{This parameter indicates if there are anymore QR codes left on the device or not. True means that there are no more QR codes left on the device.}
	 */
	@ApiField("has_zero_qr_codes")
	private Boolean hasZeroQrCodes;

	/**
	 * 上一个展示过的码id，-1个可做失效处理。{The identifier of the most recently consumed payment credential}
	 */
	@ApiField("last_used_credential_identifier")
	private String lastUsedCredentialIdentifier;

	/**
	 * 希望下发的码个数。{The desired number of payment credentials to be returned}
	 */
	@ApiField("number_to_fetch")
	private Long numberToFetch;

	/**
	 * 码类型。 {To enable QR code and barcode functionality}
	 */
	@ApiField("payment_credential_type")
	private String paymentCredentialType;

	/**
	 * SAM pass的bundleId，唯一标识一张卡片。{The identifier on the device for which the payment credentials are destined}
	 */
	@ApiField("provisioning_bundle_identifier")
	private String provisioningBundleIdentifier;

	public String getAppleSignature() {
		return this.appleSignature;
	}
	public void setAppleSignature(String appleSignature) {
		this.appleSignature = appleSignature;
	}

	public String getEncryptionPublicKeyHash() {
		return this.encryptionPublicKeyHash;
	}
	public void setEncryptionPublicKeyHash(String encryptionPublicKeyHash) {
		this.encryptionPublicKeyHash = encryptionPublicKeyHash;
	}

	public CredentialsFraudData getFraudData() {
		return this.fraudData;
	}
	public void setFraudData(CredentialsFraudData fraudData) {
		this.fraudData = fraudData;
	}

	public Boolean getHasZeroQrCodes() {
		return this.hasZeroQrCodes;
	}
	public void setHasZeroQrCodes(Boolean hasZeroQrCodes) {
		this.hasZeroQrCodes = hasZeroQrCodes;
	}

	public String getLastUsedCredentialIdentifier() {
		return this.lastUsedCredentialIdentifier;
	}
	public void setLastUsedCredentialIdentifier(String lastUsedCredentialIdentifier) {
		this.lastUsedCredentialIdentifier = lastUsedCredentialIdentifier;
	}

	public Long getNumberToFetch() {
		return this.numberToFetch;
	}
	public void setNumberToFetch(Long numberToFetch) {
		this.numberToFetch = numberToFetch;
	}

	public String getPaymentCredentialType() {
		return this.paymentCredentialType;
	}
	public void setPaymentCredentialType(String paymentCredentialType) {
		this.paymentCredentialType = paymentCredentialType;
	}

	public String getProvisioningBundleIdentifier() {
		return this.provisioningBundleIdentifier;
	}
	public void setProvisioningBundleIdentifier(String provisioningBundleIdentifier) {
		this.provisioningBundleIdentifier = provisioningBundleIdentifier;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * wagu付款码证书加载
 *
 * @author auto create
 * @since 1.0, 2020-08-20 20:11:56
 */
public class AlipayPayCodecApplepayEstablishSetModel extends AlipayObject {

	private static final long serialVersionUID = 1236671978945727881L;

	/**
	 * 数字签名。
The Base 64 encoded signature generated on Apple server. PKCS#7 detached ECC signature covering the SHA 256 hash of the concatenation of the UTF-8 value of
provisioningBundleIdentifier and certificatesRequested and Base 64 decoded values of
barcodeEncryptionCertificate , deviceSignatureCertificate .
	 */
	@ApiField("apple_signature")
	private String appleSignature;

	/**
	 * JSON格式，base64的证书链List。只有leaf证书结构，能被imediately和root证书验过。第0个证书用于二维码加密使用。
Base 64 encoded X.509 encryption certificate chain containing the intermediate and leaf certificates. Encryption shall be performed using the first certificate in the list.
	 */
	@ApiListField("barcode_encryption_cert_chain")
	@ApiField("string")
	private List<String> barcodeEncryptionCertChain;

	/**
	 * JSON格式，base64的证书链List。只有leaf证书结构，能被imediately和root证书验过。第0个证书用于二维码上报加签使用。
Base 64 encoded X.509 signature certificate chain containing the intermediate and leaf certificates. The device will sign a payload each time it displays a QR code on the screen using the private key of this key pair. The public key of the first certificate should be used to verify that signature.
	 */
	@ApiListField("device_signature_cert_chain")
	@ApiField("string")
	private List<String> deviceSignatureCertChain;

	/**
	 * 风控信息。 Fraud data provided by Apple as outlined in separate Fraud SIA document, if applicable
	 */
	@ApiField("fraud_data")
	private EstablishFraudData fraudData;

	/**
	 * SAM pass的bundleId，唯一标识一张卡片。
The identifier for which the feature is being enabled.
	 */
	@ApiField("provisioning_bundle_identifier")
	private String provisioningBundleIdentifier;

	public String getAppleSignature() {
		return this.appleSignature;
	}
	public void setAppleSignature(String appleSignature) {
		this.appleSignature = appleSignature;
	}

	public List<String> getBarcodeEncryptionCertChain() {
		return this.barcodeEncryptionCertChain;
	}
	public void setBarcodeEncryptionCertChain(List<String> barcodeEncryptionCertChain) {
		this.barcodeEncryptionCertChain = barcodeEncryptionCertChain;
	}

	public List<String> getDeviceSignatureCertChain() {
		return this.deviceSignatureCertChain;
	}
	public void setDeviceSignatureCertChain(List<String> deviceSignatureCertChain) {
		this.deviceSignatureCertChain = deviceSignatureCertChain;
	}

	public EstablishFraudData getFraudData() {
		return this.fraudData;
	}
	public void setFraudData(EstablishFraudData fraudData) {
		this.fraudData = fraudData;
	}

	public String getProvisioningBundleIdentifier() {
		return this.provisioningBundleIdentifier;
	}
	public void setProvisioningBundleIdentifier(String provisioningBundleIdentifier) {
		this.provisioningBundleIdentifier = provisioningBundleIdentifier;
	}

}

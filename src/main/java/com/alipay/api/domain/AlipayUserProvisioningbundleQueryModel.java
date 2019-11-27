package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * wagu获取卡片信息接口
 *
 * @author auto create
 * @since 1.0, 2019-11-05 18:18:13
 */
public class AlipayUserProvisioningbundleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8344748339695112473L;

	/**
	 * 加密证书链
	 */
	@ApiListField("encryption_cert_chain")
	@ApiField("string")
	private List<String> encryptionCertChain;

	/**
	 * 加密版本号
	 */
	@ApiField("encryption_version")
	private String encryptionVersion;

	/**
	 * 欺诈数据
	 */
	@ApiField("fraud_data")
	private FraudData fraudData;

	/**
	 * 地区
	 */
	@ApiField("locale")
	private String locale;

	/**
	 * 隐私数据加密证书链
	 */
	@ApiListField("private_encryption_cert_chain")
	@ApiField("string")
	private List<String> privateEncryptionCertChain;

	/**
	 * 卡id
	 */
	@ApiField("provisioning_bundle_identifier")
	private String provisioningBundleIdentifier;

	/**
	 * sam用户id
	 */
	@ApiField("reference_identifier")
	private String referenceIdentifier;

	/**
	 * 调用上下文
	 */
	@ApiField("triggering_request_identifier")
	private String triggeringRequestIdentifier;

	/**
	 * 卡的pod
	 */
	@ApiField("x_pod")
	private String xPod;

	public List<String> getEncryptionCertChain() {
		return this.encryptionCertChain;
	}
	public void setEncryptionCertChain(List<String> encryptionCertChain) {
		this.encryptionCertChain = encryptionCertChain;
	}

	public String getEncryptionVersion() {
		return this.encryptionVersion;
	}
	public void setEncryptionVersion(String encryptionVersion) {
		this.encryptionVersion = encryptionVersion;
	}

	public FraudData getFraudData() {
		return this.fraudData;
	}
	public void setFraudData(FraudData fraudData) {
		this.fraudData = fraudData;
	}

	public String getLocale() {
		return this.locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}

	public List<String> getPrivateEncryptionCertChain() {
		return this.privateEncryptionCertChain;
	}
	public void setPrivateEncryptionCertChain(List<String> privateEncryptionCertChain) {
		this.privateEncryptionCertChain = privateEncryptionCertChain;
	}

	public String getProvisioningBundleIdentifier() {
		return this.provisioningBundleIdentifier;
	}
	public void setProvisioningBundleIdentifier(String provisioningBundleIdentifier) {
		this.provisioningBundleIdentifier = provisioningBundleIdentifier;
	}

	public String getReferenceIdentifier() {
		return this.referenceIdentifier;
	}
	public void setReferenceIdentifier(String referenceIdentifier) {
		this.referenceIdentifier = referenceIdentifier;
	}

	public String getTriggeringRequestIdentifier() {
		return this.triggeringRequestIdentifier;
	}
	public void setTriggeringRequestIdentifier(String triggeringRequestIdentifier) {
		this.triggeringRequestIdentifier = triggeringRequestIdentifier;
	}

	public String getxPod() {
		return this.xPod;
	}
	public void setxPod(String xPod) {
		this.xPod = xPod;
	}

}

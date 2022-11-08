package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保存了应用的一些密钥配置信息
 *
 * @author auto create
 * @since 1.0, 2022-11-02 15:35:54
 */
public class AppSecurityExt extends AlipayObject {

	private static final long serialVersionUID = 7484899677491587559L;

	/**
	 * 支付宝公钥
	 */
	@ApiField("alipay_public_key")
	private String alipayPublicKey;

	/**
	 * 应用的APPID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 证书编号
	 */
	@ApiField("cert_sn")
	private String certSn;

	/**
	 * 应用私钥
	 */
	@ApiField("partner_private_key")
	private String partnerPrivateKey;

	/**
	 * 应用公钥
	 */
	@ApiField("partner_public_key")
	private String partnerPublicKey;

	/**
	 * 密钥类型
	 */
	@ApiField("public_key_source")
	private String publicKeySource;

	/**
	 * 应用的签名类型
	 */
	@ApiField("signature_type")
	private String signatureType;

	public String getAlipayPublicKey() {
		return this.alipayPublicKey;
	}
	public void setAlipayPublicKey(String alipayPublicKey) {
		this.alipayPublicKey = alipayPublicKey;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCertSn() {
		return this.certSn;
	}
	public void setCertSn(String certSn) {
		this.certSn = certSn;
	}

	public String getPartnerPrivateKey() {
		return this.partnerPrivateKey;
	}
	public void setPartnerPrivateKey(String partnerPrivateKey) {
		this.partnerPrivateKey = partnerPrivateKey;
	}

	public String getPartnerPublicKey() {
		return this.partnerPublicKey;
	}
	public void setPartnerPublicKey(String partnerPublicKey) {
		this.partnerPublicKey = partnerPublicKey;
	}

	public String getPublicKeySource() {
		return this.publicKeySource;
	}
	public void setPublicKeySource(String publicKeySource) {
		this.publicKeySource = publicKeySource;
	}

	public String getSignatureType() {
		return this.signatureType;
	}
	public void setSignatureType(String signatureType) {
		this.signatureType = signatureType;
	}

}

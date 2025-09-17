package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 购卡人登记
 *
 * @author auto create
 * @since 1.0, 2023-10-25 17:53:44
 */
public class AlipayFundMbpcardPurchaseSignModel extends AlipayObject {

	private static final long serialVersionUID = 8714971572769469995L;

	/**
	 * 算法名称，加密使用
	 */
	@ApiField("algorithm_name")
	private String algorithmName;

	/**
	 * 支付宝账号
	 */
	@ApiField("alipay_identity_id")
	private String alipayIdentityId;

	/**
	 * 支付宝账号类型
ALIPAY_LOGON_ID：登录号
ALIPAY_USER_ID：会员号
	 */
	@ApiField("alipay_identity_type")
	private String alipayIdentityType;

	/**
	 * 证件正面图片存储标识
	 */
	@ApiField("cert_image")
	private String certImage;

	/**
	 * 证件背面图片存储标识
	 */
	@ApiField("cert_image_back")
	private String certImageBack;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 营业执照: 201
事业单位法人证书: 218
民办非企业登记证书: 204
社会团体法人登记证书: 206
党政机关批准设立文件/行政执法主体资格证: 219
个人身份证: 100
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 密钥类型：RSA，RSA2
	 */
	@ApiField("cipher_type")
	private String cipherType;

	/**
	 * 联系人列表，支持多个
	 */
	@ApiListField("contact_infos")
	@ApiField("contact_user_info")
	private List<ContactUserInfo> contactInfos;

	/**
	 * 证件背面图片存储标识
	 */
	@ApiField("legal_cert_back_image")
	private String legalCertBackImage;

	/**
	 * 证件正面图片存储标识
	 */
	@ApiField("legal_cert_front_image")
	private String legalCertFrontImage;

	/**
	 * 法人身份证号
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 法人姓名
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 法人手机号或座机
	 */
	@ApiField("legal_phone")
	private String legalPhone;

	/**
	 * 支付宝开放平台账号
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 企业加密公钥；服务商购卡适用；
密钥类型和密钥必须同时存在
	 */
	@ApiField("public_rsa_key")
	private String publicRsaKey;

	/**
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getAlgorithmName() {
		return this.algorithmName;
	}
	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	public String getAlipayIdentityId() {
		return this.alipayIdentityId;
	}
	public void setAlipayIdentityId(String alipayIdentityId) {
		this.alipayIdentityId = alipayIdentityId;
	}

	public String getAlipayIdentityType() {
		return this.alipayIdentityType;
	}
	public void setAlipayIdentityType(String alipayIdentityType) {
		this.alipayIdentityType = alipayIdentityType;
	}

	public String getCertImage() {
		return this.certImage;
	}
	public void setCertImage(String certImage) {
		this.certImage = certImage;
	}

	public String getCertImageBack() {
		return this.certImageBack;
	}
	public void setCertImageBack(String certImageBack) {
		this.certImageBack = certImageBack;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCipherType() {
		return this.cipherType;
	}
	public void setCipherType(String cipherType) {
		this.cipherType = cipherType;
	}

	public List<ContactUserInfo> getContactInfos() {
		return this.contactInfos;
	}
	public void setContactInfos(List<ContactUserInfo> contactInfos) {
		this.contactInfos = contactInfos;
	}

	public String getLegalCertBackImage() {
		return this.legalCertBackImage;
	}
	public void setLegalCertBackImage(String legalCertBackImage) {
		this.legalCertBackImage = legalCertBackImage;
	}

	public String getLegalCertFrontImage() {
		return this.legalCertFrontImage;
	}
	public void setLegalCertFrontImage(String legalCertFrontImage) {
		this.legalCertFrontImage = legalCertFrontImage;
	}

	public String getLegalCertNo() {
		return this.legalCertNo;
	}
	public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}

	public String getLegalName() {
		return this.legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getLegalPhone() {
		return this.legalPhone;
	}
	public void setLegalPhone(String legalPhone) {
		this.legalPhone = legalPhone;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPublicRsaKey() {
		return this.publicRsaKey;
	}
	public void setPublicRsaKey(String publicRsaKey) {
		this.publicRsaKey = publicRsaKey;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}

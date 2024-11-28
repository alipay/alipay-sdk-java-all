package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ca验证结果
 *
 * @author auto create
 * @since 1.0, 2024-08-14 18:14:56
 */
public class PdfCertificateResult extends AlipayObject {

	private static final long serialVersionUID = 6343843729748386735L;

	/**
	 * 颁发者
	 */
	@ApiField("ca_issuer")
	private CaSdnDTO caIssuer;

	/**
	 * 主题
	 */
	@ApiField("ca_subject")
	private CaSdnDTO caSubject;

	/**
	 * CA_ISSUER_MATCH_FAILED("CT271","颁发者无法匹配：系统无法校验证书颁发者身份"),

    SIGNATURE_CHECK_CA_FAILED("CT272","没有CA：未检测到签名人的数字证书"),

    VERIFY_SIGNATURE_CHECK_CA_FAILED("CT273","文档已被更改：该文档在签名/盖章过程中已被更改"),

    CHECK_SIGNATURE_DATE_FAILED("CT274","证书不在有效期内"),
	 */
	@ApiListField("failed_reason")
	@ApiField("common_list_d_t_o")
	private List<CommonListDTO> failedReason;

	/**
	 * 证书颁发者
	 */
	@ApiField("issuer_dn")
	private String issuerDn;

	/**
	 * 签名结束时间
	 */
	@ApiField("not_after")
	private Date notAfter;

	/**
	 * 签名有效开始时间
	 */
	@ApiField("not_before")
	private Date notBefore;

	/**
	 * 证书格式。为签名中提取的格式，不可枚举
	 */
	@ApiField("public_key_format")
	private String publicKeyFormat;

	/**
	 * 序列号
	 */
	@ApiField("serial_number")
	private String serialNumber;

	/**
	 * 签名版本。为签名中提取的字段，不可枚举
	 */
	@ApiField("sign_cert_version")
	private String signCertVersion;

	/**
	 * 日期
	 */
	@ApiField("sign_date")
	private Date signDate;

	/**
	 * 签名名称
	 */
	@ApiField("sign_name")
	private String signName;

	/**
	 * 证书主题
              数字证书中主题(_subject)中字段的含义
             
              公用名称 (_common _name) 简称：_c_n 字段，对于 _s_s_l 证书，一般为网站域名；而对于代码签名证书则为申请单位名称；而对于客户端证书则为证书申请者的姓名；
              单位名称 (_organization _name) ：简称：_o 字段，对于 _s_s_l 证书，一般为网站域名；而对于代码签名证书则为申请单位名称；而对于客户端单位证书则为证书申请者所在单位名称；
              证书申请单位所在地：
              所在城市 (_locality) 简称：_l 字段
              所在省份 (_state/_provice) 简称：_s 字段
              所在国家 (_country) 简称：_c 字段，只能是国家字母缩写，如中国：_c_n
              其他一些字段：
              电子邮件 (_email) 简称：_e 字段
              多个姓名字段 简称：_g 字段
              介绍：_description 字段
              电话号码：_phone 字段，格式要求 + 国家区号 城市区号 电话号码，如： +86 732 88888888
              地址：_s_t_r_e_e_t  字段
              邮政编码：_postal_code 字段
              显示其他内容 简称：_o_u 字段
	 */
	@ApiField("subject_dn")
	private String subjectDn;

	/**
	 * 签名时间戳
	 */
	@ApiField("time_stamp_date")
	private Date timeStampDate;

	/**
	 * 电子章验证结果
	 */
	@ApiField("verified")
	private Boolean verified;

	/**
	 * 验证所有签名是否被篡改
	 */
	@ApiField("verify_signature")
	private Boolean verifySignature;

	/**
	 * 验证签名时间戳
	 */
	@ApiField("verify_timestamp_imprint")
	private Boolean verifyTimestampImprint;

	public CaSdnDTO getCaIssuer() {
		return this.caIssuer;
	}
	public void setCaIssuer(CaSdnDTO caIssuer) {
		this.caIssuer = caIssuer;
	}

	public CaSdnDTO getCaSubject() {
		return this.caSubject;
	}
	public void setCaSubject(CaSdnDTO caSubject) {
		this.caSubject = caSubject;
	}

	public List<CommonListDTO> getFailedReason() {
		return this.failedReason;
	}
	public void setFailedReason(List<CommonListDTO> failedReason) {
		this.failedReason = failedReason;
	}

	public String getIssuerDn() {
		return this.issuerDn;
	}
	public void setIssuerDn(String issuerDn) {
		this.issuerDn = issuerDn;
	}

	public Date getNotAfter() {
		return this.notAfter;
	}
	public void setNotAfter(Date notAfter) {
		this.notAfter = notAfter;
	}

	public Date getNotBefore() {
		return this.notBefore;
	}
	public void setNotBefore(Date notBefore) {
		this.notBefore = notBefore;
	}

	public String getPublicKeyFormat() {
		return this.publicKeyFormat;
	}
	public void setPublicKeyFormat(String publicKeyFormat) {
		this.publicKeyFormat = publicKeyFormat;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSignCertVersion() {
		return this.signCertVersion;
	}
	public void setSignCertVersion(String signCertVersion) {
		this.signCertVersion = signCertVersion;
	}

	public Date getSignDate() {
		return this.signDate;
	}
	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

	public String getSignName() {
		return this.signName;
	}
	public void setSignName(String signName) {
		this.signName = signName;
	}

	public String getSubjectDn() {
		return this.subjectDn;
	}
	public void setSubjectDn(String subjectDn) {
		this.subjectDn = subjectDn;
	}

	public Date getTimeStampDate() {
		return this.timeStampDate;
	}
	public void setTimeStampDate(Date timeStampDate) {
		this.timeStampDate = timeStampDate;
	}

	public Boolean getVerified() {
		return this.verified;
	}
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	public Boolean getVerifySignature() {
		return this.verifySignature;
	}
	public void setVerifySignature(Boolean verifySignature) {
		this.verifySignature = verifySignature;
	}

	public Boolean getVerifyTimestampImprint() {
		return this.verifyTimestampImprint;
	}
	public void setVerifyTimestampImprint(Boolean verifyTimestampImprint) {
		this.verifyTimestampImprint = verifyTimestampImprint;
	}

}

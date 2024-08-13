package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业身份信息验证企业四要素，个人两要素验证
 *
 * @author auto create
 * @since 1.0, 2022-10-27 16:02:26
 */
public class AnttechBlockchainIdentityInfoCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 3714456711512695645L;

	/**
	 * 支付宝账户
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 系统业务编号
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务系统bizId
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 认证类型，PERSON：代表个人，ENTERPRISE：代表企业
	 */
	@ApiField("certify_enum")
	private String certifyEnum;

	/**
	 * 业务系统渠道名称
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 企业名称
	 */
	@ApiField("ep_cert_name")
	private String epCertName;

	/**
	 * 企业证件号码
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业证件号码类型
	 */
	@ApiField("ep_cert_no_type")
	private String epCertNoType;

	/**
	 * 法人证件名称
	 */
	@ApiField("l_person_cert_name")
	private String lPersonCertName;

	/**
	 * 法人证件号码
	 */
	@ApiField("l_person_cert_no")
	private String lPersonCertNo;

	/**
	 * 个人身份证件号码
	 */
	@ApiField("l_person_certno_type")
	private String lPersonCertnoType;

	/**
	 * 系统操作名称
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 系统租户Id
	 */
	@ApiField("owner_uid")
	private String ownerUid;

	/**
	 * 证件号码
	 */
	@ApiField("person_cert_no")
	private String personCertNo;

	/**
	 * 证件类型
	 */
	@ApiField("person_cert_type")
	private String personCertType;

	/**
	 * 个人名称
	 */
	@ApiField("person_name")
	private String personName;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCertifyEnum() {
		return this.certifyEnum;
	}
	public void setCertifyEnum(String certifyEnum) {
		this.certifyEnum = certifyEnum;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getEpCertName() {
		return this.epCertName;
	}
	public void setEpCertName(String epCertName) {
		this.epCertName = epCertName;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpCertNoType() {
		return this.epCertNoType;
	}
	public void setEpCertNoType(String epCertNoType) {
		this.epCertNoType = epCertNoType;
	}

	public String getlPersonCertName() {
		return this.lPersonCertName;
	}
	public void setlPersonCertName(String lPersonCertName) {
		this.lPersonCertName = lPersonCertName;
	}

	public String getlPersonCertNo() {
		return this.lPersonCertNo;
	}
	public void setlPersonCertNo(String lPersonCertNo) {
		this.lPersonCertNo = lPersonCertNo;
	}

	public String getlPersonCertnoType() {
		return this.lPersonCertnoType;
	}
	public void setlPersonCertnoType(String lPersonCertnoType) {
		this.lPersonCertnoType = lPersonCertnoType;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerUid() {
		return this.ownerUid;
	}
	public void setOwnerUid(String ownerUid) {
		this.ownerUid = ownerUid;
	}

	public String getPersonCertNo() {
		return this.personCertNo;
	}
	public void setPersonCertNo(String personCertNo) {
		this.personCertNo = personCertNo;
	}

	public String getPersonCertType() {
		return this.personCertType;
	}
	public void setPersonCertType(String personCertType) {
		this.personCertType = personCertType;
	}

	public String getPersonName() {
		return this.personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}

}

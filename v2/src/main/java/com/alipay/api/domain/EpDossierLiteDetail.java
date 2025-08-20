package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业简版档案信息详情
 *
 * @author auto create
 * @since 1.0, 2023-12-29 10:16:44
 */
public class EpDossierLiteDetail extends AlipayObject {

	private static final long serialVersionUID = 4774652329261132711L;

	/**
	 * 法人/负责人姓名
	 */
	@ApiField("charge_person_name")
	private String chargePersonName;

	/**
	 * 统一社会信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业全称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 经营状态，如存续、在业、吊销、注销、迁入、迁出等
	 */
	@ApiField("ep_status")
	private String epStatus;

	/**
	 * 企业类型 ENTERPRISE (企业)， INDIVIDUAL（个体工商户) ORGANIZATION(组织机构)
	 */
	@ApiField("ep_type")
	private String epType;

	public String getChargePersonName() {
		return this.chargePersonName;
	}
	public void setChargePersonName(String chargePersonName) {
		this.chargePersonName = chargePersonName;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getEpStatus() {
		return this.epStatus;
	}
	public void setEpStatus(String epStatus) {
		this.epStatus = epStatus;
	}

	public String getEpType() {
		return this.epType;
	}
	public void setEpType(String epType) {
		this.epType = epType;
	}

}

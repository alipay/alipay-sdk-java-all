package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起失败转账
 *
 * @author auto create
 * @since 1.0, 2025-08-04 10:42:16
 */
public class AlipayCommerceMedicalEnterprisesubsidyFailureTransferModel extends AlipayObject {

	private static final long serialVersionUID = 4617657584689947277L;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 企业编号
	 */
	@ApiField("cur_company_id")
	private String curCompanyId;

	/**
	 * 上级企业编号
	 */
	@ApiField("father_company_id")
	private String fatherCompanyId;

	/**
	 * 就诊编号
	 */
	@ApiField("mdtrt_id")
	private String mdtrtId;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 医保结算编号
	 */
	@ApiField("setl_id")
	private String setlId;

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

	public String getCurCompanyId() {
		return this.curCompanyId;
	}
	public void setCurCompanyId(String curCompanyId) {
		this.curCompanyId = curCompanyId;
	}

	public String getFatherCompanyId() {
		return this.fatherCompanyId;
	}
	public void setFatherCompanyId(String fatherCompanyId) {
		this.fatherCompanyId = fatherCompanyId;
	}

	public String getMdtrtId() {
		return this.mdtrtId;
	}
	public void setMdtrtId(String mdtrtId) {
		this.mdtrtId = mdtrtId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSetlId() {
		return this.setlId;
	}
	public void setSetlId(String setlId) {
		this.setlId = setlId;
	}

}

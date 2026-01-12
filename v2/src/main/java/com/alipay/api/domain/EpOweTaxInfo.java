package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业催缴欠税明细
 *
 * @author auto create
 * @since 1.0, 2025-01-20 15:29:41
 */
public class EpOweTaxInfo extends AlipayObject {

	private static final long serialVersionUID = 2749494112411635667L;

	/**
	 * 识别号
	 */
	@ApiField("identify_number")
	private String identifyNumber;

	/**
	 * 发布时间
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 法定代表人姓名
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/**
	 * 经营地址
	 */
	@ApiField("manage_address")
	private String manageAddress;

	/**
	 * 金额，单位万元
	 */
	@ApiField("money")
	private String money;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 公告
	 */
	@ApiField("notice_type")
	private String noticeType;

	/**
	 * 税务机关
	 */
	@ApiField("taxes_organ")
	private String taxesOrgan;

	/**
	 * 税种
	 */
	@ApiField("taxes_type")
	private String taxesType;

	public String getIdentifyNumber() {
		return this.identifyNumber;
	}
	public void setIdentifyNumber(String identifyNumber) {
		this.identifyNumber = identifyNumber;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

	public String getManageAddress() {
		return this.manageAddress;
	}
	public void setManageAddress(String manageAddress) {
		this.manageAddress = manageAddress;
	}

	public String getMoney() {
		return this.money;
	}
	public void setMoney(String money) {
		this.money = money;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNoticeType() {
		return this.noticeType;
	}
	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}

	public String getTaxesOrgan() {
		return this.taxesOrgan;
	}
	public void setTaxesOrgan(String taxesOrgan) {
		this.taxesOrgan = taxesOrgan;
	}

	public String getTaxesType() {
		return this.taxesType;
	}
	public void setTaxesType(String taxesType) {
		this.taxesType = taxesType;
	}

}

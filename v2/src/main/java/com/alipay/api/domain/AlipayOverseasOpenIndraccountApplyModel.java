package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 申请新增账号API
 *
 * @author auto create
 * @since 1.0, 2026-01-06 17:26:34
 */
public class AlipayOverseasOpenIndraccountApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6255193645513852178L;

	/**
	 * 账户名简称
	 */
	@ApiField("account_abb_name")
	private String accountAbbName;

	/**
	 * 收款人地址
	 */
	@ApiField("account_address")
	private IndrAddress accountAddress;

	/**
	 * 账户名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 1. BANK_ACCOUNT账号
2. VCC账号
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 银行地址
	 */
	@ApiField("bank_address")
	private IndrAddress bankAddress;

	/**
	 * 必填
VCC为Sunrate
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 关联机构id
	 */
	@ApiField("beneficiary_id")
	private String beneficiaryId;

	/**
	 * 账号币种编码
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 文件list
	 */
	@ApiListField("file_list")
	@ApiField("indr_file_info")
	private List<IndrFileInfo> fileList;

	/**
	 * 账号币种为GBP/EUR时需要iban
	 */
	@ApiField("iban")
	private String iban;

	/**
	 * 收款账号,VCC默认95649503
	 */
	@ApiField("number")
	private String number;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 1. 留学场景：TUITION
2. 租房场景：HOUSE_RENTAL
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 本地清算号，英国地区的bank_account账号需要
	 */
	@ApiField("sort_code")
	private String sortCode;

	/**
	 * 电汇时需要swiftcode
	 */
	@ApiField("swift_code")
	private String swiftCode;

	/**
	 * 学校官网
	 */
	@ApiField("websites")
	private String websites;

	public String getAccountAbbName() {
		return this.accountAbbName;
	}
	public void setAccountAbbName(String accountAbbName) {
		this.accountAbbName = accountAbbName;
	}

	public IndrAddress getAccountAddress() {
		return this.accountAddress;
	}
	public void setAccountAddress(IndrAddress accountAddress) {
		this.accountAddress = accountAddress;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public IndrAddress getBankAddress() {
		return this.bankAddress;
	}
	public void setBankAddress(IndrAddress bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBeneficiaryId() {
		return this.beneficiaryId;
	}
	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public List<IndrFileInfo> getFileList() {
		return this.fileList;
	}
	public void setFileList(List<IndrFileInfo> fileList) {
		this.fileList = fileList;
	}

	public String getIban() {
		return this.iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getSortCode() {
		return this.sortCode;
	}
	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getSwiftCode() {
		return this.swiftCode;
	}
	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	public String getWebsites() {
		return this.websites;
	}
	public void setWebsites(String websites) {
		this.websites = websites;
	}

}

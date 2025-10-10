package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同信息
 *
 * @author auto create
 * @since 1.0, 2021-02-25 11:16:10
 */
public class LoanContractInfo extends AlipayObject {

	private static final long serialVersionUID = 1632545567532819278L;

	/**
	 * 合同编码
	 */
	@ApiField("contract_code")
	private String contractCode;

	/**
	 * 合同结束时间
	 */
	@ApiField("contract_end_date")
	private Date contractEndDate;

	/**
	 * 房抵贷抵押合同
	 */
	@ApiField("contract_name")
	private String contractName;

	/**
	 * 合同编号
本次使用区块链上内部合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 合同oss 地址
	 */
	@ApiField("contract_oss_url")
	private String contractOssUrl;

	/**
	 * 合同签约时间
	 */
	@ApiField("contract_sign_date")
	private Date contractSignDate;

	/**
	 * 合同版本
	 */
	@ApiField("contract_version")
	private String contractVersion;

	public String getContractCode() {
		return this.contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public Date getContractEndDate() {
		return this.contractEndDate;
	}
	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public String getContractName() {
		return this.contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractOssUrl() {
		return this.contractOssUrl;
	}
	public void setContractOssUrl(String contractOssUrl) {
		this.contractOssUrl = contractOssUrl;
	}

	public Date getContractSignDate() {
		return this.contractSignDate;
	}
	public void setContractSignDate(Date contractSignDate) {
		this.contractSignDate = contractSignDate;
	}

	public String getContractVersion() {
		return this.contractVersion;
	}
	public void setContractVersion(String contractVersion) {
		this.contractVersion = contractVersion;
	}

}

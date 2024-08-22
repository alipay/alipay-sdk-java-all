package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基金行业银行卡信息描述模型
 *
 * @author auto create
 * @since 1.0, 2022-11-25 13:53:41
 */
public class FundBankCardInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2281279929436941195L;

	/**
	 * 银行卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 发卡行
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 银行卡户名
	 */
	@ApiField("inst_account_name")
	private String instAccountName;

	/**
	 * 机构编码，点此下载 <a href="https://gw.alipayobjects.com/os/bmw-prod/bb7b3928-e012-41f2-98bb-13b1ff4a76a8.xlsx" target="_blank" rel="noopener noreferrer"><span>常见机构编码.xlsx</span></a>。
	 */
	@ApiField("inst_id")
	private String instId;

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getInstAccountName() {
		return this.instAccountName;
	}
	public void setInstAccountName(String instAccountName) {
		this.instAccountName = instAccountName;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}

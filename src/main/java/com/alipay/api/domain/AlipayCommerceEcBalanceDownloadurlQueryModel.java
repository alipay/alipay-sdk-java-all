package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对账单文件下载接口
 *
 * @author auto create
 * @since 1.0, 2022-10-21 10:39:30
 */
public class AlipayCommerceEcBalanceDownloadurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7328899636863278514L;

	/**
	 * 共同账户ID，没有企业ID可以用此ID查询
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号，以共同账户ID查询时必传
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 账单时间：
日账单格式为yyyy-MM-dd，最早可下载2016年1月1日开始的日账单。不支持下载当日账单，只能下载前一日24点前的账单数据（T+1），当日数据一般于次日 9 点前生成，特殊情况可能延迟。
月账单格式为yyyy-MM，最早可下载2016年1月开始的月账单。不支持下载当月账单，只能下载上一月账单数据，当月账单一般在次月 3 日生成，特殊情况可能延迟。
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 账单类型，商户通过接口或商户经开放平台授权后其所属服务商通过接口可以获取以下账单类型，支持：
enterprisetrade：商户基于企业码交易收单的业务账单;
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}

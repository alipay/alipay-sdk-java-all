package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.salary.fundflow.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-06 16:42:24
 */
public class AlipayEbppIndustrySalaryFundflowApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1214831785982225974L;

	/** 
	 * 子户账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 结束时间
	 */
	@ApiField("end_date")
	private String endDate;

	/** 
	 * 网商商户号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 外部流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 对账单单号
	 */
	@ApiField("receipt_no")
	private String receiptNo;

	/** 
	 * 响应加签xml, base64编码
	 */
	@ApiField("sign_xml")
	private String signXml;

	/** 
	 * 开始时间
	 */
	@ApiField("start_date")
	private String startDate;

	/** 
	 * 回单类型
	 */
	@ApiField("type")
	private String type;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndDate( ) {
		return this.endDate;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}
	public String getReceiptNo( ) {
		return this.receiptNo;
	}

	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}
	public String getSignXml( ) {
		return this.signXml;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate( ) {
		return this.startDate;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}

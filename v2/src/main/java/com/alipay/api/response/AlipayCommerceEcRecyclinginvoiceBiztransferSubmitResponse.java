package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.biztransfer.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-25 17:32:58
 */
public class AlipayCommerceEcRecyclinginvoiceBiztransferSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 4141711139475298623L;

	/** 
	 * 支付流水号
	 */
	@ApiField("alipay_pay_no")
	private String alipayPayNo;

	/** 
	 * 业务转账单据ID
	 */
	@ApiField("biz_transfer_id")
	private String bizTransferId;

	/** 
	 * 企业资金账户ID
	 */
	@ApiField("company_account_id")
	private String companyAccountId;

	/** 
	 * 转账失败的错误码，只有在转账失败时有值
	 */
	@ApiField("fail_code")
	private String failCode;

	/** 
	 * 当转账失败的情况下，透出具体原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 支付成功的时间
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/** 
	 * 外部业务转账单号
	 */
	@ApiField("out_biz_transfer_id")
	private String outBizTransferId;

	/** 
	 * 收款账号
	 */
	@ApiField("payee_account")
	private String payeeAccount;

	/** 
	 * 收款账号类型：PHONE / EMAIL
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/** 
	 * 收款人姓名
	 */
	@ApiField("payee_name")
	private String payeeName;

	/** 
	 * 凭证文件ID
	 */
	@ApiField("receipt_file_id")
	private String receiptFileId;

	/** 
	 * 通过反向创建订单返回的订单id
	 */
	@ApiField("recycling_order_id")
	private String recyclingOrderId;

	/** 
	 * 转账业务金额，单位元
	 */
	@ApiField("transfer_biz_amount")
	private String transferBizAmount;

	/** 
	 * 转账状态：INIT / PROCESSING / SUCCESS / FAIL
	 */
	@ApiField("transfer_biz_status")
	private String transferBizStatus;

	/** 
	 * 业务类型(LOGISTICS:物流，COMMISSION：分佣)
	 */
	@ApiField("transfer_biz_type")
	private String transferBizType;

	public void setAlipayPayNo(String alipayPayNo) {
		this.alipayPayNo = alipayPayNo;
	}
	public String getAlipayPayNo( ) {
		return this.alipayPayNo;
	}

	public void setBizTransferId(String bizTransferId) {
		this.bizTransferId = bizTransferId;
	}
	public String getBizTransferId( ) {
		return this.bizTransferId;
	}

	public void setCompanyAccountId(String companyAccountId) {
		this.companyAccountId = companyAccountId;
	}
	public String getCompanyAccountId( ) {
		return this.companyAccountId;
	}

	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}
	public String getFailCode( ) {
		return this.failCode;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}
	public Date getGmtPay( ) {
		return this.gmtPay;
	}

	public void setOutBizTransferId(String outBizTransferId) {
		this.outBizTransferId = outBizTransferId;
	}
	public String getOutBizTransferId( ) {
		return this.outBizTransferId;
	}

	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}
	public String getPayeeAccount( ) {
		return this.payeeAccount;
	}

	public void setPayeeAccountType(String payeeAccountType) {
		this.payeeAccountType = payeeAccountType;
	}
	public String getPayeeAccountType( ) {
		return this.payeeAccountType;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public String getPayeeName( ) {
		return this.payeeName;
	}

	public void setReceiptFileId(String receiptFileId) {
		this.receiptFileId = receiptFileId;
	}
	public String getReceiptFileId( ) {
		return this.receiptFileId;
	}

	public void setRecyclingOrderId(String recyclingOrderId) {
		this.recyclingOrderId = recyclingOrderId;
	}
	public String getRecyclingOrderId( ) {
		return this.recyclingOrderId;
	}

	public void setTransferBizAmount(String transferBizAmount) {
		this.transferBizAmount = transferBizAmount;
	}
	public String getTransferBizAmount( ) {
		return this.transferBizAmount;
	}

	public void setTransferBizStatus(String transferBizStatus) {
		this.transferBizStatus = transferBizStatus;
	}
	public String getTransferBizStatus( ) {
		return this.transferBizStatus;
	}

	public void setTransferBizType(String transferBizType) {
		this.transferBizType = transferBizType;
	}
	public String getTransferBizType( ) {
		return this.transferBizType;
	}

}

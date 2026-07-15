package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向开票-业务转账单据信息
 *
 * @author auto create
 * @since 1.0, 2026-06-25 17:22:50
 */
public class RecyclingInvoiceBizTransfer extends AlipayObject {

	private static final long serialVersionUID = 5789546745988144632L;

	/**
	 * 支付宝侧的支付流水号，转账成功后返回
	 */
	@ApiField("alipay_pay_no")
	private String alipayPayNo;

	/**
	 * 系统生成的业务转账唯一标识
	 */
	@ApiField("biz_transfer_id")
	private String bizTransferId;

	/**
	 * 企业在转账平台的开户账户标识
	 */
	@ApiField("company_account_id")
	private String companyAccountId;

	/**
	 * 转账失败时的错误码
	 */
	@ApiField("fail_code")
	private String failCode;

	/**
	 * 转账失败时的错误描述
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 转账支付完成的时间
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/**
	 * 外部系统传入的转账单号，用于幂等控制
	 */
	@ApiField("out_biz_transfer_id")
	private String outBizTransferId;

	/**
	 * 业务来源标识
	 */
	@ApiField("out_source")
	private String outSource;

	/**
	 * 收款方账号，与 payee_account_type 对应
	 */
	@ApiField("payee_account")
	private String payeeAccount;

	/**
	 * 收款账号类型枚举：PHONE-手机号，EMAIL-邮箱
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/**
	 * 收款方真实姓名
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 通过 receiptId 关联回单表获取的文件下载地址
	 */
	@ApiField("receipt_file_url")
	private String receiptFileUrl;

	/**
	 * 关联回单记录表的主键ID
	 */
	@ApiField("receipt_id")
	private Long receiptId;

	/**
	 * 关联的反向开票订单唯一标识
	 */
	@ApiField("recycling_order_id")
	private String recyclingOrderId;

	/**
	 * 转账金额，单位为元，精确到分，最多两位小数
	 */
	@ApiField("transfer_biz_amount")
	private String transferBizAmount;

	/**
	 * 转账状态枚举：INIT-已创建，SUCCESS-转账成功，FAIL-转账失败
	 */
	@ApiField("transfer_biz_status")
	private String transferBizStatus;

	/**
	 * 转账业务类型枚举：COMMISSION-平台抽佣/服务费，LOGISTICS-物流费
	 */
	@ApiField("transfer_biz_type")
	private String transferBizType;

	public String getAlipayPayNo() {
		return this.alipayPayNo;
	}
	public void setAlipayPayNo(String alipayPayNo) {
		this.alipayPayNo = alipayPayNo;
	}

	public String getBizTransferId() {
		return this.bizTransferId;
	}
	public void setBizTransferId(String bizTransferId) {
		this.bizTransferId = bizTransferId;
	}

	public String getCompanyAccountId() {
		return this.companyAccountId;
	}
	public void setCompanyAccountId(String companyAccountId) {
		this.companyAccountId = companyAccountId;
	}

	public String getFailCode() {
		return this.failCode;
	}
	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public Date getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}

	public String getOutBizTransferId() {
		return this.outBizTransferId;
	}
	public void setOutBizTransferId(String outBizTransferId) {
		this.outBizTransferId = outBizTransferId;
	}

	public String getOutSource() {
		return this.outSource;
	}
	public void setOutSource(String outSource) {
		this.outSource = outSource;
	}

	public String getPayeeAccount() {
		return this.payeeAccount;
	}
	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public String getPayeeAccountType() {
		return this.payeeAccountType;
	}
	public void setPayeeAccountType(String payeeAccountType) {
		this.payeeAccountType = payeeAccountType;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getReceiptFileUrl() {
		return this.receiptFileUrl;
	}
	public void setReceiptFileUrl(String receiptFileUrl) {
		this.receiptFileUrl = receiptFileUrl;
	}

	public Long getReceiptId() {
		return this.receiptId;
	}
	public void setReceiptId(Long receiptId) {
		this.receiptId = receiptId;
	}

	public String getRecyclingOrderId() {
		return this.recyclingOrderId;
	}
	public void setRecyclingOrderId(String recyclingOrderId) {
		this.recyclingOrderId = recyclingOrderId;
	}

	public String getTransferBizAmount() {
		return this.transferBizAmount;
	}
	public void setTransferBizAmount(String transferBizAmount) {
		this.transferBizAmount = transferBizAmount;
	}

	public String getTransferBizStatus() {
		return this.transferBizStatus;
	}
	public void setTransferBizStatus(String transferBizStatus) {
		this.transferBizStatus = transferBizStatus;
	}

	public String getTransferBizType() {
		return this.transferBizType;
	}
	public void setTransferBizType(String transferBizType) {
		this.transferBizType = transferBizType;
	}

}

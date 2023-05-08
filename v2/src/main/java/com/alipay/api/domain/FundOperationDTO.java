package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基金支付流水查询返回结果
 *
 * @author auto create
 * @since 1.0, 2022-11-22 16:18:40
 */
public class FundOperationDTO extends AlipayObject {

	private static final long serialVersionUID = 7239579279385937434L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号，调用签约接口成功时返回。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 失败错误吗，仅明确失败且流水关单时返回
	 */
	@ApiField("close_code")
	private String closeCode;

	/**
	 * 失败原因，仅明确失败且流水关单时返回
	 */
	@ApiField("close_reason")
	private String closeReason;

	/**
	 * 支付时间
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/**
	 * 支付宝流水号
	 */
	@ApiField("operation_id")
	private String operationId;

	/**
	 * INIT：初始
PROCESSING：处理中
SUCCESS：成功
CLOSED：关闭
	 */
	@ApiField("operation_status")
	private String operationStatus;

	/**
	 * PURCHASE：申购
REVOKE：申购撤销
REDEEM：赎回
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 展示在用户的消费记录中的订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 申购撤销/赎回场景下必填
银行卡号（脱敏）/支付宝uid/NULL
	 */
	@ApiField("principal_account")
	private String principalAccount;

	/**
	 * 申购撤销/赎回场景下必填
● BANKCARD：银行卡
● ALIPAYACCOUNT：支付宝余额
● SLIP：差错户
	 */
	@ApiField("receive_asset")
	private String receiveAsset;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCloseCode() {
		return this.closeCode;
	}
	public void setCloseCode(String closeCode) {
		this.closeCode = closeCode;
	}

	public String getCloseReason() {
		return this.closeReason;
	}
	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public Date getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}

	public String getOperationId() {
		return this.operationId;
	}
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public String getOperationStatus() {
		return this.operationStatus;
	}
	public void setOperationStatus(String operationStatus) {
		this.operationStatus = operationStatus;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPrincipalAccount() {
		return this.principalAccount;
	}
	public void setPrincipalAccount(String principalAccount) {
		this.principalAccount = principalAccount;
	}

	public String getReceiveAsset() {
		return this.receiveAsset;
	}
	public void setReceiveAsset(String receiveAsset) {
		this.receiveAsset = receiveAsset;
	}

}

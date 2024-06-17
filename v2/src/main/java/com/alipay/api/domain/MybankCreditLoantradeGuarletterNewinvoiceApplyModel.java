package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保函发票申请（新）
 *
 * @author auto create
 * @since 1.0, 2022-11-09 16:33:20
 */
public class MybankCreditLoantradeGuarletterNewinvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1841875242327216141L;

	/**
	 * 申请开票用户信息
	 */
	@ApiField("apply_user_info")
	private EnterpriseCustomerInfoVO applyUserInfo;

	/**
	 * 保函单号
	 */
	@ApiField("guar_order_no")
	private String guarOrderNo;

	/**
	 * 开票金额
	 */
	@ApiField("invoice_amt")
	private CreditPayMoneyVO invoiceAmt;

	/**
	 * 1：普票 2：专票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 接收信息
	 */
	@ApiField("receive_info")
	private ReceiveInfoVO receiveInfo;

	/**
	 * 请求单号
	 */
	@ApiField("request_id")
	private String requestId;

	public EnterpriseCustomerInfoVO getApplyUserInfo() {
		return this.applyUserInfo;
	}
	public void setApplyUserInfo(EnterpriseCustomerInfoVO applyUserInfo) {
		this.applyUserInfo = applyUserInfo;
	}

	public String getGuarOrderNo() {
		return this.guarOrderNo;
	}
	public void setGuarOrderNo(String guarOrderNo) {
		this.guarOrderNo = guarOrderNo;
	}

	public CreditPayMoneyVO getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(CreditPayMoneyVO invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public ReceiveInfoVO getReceiveInfo() {
		return this.receiveInfo;
	}
	public void setReceiveInfo(ReceiveInfoVO receiveInfo) {
		this.receiveInfo = receiveInfo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}

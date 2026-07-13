package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向开票业务转账提交
 *
 * @author auto create
 * @since 1.0, 2026-06-25 16:35:19
 */
public class AlipayCommerceEcRecyclinginvoiceBiztransferSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 2818885587615128896L;

	/**
	 * 企业转账账户ID
	 */
	@ApiField("company_account_id")
	private String companyAccountId;

	/**
	 * 外部业务转账单号（幂等键）
	 */
	@ApiField("out_biz_transfer_id")
	private String outBizTransferId;

	/**
	 * 支付宝收款账号，邮箱账号|手机号账号
	 */
	@ApiField("payee_account")
	private String payeeAccount;

	/**
	 * 传入的支付宝账号类型，手机号或者邮箱账号
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/**
	 * 收款方姓名，校验收款账号是否正确
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 订单号，调用反向订单创建接口时返回
	 */
	@ApiField("recycling_order_id")
	private String recyclingOrderId;

	/**
	 * 企业的税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 转账业务金额 单位：元
	 */
	@ApiField("transfer_biz_amount")
	private String transferBizAmount;

	/**
	 * 区分转账的业务类型
	 */
	@ApiField("transfer_biz_type")
	private String transferBizType;

	public String getCompanyAccountId() {
		return this.companyAccountId;
	}
	public void setCompanyAccountId(String companyAccountId) {
		this.companyAccountId = companyAccountId;
	}

	public String getOutBizTransferId() {
		return this.outBizTransferId;
	}
	public void setOutBizTransferId(String outBizTransferId) {
		this.outBizTransferId = outBizTransferId;
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

	public String getRecyclingOrderId() {
		return this.recyclingOrderId;
	}
	public void setRecyclingOrderId(String recyclingOrderId) {
		this.recyclingOrderId = recyclingOrderId;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTransferBizAmount() {
		return this.transferBizAmount;
	}
	public void setTransferBizAmount(String transferBizAmount) {
		this.transferBizAmount = transferBizAmount;
	}

	public String getTransferBizType() {
		return this.transferBizType;
	}
	public void setTransferBizType(String transferBizType) {
		this.transferBizType = transferBizType;
	}

}

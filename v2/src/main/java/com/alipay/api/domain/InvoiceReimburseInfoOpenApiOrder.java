package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报销信息
 *
 * @author auto create
 * @since 1.0, 2023-10-13 10:00:44
 */
public class InvoiceReimburseInfoOpenApiOrder extends AlipayObject {

	private static final long serialVersionUID = 3746158653735117438L;

	/**
	 * 费用明细
	 */
	@ApiListField("account_info_order_list")
	@ApiField("account_info_open_api_order")
	private List<AccountInfoOpenApiOrder> accountInfoOrderList;

	/**
	 * 报销单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 报销行号
	 */
	@ApiField("line_no")
	private String lineNo;

	/**
	 * 发票使用金额
	 */
	@ApiField("use_amt")
	private String useAmt;

	public List<AccountInfoOpenApiOrder> getAccountInfoOrderList() {
		return this.accountInfoOrderList;
	}
	public void setAccountInfoOrderList(List<AccountInfoOpenApiOrder> accountInfoOrderList) {
		this.accountInfoOrderList = accountInfoOrderList;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getLineNo() {
		return this.lineNo;
	}
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getUseAmt() {
		return this.useAmt;
	}
	public void setUseAmt(String useAmt) {
		this.useAmt = useAmt;
	}

}

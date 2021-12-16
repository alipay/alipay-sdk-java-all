package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单支付工具结果信息，包括支付宝返回的支付工具单据ID，状态和资金信息。支持现金、商户预付卡、支付宝、银行卡、其他第三方支付工具信息。
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:45:10
 */
public class PaytoolResultDetail extends AlipayObject {

	private static final long serialVersionUID = 4885754993573371467L;

	/**
	 * 支付宝交易号，当tool_code是ALIPAY和TMARKETING时有效。
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 支付工具金额。单位为元，精确到小数点后两位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 该支付工具的资金组成明细。仅当该支付工具驱动支付宝发生资金流时返回该字段。
	 */
	@ApiListField("fund_bill_list")
	@ApiField("trade_fund_bill")
	private List<TradeFundBill> fundBillList;

	/**
	 * 支付完成时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/**
	 * 付款方用户详细信息
	 */
	@ApiField("payer_info")
	private UserDetailInfo payerInfo;

	/**
	 * 支付宝支付工具单据号
	 */
	@ApiField("paytool_bill_no")
	private String paytoolBillNo;

	/**
	 * 商户支付工具单据号
	 */
	@ApiField("paytool_request_no")
	private String paytoolRequestNo;

	/**
	 * 支付工具状态;
支付成功：PAYMENT_SUCCESS，支付中：PAYMENT_INPROCESS，支付失败：PAYMENT_FAIL，支付撤销：PAYMENT_CANCELED
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝统一分配的支付工具编码;
现金:CASH;支付宝:ALIPAY,营销:TMARKETING;POS支付:POS,商户预付卡:MERCHANT_MCARD,OTHER:其他
	 */
	@ApiField("tool_code")
	private String toolCode;

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public List<TradeFundBill> getFundBillList() {
		return this.fundBillList;
	}
	public void setFundBillList(List<TradeFundBill> fundBillList) {
		this.fundBillList = fundBillList;
	}

	public Date getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}

	public UserDetailInfo getPayerInfo() {
		return this.payerInfo;
	}
	public void setPayerInfo(UserDetailInfo payerInfo) {
		this.payerInfo = payerInfo;
	}

	public String getPaytoolBillNo() {
		return this.paytoolBillNo;
	}
	public void setPaytoolBillNo(String paytoolBillNo) {
		this.paytoolBillNo = paytoolBillNo;
	}

	public String getPaytoolRequestNo() {
		return this.paytoolRequestNo;
	}
	public void setPaytoolRequestNo(String paytoolRequestNo) {
		this.paytoolRequestNo = paytoolRequestNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getToolCode() {
		return this.toolCode;
	}
	public void setToolCode(String toolCode) {
		this.toolCode = toolCode;
	}

}

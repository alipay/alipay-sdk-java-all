package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付工具退款结果明细
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:44:09
 */
public class PaytoolRefundResultDetail extends AlipayObject {

	private static final long serialVersionUID = 6696778711697449898L;

	/**
	 * 支付工具退款完成时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_refund")
	private Date gmtRefund;

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
	 * 退款支付工具金额。单位为元，精确到小数点后两位
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 该支付工具的退款资金组成明细。仅当该支付工具驱动支付宝发生资金流时返回该字段。
	 */
	@ApiListField("refund_fund_bill_list")
	@ApiField("trade_fund_bill")
	private List<TradeFundBill> refundFundBillList;

	/**
	 * 支付工具退款状态;
退款：REFUND_SUCCESS，退款处理中：REFUND_INPROCESS，退款失败：REFUND_FAIL
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝统一分配的支付工具编码;
现金:CASH;支付宝:ALIPAY,营销:TMARKETING;POS支付:POS,商户预付卡:MERCHANT_MCARD,OTHER:其他
	 */
	@ApiField("tool_code")
	private String toolCode;

	public Date getGmtRefund() {
		return this.gmtRefund;
	}
	public void setGmtRefund(Date gmtRefund) {
		this.gmtRefund = gmtRefund;
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

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public List<TradeFundBill> getRefundFundBillList() {
		return this.refundFundBillList;
	}
	public void setRefundFundBillList(List<TradeFundBill> refundFundBillList) {
		this.refundFundBillList = refundFundBillList;
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

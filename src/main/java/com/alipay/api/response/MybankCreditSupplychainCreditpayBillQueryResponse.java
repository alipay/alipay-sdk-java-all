package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Member;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.creditpay.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:12
 */
public class MybankCreditSupplychainCreditpayBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5773776722424971135L;

	/** 
	 * 余额总金额
	 */
	@ApiField("balance_amt")
	private String balanceAmt;

	/** 
	 * 余额罚息金额
	 */
	@ApiField("balance_int_amt")
	private String balanceIntAmt;

	/** 
	 * 余额本金金额
	 */
	@ApiField("balance_prin_amt")
	private String balancePrinAmt;

	/** 
	 * 入账金额
	 */
	@ApiField("bill_amt")
	private String billAmt;

	/** 
	 * 出账日期
	 */
	@ApiField("bill_date")
	private String billDate;

	/** 
	 * 账单罚息金额
	 */
	@ApiField("bill_int_amt")
	private String billIntAmt;

	/** 
	 * 账单本金金额
	 */
	@ApiField("bill_prin_amt")
	private String billPrinAmt;

	/** 
	 * 买方信息，这里是ISV的信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/** 
	 * 1688买家ID
	 */
	@ApiField("buyer_scene_id")
	private String buyerSceneId;

	/** 
	 * 账单状态：NOR/CLR/OVD
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 网商日志ID
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setBalanceAmt(String balanceAmt) {
		this.balanceAmt = balanceAmt;
	}
	public String getBalanceAmt( ) {
		return this.balanceAmt;
	}

	public void setBalanceIntAmt(String balanceIntAmt) {
		this.balanceIntAmt = balanceIntAmt;
	}
	public String getBalanceIntAmt( ) {
		return this.balanceIntAmt;
	}

	public void setBalancePrinAmt(String balancePrinAmt) {
		this.balancePrinAmt = balancePrinAmt;
	}
	public String getBalancePrinAmt( ) {
		return this.balancePrinAmt;
	}

	public void setBillAmt(String billAmt) {
		this.billAmt = billAmt;
	}
	public String getBillAmt( ) {
		return this.billAmt;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getBillDate( ) {
		return this.billDate;
	}

	public void setBillIntAmt(String billIntAmt) {
		this.billIntAmt = billIntAmt;
	}
	public String getBillIntAmt( ) {
		return this.billIntAmt;
	}

	public void setBillPrinAmt(String billPrinAmt) {
		this.billPrinAmt = billPrinAmt;
	}
	public String getBillPrinAmt( ) {
		return this.billPrinAmt;
	}

	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}
	public Member getBuyer( ) {
		return this.buyer;
	}

	public void setBuyerSceneId(String buyerSceneId) {
		this.buyerSceneId = buyerSceneId;
	}
	public String getBuyerSceneId( ) {
		return this.buyerSceneId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}

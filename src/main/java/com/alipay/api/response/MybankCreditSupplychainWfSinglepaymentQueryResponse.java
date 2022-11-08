package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AmountWf;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.singlepayment.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-18 15:16:58
 */
public class MybankCreditSupplychainWfSinglepaymentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3523322976533989325L;

	/** 
	 * 未还清总金额
	 */
	@ApiField("balanceamt")
	private AmountWf balanceamt;

	/** 
	 * 支用编号
	 */
	@ApiField("billno")
	private String billno;

	/** 
	 * 利率展示
BigDecimal*100
	 */
	@ApiField("displayrate")
	private String displayrate;

	/** 
	 * 账单到期日
	 */
	@ApiField("duedate")
	private Long duedate;

	/** 
	 * 支用金额
	 */
	@ApiField("encashamt")
	private AmountWf encashamt;

	/** 
	 * 放款机构
	 */
	@ApiField("fipname")
	private String fipname;

	/** 
	 * 收款账户
	 */
	@ApiField("grantaccount")
	private String grantaccount;

	/** 
	 * 未结清利息
	 */
	@ApiField("interest")
	private AmountWf interest;

	/** 
	 * 未结清罚息
	 */
	@ApiField("intpenalty")
	private AmountWf intpenalty;

	/** 
	 * 已结清总额
	 */
	@ApiField("paidbillamt")
	private AmountWf paidbillamt;

	/** 
	 * 未结清本金
	 */
	@ApiField("prinbalamt")
	private AmountWf prinbalamt;

	/** 
	 * 利率
	 */
	@ApiField("rate")
	private String rate;

	/** 
	 * 店铺ID
	 */
	@ApiField("sellerid")
	private String sellerid;

	/** 
	 * 支用成功时间
	 */
	@ApiField("startdate")
	private Long startdate;

	/** 
	 * 账单状态
	 */
	@ApiField("status")
	private String status;

	public void setBalanceamt(AmountWf balanceamt) {
		this.balanceamt = balanceamt;
	}
	public AmountWf getBalanceamt( ) {
		return this.balanceamt;
	}

	public void setBillno(String billno) {
		this.billno = billno;
	}
	public String getBillno( ) {
		return this.billno;
	}

	public void setDisplayrate(String displayrate) {
		this.displayrate = displayrate;
	}
	public String getDisplayrate( ) {
		return this.displayrate;
	}

	public void setDuedate(Long duedate) {
		this.duedate = duedate;
	}
	public Long getDuedate( ) {
		return this.duedate;
	}

	public void setEncashamt(AmountWf encashamt) {
		this.encashamt = encashamt;
	}
	public AmountWf getEncashamt( ) {
		return this.encashamt;
	}

	public void setFipname(String fipname) {
		this.fipname = fipname;
	}
	public String getFipname( ) {
		return this.fipname;
	}

	public void setGrantaccount(String grantaccount) {
		this.grantaccount = grantaccount;
	}
	public String getGrantaccount( ) {
		return this.grantaccount;
	}

	public void setInterest(AmountWf interest) {
		this.interest = interest;
	}
	public AmountWf getInterest( ) {
		return this.interest;
	}

	public void setIntpenalty(AmountWf intpenalty) {
		this.intpenalty = intpenalty;
	}
	public AmountWf getIntpenalty( ) {
		return this.intpenalty;
	}

	public void setPaidbillamt(AmountWf paidbillamt) {
		this.paidbillamt = paidbillamt;
	}
	public AmountWf getPaidbillamt( ) {
		return this.paidbillamt;
	}

	public void setPrinbalamt(AmountWf prinbalamt) {
		this.prinbalamt = prinbalamt;
	}
	public AmountWf getPrinbalamt( ) {
		return this.prinbalamt;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getRate( ) {
		return this.rate;
	}

	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}
	public String getSellerid( ) {
		return this.sellerid;
	}

	public void setStartdate(Long startdate) {
		this.startdate = startdate;
	}
	public Long getStartdate( ) {
		return this.startdate;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

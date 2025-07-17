package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MultiCurrencyMoneyOpenApi;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.apbill.totalbillamt.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:54:58
 */
public class AlipayBossFncApbillTotalbillamtQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4842325692366478739L;

	/** 
	 * 汇总调整金额
	 */
	@ApiField("agr_adj_amt")
	private MultiCurrencyMoneyOpenApi agrAdjAmt;

	/** 
	 * 确认汇总调整金额
	 */
	@ApiField("agr_adj_chk_amt")
	private MultiCurrencyMoneyOpenApi agrAdjChkAmt;

	/** 
	 * 分析维度1
	 */
	@ApiField("analysis_dmsn_1")
	private String analysisDmsn1;

	/** 
	 * 分析维度2
	 */
	@ApiField("analysis_dmsn_2")
	private String analysisDmsn2;

	/** 
	 * 分析维度3
	 */
	@ApiField("analysis_dmsn_3")
	private String analysisDmsn3;

	/** 
	 * 分析维度4
	 */
	@ApiField("analysis_dmsn_4")
	private String analysisDmsn4;

	/** 
	 * 合约号
	 */
	@ApiField("ar_no")
	private String arNo;

	/** 
	 * 认证关联发票金额
	 */
	@ApiField("auth_invoice_amt")
	private MultiCurrencyMoneyOpenApi authInvoiceAmt;

	/** 
	 * 原始账单金额
	 */
	@ApiField("bill_amt")
	private MultiCurrencyMoneyOpenApi billAmt;

	/** 
	 * 账单对账状态{"01":"账单生成","02":"待确认出账","03":"已出账","04":"客户已对账","05":"对账差异","06":"部分出账","07":"账单出账中"}
	 */
	@ApiField("bill_check_status")
	private String billCheckStatus;

	/** 
	 * 原始账单确认金额
	 */
	@ApiField("bill_chk_amt")
	private MultiCurrencyMoneyOpenApi billChkAmt;

	/** 
	 * 账单结束日期yyyyMMdd
	 */
	@ApiField("bill_end_date")
	private String billEndDate;

	/** 
	 * 账单关联发票状态{"01":"未关联","02':"部分关联","03":"完全关联"}
	 */
	@ApiField("bill_invoice_link_status")
	private String billInvoiceLinkStatus;

	/** 
	 * 账单月(yyyyMM)
	 */
	@ApiField("bill_month")
	private String billMonth;

	/** 
	 * 账单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 账单开始日期yyyyMMdd
	 */
	@ApiField("bill_start_date")
	private String billStartDate;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 明细调整金额
	 */
	@ApiField("dtl_adj_amt")
	private MultiCurrencyMoneyOpenApi dtlAdjAmt;

	/** 
	 * 确认明细调整金额
	 */
	@ApiField("dtl_adj_chk_amt")
	private MultiCurrencyMoneyOpenApi dtlAdjChkAmt;

	/** 
	 * 账单结束日期(yyyyMMdd)
	 */
	@ApiField("end_date")
	private String endDate;

	/** 
	 * 汇率
	 */
	@ApiField("exchange_rate")
	private String exchangeRate;

	/** 
	 * 月账单扩展字段
	 */
	@ApiField("exn_inf")
	private String exnInf;

	/** 
	 * 止付金额
	 */
	@ApiField("fbd_pay_amt")
	private MultiCurrencyMoneyOpenApi fbdPayAmt;

	/** 
	 * 确认止付金额
	 */
	@ApiField("fbd_pay_chk_amt")
	private MultiCurrencyMoneyOpenApi fbdPayChkAmt;

	/** 
	 * 分支机构ID（OU标识）
	 */
	@ApiField("inst_id")
	private String instId;

	/** 
	 * 在途金额
	 */
	@ApiField("intransit_amt")
	private MultiCurrencyMoneyOpenApi intransitAmt;

	/** 
	 * 关联发票金额
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/** 
	 * 结算对象（PID）
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/** 
	 * MID
	 */
	@ApiField("mid")
	private String mid;

	/** 
	 * 税损扣除后月账单可关联发票金额
	 */
	@ApiField("new_can_invoice_amt")
	private MultiCurrencyMoneyOpenApi newCanInvoiceAmt;

	/** 
	 * 已付金额
	 */
	@ApiField("paid_amt")
	private MultiCurrencyMoneyOpenApi paidAmt;

	/** 
	 * 付款渠道[银行账号/支付宝账号/国际银行卡]
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/** 
	 * 付款状态{"01":"待结算","02":"部分结算","03":"结算完成"}
	 */
	@ApiField("pay_status")
	private String payStatus;

	/** 
	 * 产品码
	 */
	@ApiField("pd_code")
	private String pdCode;

	/** 
	 * 产品名称
	 */
	@ApiField("pd_name")
	private String pdName;

	/** 
	 * 预付已冲销金额
	 */
	@ApiField("pre_wrtof_amt")
	private MultiCurrencyMoneyOpenApi preWrtofAmt;

	/** 
	 * 价格标识
	 */
	@ApiField("price_id")
	private String priceId;

	/** 
	 * 价格政策ID
	 */
	@ApiField("price_policy_id")
	private String pricePolicyId;

	/** 
	 * 价格政策名
	 */
	@ApiField("price_policy_name")
	private String pricePolicyName;

	/** 
	 * 账单金额
	 */
	@ApiField("real_bill_amt")
	private MultiCurrencyMoneyOpenApi realBillAmt;

	/** 
	 * 确认账单金额
	 */
	@ApiField("real_bill_chk_amt")
	private MultiCurrencyMoneyOpenApi realBillChkAmt;

	/** 
	 * 结算类型，暂不提供枚举，01-实时，02-后付，03-周期性
	 */
	@ApiField("settle_type")
	private String settleType;

	/** 
	 * 账单开始日期(yyyyMMdd)
	 */
	@ApiField("start_date")
	private String startDate;

	/** 
	 * 税额
	 */
	@ApiField("tax_amt")
	private MultiCurrencyMoneyOpenApi taxAmt;

	/** 
	 * 含税金额（账单金额 + 代缴税金金额）
	 */
	@ApiField("tax_included_amt")
	private MultiCurrencyMoneyOpenApi taxIncludedAmt;

	/** 
	 * 代缴税金金额
	 */
	@ApiField("withhold_tax_amt")
	private MultiCurrencyMoneyOpenApi withholdTaxAmt;

	/** 
	 * 确认代缴税金金额
	 */
	@ApiField("withhold_tax_chk_amt")
	private MultiCurrencyMoneyOpenApi withholdTaxChkAmt;

	public void setAgrAdjAmt(MultiCurrencyMoneyOpenApi agrAdjAmt) {
		this.agrAdjAmt = agrAdjAmt;
	}
	public MultiCurrencyMoneyOpenApi getAgrAdjAmt( ) {
		return this.agrAdjAmt;
	}

	public void setAgrAdjChkAmt(MultiCurrencyMoneyOpenApi agrAdjChkAmt) {
		this.agrAdjChkAmt = agrAdjChkAmt;
	}
	public MultiCurrencyMoneyOpenApi getAgrAdjChkAmt( ) {
		return this.agrAdjChkAmt;
	}

	public void setAnalysisDmsn1(String analysisDmsn1) {
		this.analysisDmsn1 = analysisDmsn1;
	}
	public String getAnalysisDmsn1( ) {
		return this.analysisDmsn1;
	}

	public void setAnalysisDmsn2(String analysisDmsn2) {
		this.analysisDmsn2 = analysisDmsn2;
	}
	public String getAnalysisDmsn2( ) {
		return this.analysisDmsn2;
	}

	public void setAnalysisDmsn3(String analysisDmsn3) {
		this.analysisDmsn3 = analysisDmsn3;
	}
	public String getAnalysisDmsn3( ) {
		return this.analysisDmsn3;
	}

	public void setAnalysisDmsn4(String analysisDmsn4) {
		this.analysisDmsn4 = analysisDmsn4;
	}
	public String getAnalysisDmsn4( ) {
		return this.analysisDmsn4;
	}

	public void setArNo(String arNo) {
		this.arNo = arNo;
	}
	public String getArNo( ) {
		return this.arNo;
	}

	public void setAuthInvoiceAmt(MultiCurrencyMoneyOpenApi authInvoiceAmt) {
		this.authInvoiceAmt = authInvoiceAmt;
	}
	public MultiCurrencyMoneyOpenApi getAuthInvoiceAmt( ) {
		return this.authInvoiceAmt;
	}

	public void setBillAmt(MultiCurrencyMoneyOpenApi billAmt) {
		this.billAmt = billAmt;
	}
	public MultiCurrencyMoneyOpenApi getBillAmt( ) {
		return this.billAmt;
	}

	public void setBillCheckStatus(String billCheckStatus) {
		this.billCheckStatus = billCheckStatus;
	}
	public String getBillCheckStatus( ) {
		return this.billCheckStatus;
	}

	public void setBillChkAmt(MultiCurrencyMoneyOpenApi billChkAmt) {
		this.billChkAmt = billChkAmt;
	}
	public MultiCurrencyMoneyOpenApi getBillChkAmt( ) {
		return this.billChkAmt;
	}

	public void setBillEndDate(String billEndDate) {
		this.billEndDate = billEndDate;
	}
	public String getBillEndDate( ) {
		return this.billEndDate;
	}

	public void setBillInvoiceLinkStatus(String billInvoiceLinkStatus) {
		this.billInvoiceLinkStatus = billInvoiceLinkStatus;
	}
	public String getBillInvoiceLinkStatus( ) {
		return this.billInvoiceLinkStatus;
	}

	public void setBillMonth(String billMonth) {
		this.billMonth = billMonth;
	}
	public String getBillMonth( ) {
		return this.billMonth;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setBillStartDate(String billStartDate) {
		this.billStartDate = billStartDate;
	}
	public String getBillStartDate( ) {
		return this.billStartDate;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setDtlAdjAmt(MultiCurrencyMoneyOpenApi dtlAdjAmt) {
		this.dtlAdjAmt = dtlAdjAmt;
	}
	public MultiCurrencyMoneyOpenApi getDtlAdjAmt( ) {
		return this.dtlAdjAmt;
	}

	public void setDtlAdjChkAmt(MultiCurrencyMoneyOpenApi dtlAdjChkAmt) {
		this.dtlAdjChkAmt = dtlAdjChkAmt;
	}
	public MultiCurrencyMoneyOpenApi getDtlAdjChkAmt( ) {
		return this.dtlAdjChkAmt;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndDate( ) {
		return this.endDate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public String getExchangeRate( ) {
		return this.exchangeRate;
	}

	public void setExnInf(String exnInf) {
		this.exnInf = exnInf;
	}
	public String getExnInf( ) {
		return this.exnInf;
	}

	public void setFbdPayAmt(MultiCurrencyMoneyOpenApi fbdPayAmt) {
		this.fbdPayAmt = fbdPayAmt;
	}
	public MultiCurrencyMoneyOpenApi getFbdPayAmt( ) {
		return this.fbdPayAmt;
	}

	public void setFbdPayChkAmt(MultiCurrencyMoneyOpenApi fbdPayChkAmt) {
		this.fbdPayChkAmt = fbdPayChkAmt;
	}
	public MultiCurrencyMoneyOpenApi getFbdPayChkAmt( ) {
		return this.fbdPayChkAmt;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstId( ) {
		return this.instId;
	}

	public void setIntransitAmt(MultiCurrencyMoneyOpenApi intransitAmt) {
		this.intransitAmt = intransitAmt;
	}
	public MultiCurrencyMoneyOpenApi getIntransitAmt( ) {
		return this.intransitAmt;
	}

	public void setInvoiceAmt(MultiCurrencyMoneyOpenApi invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}
	public MultiCurrencyMoneyOpenApi getInvoiceAmt( ) {
		return this.invoiceAmt;
	}

	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}
	public String getIpRoleId( ) {
		return this.ipRoleId;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMid( ) {
		return this.mid;
	}

	public void setNewCanInvoiceAmt(MultiCurrencyMoneyOpenApi newCanInvoiceAmt) {
		this.newCanInvoiceAmt = newCanInvoiceAmt;
	}
	public MultiCurrencyMoneyOpenApi getNewCanInvoiceAmt( ) {
		return this.newCanInvoiceAmt;
	}

	public void setPaidAmt(MultiCurrencyMoneyOpenApi paidAmt) {
		this.paidAmt = paidAmt;
	}
	public MultiCurrencyMoneyOpenApi getPaidAmt( ) {
		return this.paidAmt;
	}

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}
	public String getPayChannel( ) {
		return this.payChannel;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getPayStatus( ) {
		return this.payStatus;
	}

	public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}
	public String getPdCode( ) {
		return this.pdCode;
	}

	public void setPdName(String pdName) {
		this.pdName = pdName;
	}
	public String getPdName( ) {
		return this.pdName;
	}

	public void setPreWrtofAmt(MultiCurrencyMoneyOpenApi preWrtofAmt) {
		this.preWrtofAmt = preWrtofAmt;
	}
	public MultiCurrencyMoneyOpenApi getPreWrtofAmt( ) {
		return this.preWrtofAmt;
	}

	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}
	public String getPriceId( ) {
		return this.priceId;
	}

	public void setPricePolicyId(String pricePolicyId) {
		this.pricePolicyId = pricePolicyId;
	}
	public String getPricePolicyId( ) {
		return this.pricePolicyId;
	}

	public void setPricePolicyName(String pricePolicyName) {
		this.pricePolicyName = pricePolicyName;
	}
	public String getPricePolicyName( ) {
		return this.pricePolicyName;
	}

	public void setRealBillAmt(MultiCurrencyMoneyOpenApi realBillAmt) {
		this.realBillAmt = realBillAmt;
	}
	public MultiCurrencyMoneyOpenApi getRealBillAmt( ) {
		return this.realBillAmt;
	}

	public void setRealBillChkAmt(MultiCurrencyMoneyOpenApi realBillChkAmt) {
		this.realBillChkAmt = realBillChkAmt;
	}
	public MultiCurrencyMoneyOpenApi getRealBillChkAmt( ) {
		return this.realBillChkAmt;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}
	public String getSettleType( ) {
		return this.settleType;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate( ) {
		return this.startDate;
	}

	public void setTaxAmt(MultiCurrencyMoneyOpenApi taxAmt) {
		this.taxAmt = taxAmt;
	}
	public MultiCurrencyMoneyOpenApi getTaxAmt( ) {
		return this.taxAmt;
	}

	public void setTaxIncludedAmt(MultiCurrencyMoneyOpenApi taxIncludedAmt) {
		this.taxIncludedAmt = taxIncludedAmt;
	}
	public MultiCurrencyMoneyOpenApi getTaxIncludedAmt( ) {
		return this.taxIncludedAmt;
	}

	public void setWithholdTaxAmt(MultiCurrencyMoneyOpenApi withholdTaxAmt) {
		this.withholdTaxAmt = withholdTaxAmt;
	}
	public MultiCurrencyMoneyOpenApi getWithholdTaxAmt( ) {
		return this.withholdTaxAmt;
	}

	public void setWithholdTaxChkAmt(MultiCurrencyMoneyOpenApi withholdTaxChkAmt) {
		this.withholdTaxChkAmt = withholdTaxChkAmt;
	}
	public MultiCurrencyMoneyOpenApi getWithholdTaxChkAmt( ) {
		return this.withholdTaxChkAmt;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应付月账单客户视图
 *
 * @author auto create
 * @since 1.0, 2020-05-14 12:09:49
 */
public class ApMonthlyBillCustOpenApiResponse extends AlipayObject {

	private static final long serialVersionUID = 1189757696556727689L;

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
	 * 账单关联发票状态[01-未关联；02-部分关联；03-完全关联]
	 */
	@ApiField("bill_invoice_link_status")
	private String billInvoiceLinkStatus;

	/**
	 * 账单月份(yyyyMM)
	 */
	@ApiField("bill_month")
	private String billMonth;

	/**
	 * 月账单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 账单结束日期(yyyyMMdd)
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 止付金额
	 */
	@ApiField("fbd_pay_amt")
	private MultiCurrencyMoneyOpenApi fbdPayAmt;

	/**
	 * 止付类型（通常为空）{"01":"客户级别止付","02":"用户级别止付","03":"账单级别止付","04":"用户产品级别止付","05":"客户产品级别止付","99":"未止付"}
	 */
	@ApiField("fbd_pay_type")
	private String fbdPayType;

	/**
	 * 分支机构ID（OU标识）
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 关联发票金额
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * 签约对象PID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 结算对象名称
	 */
	@ApiField("ip_role_name")
	private String ipRoleName;

	/**
	 * 签约对象MID（非商户时为空）
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 税损扣除后月账单可关联发票金额，无发票类型时，默认为0
	 */
	@ApiField("new_can_invoice_amt")
	private MultiCurrencyMoneyOpenApi newCanInvoiceAmt;

	/**
	 * 已付金额
	 */
	@ApiField("paid_amt")
	private MultiCurrencyMoneyOpenApi paidAmt;

	/**
	 * 付款渠道：银行账号 、支付宝账号、国际银行卡
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 付款状态[01-待结算；02-部分结算；03-结算完成]
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
	 * 计价标识
	 */
	@ApiField("price_id")
	private String priceId;

	/**
	 * 价格名
	 */
	@ApiField("price_name")
	private String priceName;

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
	 * 客户可见账单金额 = 账单确认金额 + 汇总调整确认金额 + 明细调整确认金额
	 */
	@ApiField("real_bill_amt")
	private MultiCurrencyMoneyOpenApi realBillAmt;

	/**
	 * 结算类型，01-实时，02-后付，03-周期性
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

	public String getAnalysisDmsn1() {
		return this.analysisDmsn1;
	}
	public void setAnalysisDmsn1(String analysisDmsn1) {
		this.analysisDmsn1 = analysisDmsn1;
	}

	public String getAnalysisDmsn2() {
		return this.analysisDmsn2;
	}
	public void setAnalysisDmsn2(String analysisDmsn2) {
		this.analysisDmsn2 = analysisDmsn2;
	}

	public String getAnalysisDmsn3() {
		return this.analysisDmsn3;
	}
	public void setAnalysisDmsn3(String analysisDmsn3) {
		this.analysisDmsn3 = analysisDmsn3;
	}

	public String getAnalysisDmsn4() {
		return this.analysisDmsn4;
	}
	public void setAnalysisDmsn4(String analysisDmsn4) {
		this.analysisDmsn4 = analysisDmsn4;
	}

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public MultiCurrencyMoneyOpenApi getAuthInvoiceAmt() {
		return this.authInvoiceAmt;
	}
	public void setAuthInvoiceAmt(MultiCurrencyMoneyOpenApi authInvoiceAmt) {
		this.authInvoiceAmt = authInvoiceAmt;
	}

	public String getBillInvoiceLinkStatus() {
		return this.billInvoiceLinkStatus;
	}
	public void setBillInvoiceLinkStatus(String billInvoiceLinkStatus) {
		this.billInvoiceLinkStatus = billInvoiceLinkStatus;
	}

	public String getBillMonth() {
		return this.billMonth;
	}
	public void setBillMonth(String billMonth) {
		this.billMonth = billMonth;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public MultiCurrencyMoneyOpenApi getFbdPayAmt() {
		return this.fbdPayAmt;
	}
	public void setFbdPayAmt(MultiCurrencyMoneyOpenApi fbdPayAmt) {
		this.fbdPayAmt = fbdPayAmt;
	}

	public String getFbdPayType() {
		return this.fbdPayType;
	}
	public void setFbdPayType(String fbdPayType) {
		this.fbdPayType = fbdPayType;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public MultiCurrencyMoneyOpenApi getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(MultiCurrencyMoneyOpenApi invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getIpRoleName() {
		return this.ipRoleName;
	}
	public void setIpRoleName(String ipRoleName) {
		this.ipRoleName = ipRoleName;
	}

	public String getMid() {
		return this.mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}

	public MultiCurrencyMoneyOpenApi getNewCanInvoiceAmt() {
		return this.newCanInvoiceAmt;
	}
	public void setNewCanInvoiceAmt(MultiCurrencyMoneyOpenApi newCanInvoiceAmt) {
		this.newCanInvoiceAmt = newCanInvoiceAmt;
	}

	public MultiCurrencyMoneyOpenApi getPaidAmt() {
		return this.paidAmt;
	}
	public void setPaidAmt(MultiCurrencyMoneyOpenApi paidAmt) {
		this.paidAmt = paidAmt;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPdCode() {
		return this.pdCode;
	}
	public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}

	public String getPdName() {
		return this.pdName;
	}
	public void setPdName(String pdName) {
		this.pdName = pdName;
	}

	public String getPriceId() {
		return this.priceId;
	}
	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}

	public String getPriceName() {
		return this.priceName;
	}
	public void setPriceName(String priceName) {
		this.priceName = priceName;
	}

	public String getPricePolicyId() {
		return this.pricePolicyId;
	}
	public void setPricePolicyId(String pricePolicyId) {
		this.pricePolicyId = pricePolicyId;
	}

	public String getPricePolicyName() {
		return this.pricePolicyName;
	}
	public void setPricePolicyName(String pricePolicyName) {
		this.pricePolicyName = pricePolicyName;
	}

	public MultiCurrencyMoneyOpenApi getRealBillAmt() {
		return this.realBillAmt;
	}
	public void setRealBillAmt(MultiCurrencyMoneyOpenApi realBillAmt) {
		this.realBillAmt = realBillAmt;
	}

	public String getSettleType() {
		return this.settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public MultiCurrencyMoneyOpenApi getTaxAmt() {
		return this.taxAmt;
	}
	public void setTaxAmt(MultiCurrencyMoneyOpenApi taxAmt) {
		this.taxAmt = taxAmt;
	}

}

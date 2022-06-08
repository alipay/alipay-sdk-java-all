package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 对账单开放平台返回结果
 *
 * @author auto create
 * @since 1.0, 2019-09-05 20:06:43
 */
public class ArMonthlyStatementBillOpenApiResponse extends AlipayObject {

	private static final long serialVersionUID = 6332166719668792547L;

	/**
	 * 账单核算时区
	 */
	@ApiField("accounting_time_zone")
	private String accountingTimeZone;

	/**
	 * 应收日期(yyyyMMdd)
	 */
	@ApiField("accrued_date")
	private String accruedDate;

	/**
	 * 调整金额
	 */
	@ApiField("adjust_amt")
	private MultiCurrencyMoneyOpenApi adjustAmt;

	/**
	 * 业务扩展分析维度，来自于分析、汇总维度 k1=v1$k2=v2$k3=v3*
	 */
	@ApiField("analysis_dmsn")
	private String analysisDmsn;

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
	 * 申请中开票金额
	 */
	@ApiField("applying_invoice_amt")
	private MultiCurrencyMoneyOpenApi applyingInvoiceAmt;

	/**
	 * 合约号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 原始账单金额（对于月账单存在调整金额的情况，真实账单金额=原始账单金额+调整金额）
	 */
	@ApiField("bill_amt")
	private MultiCurrencyMoneyOpenApi billAmt;

	/**
	 * 账单结束日期
	 */
	@ApiField("bill_end_date")
	private String billEndDate;

	/**
	 * 账单月
	 */
	@ApiField("bill_month")
	private String billMonth;

	/**
	 * 账单编码
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单开始日期
	 */
	@ApiField("bill_start_date")
	private String billStartDate;

	/**
	 * 收费项编码
	 */
	@ApiField("charge_item_code")
	private String chargeItemCode;

	/**
	 * 计费类型，名称见charge_type_name
	 */
	@ApiField("charge_type")
	private String chargeType;

	/**
	 * 01:云在线计费
02:离线计费
03:老主站计收费
04:芝麻在线计收费
05:国际在线计收费
06:网商计费
07:应收收入计提
08:应收返点计提
09:国际离线计收费
10:线上生成账单
	 */
	@ApiField("charge_type_name")
	private String chargeTypeName;

	/**
	 * 对账状态
01 账单生成
02 待确认出账
03 已出账
04 客户已对账
05 对账差异
06 部分出账
	 */
	@ApiField("check_state")
	private String checkState;

	/**
	 * 计算依据
	 */
	@ApiField("clcn_basic_amt")
	private Long clcnBasicAmt;

	/**
	 * 01 交易金额
02 交易笔数
03 交易张数
04 资费依据扩展
05 其他
	 */
	@ApiField("clcn_basic_type")
	private String clcnBasicType;

	/**
	 * 01 交易金额
02 交易笔数
03 交易张数
04 资费依据扩展
05 其他
	 */
	@ApiField("clcn_basic_type_name")
	private String clcnBasicTypeName;

	/**
	 * 01 差额累进
02 全额累进
03 按传入金额收费
04 价格包量
05 包时间周期
06 按时间全额累进
07 包时间周期差额累进
08 期间差额累进
09 期间全额累进
10 包时间周期单笔
11 标准单笔计费
12 包时间周期单笔-按照传入金额计费
13 期间靠档差额累进
14 自定义
	 */
	@ApiField("clcn_method")
	private String clcnMethod;

	/**
	 * 01 差额累进
02 全额累进
03 按传入金额收费
04 价格包量
05 包时间周期
06 按时间全额累进
07 包时间周期差额累进
08 期间差额累进
09 期间全额累进
10 包时间周期单笔
11 标准单笔计费
12 包时间周期单笔-按照传入金额计费
13 期间靠档差额累进
14 自定义
	 */
	@ApiField("clcn_method_name")
	private String clcnMethodName;

	/**
	 * 调账金额
	 */
	@ApiField("detail_bill_adj_amt")
	private MultiCurrencyMoneyOpenApi detailBillAdjAmt;

	/**
	 * 调账原因
	 */
	@ApiField("detail_bill_adj_reason")
	private String detailBillAdjReason;

	/**
	 * 环境标识:租户ID
	 */
	@ApiField("env_source")
	private String envSource;

	/**
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 是否是关联交易
	 */
	@ApiField("inter_trade_flag")
	private String interTradeFlag;

	/**
	 * 可开票金额
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * 发票单据状态
01 未开票
02 部分开票
03 完全开票
04 线下开票
09 作废
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 已开票金额
	 */
	@ApiField("invoiced_amt")
	private MultiCurrencyMoneyOpenApi invoicedAmt;

	/**
	 * 结算对象参与者标识
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 结算对象参与者角色标识
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 已关联发票金额
	 */
	@ApiField("link_invoice_amt")
	private MultiCurrencyMoneyOpenApi linkInvoiceAmt;

	/**
	 * 记录未开票原因
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 元数据来源标识，包括(用户、商户、产品、合约、计费)来源
	 */
	@ApiField("metadata_source")
	private String metadataSource;

	/**
	 * 应收月账单号
	 */
	@ApiField("monthly_bill_no")
	private String monthlyBillNo;

	/**
	 * 已付金额1
	 */
	@ApiField("paid_amt")
	private MultiCurrencyMoneyOpenApi paidAmt;

	/**
	 * 是否存在往期扣款金额
	 */
	@ApiField("past_pay_flag")
	private Boolean pastPayFlag;

	/**
	 * 付款状态
01 待结算
02 部分结算
03 结算完
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 付款方式 1资金  5走量
	 */
	@ApiField("pay_way")
	private String payWay;

	/**
	 * 可付金额
	 */
	@ApiField("payable_amt")
	private MultiCurrencyMoneyOpenApi payableAmt;

	/**
	 * 可付标记
	 */
	@ApiField("payable_flag")
	private String payableFlag;

	/**
	 * 收款方账号
	 */
	@ApiField("payee_account")
	private String payeeAccount;

	/**
	 * 付款方银行账号
	 */
	@ApiField("payer_account_no")
	private String payerAccountNo;

	/**
	 * 扣款对象pid
	 */
	@ApiField("payer_ip_role_id")
	private String payerIpRoleId;

	/**
	 * 政策id
	 */
	@ApiField("price_policy_id")
	private String pricePolicyId;

	/**
	 * 产品码，金融云为商品ID
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品名称，金融云为空，需要自己查询
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 已收金额
	 */
	@ApiField("received_amt")
	private MultiCurrencyMoneyOpenApi receivedAmt;

	/**
	 * 关联的可开票单据列表
	 */
	@ApiListField("rel_rcpt_list")
	@ApiField("string")
	private List<String> relRcptList;

	/**
	 * 结算周期
01 年结
02 季结
03 月结
99 其它结算周期
	 */
	@ApiField("settle_period")
	private String settlePeriod;

	/**
	 * 账单结算时区
	 */
	@ApiField("settle_time_zone")
	private String settleTimeZone;

	/**
	 * 01 实时
02 预收
03 后收
04 周期结算
05 按日结算
09 延期结算
12 新周期结算
	 */
	@ApiField("settle_type")
	private String settleType;

	/**
	 * 签约对象参与者标识
	 */
	@ApiField("sign_ip_id")
	private String signIpId;

	/**
	 * 参与者名称,金融云需要自己查询
	 */
	@ApiField("sign_ip_id_name")
	private String signIpIdName;

	/**
	 * 签约对象参与者角色标识
	 */
	@ApiField("sign_ip_role_id")
	private String signIpRoleId;

	/**
	 * 税额
	 */
	@ApiField("tax_amt")
	private MultiCurrencyMoneyOpenApi taxAmt;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private Long taxRate;

	/**
	 * 02 营业税
01 增值税
00 无税
	 */
	@ApiField("tax_tp")
	private String taxTp;

	/**
	 * 租户标识
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 待核销明细数量
	 */
	@ApiField("to_writeoff_detail_count")
	private String toWriteoffDetailCount;

	/**
	 * 账单类型  1应收，2返点 ,4递延
	 */
	@ApiField("type")
	private String type;

	/**
	 * 账单类型  1应收，2返点，4递延
	 */
	@ApiField("type_name")
	private String typeName;

	/**
	 * 核销明细数量
	 */
	@ApiField("writeoff_detail_count")
	private String writeoffDetailCount;

	public String getAccountingTimeZone() {
		return this.accountingTimeZone;
	}
	public void setAccountingTimeZone(String accountingTimeZone) {
		this.accountingTimeZone = accountingTimeZone;
	}

	public String getAccruedDate() {
		return this.accruedDate;
	}
	public void setAccruedDate(String accruedDate) {
		this.accruedDate = accruedDate;
	}

	public MultiCurrencyMoneyOpenApi getAdjustAmt() {
		return this.adjustAmt;
	}
	public void setAdjustAmt(MultiCurrencyMoneyOpenApi adjustAmt) {
		this.adjustAmt = adjustAmt;
	}

	public String getAnalysisDmsn() {
		return this.analysisDmsn;
	}
	public void setAnalysisDmsn(String analysisDmsn) {
		this.analysisDmsn = analysisDmsn;
	}

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

	public MultiCurrencyMoneyOpenApi getApplyingInvoiceAmt() {
		return this.applyingInvoiceAmt;
	}
	public void setApplyingInvoiceAmt(MultiCurrencyMoneyOpenApi applyingInvoiceAmt) {
		this.applyingInvoiceAmt = applyingInvoiceAmt;
	}

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

	public MultiCurrencyMoneyOpenApi getBillAmt() {
		return this.billAmt;
	}
	public void setBillAmt(MultiCurrencyMoneyOpenApi billAmt) {
		this.billAmt = billAmt;
	}

	public String getBillEndDate() {
		return this.billEndDate;
	}
	public void setBillEndDate(String billEndDate) {
		this.billEndDate = billEndDate;
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

	public String getBillStartDate() {
		return this.billStartDate;
	}
	public void setBillStartDate(String billStartDate) {
		this.billStartDate = billStartDate;
	}

	public String getChargeItemCode() {
		return this.chargeItemCode;
	}
	public void setChargeItemCode(String chargeItemCode) {
		this.chargeItemCode = chargeItemCode;
	}

	public String getChargeType() {
		return this.chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getChargeTypeName() {
		return this.chargeTypeName;
	}
	public void setChargeTypeName(String chargeTypeName) {
		this.chargeTypeName = chargeTypeName;
	}

	public String getCheckState() {
		return this.checkState;
	}
	public void setCheckState(String checkState) {
		this.checkState = checkState;
	}

	public Long getClcnBasicAmt() {
		return this.clcnBasicAmt;
	}
	public void setClcnBasicAmt(Long clcnBasicAmt) {
		this.clcnBasicAmt = clcnBasicAmt;
	}

	public String getClcnBasicType() {
		return this.clcnBasicType;
	}
	public void setClcnBasicType(String clcnBasicType) {
		this.clcnBasicType = clcnBasicType;
	}

	public String getClcnBasicTypeName() {
		return this.clcnBasicTypeName;
	}
	public void setClcnBasicTypeName(String clcnBasicTypeName) {
		this.clcnBasicTypeName = clcnBasicTypeName;
	}

	public String getClcnMethod() {
		return this.clcnMethod;
	}
	public void setClcnMethod(String clcnMethod) {
		this.clcnMethod = clcnMethod;
	}

	public String getClcnMethodName() {
		return this.clcnMethodName;
	}
	public void setClcnMethodName(String clcnMethodName) {
		this.clcnMethodName = clcnMethodName;
	}

	public MultiCurrencyMoneyOpenApi getDetailBillAdjAmt() {
		return this.detailBillAdjAmt;
	}
	public void setDetailBillAdjAmt(MultiCurrencyMoneyOpenApi detailBillAdjAmt) {
		this.detailBillAdjAmt = detailBillAdjAmt;
	}

	public String getDetailBillAdjReason() {
		return this.detailBillAdjReason;
	}
	public void setDetailBillAdjReason(String detailBillAdjReason) {
		this.detailBillAdjReason = detailBillAdjReason;
	}

	public String getEnvSource() {
		return this.envSource;
	}
	public void setEnvSource(String envSource) {
		this.envSource = envSource;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInterTradeFlag() {
		return this.interTradeFlag;
	}
	public void setInterTradeFlag(String interTradeFlag) {
		this.interTradeFlag = interTradeFlag;
	}

	public MultiCurrencyMoneyOpenApi getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(MultiCurrencyMoneyOpenApi invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public MultiCurrencyMoneyOpenApi getInvoicedAmt() {
		return this.invoicedAmt;
	}
	public void setInvoicedAmt(MultiCurrencyMoneyOpenApi invoicedAmt) {
		this.invoicedAmt = invoicedAmt;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public MultiCurrencyMoneyOpenApi getLinkInvoiceAmt() {
		return this.linkInvoiceAmt;
	}
	public void setLinkInvoiceAmt(MultiCurrencyMoneyOpenApi linkInvoiceAmt) {
		this.linkInvoiceAmt = linkInvoiceAmt;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMetadataSource() {
		return this.metadataSource;
	}
	public void setMetadataSource(String metadataSource) {
		this.metadataSource = metadataSource;
	}

	public String getMonthlyBillNo() {
		return this.monthlyBillNo;
	}
	public void setMonthlyBillNo(String monthlyBillNo) {
		this.monthlyBillNo = monthlyBillNo;
	}

	public MultiCurrencyMoneyOpenApi getPaidAmt() {
		return this.paidAmt;
	}
	public void setPaidAmt(MultiCurrencyMoneyOpenApi paidAmt) {
		this.paidAmt = paidAmt;
	}

	public Boolean getPastPayFlag() {
		return this.pastPayFlag;
	}
	public void setPastPayFlag(Boolean pastPayFlag) {
		this.pastPayFlag = pastPayFlag;
	}

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPayWay() {
		return this.payWay;
	}
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public MultiCurrencyMoneyOpenApi getPayableAmt() {
		return this.payableAmt;
	}
	public void setPayableAmt(MultiCurrencyMoneyOpenApi payableAmt) {
		this.payableAmt = payableAmt;
	}

	public String getPayableFlag() {
		return this.payableFlag;
	}
	public void setPayableFlag(String payableFlag) {
		this.payableFlag = payableFlag;
	}

	public String getPayeeAccount() {
		return this.payeeAccount;
	}
	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public String getPayerAccountNo() {
		return this.payerAccountNo;
	}
	public void setPayerAccountNo(String payerAccountNo) {
		this.payerAccountNo = payerAccountNo;
	}

	public String getPayerIpRoleId() {
		return this.payerIpRoleId;
	}
	public void setPayerIpRoleId(String payerIpRoleId) {
		this.payerIpRoleId = payerIpRoleId;
	}

	public String getPricePolicyId() {
		return this.pricePolicyId;
	}
	public void setPricePolicyId(String pricePolicyId) {
		this.pricePolicyId = pricePolicyId;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public MultiCurrencyMoneyOpenApi getReceivedAmt() {
		return this.receivedAmt;
	}
	public void setReceivedAmt(MultiCurrencyMoneyOpenApi receivedAmt) {
		this.receivedAmt = receivedAmt;
	}

	public List<String> getRelRcptList() {
		return this.relRcptList;
	}
	public void setRelRcptList(List<String> relRcptList) {
		this.relRcptList = relRcptList;
	}

	public String getSettlePeriod() {
		return this.settlePeriod;
	}
	public void setSettlePeriod(String settlePeriod) {
		this.settlePeriod = settlePeriod;
	}

	public String getSettleTimeZone() {
		return this.settleTimeZone;
	}
	public void setSettleTimeZone(String settleTimeZone) {
		this.settleTimeZone = settleTimeZone;
	}

	public String getSettleType() {
		return this.settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public String getSignIpId() {
		return this.signIpId;
	}
	public void setSignIpId(String signIpId) {
		this.signIpId = signIpId;
	}

	public String getSignIpIdName() {
		return this.signIpIdName;
	}
	public void setSignIpIdName(String signIpIdName) {
		this.signIpIdName = signIpIdName;
	}

	public String getSignIpRoleId() {
		return this.signIpRoleId;
	}
	public void setSignIpRoleId(String signIpRoleId) {
		this.signIpRoleId = signIpRoleId;
	}

	public MultiCurrencyMoneyOpenApi getTaxAmt() {
		return this.taxAmt;
	}
	public void setTaxAmt(MultiCurrencyMoneyOpenApi taxAmt) {
		this.taxAmt = taxAmt;
	}

	public Long getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(Long taxRate) {
		this.taxRate = taxRate;
	}

	public String getTaxTp() {
		return this.taxTp;
	}
	public void setTaxTp(String taxTp) {
		this.taxTp = taxTp;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getToWriteoffDetailCount() {
		return this.toWriteoffDetailCount;
	}
	public void setToWriteoffDetailCount(String toWriteoffDetailCount) {
		this.toWriteoffDetailCount = toWriteoffDetailCount;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getTypeName() {
		return this.typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getWriteoffDetailCount() {
		return this.writeoffDetailCount;
	}
	public void setWriteoffDetailCount(String writeoffDetailCount) {
		this.writeoffDetailCount = writeoffDetailCount;
	}

}

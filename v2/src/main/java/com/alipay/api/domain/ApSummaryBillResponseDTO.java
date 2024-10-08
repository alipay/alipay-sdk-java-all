package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AP账单查询结果DTO
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:28:46
 */
public class ApSummaryBillResponseDTO extends AlipayObject {

	private static final long serialVersionUID = 6819324987666133215L;

	/**
	 * 调账金额
	 */
	@ApiField("adjust_amount")
	private MultiCurrencyMoneyOpenApi adjustAmount;

	/**
	 * 合约号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 自动确认日期
	 */
	@ApiField("auto_confirm_date")
	private String autoConfirmDate;

	/**
	 * 账单金额
	 */
	@ApiField("bill_amount")
	private MultiCurrencyMoneyOpenApi billAmount;

	/**
	 * 账单结束日期
	 */
	@ApiField("bill_end_date")
	private String billEndDate;

	/**
	 * 账单月份
	 */
	@ApiField("bill_month")
	private String billMonth;

	/**
	 * 账单编码
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单起始日期
	 */
	@ApiField("bill_start_date")
	private String billStartDate;

	/**
	 * 账单状态
	 */
	@ApiField("bill_status")
	private String billStatus;

	/**
	 * 账单状态
	 */
	@ApiField("bill_status_name")
	private String billStatusName;

	/**
	 * 业务模块
	 */
	@ApiField("biz_module")
	private String bizModule;

	/**
	 * 业财产品码
	 */
	@ApiField("biz_pd_code")
	private String bizPdCode;

	/**
	 * 币种
	 */
	@ApiField("ccy")
	private String ccy;

	/**
	 * 币种
	 */
	@ApiField("ccy_code")
	private String ccyCode;

	/**
	 * 收费项编码
	 */
	@ApiField("charge_item_code")
	private String chargeItemCode;

	/**
	 * 出账周期
	 */
	@ApiField("charge_off_period")
	private String chargeOffPeriod;

	/**
	 * 出账周期类型
	 */
	@ApiField("charge_off_period_type")
	private String chargeOffPeriodType;

	/**
	 * 出账周期类型name
	 */
	@ApiField("charge_off_period_type_name")
	private String chargeOffPeriodTypeName;

	/**
	 * 出账日期
	 */
	@ApiField("check_date")
	private String checkDate;

	/**
	 * 计费服务量
	 */
	@ApiField("clcn_basic_amount")
	private String clcnBasicAmount;

	/**
	 * 计费服务类型
	 */
	@ApiField("clcn_basic_type")
	private String clcnBasicType;

	/**
	 * 计费服务类型
	 */
	@ApiField("clcn_basic_type_name")
	private String clcnBasicTypeName;

	/**
	 * 已确认金额
	 */
	@ApiField("confirmed_amount")
	private MultiCurrencyMoneyOpenApi confirmedAmount;

	/**
	 * 不含税金额
	 */
	@ApiField("exclude_tax_amount")
	private MultiCurrencyMoneyOpenApi excludeTaxAmount;

	/**
	 * 结算时点
	 */
	@ApiField("fund_settle_time")
	private String fundSettleTime;

	/**
	 * 关联方标志
	 */
	@ApiField("inner_trade_flag")
	private String innerTradeFlag;

	/**
	 * 结算机构ou
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 关联发票状态
	 */
	@ApiField("invoice_status_desc")
	private String invoiceStatusDesc;

	/**
	 * 已收票金额
	 */
	@ApiField("invoiced_amount")
	private MultiCurrencyMoneyOpenApi invoicedAmount;

	/**
	 * 已回票金额 （结算单关联的发票金额）
	 */
	@ApiField("invoiced_amt")
	private MultiCurrencyMoneyOpenApi invoicedAmt;

	/**
	 * 收款方账号扩展信息
	 */
	@ApiField("payee_account_ext_info")
	private MapTypeParam payeeAccountExtInfo;

	/**
	 * 收款方账号
	 */
	@ApiField("payee_account_no")
	private String payeeAccountNo;

	/**
	 * 收款方账号类型
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/**
	 * 收款方账号类型 name
	 */
	@ApiField("payee_account_type_name")
	private String payeeAccountTypeName;

	/**
	 * 收款对象pid
	 */
	@ApiField("payee_ip_role_id")
	private String payeeIpRoleId;

	/**
	 * 收款对象pid来源
	 */
	@ApiField("payee_ip_role_id_source")
	private String payeeIpRoleIdSource;

	/**
	 * 付款方账号扩展信息
	 */
	@ApiField("payer_account_ext_info")
	private MapTypeParam payerAccountExtInfo;

	/**
	 * 付款账号
	 */
	@ApiField("payer_account_no")
	private String payerAccountNo;

	/**
	 * 付款方账号类型
	 */
	@ApiField("payer_account_type")
	private String payerAccountType;

	/**
	 * 付款方账号类型名字
	 */
	@ApiField("payer_account_type_name")
	private String payerAccountTypeName;

	/**
	 * 付款对象pid
	 */
	@ApiField("payer_ip_role_id")
	private String payerIpRoleId;

	/**
	 * 付款对象pid来源
	 */
	@ApiField("payer_ip_role_id_source")
	private String payerIpRoleIdSource;

	/**
	 * 真实账单金额 = 账单金额 + 调账金额
	 */
	@ApiField("real_bill_amount")
	private MultiCurrencyMoneyOpenApi realBillAmount;

	/**
	 * 对账状态
	 */
	@ApiField("reconciliation_status")
	private String reconciliationStatus;

	/**
	 * 对账状态
	 */
	@ApiField("reconciliation_status_name")
	private String reconciliationStatusName;

	/**
	 * 销售产品码
	 */
	@ApiField("sales_product_code")
	private String salesProductCode;

	/**
	 * 销售产品名称
	 */
	@ApiField("sales_product_name")
	private String salesProductName;

	/**
	 * 结算业务类型
	 */
	@ApiField("settle_biz_type")
	private String settleBizType;

	/**
	 * 结算业务类型name
	 */
	@ApiField("settle_biz_type_name")
	private String settleBizTypeName;

	/**
	 * 结算对象pid
	 */
	@ApiField("settle_ip_role_id")
	private String settleIpRoleId;

	/**
	 * 结算对象pid来源
	 */
	@ApiField("settle_ip_role_id_source")
	private String settleIpRoleIdSource;

	/**
	 * 结算对象
	 */
	@ApiField("settle_ip_role_name")
	private String settleIpRoleName;

	/**
	 * 结算对象mid
	 */
	@ApiField("settle_merchant_id")
	private String settleMerchantId;

	/**
	 * 结算对象mid来源
	 */
	@ApiField("settle_merchant_id_source")
	private String settleMerchantIdSource;

	/**
	 * 结算对象mid名称
	 */
	@ApiField("settle_merchant_name")
	private String settleMerchantName;

	/**
	 * 结算状态
	 */
	@ApiField("settle_status")
	private String settleStatus;

	/**
	 * 结算状态
	 */
	@ApiField("settle_status_name")
	private String settleStatusName;

	/**
	 * 结算时点类型
	 */
	@ApiField("settle_time_type")
	private String settleTimeType;

	/**
	 * 结算时点类型name
	 */
	@ApiField("settle_time_type_name")
	private String settleTimeTypeName;

	/**
	 * 已结算金额
	 */
	@ApiField("settled_amount")
	private MultiCurrencyMoneyOpenApi settledAmount;

	/**
	 * 签约对象pid
	 */
	@ApiField("sign_ip_role_id")
	private String signIpRoleId;

	/**
	 * 签约对象pid来源
	 */
	@ApiField("sign_ip_role_id_source")
	private String signIpRoleIdSource;

	/**
	 * 签约对象mid
	 */
	@ApiField("sign_merchant_id")
	private String signMerchantId;

	/**
	 * 结算对象mid来源
	 */
	@ApiField("sign_merchant_id_source")
	private String signMerchantIdSource;

	/**
	 * 分析维度
	 */
	@ApiField("summary_dmsn_1")
	private String summaryDmsn1;

	/**
	 * 1
	 */
	@ApiField("summary_dmsn_2")
	private String summaryDmsn2;

	/**
	 * 3
	 */
	@ApiField("summary_dmsn_3")
	private String summaryDmsn3;

	/**
	 * 1
	 */
	@ApiField("summary_dmsn_4")
	private String summaryDmsn4;

	/**
	 * 1
	 */
	@ApiField("summary_dmsn_5")
	private String summaryDmsn5;

	/**
	 * 1
	 */
	@ApiField("summary_dmsn_6")
	private String summaryDmsn6;

	/**
	 * 1
	 */
	@ApiField("summary_dmsn_7")
	private String summaryDmsn7;

	/**
	 * 汇总维度值
	 */
	@ApiField("summary_dmsn_value")
	private String summaryDmsnValue;

	/**
	 * 税额
	 */
	@ApiField("tax_amount")
	private MultiCurrencyMoneyOpenApi taxAmount;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 税种
	 */
	@ApiField("tax_type")
	private String taxType;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 未确认金额
	 */
	@ApiField("un_confirmed_amount")
	private MultiCurrencyMoneyOpenApi unConfirmedAmount;

	/**
	 * 未回票金额 = (结算单==null ? 账单确认金额 ： 结算单可收票金额)-已回票金额
	 */
	@ApiField("un_invoice_amt")
	private MultiCurrencyMoneyOpenApi unInvoiceAmt;

	/**
	 * 未结算金额= 账单确认金额-已结算金额
	 */
	@ApiField("un_settled_amount")
	private MultiCurrencyMoneyOpenApi unSettledAmount;

	/**
	 * 数据版本标记
	 */
	@ApiField("version_flag")
	private String versionFlag;

	public MultiCurrencyMoneyOpenApi getAdjustAmount() {
		return this.adjustAmount;
	}
	public void setAdjustAmount(MultiCurrencyMoneyOpenApi adjustAmount) {
		this.adjustAmount = adjustAmount;
	}

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

	public String getAutoConfirmDate() {
		return this.autoConfirmDate;
	}
	public void setAutoConfirmDate(String autoConfirmDate) {
		this.autoConfirmDate = autoConfirmDate;
	}

	public MultiCurrencyMoneyOpenApi getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(MultiCurrencyMoneyOpenApi billAmount) {
		this.billAmount = billAmount;
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

	public String getBillStatus() {
		return this.billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getBillStatusName() {
		return this.billStatusName;
	}
	public void setBillStatusName(String billStatusName) {
		this.billStatusName = billStatusName;
	}

	public String getBizModule() {
		return this.bizModule;
	}
	public void setBizModule(String bizModule) {
		this.bizModule = bizModule;
	}

	public String getBizPdCode() {
		return this.bizPdCode;
	}
	public void setBizPdCode(String bizPdCode) {
		this.bizPdCode = bizPdCode;
	}

	public String getCcy() {
		return this.ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getCcyCode() {
		return this.ccyCode;
	}
	public void setCcyCode(String ccyCode) {
		this.ccyCode = ccyCode;
	}

	public String getChargeItemCode() {
		return this.chargeItemCode;
	}
	public void setChargeItemCode(String chargeItemCode) {
		this.chargeItemCode = chargeItemCode;
	}

	public String getChargeOffPeriod() {
		return this.chargeOffPeriod;
	}
	public void setChargeOffPeriod(String chargeOffPeriod) {
		this.chargeOffPeriod = chargeOffPeriod;
	}

	public String getChargeOffPeriodType() {
		return this.chargeOffPeriodType;
	}
	public void setChargeOffPeriodType(String chargeOffPeriodType) {
		this.chargeOffPeriodType = chargeOffPeriodType;
	}

	public String getChargeOffPeriodTypeName() {
		return this.chargeOffPeriodTypeName;
	}
	public void setChargeOffPeriodTypeName(String chargeOffPeriodTypeName) {
		this.chargeOffPeriodTypeName = chargeOffPeriodTypeName;
	}

	public String getCheckDate() {
		return this.checkDate;
	}
	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}

	public String getClcnBasicAmount() {
		return this.clcnBasicAmount;
	}
	public void setClcnBasicAmount(String clcnBasicAmount) {
		this.clcnBasicAmount = clcnBasicAmount;
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

	public MultiCurrencyMoneyOpenApi getConfirmedAmount() {
		return this.confirmedAmount;
	}
	public void setConfirmedAmount(MultiCurrencyMoneyOpenApi confirmedAmount) {
		this.confirmedAmount = confirmedAmount;
	}

	public MultiCurrencyMoneyOpenApi getExcludeTaxAmount() {
		return this.excludeTaxAmount;
	}
	public void setExcludeTaxAmount(MultiCurrencyMoneyOpenApi excludeTaxAmount) {
		this.excludeTaxAmount = excludeTaxAmount;
	}

	public String getFundSettleTime() {
		return this.fundSettleTime;
	}
	public void setFundSettleTime(String fundSettleTime) {
		this.fundSettleTime = fundSettleTime;
	}

	public String getInnerTradeFlag() {
		return this.innerTradeFlag;
	}
	public void setInnerTradeFlag(String innerTradeFlag) {
		this.innerTradeFlag = innerTradeFlag;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInvoiceStatusDesc() {
		return this.invoiceStatusDesc;
	}
	public void setInvoiceStatusDesc(String invoiceStatusDesc) {
		this.invoiceStatusDesc = invoiceStatusDesc;
	}

	public MultiCurrencyMoneyOpenApi getInvoicedAmount() {
		return this.invoicedAmount;
	}
	public void setInvoicedAmount(MultiCurrencyMoneyOpenApi invoicedAmount) {
		this.invoicedAmount = invoicedAmount;
	}

	public MultiCurrencyMoneyOpenApi getInvoicedAmt() {
		return this.invoicedAmt;
	}
	public void setInvoicedAmt(MultiCurrencyMoneyOpenApi invoicedAmt) {
		this.invoicedAmt = invoicedAmt;
	}

	public MapTypeParam getPayeeAccountExtInfo() {
		return this.payeeAccountExtInfo;
	}
	public void setPayeeAccountExtInfo(MapTypeParam payeeAccountExtInfo) {
		this.payeeAccountExtInfo = payeeAccountExtInfo;
	}

	public String getPayeeAccountNo() {
		return this.payeeAccountNo;
	}
	public void setPayeeAccountNo(String payeeAccountNo) {
		this.payeeAccountNo = payeeAccountNo;
	}

	public String getPayeeAccountType() {
		return this.payeeAccountType;
	}
	public void setPayeeAccountType(String payeeAccountType) {
		this.payeeAccountType = payeeAccountType;
	}

	public String getPayeeAccountTypeName() {
		return this.payeeAccountTypeName;
	}
	public void setPayeeAccountTypeName(String payeeAccountTypeName) {
		this.payeeAccountTypeName = payeeAccountTypeName;
	}

	public String getPayeeIpRoleId() {
		return this.payeeIpRoleId;
	}
	public void setPayeeIpRoleId(String payeeIpRoleId) {
		this.payeeIpRoleId = payeeIpRoleId;
	}

	public String getPayeeIpRoleIdSource() {
		return this.payeeIpRoleIdSource;
	}
	public void setPayeeIpRoleIdSource(String payeeIpRoleIdSource) {
		this.payeeIpRoleIdSource = payeeIpRoleIdSource;
	}

	public MapTypeParam getPayerAccountExtInfo() {
		return this.payerAccountExtInfo;
	}
	public void setPayerAccountExtInfo(MapTypeParam payerAccountExtInfo) {
		this.payerAccountExtInfo = payerAccountExtInfo;
	}

	public String getPayerAccountNo() {
		return this.payerAccountNo;
	}
	public void setPayerAccountNo(String payerAccountNo) {
		this.payerAccountNo = payerAccountNo;
	}

	public String getPayerAccountType() {
		return this.payerAccountType;
	}
	public void setPayerAccountType(String payerAccountType) {
		this.payerAccountType = payerAccountType;
	}

	public String getPayerAccountTypeName() {
		return this.payerAccountTypeName;
	}
	public void setPayerAccountTypeName(String payerAccountTypeName) {
		this.payerAccountTypeName = payerAccountTypeName;
	}

	public String getPayerIpRoleId() {
		return this.payerIpRoleId;
	}
	public void setPayerIpRoleId(String payerIpRoleId) {
		this.payerIpRoleId = payerIpRoleId;
	}

	public String getPayerIpRoleIdSource() {
		return this.payerIpRoleIdSource;
	}
	public void setPayerIpRoleIdSource(String payerIpRoleIdSource) {
		this.payerIpRoleIdSource = payerIpRoleIdSource;
	}

	public MultiCurrencyMoneyOpenApi getRealBillAmount() {
		return this.realBillAmount;
	}
	public void setRealBillAmount(MultiCurrencyMoneyOpenApi realBillAmount) {
		this.realBillAmount = realBillAmount;
	}

	public String getReconciliationStatus() {
		return this.reconciliationStatus;
	}
	public void setReconciliationStatus(String reconciliationStatus) {
		this.reconciliationStatus = reconciliationStatus;
	}

	public String getReconciliationStatusName() {
		return this.reconciliationStatusName;
	}
	public void setReconciliationStatusName(String reconciliationStatusName) {
		this.reconciliationStatusName = reconciliationStatusName;
	}

	public String getSalesProductCode() {
		return this.salesProductCode;
	}
	public void setSalesProductCode(String salesProductCode) {
		this.salesProductCode = salesProductCode;
	}

	public String getSalesProductName() {
		return this.salesProductName;
	}
	public void setSalesProductName(String salesProductName) {
		this.salesProductName = salesProductName;
	}

	public String getSettleBizType() {
		return this.settleBizType;
	}
	public void setSettleBizType(String settleBizType) {
		this.settleBizType = settleBizType;
	}

	public String getSettleBizTypeName() {
		return this.settleBizTypeName;
	}
	public void setSettleBizTypeName(String settleBizTypeName) {
		this.settleBizTypeName = settleBizTypeName;
	}

	public String getSettleIpRoleId() {
		return this.settleIpRoleId;
	}
	public void setSettleIpRoleId(String settleIpRoleId) {
		this.settleIpRoleId = settleIpRoleId;
	}

	public String getSettleIpRoleIdSource() {
		return this.settleIpRoleIdSource;
	}
	public void setSettleIpRoleIdSource(String settleIpRoleIdSource) {
		this.settleIpRoleIdSource = settleIpRoleIdSource;
	}

	public String getSettleIpRoleName() {
		return this.settleIpRoleName;
	}
	public void setSettleIpRoleName(String settleIpRoleName) {
		this.settleIpRoleName = settleIpRoleName;
	}

	public String getSettleMerchantId() {
		return this.settleMerchantId;
	}
	public void setSettleMerchantId(String settleMerchantId) {
		this.settleMerchantId = settleMerchantId;
	}

	public String getSettleMerchantIdSource() {
		return this.settleMerchantIdSource;
	}
	public void setSettleMerchantIdSource(String settleMerchantIdSource) {
		this.settleMerchantIdSource = settleMerchantIdSource;
	}

	public String getSettleMerchantName() {
		return this.settleMerchantName;
	}
	public void setSettleMerchantName(String settleMerchantName) {
		this.settleMerchantName = settleMerchantName;
	}

	public String getSettleStatus() {
		return this.settleStatus;
	}
	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

	public String getSettleStatusName() {
		return this.settleStatusName;
	}
	public void setSettleStatusName(String settleStatusName) {
		this.settleStatusName = settleStatusName;
	}

	public String getSettleTimeType() {
		return this.settleTimeType;
	}
	public void setSettleTimeType(String settleTimeType) {
		this.settleTimeType = settleTimeType;
	}

	public String getSettleTimeTypeName() {
		return this.settleTimeTypeName;
	}
	public void setSettleTimeTypeName(String settleTimeTypeName) {
		this.settleTimeTypeName = settleTimeTypeName;
	}

	public MultiCurrencyMoneyOpenApi getSettledAmount() {
		return this.settledAmount;
	}
	public void setSettledAmount(MultiCurrencyMoneyOpenApi settledAmount) {
		this.settledAmount = settledAmount;
	}

	public String getSignIpRoleId() {
		return this.signIpRoleId;
	}
	public void setSignIpRoleId(String signIpRoleId) {
		this.signIpRoleId = signIpRoleId;
	}

	public String getSignIpRoleIdSource() {
		return this.signIpRoleIdSource;
	}
	public void setSignIpRoleIdSource(String signIpRoleIdSource) {
		this.signIpRoleIdSource = signIpRoleIdSource;
	}

	public String getSignMerchantId() {
		return this.signMerchantId;
	}
	public void setSignMerchantId(String signMerchantId) {
		this.signMerchantId = signMerchantId;
	}

	public String getSignMerchantIdSource() {
		return this.signMerchantIdSource;
	}
	public void setSignMerchantIdSource(String signMerchantIdSource) {
		this.signMerchantIdSource = signMerchantIdSource;
	}

	public String getSummaryDmsn1() {
		return this.summaryDmsn1;
	}
	public void setSummaryDmsn1(String summaryDmsn1) {
		this.summaryDmsn1 = summaryDmsn1;
	}

	public String getSummaryDmsn2() {
		return this.summaryDmsn2;
	}
	public void setSummaryDmsn2(String summaryDmsn2) {
		this.summaryDmsn2 = summaryDmsn2;
	}

	public String getSummaryDmsn3() {
		return this.summaryDmsn3;
	}
	public void setSummaryDmsn3(String summaryDmsn3) {
		this.summaryDmsn3 = summaryDmsn3;
	}

	public String getSummaryDmsn4() {
		return this.summaryDmsn4;
	}
	public void setSummaryDmsn4(String summaryDmsn4) {
		this.summaryDmsn4 = summaryDmsn4;
	}

	public String getSummaryDmsn5() {
		return this.summaryDmsn5;
	}
	public void setSummaryDmsn5(String summaryDmsn5) {
		this.summaryDmsn5 = summaryDmsn5;
	}

	public String getSummaryDmsn6() {
		return this.summaryDmsn6;
	}
	public void setSummaryDmsn6(String summaryDmsn6) {
		this.summaryDmsn6 = summaryDmsn6;
	}

	public String getSummaryDmsn7() {
		return this.summaryDmsn7;
	}
	public void setSummaryDmsn7(String summaryDmsn7) {
		this.summaryDmsn7 = summaryDmsn7;
	}

	public String getSummaryDmsnValue() {
		return this.summaryDmsnValue;
	}
	public void setSummaryDmsnValue(String summaryDmsnValue) {
		this.summaryDmsnValue = summaryDmsnValue;
	}

	public MultiCurrencyMoneyOpenApi getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(MultiCurrencyMoneyOpenApi taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTaxType() {
		return this.taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public MultiCurrencyMoneyOpenApi getUnConfirmedAmount() {
		return this.unConfirmedAmount;
	}
	public void setUnConfirmedAmount(MultiCurrencyMoneyOpenApi unConfirmedAmount) {
		this.unConfirmedAmount = unConfirmedAmount;
	}

	public MultiCurrencyMoneyOpenApi getUnInvoiceAmt() {
		return this.unInvoiceAmt;
	}
	public void setUnInvoiceAmt(MultiCurrencyMoneyOpenApi unInvoiceAmt) {
		this.unInvoiceAmt = unInvoiceAmt;
	}

	public MultiCurrencyMoneyOpenApi getUnSettledAmount() {
		return this.unSettledAmount;
	}
	public void setUnSettledAmount(MultiCurrencyMoneyOpenApi unSettledAmount) {
		this.unSettledAmount = unSettledAmount;
	}

	public String getVersionFlag() {
		return this.versionFlag;
	}
	public void setVersionFlag(String versionFlag) {
		this.versionFlag = versionFlag;
	}

}

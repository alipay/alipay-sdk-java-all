package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收入月账单
 *
 * @author auto create
 * @since 1.0, 2018-11-23 19:34:35
 */
public class ArMonthlyBillDTO extends AlipayObject {

	private static final long serialVersionUID = 1274817198616197298L;

	/**
	 * 出账日
	 */
	@ApiField("account_day")
	private String accountDay;

	/**
	 * 应收日期(yyyyMMdd)
	 */
	@ApiField("accrued_date")
	private String accruedDate;

	/**
	 * 调账金额
	 */
	@ApiField("adjust_amt")
	private MultiCurrencyMoneyOpenApi adjustAmt;

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
	 * 合约号，商户签约产品对应的合约号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 账单金额（原始账单金额，对于月账单存在调整金额的情况，真实账单金额=原始账单金额+调整金额）
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
	 * 月账单号,唯一标识月账单的ID
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单开始日期
	 */
	@ApiField("bill_start_date")
	private String billStartDate;

	/**
	 * 账单类型
21：应收月账单
目前仅支持该类型的账单类型
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 收费项编码
	 */
	@ApiField("charge_item_code")
	private String chargeItemCode;

	/**
	 * 计费类型
01：云在线计费，02：离线计费，03：老主站计收费，04：芝麻在线计收费
	 */
	@ApiField("charge_type")
	private String chargeType;

	/**
	 * 出账状态
01：账单生成，02：待确认出账，03：已出账，04：客户已对账，05：对账差异，06：部分出账
	 */
	@ApiField("check_status")
	private String checkStatus;

	/**
	 * 已出账金额
	 */
	@ApiField("checked_amt")
	private MultiCurrencyMoneyOpenApi checkedAmt;

	/**
	 * 出账中金额
	 */
	@ApiField("checking_amt")
	private MultiCurrencyMoneyOpenApi checkingAmt;

	/**
	 * 计算依据
	 */
	@ApiField("clcn_basic_amt")
	private Long clcnBasicAmt;

	/**
	 * 计算依据类型
01：交易金额，02：交易笔数，03：交易张数，04：资费依据扩展，05：其他
	 */
	@ApiField("clcn_basic_type")
	private String clcnBasicType;

	/**
	 * 计算方法
01：差额累进，02：全额累进，03：按传入金额收费，04：价格包量，05：包时间周期，06：按时间全额累进，07：包时间周期差额累进，08：期间差额累进，09：期间全额累进，10：包时间周期单笔，11：标准单笔计费，12：包时间周期单笔-按照传入金额计费，13：期间靠档差额累进，靠档计息使用，14：自定义
	 */
	@ApiField("clcn_method")
	private String clcnMethod;

	/**
	 * 冻结金额
	 */
	@ApiField("freeze_amt")
	private MultiCurrencyMoneyOpenApi freezeAmt;

	/**
	 * 创建时间（创建备份时需要）
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间（创建备份时需要）
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 付款时间
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/**
	 * 分支机构号
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 可开票金额
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

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
	 * 参与者名字
	 */
	@ApiField("ip_name")
	private String ipName;

	/**
	 * 结算对象参与者角色标识
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 最后修改人
	 */
	@ApiField("last_moder")
	private String lastModer;

	/**
	 * 已关联发票金额
	 */
	@ApiField("link_invoice_amt")
	private MultiCurrencyMoneyOpenApi linkInvoiceAmt;

	/**
	 * 付款来源
1：主账务，2：包量，3：预收，4：预存，5：银行，6：积分，7：统一支付，8：支付受理
	 */
	@ApiField("pay_original")
	private String payOriginal;

	/**
	 * 付款状态
01：待结算；02：部分结算；03：结算完成
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 付款方式
1：资金；2：包量
	 */
	@ApiField("pay_way")
	private String payWay;

	/**
	 * 收款方账号
	 */
	@ApiField("payee_account")
	private String payeeAccount;

	/**
	 * 付款方账号
	 */
	@ApiField("payer_account")
	private String payerAccount;

	/**
	 * 扣款对象pid
	 */
	@ApiField("payer_ip_role_id")
	private String payerIpRoleId;

	/**
	 * 产品码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 已收金额
	 */
	@ApiField("received_amt")
	private MultiCurrencyMoneyOpenApi receivedAmt;

	/**
	 * 记录id，账单全局唯一号
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 服务金额
	 */
	@ApiField("service_amt")
	private MultiCurrencyMoneyOpenApi serviceAmt;

	/**
	 * 结算类型
01：实时；02：预收；03：后收；04：周期结算；05：按日汇总结算；09：延期结算
	 */
	@ApiField("settle_type")
	private String settleType;

	/**
	 * 签约对象参与者标识
	 */
	@ApiField("sign_ip_id")
	private String signIpId;

	/**
	 * 签约对象参与者角色标识
	 */
	@ApiField("sign_ip_role_id")
	private String signIpRoleId;

	/**
	 * 结算对象PID
	 */
	@ApiField("stl_ip_role_id")
	private String stlIpRoleId;

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
	 * 税收类型，01：增值税，02：营业税
营业税已经在大部分行业废弃，要传入需咨询后再确认
	 */
	@ApiField("tax_type")
	private String taxType;

	/**
	 * 待核销明细数量
	 */
	@ApiField("to_writeoff_detail_count")
	private Long toWriteoffDetailCount;

	/**
	 * 账单分类 1应收，2返点
	 */
	@ApiField("type")
	private String type;

	/**
	 * 核销明细数量
	 */
	@ApiField("writeoff_detail_dount")
	private Long writeoffDetailDount;

	/**
	 * 核销中金额
	 */
	@ApiField("writingoff_amt")
	private MultiCurrencyMoneyOpenApi writingoffAmt;

	public String getAccountDay() {
		return this.accountDay;
	}
	public void setAccountDay(String accountDay) {
		this.accountDay = accountDay;
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

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
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

	public String getCheckStatus() {
		return this.checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public MultiCurrencyMoneyOpenApi getCheckedAmt() {
		return this.checkedAmt;
	}
	public void setCheckedAmt(MultiCurrencyMoneyOpenApi checkedAmt) {
		this.checkedAmt = checkedAmt;
	}

	public MultiCurrencyMoneyOpenApi getCheckingAmt() {
		return this.checkingAmt;
	}
	public void setCheckingAmt(MultiCurrencyMoneyOpenApi checkingAmt) {
		this.checkingAmt = checkingAmt;
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

	public String getClcnMethod() {
		return this.clcnMethod;
	}
	public void setClcnMethod(String clcnMethod) {
		this.clcnMethod = clcnMethod;
	}

	public MultiCurrencyMoneyOpenApi getFreezeAmt() {
		return this.freezeAmt;
	}
	public void setFreezeAmt(MultiCurrencyMoneyOpenApi freezeAmt) {
		this.freezeAmt = freezeAmt;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Date getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
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

	public String getIpName() {
		return this.ipName;
	}
	public void setIpName(String ipName) {
		this.ipName = ipName;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getLastModer() {
		return this.lastModer;
	}
	public void setLastModer(String lastModer) {
		this.lastModer = lastModer;
	}

	public MultiCurrencyMoneyOpenApi getLinkInvoiceAmt() {
		return this.linkInvoiceAmt;
	}
	public void setLinkInvoiceAmt(MultiCurrencyMoneyOpenApi linkInvoiceAmt) {
		this.linkInvoiceAmt = linkInvoiceAmt;
	}

	public String getPayOriginal() {
		return this.payOriginal;
	}
	public void setPayOriginal(String payOriginal) {
		this.payOriginal = payOriginal;
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

	public String getPayeeAccount() {
		return this.payeeAccount;
	}
	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public String getPayerAccount() {
		return this.payerAccount;
	}
	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}

	public String getPayerIpRoleId() {
		return this.payerIpRoleId;
	}
	public void setPayerIpRoleId(String payerIpRoleId) {
		this.payerIpRoleId = payerIpRoleId;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public MultiCurrencyMoneyOpenApi getReceivedAmt() {
		return this.receivedAmt;
	}
	public void setReceivedAmt(MultiCurrencyMoneyOpenApi receivedAmt) {
		this.receivedAmt = receivedAmt;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public MultiCurrencyMoneyOpenApi getServiceAmt() {
		return this.serviceAmt;
	}
	public void setServiceAmt(MultiCurrencyMoneyOpenApi serviceAmt) {
		this.serviceAmt = serviceAmt;
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

	public String getSignIpRoleId() {
		return this.signIpRoleId;
	}
	public void setSignIpRoleId(String signIpRoleId) {
		this.signIpRoleId = signIpRoleId;
	}

	public String getStlIpRoleId() {
		return this.stlIpRoleId;
	}
	public void setStlIpRoleId(String stlIpRoleId) {
		this.stlIpRoleId = stlIpRoleId;
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

	public String getTaxType() {
		return this.taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public Long getToWriteoffDetailCount() {
		return this.toWriteoffDetailCount;
	}
	public void setToWriteoffDetailCount(Long toWriteoffDetailCount) {
		this.toWriteoffDetailCount = toWriteoffDetailCount;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Long getWriteoffDetailDount() {
		return this.writeoffDetailDount;
	}
	public void setWriteoffDetailDount(Long writeoffDetailDount) {
		this.writeoffDetailDount = writeoffDetailDount;
	}

	public MultiCurrencyMoneyOpenApi getWritingoffAmt() {
		return this.writingoffAmt;
	}
	public void setWritingoffAmt(MultiCurrencyMoneyOpenApi writingoffAmt) {
		this.writingoffAmt = writingoffAmt;
	}

}

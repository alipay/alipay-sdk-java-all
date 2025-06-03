package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收款单open api DTO
 *
 * @author auto create
 * @since 1.0, 2021-09-24 09:15:59
 */
public class CollectReceiptOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 1745791611144483484L;

	/**
	 * 外部业务单据号
	 */
	@ApiField("bsn_no")
	private String bsnNo;

	/**
	 * 最初收款单的bsnRefNo，收款单拆分时使用，用于核对，找到最原始收款单
	 */
	@ApiField("bsn_ref_no")
	private String bsnRefNo;

	/**
	 * 收款单对应的业务场景
	 */
	@ApiField("business_scene")
	private String businessScene;

	/**
	 * 渠道，
01：支付宝
02：银行渠道
12:  信用证
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 支付渠道的流水单号(银行、支付宝的付款流水单号)
	 */
	@ApiField("channel_log_no")
	private String channelLogNo;

	/**
	 * 支付渠道的原始备注（银行、支付宝的流水备注）
	 */
	@ApiField("channel_memo")
	private String channelMemo;

	/**
	 * 收款单金额
	 */
	@ApiField("collect_amt")
	private MultiCurrencyMoneyOpenApi collectAmt;

	/**
	 * 交易时间（收款流水的交易时间）
	 */
	@ApiField("collect_date")
	private Date collectDate;

	/**
	 * 收款单的收款状态
 * 未收款: UNCOLLECTED
 * 已收款: COLLECTED
	 */
	@ApiField("collect_status")
	private String collectStatus;

	/**
	 * 已实收金额
	 */
	@ApiField("collected_amt")
	private MultiCurrencyMoneyOpenApi collectedAmt;

	/**
	 * 创建者
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 收款单冻结金额
	 */
	@ApiField("freeze_amt")
	private MultiCurrencyMoneyOpenApi freezeAmt;

	/**
	 * 流水平台的流水号
	 */
	@ApiField("fund_log_id")
	private String fundLogId;

	/**
	 * 打款币种对实收币种的GL里的汇率
	 */
	@ApiField("gl_exchange_rate")
	private String glExchangeRate;

	/**
	 * 生成时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 最后修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 收款方账号名称
	 */
	@ApiField("payee_account_name")
	private String payeeAccountName;

	/**
	 * 收款方账号
	 */
	@ApiField("payee_account_no")
	private String payeeAccountNo;

	/**
	 * 收款方机构id
	 */
	@ApiField("payee_inst_id")
	private String payeeInstId;

	/**
	 * 收款方PID
	 */
	@ApiField("payee_ip_role_id")
	private String payeeIpRoleId;

	/**
	 * 付款方账号名称
	 */
	@ApiField("payer_account_name")
	private String payerAccountName;

	/**
	 * 付款方账号
	 */
	@ApiField("payer_account_no")
	private String payerAccountNo;

	/**
	 * 付款方支行名称
	 */
	@ApiField("payer_bank_branch_name")
	private String payerBankBranchName;

	/**
	 * 付款方机构id
	 */
	@ApiField("payer_inst_id")
	private String payerInstId;

	/**
	 * 付款方PID
	 */
	@ApiField("payer_ip_role_id")
	private String payerIpRoleId;

	/**
	 * 收款单号(主键字段)
	 */
	@ApiField("receipt_no")
	private String receiptNo;

	/**
	 * 关联的资金交易唯一单号，用于与流水关联
	 */
	@ApiField("ref_trans_no")
	private String refTransNo;

	/**
	 * 关联的资金交易唯一单号的类型，用于与流水关联，可空.
GFFUND_GTIT_NO:财资平台的调拨号
ALIPAY_TRANS_NO:支付宝交易号
RECEIVE_APPLY_NO:收款引擎受理单号
	 */
	@ApiField("ref_trans_no_type")
	private String refTransNoType;

	/**
	 * 来源系统
	 */
	@ApiField("source")
	private String source;

	/**
	 * 收款单状态
* 待充值预收户: WAITING_RECHARGE
* 未使用: NO_USE
* 部分使用: PART_USE
* 全部使用: ALL_USE
	 */
	@ApiField("status")
	private String status;

	/**
	 * 租户
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 收款单已使用金额
	 */
	@ApiField("used_amt")
	private MultiCurrencyMoneyOpenApi usedAmt;

	/**
	 * 自动核销关联号
	 */
	@ApiField("writeoff_relative_id")
	private String writeoffRelativeId;

	public String getBsnNo() {
		return this.bsnNo;
	}
	public void setBsnNo(String bsnNo) {
		this.bsnNo = bsnNo;
	}

	public String getBsnRefNo() {
		return this.bsnRefNo;
	}
	public void setBsnRefNo(String bsnRefNo) {
		this.bsnRefNo = bsnRefNo;
	}

	public String getBusinessScene() {
		return this.businessScene;
	}
	public void setBusinessScene(String businessScene) {
		this.businessScene = businessScene;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannelLogNo() {
		return this.channelLogNo;
	}
	public void setChannelLogNo(String channelLogNo) {
		this.channelLogNo = channelLogNo;
	}

	public String getChannelMemo() {
		return this.channelMemo;
	}
	public void setChannelMemo(String channelMemo) {
		this.channelMemo = channelMemo;
	}

	public MultiCurrencyMoneyOpenApi getCollectAmt() {
		return this.collectAmt;
	}
	public void setCollectAmt(MultiCurrencyMoneyOpenApi collectAmt) {
		this.collectAmt = collectAmt;
	}

	public Date getCollectDate() {
		return this.collectDate;
	}
	public void setCollectDate(Date collectDate) {
		this.collectDate = collectDate;
	}

	public String getCollectStatus() {
		return this.collectStatus;
	}
	public void setCollectStatus(String collectStatus) {
		this.collectStatus = collectStatus;
	}

	public MultiCurrencyMoneyOpenApi getCollectedAmt() {
		return this.collectedAmt;
	}
	public void setCollectedAmt(MultiCurrencyMoneyOpenApi collectedAmt) {
		this.collectedAmt = collectedAmt;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public MultiCurrencyMoneyOpenApi getFreezeAmt() {
		return this.freezeAmt;
	}
	public void setFreezeAmt(MultiCurrencyMoneyOpenApi freezeAmt) {
		this.freezeAmt = freezeAmt;
	}

	public String getFundLogId() {
		return this.fundLogId;
	}
	public void setFundLogId(String fundLogId) {
		this.fundLogId = fundLogId;
	}

	public String getGlExchangeRate() {
		return this.glExchangeRate;
	}
	public void setGlExchangeRate(String glExchangeRate) {
		this.glExchangeRate = glExchangeRate;
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

	public String getPayeeAccountName() {
		return this.payeeAccountName;
	}
	public void setPayeeAccountName(String payeeAccountName) {
		this.payeeAccountName = payeeAccountName;
	}

	public String getPayeeAccountNo() {
		return this.payeeAccountNo;
	}
	public void setPayeeAccountNo(String payeeAccountNo) {
		this.payeeAccountNo = payeeAccountNo;
	}

	public String getPayeeInstId() {
		return this.payeeInstId;
	}
	public void setPayeeInstId(String payeeInstId) {
		this.payeeInstId = payeeInstId;
	}

	public String getPayeeIpRoleId() {
		return this.payeeIpRoleId;
	}
	public void setPayeeIpRoleId(String payeeIpRoleId) {
		this.payeeIpRoleId = payeeIpRoleId;
	}

	public String getPayerAccountName() {
		return this.payerAccountName;
	}
	public void setPayerAccountName(String payerAccountName) {
		this.payerAccountName = payerAccountName;
	}

	public String getPayerAccountNo() {
		return this.payerAccountNo;
	}
	public void setPayerAccountNo(String payerAccountNo) {
		this.payerAccountNo = payerAccountNo;
	}

	public String getPayerBankBranchName() {
		return this.payerBankBranchName;
	}
	public void setPayerBankBranchName(String payerBankBranchName) {
		this.payerBankBranchName = payerBankBranchName;
	}

	public String getPayerInstId() {
		return this.payerInstId;
	}
	public void setPayerInstId(String payerInstId) {
		this.payerInstId = payerInstId;
	}

	public String getPayerIpRoleId() {
		return this.payerIpRoleId;
	}
	public void setPayerIpRoleId(String payerIpRoleId) {
		this.payerIpRoleId = payerIpRoleId;
	}

	public String getReceiptNo() {
		return this.receiptNo;
	}
	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getRefTransNo() {
		return this.refTransNo;
	}
	public void setRefTransNo(String refTransNo) {
		this.refTransNo = refTransNo;
	}

	public String getRefTransNoType() {
		return this.refTransNoType;
	}
	public void setRefTransNoType(String refTransNoType) {
		this.refTransNoType = refTransNoType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public MultiCurrencyMoneyOpenApi getUsedAmt() {
		return this.usedAmt;
	}
	public void setUsedAmt(MultiCurrencyMoneyOpenApi usedAmt) {
		this.usedAmt = usedAmt;
	}

	public String getWriteoffRelativeId() {
		return this.writeoffRelativeId;
	}
	public void setWriteoffRelativeId(String writeoffRelativeId) {
		this.writeoffRelativeId = writeoffRelativeId;
	}

}

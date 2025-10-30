package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标准资金凭证open api VO模型
 *
 * @author auto create
 * @since 1.0, 2021-10-13 10:32:13
 */
public class StandardVoucherOpenApiVO extends AlipayObject {

	private static final long serialVersionUID = 1222995371123922646L;

	/**
	 * 是否有算法打标推荐值
	 */
	@ApiField("algorithm_tag")
	private String algorithmTag;

	/**
	 * 账户余额
	 */
	@ApiField("balance")
	private MultiCurrencyMoneyOpenApi balance;

	/**
	 * 收费金额
	 */
	@ApiField("charge_amount")
	private MultiCurrencyMoneyOpenApi chargeAmount;

	/**
	 * COA扩展属性，json格式
	 */
	@ApiField("coa_properties")
	private String coaProperties;

	/**
	 * 数仓dt
	 */
	@ApiField("dt")
	private String dt;

	/**
	 * 数仓流水类型：当日银行流水(BANK_CURRENT)，历史银行流水(HISTORY_BANK)，当日支付宝流水(ALIPAY_CURRENT)，历史支付宝流水(ALIPAY_HISTORY)
	 */
	@ApiField("dw_log_type")
	private String dwLogType;

	/**
	 * 业务事件码
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 扩展属性
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 资金业务码
	 */
	@ApiField("fund_biz_code")
	private String fundBizCode;

	/**
	 * 资金业务名称
	 */
	@ApiField("fund_biz_name")
	private String fundBizName;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 处理结果状态，10-系统处理中，20-未明，30-线下平台已入账，40-其他平台已入账，50-业务平台入账成功
	 */
	@ApiField("handle_status")
	private String handleStatus;

	/**
	 * 数仓hour
	 */
	@ApiField("hour")
	private String hour;

	/**
	 * 主键ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 幂等ID
	 */
	@ApiField("idempotent_id")
	private String idempotentId;

	/**
	 * 原始流水号：机构流水号
	 */
	@ApiField("inst_serial_no")
	private String instSerialNo;

	/**
	 * 人工打标备注
	 */
	@ApiField("manual_dist_demo")
	private String manualDistDemo;

	/**
	 * 人工打标类型
	 */
	@ApiField("manual_dist_type")
	private String manualDistType;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 原始流水号
	 */
	@ApiField("org_trans_no")
	private String orgTransNo;

	/**
	 * 原始交易金额
	 */
	@ApiField("ori_trans_amount")
	private MultiCurrencyMoneyOpenApi oriTransAmount;

	/**
	 * 原始交易汇率
	 */
	@ApiField("ori_trans_rate")
	private String oriTransRate;

	/**
	 * 对方账户信息
	 */
	@ApiField("other_account")
	private AccountInfoVO otherAccount;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务产品码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 关联凭证ID
	 */
	@ApiField("rel_voucher_id")
	private String relVoucherId;

	/**
	 * 凭证状态，01-初始，02-已识别，03-业务平台处理中，04-已处理，05-冲销中，06-已冲销，07-人工待处理，08-人工处理中，09-已作废，10-未明到通用登账中
	 */
	@ApiField("status")
	private String status;

	/**
	 * 目标账户信息
	 */
	@ApiField("target_account")
	private AccountInfoVO targetAccount;

	/**
	 * 租户ID
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 账户信息
	 */
	@ApiField("trans_account")
	private AccountInfoVO transAccount;

	/**
	 * 交易金额
	 */
	@ApiField("trans_amount")
	private MultiCurrencyMoneyOpenApi transAmount;

	/**
	 * 借贷方向；借：DEBIT;贷：CREDIT
	 */
	@ApiField("trans_direction")
	private String transDirection;

	/**
	 * 交易时间
	 */
	@ApiField("trans_dt")
	private Date transDt;

	/**
	 * 机构ID，Z50、K53等等，非空
	 */
	@ApiField("trans_inst_id")
	private String transInstId;

	/**
	 * 主事务id,用于凭证勾兑,当前内部户勾兑使用
	 */
	@ApiField("tx_id")
	private String txId;

	/**
	 * 凭证类型，ALIPAY-支付宝，BANK-银行
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 关联冲销凭证ID
	 */
	@ApiField("writeoff_voucher_id")
	private String writeoffVoucherId;

	public String getAlgorithmTag() {
		return this.algorithmTag;
	}
	public void setAlgorithmTag(String algorithmTag) {
		this.algorithmTag = algorithmTag;
	}

	public MultiCurrencyMoneyOpenApi getBalance() {
		return this.balance;
	}
	public void setBalance(MultiCurrencyMoneyOpenApi balance) {
		this.balance = balance;
	}

	public MultiCurrencyMoneyOpenApi getChargeAmount() {
		return this.chargeAmount;
	}
	public void setChargeAmount(MultiCurrencyMoneyOpenApi chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public String getCoaProperties() {
		return this.coaProperties;
	}
	public void setCoaProperties(String coaProperties) {
		this.coaProperties = coaProperties;
	}

	public String getDt() {
		return this.dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getDwLogType() {
		return this.dwLogType;
	}
	public void setDwLogType(String dwLogType) {
		this.dwLogType = dwLogType;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFundBizCode() {
		return this.fundBizCode;
	}
	public void setFundBizCode(String fundBizCode) {
		this.fundBizCode = fundBizCode;
	}

	public String getFundBizName() {
		return this.fundBizName;
	}
	public void setFundBizName(String fundBizName) {
		this.fundBizName = fundBizName;
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

	public String getHandleStatus() {
		return this.handleStatus;
	}
	public void setHandleStatus(String handleStatus) {
		this.handleStatus = handleStatus;
	}

	public String getHour() {
		return this.hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIdempotentId() {
		return this.idempotentId;
	}
	public void setIdempotentId(String idempotentId) {
		this.idempotentId = idempotentId;
	}

	public String getInstSerialNo() {
		return this.instSerialNo;
	}
	public void setInstSerialNo(String instSerialNo) {
		this.instSerialNo = instSerialNo;
	}

	public String getManualDistDemo() {
		return this.manualDistDemo;
	}
	public void setManualDistDemo(String manualDistDemo) {
		this.manualDistDemo = manualDistDemo;
	}

	public String getManualDistType() {
		return this.manualDistType;
	}
	public void setManualDistType(String manualDistType) {
		this.manualDistType = manualDistType;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOrgTransNo() {
		return this.orgTransNo;
	}
	public void setOrgTransNo(String orgTransNo) {
		this.orgTransNo = orgTransNo;
	}

	public MultiCurrencyMoneyOpenApi getOriTransAmount() {
		return this.oriTransAmount;
	}
	public void setOriTransAmount(MultiCurrencyMoneyOpenApi oriTransAmount) {
		this.oriTransAmount = oriTransAmount;
	}

	public String getOriTransRate() {
		return this.oriTransRate;
	}
	public void setOriTransRate(String oriTransRate) {
		this.oriTransRate = oriTransRate;
	}

	public AccountInfoVO getOtherAccount() {
		return this.otherAccount;
	}
	public void setOtherAccount(AccountInfoVO otherAccount) {
		this.otherAccount = otherAccount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getRelVoucherId() {
		return this.relVoucherId;
	}
	public void setRelVoucherId(String relVoucherId) {
		this.relVoucherId = relVoucherId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public AccountInfoVO getTargetAccount() {
		return this.targetAccount;
	}
	public void setTargetAccount(AccountInfoVO targetAccount) {
		this.targetAccount = targetAccount;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public AccountInfoVO getTransAccount() {
		return this.transAccount;
	}
	public void setTransAccount(AccountInfoVO transAccount) {
		this.transAccount = transAccount;
	}

	public MultiCurrencyMoneyOpenApi getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(MultiCurrencyMoneyOpenApi transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransDirection() {
		return this.transDirection;
	}
	public void setTransDirection(String transDirection) {
		this.transDirection = transDirection;
	}

	public Date getTransDt() {
		return this.transDt;
	}
	public void setTransDt(Date transDt) {
		this.transDt = transDt;
	}

	public String getTransInstId() {
		return this.transInstId;
	}
	public void setTransInstId(String transInstId) {
		this.transInstId = transInstId;
	}

	public String getTxId() {
		return this.txId;
	}
	public void setTxId(String txId) {
		this.txId = txId;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

	public String getWriteoffVoucherId() {
		return this.writeoffVoucherId;
	}
	public void setWriteoffVoucherId(String writeoffVoucherId) {
		this.writeoffVoucherId = writeoffVoucherId;
	}

}

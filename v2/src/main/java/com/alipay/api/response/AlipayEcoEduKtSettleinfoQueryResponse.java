package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.settleinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:56
 */
public class AlipayEcoEduKtSettleinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2158645244988425821L;

	/** 
	 * 账户类型
	 */
	@ApiField("account_type")
	private String accountType;

	/** 
	 * 账户名
	 */
	@ApiField("bank_account_name")
	private String bankAccountName;

	/** 
	 * 账户(脱敏)
	 */
	@ApiField("bank_account_no")
	private String bankAccountNo;

	/** 
	 * 银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/** 
	 * 退票时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("dishonoured_time")
	private String dishonouredTime;

	/** 
	 * 结算失败(退票)的原因码(结算失败或退票消息为必选字段)。
ACCOUNT_NOT_MATCH:银行校验账号和户名不一致；
ACCOUNT_DISABLED:银行账户不可用；
DEFAULT_MSG:处理延时，请等待，系统稍后将自动重试；
	 */
	@ApiField("fail_code")
	private String failCode;

	/** 
	 * 结算失败(退票)的原因描述(结算失败或退票为必选)。
ACCOUNT_NOT_MATCH:银行校验账号和户名不一致；
ACCOUNT_DISABLED:银行账户不可用；
DEFAULT_MSG:处理延时，请等待，系统稍后将自动重试；
	 */
	@ApiField("fail_desc")
	private String failDesc;

	/** 
	 * 净结算金额，取值范围[0.01,100000000]，精确到小数点后2位。
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/** 
	 * 净结算金额的币种
	 */
	@ApiField("settle_currency")
	private String settleCurrency;

	/** 
	 * 支付宝结算单据号
	 */
	@ApiField("settle_id")
	private String settleId;

	/** 
	 * 本次结算对应的结算周期的起始时间（包含此时间点），格式为yyyy-MM-dd HH:mm:ss。 例如，若按天结算，日切点为0点时，某一笔的结算周期时间为： settle_period_begin_time = 2018-01-01 00:00:00 settle_period_end_time = 2018-01-02 00:00:00
	 */
	@ApiField("settle_period_begin_time")
	private String settlePeriodBeginTime;

	/** 
	 * 本次结算对应的结算周期的起始时间（不包含此时间点），格式为yyyy-MM-dd HH:mm:ss。 例如，若按天结算，日切点为0点时，某一笔的结算周期时间为： settle_period_begin_time = 2018-01-01 00:00:00 settle_period_end_time = 2018-01-02 00:00:00
	 */
	@ApiField("settle_period_end_time")
	private String settlePeriodEndTime;

	/** 
	 * 结算成功时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("settle_time")
	private String settleTime;

	/** 
	 * 结算状态 0 成功 1 失败 2 退票
	 */
	@ApiField("status")
	private String status;

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountType( ) {
		return this.accountType;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}
	public String getBankAccountName( ) {
		return this.bankAccountName;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	public String getBankAccountNo( ) {
		return this.bankAccountNo;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName( ) {
		return this.bankName;
	}

	public void setDishonouredTime(String dishonouredTime) {
		this.dishonouredTime = dishonouredTime;
	}
	public String getDishonouredTime( ) {
		return this.dishonouredTime;
	}

	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}
	public String getFailCode( ) {
		return this.failCode;
	}

	public void setFailDesc(String failDesc) {
		this.failDesc = failDesc;
	}
	public String getFailDesc( ) {
		return this.failDesc;
	}

	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}
	public String getSettleAmount( ) {
		return this.settleAmount;
	}

	public void setSettleCurrency(String settleCurrency) {
		this.settleCurrency = settleCurrency;
	}
	public String getSettleCurrency( ) {
		return this.settleCurrency;
	}

	public void setSettleId(String settleId) {
		this.settleId = settleId;
	}
	public String getSettleId( ) {
		return this.settleId;
	}

	public void setSettlePeriodBeginTime(String settlePeriodBeginTime) {
		this.settlePeriodBeginTime = settlePeriodBeginTime;
	}
	public String getSettlePeriodBeginTime( ) {
		return this.settlePeriodBeginTime;
	}

	public void setSettlePeriodEndTime(String settlePeriodEndTime) {
		this.settlePeriodEndTime = settlePeriodEndTime;
	}
	public String getSettlePeriodEndTime( ) {
		return this.settlePeriodEndTime;
	}

	public void setSettleTime(String settleTime) {
		this.settleTime = settleTime;
	}
	public String getSettleTime( ) {
		return this.settleTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

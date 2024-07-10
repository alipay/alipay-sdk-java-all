package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 调拨记录流水详情
 *
 * @author auto create
 * @since 1.0, 2024-06-25 09:42:43
 */
public class InstFundFlowRecordDTO extends AlipayObject {

	private static final long serialVersionUID = 5581886113174816651L;

	/**
	 * 调拨业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 收款账号
	 */
	@ApiField("credit_account_no")
	private String creditAccountNo;

	/**
	 * 收款账户类型
	 */
	@ApiField("credit_account_type")
	private String creditAccountType;

	/**
	 * 收款用户openid
	 */
	@ApiField("credit_open_id")
	private String creditOpenId;

	/**
	 * 收款用户ID
	 */
	@ApiField("credit_user_id")
	private String creditUserId;

	/**
	 * 付款账号
	 */
	@ApiField("debit_account_no")
	private String debitAccountNo;

	/**
	 * 付款账户类型
	 */
	@ApiField("debit_account_type")
	private String debitAccountType;

	/**
	 * 付款用户openid
	 */
	@ApiField("debit_open_id")
	private String debitOpenId;

	/**
	 * 付款用户ID
	 */
	@ApiField("debit_user_id")
	private String debitUserId;

	/**
	 * 执行时间
	 */
	@ApiField("gmt_execute_time")
	private String gmtExecuteTime;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * SUCCESS：成功 INSUFFICIENT_BALANCE：余额不足 NO_INST_ABILITY_ITEM：无渠道可用 RETRY_OUT_OF_LIMITS：重试次数超限
	 */
	@ApiField("pay_result_code")
	private String payResultCode;

	/**
	 * 针对pay_result_code的描述
	 */
	@ApiField("pay_result_desc")
	private String payResultDesc;

	/**
	 * INNER：主动调拨
OUTER：自动调拨
	 */
	@ApiField("record_type")
	private String recordType;

	/**
	 * 执行结果状态，SUCCESS/FAIL
	 */
	@ApiField("status")
	private String status;

	/**
	 * 交易金额，单位分
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/**
	 * 币种
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	/**
	 * 消息通知唯一标识
	 */
	@ApiField("unique_no")
	private String uniqueNo;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCreditAccountNo() {
		return this.creditAccountNo;
	}
	public void setCreditAccountNo(String creditAccountNo) {
		this.creditAccountNo = creditAccountNo;
	}

	public String getCreditAccountType() {
		return this.creditAccountType;
	}
	public void setCreditAccountType(String creditAccountType) {
		this.creditAccountType = creditAccountType;
	}

	public String getCreditOpenId() {
		return this.creditOpenId;
	}
	public void setCreditOpenId(String creditOpenId) {
		this.creditOpenId = creditOpenId;
	}

	public String getCreditUserId() {
		return this.creditUserId;
	}
	public void setCreditUserId(String creditUserId) {
		this.creditUserId = creditUserId;
	}

	public String getDebitAccountNo() {
		return this.debitAccountNo;
	}
	public void setDebitAccountNo(String debitAccountNo) {
		this.debitAccountNo = debitAccountNo;
	}

	public String getDebitAccountType() {
		return this.debitAccountType;
	}
	public void setDebitAccountType(String debitAccountType) {
		this.debitAccountType = debitAccountType;
	}

	public String getDebitOpenId() {
		return this.debitOpenId;
	}
	public void setDebitOpenId(String debitOpenId) {
		this.debitOpenId = debitOpenId;
	}

	public String getDebitUserId() {
		return this.debitUserId;
	}
	public void setDebitUserId(String debitUserId) {
		this.debitUserId = debitUserId;
	}

	public String getGmtExecuteTime() {
		return this.gmtExecuteTime;
	}
	public void setGmtExecuteTime(String gmtExecuteTime) {
		this.gmtExecuteTime = gmtExecuteTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayResultCode() {
		return this.payResultCode;
	}
	public void setPayResultCode(String payResultCode) {
		this.payResultCode = payResultCode;
	}

	public String getPayResultDesc() {
		return this.payResultDesc;
	}
	public void setPayResultDesc(String payResultDesc) {
		this.payResultDesc = payResultDesc;
	}

	public String getRecordType() {
		return this.recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransCurrency() {
		return this.transCurrency;
	}
	public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}

	public String getUniqueNo() {
		return this.uniqueNo;
	}
	public void setUniqueNo(String uniqueNo) {
		this.uniqueNo = uniqueNo;
	}

}

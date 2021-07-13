package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值、提现、转账明细记录
 *
 * @author auto create
 * @since 1.0, 2019-10-11 10:57:18
 */
public class TransferDetailResult extends AlipayObject {

	private static final long serialVersionUID = 5665264233831434914L;

	/**
	 * 付款/收款账户。充值记录中是付款账户。提现、转账记录中是收款账户。支付宝名称及账号脱敏；银行账户的户名脱敏，银行账户显示银行名称+银行卡号后四位
	 */
	@ApiField("account")
	private String account;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资金来源/去向类型。在充值记录中，表示资金来源类型，在转账和提现类型中，表示去向类型
	 */
	@ApiField("fund_desc")
	private String fundDesc;

	/**
	 * 银行单据号。对账使用，无需脱敏
	 */
	@ApiField("instruction_id")
	private String instructionId;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 业务订单号。该笔业务单据的唯一识别编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 服务费金额
	 */
	@ApiField("service_fee")
	private String serviceFee;

	/**
	 * 资金状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子类型。“充值类型”，普通充值、大额充值。“转账类型”，暂无实现。转账至支付宝账户、转账至银行卡、批量转账支付宝账户、批量转账至银行卡、批量付款。“提现类型”，暂无实现。普通提现、批量委托提现。对账使用，无需脱敏
	 */
	@ApiField("sub_type_desc")
	private String subTypeDesc;

	/**
	 * 业务发生时间
	 */
	@ApiField("trans_dt")
	private String transDt;

	/**
	 * 查询类型描述：充值、转账、提现
	 */
	@ApiField("type_desc")
	private String typeDesc;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFundDesc() {
		return this.fundDesc;
	}
	public void setFundDesc(String fundDesc) {
		this.fundDesc = fundDesc;
	}

	public String getInstructionId() {
		return this.instructionId;
	}
	public void setInstructionId(String instructionId) {
		this.instructionId = instructionId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getServiceFee() {
		return this.serviceFee;
	}
	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubTypeDesc() {
		return this.subTypeDesc;
	}
	public void setSubTypeDesc(String subTypeDesc) {
		this.subTypeDesc = subTypeDesc;
	}

	public String getTransDt() {
		return this.transDt;
	}
	public void setTransDt(String transDt) {
		this.transDt = transDt;
	}

	public String getTypeDesc() {
		return this.typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

}

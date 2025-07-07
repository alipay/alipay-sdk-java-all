package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易结算明细
 *
 * @author auto create
 * @since 1.0, 2024-02-23 15:39:56
 */
public class TradeSettleDetail extends AlipayObject {

	private static final long serialVersionUID = 4189487264262911784L;

	/**
	 * 实际操作金额，单位为元，两位小数。该参数的值为分账或补差或结算时传入
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 操作日期
	 */
	@ApiField("operation_dt")
	private Date operationDt;

	/**
	 * 商户操作序列号。商户发起请求的外部请求号。
	 */
	@ApiField("operation_serial_no")
	private String operationSerialNo;

	/**
	 * 结算操作类型。有以下几种类型：
replenish(补差)、replenish_refund(退补差)、transfer(分账)、transfer_refund(退分账)、settle(结算)、settle_refund(退结算)、on_settle(待结算)。
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 商户请求的转入账号
	 */
	@ApiField("ori_trans_in")
	private String oriTransIn;

	/**
	 * 商户请求的转出账号
	 */
	@ApiField("ori_trans_out")
	private String oriTransOut;

	/**
	 * 转入账号
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 转出账号
	 */
	@ApiField("trans_out")
	private String transOut;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getOperationDt() {
		return this.operationDt;
	}
	public void setOperationDt(Date operationDt) {
		this.operationDt = operationDt;
	}

	public String getOperationSerialNo() {
		return this.operationSerialNo;
	}
	public void setOperationSerialNo(String operationSerialNo) {
		this.operationSerialNo = operationSerialNo;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOriTransIn() {
		return this.oriTransIn;
	}
	public void setOriTransIn(String oriTransIn) {
		this.oriTransIn = oriTransIn;
	}

	public String getOriTransOut() {
		return this.oriTransOut;
	}
	public void setOriTransOut(String oriTransOut) {
		this.oriTransOut = oriTransOut;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	public String getTransOut() {
		return this.transOut;
	}
	public void setTransOut(String transOut) {
		this.transOut = transOut;
	}

}

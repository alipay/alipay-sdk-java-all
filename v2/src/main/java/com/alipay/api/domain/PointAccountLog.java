package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集分宝账户流水详情
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class PointAccountLog extends AlipayObject {

	private static final long serialVersionUID = 5697762314881725662L;

	/**
	 * 账务流水号,与"我的集分宝"页面流水号保持一致
	 */
	@ApiField("account_log_id")
	private String accountLogId;

	/**
	 * 该笔交易后该账户余额，值为集分宝个数
	 */
	@ApiField("balance")
	private Long balance;

	/**
	 * 支付宝订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部订单号,集分宝充值时淘宝传递给微账务的订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 交易金额,集分宝个数,如果个数小于0则是支出,大于0是收入
	 */
	@ApiField("point_amount")
	private Long pointAmount;

	/**
	 * 子交易代码
	 */
	@ApiField("sub_trans_code")
	private String subTransCode;

	/**
	 * 子交易代码对应中文翻译,如果不想依赖我们的枚举可以使用这个值
	 */
	@ApiField("sub_trans_code_cn")
	private String subTransCodeCn;

	/**
	 * 交易代码
	 */
	@ApiField("trans_code")
	private String transCode;

	/**
	 * 账务执行时间
	 */
	@ApiField("trans_date")
	private Date transDate;

	/**
	 * 交易备注信息
	 */
	@ApiField("trans_memo")
	private String transMemo;

	public String getAccountLogId() {
		return this.accountLogId;
	}
	public void setAccountLogId(String accountLogId) {
		this.accountLogId = accountLogId;
	}

	public Long getBalance() {
		return this.balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getPointAmount() {
		return this.pointAmount;
	}
	public void setPointAmount(Long pointAmount) {
		this.pointAmount = pointAmount;
	}

	public String getSubTransCode() {
		return this.subTransCode;
	}
	public void setSubTransCode(String subTransCode) {
		this.subTransCode = subTransCode;
	}

	public String getSubTransCodeCn() {
		return this.subTransCodeCn;
	}
	public void setSubTransCodeCn(String subTransCodeCn) {
		this.subTransCodeCn = subTransCodeCn;
	}

	public String getTransCode() {
		return this.transCode;
	}
	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public Date getTransDate() {
		return this.transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public String getTransMemo() {
		return this.transMemo;
	}
	public void setTransMemo(String transMemo) {
		this.transMemo = transMemo;
	}

}

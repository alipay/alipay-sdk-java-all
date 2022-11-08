package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险电商支付单据
 *
 * @author auto create
 * @since 1.0, 2022-11-03 16:42:34
 */
public class PayOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 8762767793321832146L;

	/**
	 * 买家实际支付金额
	 */
	@ApiField("actual_total_fee")
	private Long actualTotalFee;

	/**
	 * 收款账户
	 */
	@ApiField("in_account_no")
	private String inAccountNo;

	/**
	 * 收款账户,in_account_type=ALIPAY时，通过in_account_open_id字段传参，其它类型通过in_account_no字段传参
	 */
	@ApiField("in_account_open_id")
	private String inAccountOpenId;

	/**
	 * 收款账户类型:OTHER 第三方平台
	 */
	@ApiField("in_account_type")
	private String inAccountType;

	/**
	 * 付款账户
	 */
	@ApiField("out_account_no")
	private String outAccountNo;

	/**
	 * 付款账户,outAccountType=ALIPAY时，通过out_account_open_id字段传参，其它类型通过out_account_no字段传参
	 */
	@ApiField("out_account_open_id")
	private String outAccountOpenId;

	/**
	 * 账户类型：OTHER 其它第三方平台
	 */
	@ApiField("out_account_type")
	private String outAccountType;

	/**
	 * 支付流水号
	 */
	@ApiField("pay_flow_id")
	private String payFlowId;

	/**
	 * 支付订单id
	 */
	@ApiField("pay_order_id")
	private String payOrderId;

	/**
	 * 支付状态
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * ONE_TIME(一次性缴费),
BY_MONTH(按月缴费),
BY_YEAR(按年缴费),
UNSTATED(不定期缴费),
BY_HALF_MONTH(按半月缴费)
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 订单总金额，单价×数量
	 */
	@ApiField("total_fee")
	private Long totalFee;

	public Long getActualTotalFee() {
		return this.actualTotalFee;
	}
	public void setActualTotalFee(Long actualTotalFee) {
		this.actualTotalFee = actualTotalFee;
	}

	public String getInAccountNo() {
		return this.inAccountNo;
	}
	public void setInAccountNo(String inAccountNo) {
		this.inAccountNo = inAccountNo;
	}

	public String getInAccountOpenId() {
		return this.inAccountOpenId;
	}
	public void setInAccountOpenId(String inAccountOpenId) {
		this.inAccountOpenId = inAccountOpenId;
	}

	public String getInAccountType() {
		return this.inAccountType;
	}
	public void setInAccountType(String inAccountType) {
		this.inAccountType = inAccountType;
	}

	public String getOutAccountNo() {
		return this.outAccountNo;
	}
	public void setOutAccountNo(String outAccountNo) {
		this.outAccountNo = outAccountNo;
	}

	public String getOutAccountOpenId() {
		return this.outAccountOpenId;
	}
	public void setOutAccountOpenId(String outAccountOpenId) {
		this.outAccountOpenId = outAccountOpenId;
	}

	public String getOutAccountType() {
		return this.outAccountType;
	}
	public void setOutAccountType(String outAccountType) {
		this.outAccountType = outAccountType;
	}

	public String getPayFlowId() {
		return this.payFlowId;
	}
	public void setPayFlowId(String payFlowId) {
		this.payFlowId = payFlowId;
	}

	public String getPayOrderId() {
		return this.payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Long getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(Long totalFee) {
		this.totalFee = totalFee;
	}

}

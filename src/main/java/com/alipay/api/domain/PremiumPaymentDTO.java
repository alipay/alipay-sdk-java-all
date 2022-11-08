package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景开放平台保费打款信息模型
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:21:32
 */
public class PremiumPaymentDTO extends AlipayObject {

	private static final long serialVersionUID = 7143578311631157784L;

	/**
	 * 收款账号名
	 */
	@ApiField("in_account_name")
	private String inAccountName;

	/**
	 * 收款账号
	 */
	@ApiField("in_account_no")
	private String inAccountNo;

	/**
	 * 收入账号类型
	 */
	@ApiField("in_account_type")
	private String inAccountType;

	/**
	 * 保险预下单id
	 */
	@ApiField("ins_pre_order_id")
	private String insPreOrderId;

	/**
	 * 支出账号名
	 */
	@ApiField("out_account_name")
	private String outAccountName;

	/**
	 * 支出账号
	 */
	@ApiField("out_account_no")
	private String outAccountNo;

	/**
	 * 支出账号类型
	 */
	@ApiField("out_account_type")
	private String outAccountType;

	/**
	 * 打款账单号
	 */
	@ApiField("pay_bill_no")
	private String payBillNo;

	/**
	 * 打款渠道类型
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 打款金额
	 */
	@ApiField("pay_fee")
	private Long payFee;

	/**
	 * 打款订单号
	 */
	@ApiField("pay_order_no")
	private String payOrderNo;

	/**
	 * 打款业务单号
	 */
	@ApiField("pay_out_biz_no")
	private String payOutBizNo;

	/**
	 * 打款时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 保险报价id-无预下单时传入
	 */
	@ApiField("quote_id")
	private String quoteId;

	/**
	 * 投保推荐id
	 */
	@ApiField("recommend_flow_id")
	private String recommendFlowId;

	public String getInAccountName() {
		return this.inAccountName;
	}
	public void setInAccountName(String inAccountName) {
		this.inAccountName = inAccountName;
	}

	public String getInAccountNo() {
		return this.inAccountNo;
	}
	public void setInAccountNo(String inAccountNo) {
		this.inAccountNo = inAccountNo;
	}

	public String getInAccountType() {
		return this.inAccountType;
	}
	public void setInAccountType(String inAccountType) {
		this.inAccountType = inAccountType;
	}

	public String getInsPreOrderId() {
		return this.insPreOrderId;
	}
	public void setInsPreOrderId(String insPreOrderId) {
		this.insPreOrderId = insPreOrderId;
	}

	public String getOutAccountName() {
		return this.outAccountName;
	}
	public void setOutAccountName(String outAccountName) {
		this.outAccountName = outAccountName;
	}

	public String getOutAccountNo() {
		return this.outAccountNo;
	}
	public void setOutAccountNo(String outAccountNo) {
		this.outAccountNo = outAccountNo;
	}

	public String getOutAccountType() {
		return this.outAccountType;
	}
	public void setOutAccountType(String outAccountType) {
		this.outAccountType = outAccountType;
	}

	public String getPayBillNo() {
		return this.payBillNo;
	}
	public void setPayBillNo(String payBillNo) {
		this.payBillNo = payBillNo;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public Long getPayFee() {
		return this.payFee;
	}
	public void setPayFee(Long payFee) {
		this.payFee = payFee;
	}

	public String getPayOrderNo() {
		return this.payOrderNo;
	}
	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	public String getPayOutBizNo() {
		return this.payOutBizNo;
	}
	public void setPayOutBizNo(String payOutBizNo) {
		this.payOutBizNo = payOutBizNo;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getQuoteId() {
		return this.quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	public String getRecommendFlowId() {
		return this.recommendFlowId;
	}
	public void setRecommendFlowId(String recommendFlowId) {
		this.recommendFlowId = recommendFlowId;
	}

}

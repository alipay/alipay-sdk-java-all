package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金业务明细实体
 *
 * @author auto create
 * @since 1.0, 2024-11-15 16:01:22
 */
public class BizFundReportResult extends AlipayObject {

	private static final long serialVersionUID = 5235981232944132764L;

	/**
	 * 实付金额（元）
	 */
	@ApiField("alipay_amount")
	private String alipayAmount;

	/**
	 * 是否批量转账
	 */
	@ApiField("batch_type")
	private String batchType;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务类型描述
	 */
	@ApiField("biz_type_desc")
	private String bizTypeDesc;

	/**
	 * 服务费（元）
	 */
	@ApiField("charge_fee")
	private String chargeFee;

	/**
	 * 交易时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 2020xxx
	 */
	@ApiField("instruction_id")
	private String instructionId;

	/**
	 * 出借
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 是否脱敏。非空就是不脱敏，空就是脱敏。脱敏规则根据发生的业务定义
	 */
	@ApiField("no_mbill_encrypt")
	private String noMbillEncrypt;

	/**
	 * 业务订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 实付金额（元）
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 收款方银行卡号
	 */
	@ApiField("payee_card_no")
	private String payeeCardNo;

	/**
	 * 收款方全名
	 */
	@ApiField("payee_full_name")
	private String payeeFullName;

	/**
	 * 收款方资金类型
	 */
	@ApiField("payee_fund_type")
	private String payeeFundType;

	/**
	 * 支付宝余额
	 */
	@ApiField("payee_fund_type_desc")
	private String payeeFundTypeDesc;

	/**
	 * 收款银行中文简称
	 */
	@ApiField("payee_inst_name")
	private String payeeInstName;

	/**
	 * 收款方登录Id
	 */
	@ApiField("payee_login_email")
	private String payeeLoginEmail;

	/**
	 * 收款方姓名
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 付款方资金类型
	 */
	@ApiField("payer_fund_type")
	private String payerFundType;

	/**
	 * 付款方资金类型描述
	 */
	@ApiField("payer_fund_type_desc")
	private String payerFundTypeDesc;

	/**
	 * 退款金额（元）
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 是否展示细节，默认为true
	 */
	@ApiField("show_detail")
	private String showDetail;

	/**
	 * 是否出示凭证
	 */
	@ApiField("show_voucher")
	private String showVoucher;

	/**
	 * 数据来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 单据状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/**
	 * 普通转账
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 业务子类型描述
	 */
	@ApiField("sub_biz_type_desc")
	private String subBizTypeDesc;

	public String getAlipayAmount() {
		return this.alipayAmount;
	}
	public void setAlipayAmount(String alipayAmount) {
		this.alipayAmount = alipayAmount;
	}

	public String getBatchType() {
		return this.batchType;
	}
	public void setBatchType(String batchType) {
		this.batchType = batchType;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizTypeDesc() {
		return this.bizTypeDesc;
	}
	public void setBizTypeDesc(String bizTypeDesc) {
		this.bizTypeDesc = bizTypeDesc;
	}

	public String getChargeFee() {
		return this.chargeFee;
	}
	public void setChargeFee(String chargeFee) {
		this.chargeFee = chargeFee;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
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

	public String getNoMbillEncrypt() {
		return this.noMbillEncrypt;
	}
	public void setNoMbillEncrypt(String noMbillEncrypt) {
		this.noMbillEncrypt = noMbillEncrypt;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayeeCardNo() {
		return this.payeeCardNo;
	}
	public void setPayeeCardNo(String payeeCardNo) {
		this.payeeCardNo = payeeCardNo;
	}

	public String getPayeeFullName() {
		return this.payeeFullName;
	}
	public void setPayeeFullName(String payeeFullName) {
		this.payeeFullName = payeeFullName;
	}

	public String getPayeeFundType() {
		return this.payeeFundType;
	}
	public void setPayeeFundType(String payeeFundType) {
		this.payeeFundType = payeeFundType;
	}

	public String getPayeeFundTypeDesc() {
		return this.payeeFundTypeDesc;
	}
	public void setPayeeFundTypeDesc(String payeeFundTypeDesc) {
		this.payeeFundTypeDesc = payeeFundTypeDesc;
	}

	public String getPayeeInstName() {
		return this.payeeInstName;
	}
	public void setPayeeInstName(String payeeInstName) {
		this.payeeInstName = payeeInstName;
	}

	public String getPayeeLoginEmail() {
		return this.payeeLoginEmail;
	}
	public void setPayeeLoginEmail(String payeeLoginEmail) {
		this.payeeLoginEmail = payeeLoginEmail;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayerFundType() {
		return this.payerFundType;
	}
	public void setPayerFundType(String payerFundType) {
		this.payerFundType = payerFundType;
	}

	public String getPayerFundTypeDesc() {
		return this.payerFundTypeDesc;
	}
	public void setPayerFundTypeDesc(String payerFundTypeDesc) {
		this.payerFundTypeDesc = payerFundTypeDesc;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getShowDetail() {
		return this.showDetail;
	}
	public void setShowDetail(String showDetail) {
		this.showDetail = showDetail;
	}

	public String getShowVoucher() {
		return this.showVoucher;
	}
	public void setShowVoucher(String showVoucher) {
		this.showVoucher = showVoucher;
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

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getSubBizTypeDesc() {
		return this.subBizTypeDesc;
	}
	public void setSubBizTypeDesc(String subBizTypeDesc) {
		this.subBizTypeDesc = subBizTypeDesc;
	}

}

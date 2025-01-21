package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量代发到账户请求明细模型
 *
 * @author auto create
 * @since 1.0, 2018-05-21 20:51:50
 */
public class AccTransDetail extends AlipayObject {

	private static final long serialVersionUID = 6328711148414227594L;

	/**
	 * 支付宝订单号。仅付汇失败后，商户重试时填写。首次批次请求时设置为空，否则会失败。

biz_scene=LOCAL时忽略该参数。
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 收款方身份认证信息。biz_scene=LOCAL时忽略该参数。
	 */
	@ApiField("cert_info")
	private CertInfo certInfo;

	/**
	 * 明细流水号
	 */
	@ApiField("detail_no")
	private String detailNo;

	/**
	 * 代发明细原始交易信息
	 */
	@ApiField("ori_txn_info")
	private OriTxnInfo oriTxnInfo;

	/**
	 * 收款方信息
	 */
	@ApiField("payee_info")
	private AccPayeeInfo payeeInfo;

	/**
	 * 资金到账时效。biz_scene=LOCAL时忽略该参数。
	 */
	@ApiField("reach_time")
	private String reachTime;

	/**
	 * 转账明细备注。
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 结算金额。biz_scene=LOCAL时忽略该参数。
	 */
	@ApiField("settlement_currency")
	private String settlementCurrency;

	/**
	 * 转账金额
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/**
	 * 转账币种, 用来修饰转账金额 trans_amount. biz_scene=LOCAL时忽略该参数。
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public CertInfo getCertInfo() {
		return this.certInfo;
	}
	public void setCertInfo(CertInfo certInfo) {
		this.certInfo = certInfo;
	}

	public String getDetailNo() {
		return this.detailNo;
	}
	public void setDetailNo(String detailNo) {
		this.detailNo = detailNo;
	}

	public OriTxnInfo getOriTxnInfo() {
		return this.oriTxnInfo;
	}
	public void setOriTxnInfo(OriTxnInfo oriTxnInfo) {
		this.oriTxnInfo = oriTxnInfo;
	}

	public AccPayeeInfo getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(AccPayeeInfo payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

	public String getReachTime() {
		return this.reachTime;
	}
	public void setReachTime(String reachTime) {
		this.reachTime = reachTime;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSettlementCurrency() {
		return this.settlementCurrency;
	}
	public void setSettlementCurrency(String settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
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

}

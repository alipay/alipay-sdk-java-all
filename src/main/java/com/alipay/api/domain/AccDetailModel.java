package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量代发到账户明细复杂模型
 *
 * @author auto create
 * @since 1.0, 2020-12-29 09:50:23
 */
public class AccDetailModel extends AlipayObject {

	private static final long serialVersionUID = 6146697828948335481L;

	/**
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 收款方身份认证信息。biz_scene=LOCAL时忽略该参数。
	 */
	@ApiField("cert_info")
	private CertInfo certInfo;

	/**
	 * 支付宝系统内部明细单号。
	 */
	@ApiField("detail_id")
	private String detailId;

	/**
	 * 明细流水号（注：只有境外代发使用，其他场景请使用out_biz_no）
	 */
	@ApiField("detail_no")
	private String detailNo;

	/**
	 * 明细失败错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 明细失败错误原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 转账币种兑换的汇率信息。biz_scene是LOCAL场景下，该参数返回空。
	 */
	@ApiField("exchange_rate")
	private ExchangeRate exchangeRate;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 完成时间
	 */
	@ApiField("gmt_finish")
	private String gmtFinish;

	/**
	 * 是否需要通过alipay_order_no原单据重试.
T: 需要;
F或为空: 不需要.
	 */
	@ApiField("need_retry")
	private String needRetry;

	/**
	 * 商户明细订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款方信息。
	 */
	@ApiField("payee_info")
	private AccPayeeInfo payeeInfo;

	/**
	 * 应付金额. 付款方应付金额.
LOCAL场景下为空.
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 支付币种.付款方应付的币种, 与批次请求时的payment_currency相同.
	 */
	@ApiField("payment_currency")
	private String paymentCurrency;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 结算金额。
收款方实际收到的金额.
biz_scene是LOCAL场景下，该参数返回空。
	 */
	@ApiField("settlement_amount")
	private String settlementAmount;

	/**
	 * 结算币种.收款方收到的币种. LOCAL场景下为空.
	 */
	@ApiField("settlement_currency")
	private String settlementCurrency;

	/**
	 * INIT：初始
APPLIED：已下单
DEALED：处理中
SUCCESS：处理成功
DISUSE：已废除
FAIL：处理失败
UNKNOWN：未知状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子状态
	 */
	@ApiField("sub_status")
	private String subStatus;

	/**
	 * 转账金额。代发请求中指定的trans_amount.
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/**
	 * 转账币种
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

	public String getDetailId() {
		return this.detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public String getDetailNo() {
		return this.detailNo;
	}
	public void setDetailNo(String detailNo) {
		this.detailNo = detailNo;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public ExchangeRate getExchangeRate() {
		return this.exchangeRate;
	}
	public void setExchangeRate(ExchangeRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtFinish() {
		return this.gmtFinish;
	}
	public void setGmtFinish(String gmtFinish) {
		this.gmtFinish = gmtFinish;
	}

	public String getNeedRetry() {
		return this.needRetry;
	}
	public void setNeedRetry(String needRetry) {
		this.needRetry = needRetry;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public AccPayeeInfo getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(AccPayeeInfo payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentCurrency() {
		return this.paymentCurrency;
	}
	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSettlementAmount() {
		return this.settlementAmount;
	}
	public void setSettlementAmount(String settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	public String getSettlementCurrency() {
		return this.settlementCurrency;
	}
	public void setSettlementCurrency(String settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubStatus() {
		return this.subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
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

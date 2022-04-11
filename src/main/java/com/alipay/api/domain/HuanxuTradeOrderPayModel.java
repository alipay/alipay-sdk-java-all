package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 焕旭科技聚合支付下单支付接口
 *
 * @author auto create
 * @since 1.0, 2021-03-24 14:45:37
 */
public class HuanxuTradeOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 5312264281458371192L;

	/**
	 * 聚合支付的支付渠道，焕旭分配。
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 透传扩展信息
	 */
	@ApiField("ext_params")
	private FinExtParams extParams;

	/**
	 * 商品详情
	 */
	@ApiField("goods_infos")
	private GoodsDetailInfo goodsInfos;

	/**
	 * 是否异步支付，true/false，不传默认为false。
	 */
	@ApiField("is_async_pay")
	private String isAsyncPay;

	/**
	 * 商户订单号，merchant_order_no唯一对应业务上一笔订单，相同的订单需传入相同的merchant_order_no
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 支付金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * CASH现金模式（默认值，传入这个值，则表示仅仅支持银行卡现金）BILL票据模式（传入这个值，则表示仅仅支持银行票据）CASH_BILL现金/票据都支持模式
	 */
	@ApiField("pay_entity_mode")
	private String payEntityMode;

	/**
	 * 支付模式，焕旭分配，目前只支持GUARANTEE_PAY(担保支付模式)
	 */
	@ApiField("pay_mode")
	private String payMode;

	/**
	 * 支付请求号，对应一笔业务订单下的一次支付请求，不同支付请求需保证请求号唯一
	 */
	@ApiField("pay_request_no")
	private String payRequestNo;

	/**
	 * 支付终端，指支付来源的设备端，焕旭分配，目前支持PC/APP
	 */
	@ApiField("pay_terminal")
	private String payTerminal;

	/**
	 * 收款方信息
	 */
	@ApiField("payee")
	private UserIdentity payee;

	/**
	 * 收款方的额外信息，包含会员信息和支付机构账号信息
	 */
	@ApiField("payee_ext")
	private UserIdentityExt payeeExt;

	/**
	 * 付款方信息
	 */
	@ApiField("payer")
	private UserIdentity payer;

	/**
	 * 付款方的额外信息，包含会员信息和支付机构账号信息
	 */
	@ApiField("payer_ext")
	private UserIdentityExt payerExt;

	/**
	 * 支付说明
	 */
	@ApiField("remark")
	private String remark;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public FinExtParams getExtParams() {
		return this.extParams;
	}
	public void setExtParams(FinExtParams extParams) {
		this.extParams = extParams;
	}

	public GoodsDetailInfo getGoodsInfos() {
		return this.goodsInfos;
	}
	public void setGoodsInfos(GoodsDetailInfo goodsInfos) {
		this.goodsInfos = goodsInfos;
	}

	public String getIsAsyncPay() {
		return this.isAsyncPay;
	}
	public void setIsAsyncPay(String isAsyncPay) {
		this.isAsyncPay = isAsyncPay;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayEntityMode() {
		return this.payEntityMode;
	}
	public void setPayEntityMode(String payEntityMode) {
		this.payEntityMode = payEntityMode;
	}

	public String getPayMode() {
		return this.payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getPayRequestNo() {
		return this.payRequestNo;
	}
	public void setPayRequestNo(String payRequestNo) {
		this.payRequestNo = payRequestNo;
	}

	public String getPayTerminal() {
		return this.payTerminal;
	}
	public void setPayTerminal(String payTerminal) {
		this.payTerminal = payTerminal;
	}

	public UserIdentity getPayee() {
		return this.payee;
	}
	public void setPayee(UserIdentity payee) {
		this.payee = payee;
	}

	public UserIdentityExt getPayeeExt() {
		return this.payeeExt;
	}
	public void setPayeeExt(UserIdentityExt payeeExt) {
		this.payeeExt = payeeExt;
	}

	public UserIdentity getPayer() {
		return this.payer;
	}
	public void setPayer(UserIdentity payer) {
		this.payer = payer;
	}

	public UserIdentityExt getPayerExt() {
		return this.payerExt;
	}
	public void setPayerExt(UserIdentityExt payerExt) {
		this.payerExt = payerExt;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 网商银行创建业务订单接口
 *
 * @author auto create
 * @since 1.0, 2022-02-09 14:41:46
 */
public class MybankPaymentTradeBusinessOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8743388895769519227L;

	/**
	 * 金额，单位：元，精确到小数点后两位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 买家信息
	 */
	@ApiField("buyer_info")
	private UserInfoDetail buyerInfo;

	/**
	 * 币种，不传默认CNY(人民币)
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/**
	 * 商品详情
	 */
	@ApiListField("goods_detail")
	@ApiField("bank_goods_detail")
	private List<BankGoodsDetail> goodsDetail;

	/**
	 * 匹配账号，大额支付来账匹配场景必传
	 */
	@ApiField("match_account_no")
	private String matchAccountNo;

	/**
	 * 订单扩展字段
	 */
	@ApiField("order_extend_params")
	private OrderExtendParams orderExtendParams;

	/**
	 * 幂等字段，外部平台的单据号，网商订单与外部平台订单一一对应
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 网商银行签约的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 订单备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 和out_biz_no保持一致或者可以不填
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 卖家信息
	 */
	@ApiField("seller_info")
	private UserInfoDetail sellerInfo;

	/**
	 * 订单相对超时时间。 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public UserInfoDetail getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(UserInfoDetail buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

	public String getCurrencyValue() {
		return this.currencyValue;
	}
	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}

	public List<BankGoodsDetail> getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(List<BankGoodsDetail> goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getMatchAccountNo() {
		return this.matchAccountNo;
	}
	public void setMatchAccountNo(String matchAccountNo) {
		this.matchAccountNo = matchAccountNo;
	}

	public OrderExtendParams getOrderExtendParams() {
		return this.orderExtendParams;
	}
	public void setOrderExtendParams(OrderExtendParams orderExtendParams) {
		this.orderExtendParams = orderExtendParams;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public UserInfoDetail getSellerInfo() {
		return this.sellerInfo;
	}
	public void setSellerInfo(UserInfoDetail sellerInfo) {
		this.sellerInfo = sellerInfo;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

}

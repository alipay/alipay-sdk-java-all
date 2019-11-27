package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数娱充值
 *
 * @author auto create
 * @since 1.0, 2017-09-22 18:38:53
 */
public class AlipayEcoEntertainmentOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5583189951875936662L;

	/**
	 * 充值账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 支付宝账户USERID，可以通过支付宝钱包用户信息共享接口获取支付宝账户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 具体商品代码,三级分类,比如:视频会员充值(一级分类)-> xxx黄金会员(二级分类)->三个月黄金会员充值(三级分类)
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 订单号,对接方需保持唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 购买数量,默认为1
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 支付宝分润编号,用于平台查询分润信息
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * unix 秒级时间戳
	 */
	@ApiField("transaction_time")
	private Long transactionTime;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Long getTransactionTime() {
		return this.transactionTime;
	}
	public void setTransactionTime(Long transactionTime) {
		this.transactionTime = transactionTime;
	}

}

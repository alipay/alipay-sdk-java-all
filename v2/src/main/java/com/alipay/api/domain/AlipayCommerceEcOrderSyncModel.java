package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单信息同步
 *
 * @author auto create
 * @since 1.0, 2025-06-05 14:30:55
 */
public class AlipayCommerceEcOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6816544458975381277L;

	/**
	 * 商家侧订单实际金额，金额单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商家订单实际的买家uid
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家用户的支付宝openid
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 商家侧订单优惠金额，金额单位为元
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 订单扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("ec_order_ext_info")
	private List<EcOrderExtInfo> extInfo;

	/**
	 * 订单商品信息列表
	 */
	@ApiListField("goods_info")
	@ApiField("ec_order_goods_info")
	private List<EcOrderGoodsInfo> goodsInfo;

	/**
	 * 商家侧订单实际创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单修改时间较晚的信息会被最终存储
	 */
	@ApiField("order_modified_time")
	private Date orderModifiedTime;

	/**
	 * 商家侧订单实际支付时间
	 */
	@ApiField("order_pay_time")
	private Date orderPayTime;

	/**
	 * 商家侧自定义订单号，同一笔订单必须保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商家侧订单实际支付金额，金额单位为元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 订单发生的平台，默认为Alipay
	 */
	@ApiField("source_app")
	private String sourceApp;

	/**
	 * 商家侧订单使用支付宝支付时，对应的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public List<EcOrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<EcOrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public List<EcOrderGoodsInfo> getGoodsInfo() {
		return this.goodsInfo;
	}
	public void setGoodsInfo(List<EcOrderGoodsInfo> goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderModifiedTime() {
		return this.orderModifiedTime;
	}
	public void setOrderModifiedTime(Date orderModifiedTime) {
		this.orderModifiedTime = orderModifiedTime;
	}

	public Date getOrderPayTime() {
		return this.orderPayTime;
	}
	public void setOrderPayTime(Date orderPayTime) {
		this.orderPayTime = orderPayTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getSourceApp() {
		return this.sourceApp;
	}
	public void setSourceApp(String sourceApp) {
		this.sourceApp = sourceApp;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

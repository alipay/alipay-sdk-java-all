package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 收单交易
 *
 * @author auto create
 * @since 1.0, 2023-06-21 13:57:34
 */
public class AcquireOrder extends AlipayObject {

	private static final long serialVersionUID = 7858757956337628724L;

	/**
	 * 买家外部业务平台会员ID
	 */
	@ApiField("buyer_out_member_id")
	private ReferenceId buyerOutMemberId;

	/**
	 * 商品
	 */
	@ApiListField("goods")
	@ApiField("payment_goods")
	private List<PaymentGoods> goods;

	/**
	 * 订单金额。单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 交易创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单币种
	 */
	@ApiField("order_currency")
	private String orderCurrency;

	/**
	 * 交易超时自动关单时间。
	 */
	@ApiField("order_expiry_time")
	private Date orderExpiryTime;

	/**
	 * 外部业务平台交易号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 交易备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 卖家外部业务平台会员ID
	 */
	@ApiField("seller_out_member_id")
	private ReferenceId sellerOutMemberId;

	/**
	 * 物流地址
	 */
	@ApiField("shipping")
	private Shipping shipping;

	public ReferenceId getBuyerOutMemberId() {
		return this.buyerOutMemberId;
	}
	public void setBuyerOutMemberId(ReferenceId buyerOutMemberId) {
		this.buyerOutMemberId = buyerOutMemberId;
	}

	public List<PaymentGoods> getGoods() {
		return this.goods;
	}
	public void setGoods(List<PaymentGoods> goods) {
		this.goods = goods;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderCurrency() {
		return this.orderCurrency;
	}
	public void setOrderCurrency(String orderCurrency) {
		this.orderCurrency = orderCurrency;
	}

	public Date getOrderExpiryTime() {
		return this.orderExpiryTime;
	}
	public void setOrderExpiryTime(Date orderExpiryTime) {
		this.orderExpiryTime = orderExpiryTime;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public ReferenceId getSellerOutMemberId() {
		return this.sellerOutMemberId;
	}
	public void setSellerOutMemberId(ReferenceId sellerOutMemberId) {
		this.sellerOutMemberId = sellerOutMemberId;
	}

	public Shipping getShipping() {
		return this.shipping;
	}
	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

}

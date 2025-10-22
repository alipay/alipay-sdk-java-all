package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 提交订单/更新订单使用的数据类型
 *
 * @author auto create
 * @since 1.0, 2023-09-14 14:11:19
 */
public class OrderSubmitContent extends AlipayObject {

	private static final long serialVersionUID = 5475989596933219682L;

	/**
	 * 订单收货人姓名，外层字段method_name为上报订单时必选
	 */
	@ApiField("consignee_name")
	private String consigneeName;

	/**
	 * 收货人电话。外层字段method_name为上报订单时必选
	 */
	@ApiField("consignee_phone")
	private String consigneePhone;

	/**
	 * 收货地址。外层字段method_name为上报订单时必选
	 */
	@ApiField("delivery_address")
	private String deliveryAddress;

	/**
	 * 订单优惠价格，单位：元
	 */
	@ApiField("discount_fee")
	private String discountFee;

	/**
	 * 订单物流信息
	 */
	@ApiField("logistics_info")
	private String logisticsInfo;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单跳转地址，小程序内部页面。外层字段method_name为上报订单时必选
	 */
	@ApiField("order_url")
	private String orderUrl;

	/**
	 * 订单原价格，单位：元
	 */
	@ApiField("origin_fee")
	private String originFee;

	/**
	 * 外部订单号
outOrderId唯一对应一笔订单，相同的订单需传入相同的outOrderId
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 支付日期，外层字段method_name为上报订单时必选
	 */
	@ApiField("pay_date")
	private Date payDate;

	/**
	 * 订单支付价格(=整单原价-整单优惠金额+运费)，单位为【元】。外层字段method_name为上报订单时必选
	 */
	@ApiField("pay_fee")
	private String payFee;

	/**
	 * 店铺名称。外层字段method_name为上报订单时必选
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺url跳转地址。外层字段method_name为上报订单时必选
	 */
	@ApiField("shop_url")
	private String shopUrl;

	/**
	 * 子订单信息列表。外层参数method_name为上报订单时必选
	 */
	@ApiListField("unimall_sub_orders")
	@ApiField("sub_order_content")
	private List<SubOrderContent> unimallSubOrders;

	public String getConsigneeName() {
		return this.consigneeName;
	}
	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}

	public String getConsigneePhone() {
		return this.consigneePhone;
	}
	public void setConsigneePhone(String consigneePhone) {
		this.consigneePhone = consigneePhone;
	}

	public String getDeliveryAddress() {
		return this.deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public String getLogisticsInfo() {
		return this.logisticsInfo;
	}
	public void setLogisticsInfo(String logisticsInfo) {
		this.logisticsInfo = logisticsInfo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderUrl() {
		return this.orderUrl;
	}
	public void setOrderUrl(String orderUrl) {
		this.orderUrl = orderUrl;
	}

	public String getOriginFee() {
		return this.originFee;
	}
	public void setOriginFee(String originFee) {
		this.originFee = originFee;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public Date getPayDate() {
		return this.payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public String getPayFee() {
		return this.payFee;
	}
	public void setPayFee(String payFee) {
		this.payFee = payFee;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopUrl() {
		return this.shopUrl;
	}
	public void setShopUrl(String shopUrl) {
		this.shopUrl = shopUrl;
	}

	public List<SubOrderContent> getUnimallSubOrders() {
		return this.unimallSubOrders;
	}
	public void setUnimallSubOrders(List<SubOrderContent> unimallSubOrders) {
		this.unimallSubOrders = unimallSubOrders;
	}

}

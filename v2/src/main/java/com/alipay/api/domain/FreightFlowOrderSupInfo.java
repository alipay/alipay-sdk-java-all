package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单数据大字段，用于安全防控
 *
 * @author auto create
 * @since 1.0, 2025-12-15 10:37:42
 */
public class FreightFlowOrderSupInfo extends AlipayObject {

	private static final long serialVersionUID = 7365545263423682914L;

	/**
	 * 收货人电话
	 */
	@ApiField("buyer_cell_phone")
	private String buyerCellPhone;

	/**
	 * 收货人城市
	 */
	@ApiField("buyer_city")
	private String buyerCity;

	/**
	 * 收货人姓名
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 收货人省份
	 */
	@ApiField("buyer_province")
	private String buyerProvince;

	/**
	 * 发货时间
	 */
	@ApiField("deliver_time")
	private String deliverTime;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 下单时间
	 */
	@ApiField("order_time")
	private String orderTime;

	/**
	 * 收货时间
	 */
	@ApiField("receive_time")
	private String receiveTime;

	/**
	 * 发货人绑定银行卡号
	 */
	@ApiField("seller_card_no")
	private String sellerCardNo;

	/**
	 * 发货人电话
	 */
	@ApiField("seller_cell_phone")
	private String sellerCellPhone;

	/**
	 * 发货人城市
	 */
	@ApiField("seller_city")
	private String sellerCity;

	/**
	 * 发货人姓名
	 */
	@ApiField("seller_name")
	private String sellerName;

	/**
	 * 创单人唯一id
	 */
	@ApiField("seller_out_id")
	private String sellerOutId;

	/**
	 * 发货人省份
	 */
	@ApiField("seller_province")
	private String sellerProvince;

	public String getBuyerCellPhone() {
		return this.buyerCellPhone;
	}
	public void setBuyerCellPhone(String buyerCellPhone) {
		this.buyerCellPhone = buyerCellPhone;
	}

	public String getBuyerCity() {
		return this.buyerCity;
	}
	public void setBuyerCity(String buyerCity) {
		this.buyerCity = buyerCity;
	}

	public String getBuyerName() {
		return this.buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerProvince() {
		return this.buyerProvince;
	}
	public void setBuyerProvince(String buyerProvince) {
		this.buyerProvince = buyerProvince;
	}

	public String getDeliverTime() {
		return this.deliverTime;
	}
	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getReceiveTime() {
		return this.receiveTime;
	}
	public void setReceiveTime(String receiveTime) {
		this.receiveTime = receiveTime;
	}

	public String getSellerCardNo() {
		return this.sellerCardNo;
	}
	public void setSellerCardNo(String sellerCardNo) {
		this.sellerCardNo = sellerCardNo;
	}

	public String getSellerCellPhone() {
		return this.sellerCellPhone;
	}
	public void setSellerCellPhone(String sellerCellPhone) {
		this.sellerCellPhone = sellerCellPhone;
	}

	public String getSellerCity() {
		return this.sellerCity;
	}
	public void setSellerCity(String sellerCity) {
		this.sellerCity = sellerCity;
	}

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerOutId() {
		return this.sellerOutId;
	}
	public void setSellerOutId(String sellerOutId) {
		this.sellerOutId = sellerOutId;
	}

	public String getSellerProvince() {
		return this.sellerProvince;
	}
	public void setSellerProvince(String sellerProvince) {
		this.sellerProvince = sellerProvince;
	}

}

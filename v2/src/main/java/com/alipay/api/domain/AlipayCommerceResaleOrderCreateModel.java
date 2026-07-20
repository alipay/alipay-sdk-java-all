package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 二手售卖订单创建
 *
 * @author auto create
 * @since 1.0, 2026-04-27 17:22:45
 */
public class AlipayCommerceResaleOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7339242333193754935L;

	/**
	 * 收货地址信息，邮寄方式需要输入
	 */
	@ApiField("address_info")
	private ResaleAddressVO addressInfo;

	/**
	 * null
	 */
	@ApiListField("item_info_list")
	@ApiField("resale_order_item_v_o")
	private List<ResaleOrderItemVO> itemInfoList;

	/**
	 * 支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单总金额
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单详情地址
	 */
	@ApiField("order_detail_url")
	private String orderDetailUrl;

	/**
	 * 订单备注
	 */
	@ApiField("order_memo")
	private String orderMemo;

	/**
	 * 订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商家订单编号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 3C：DIGITAL
卡券：VOUCHER
	 */
	@ApiField("service_category")
	private String serviceCategory;

	/**
	 * 小程序使用checkBeforeOrder()获取
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public ResaleAddressVO getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(ResaleAddressVO addressInfo) {
		this.addressInfo = addressInfo;
	}

	public List<ResaleOrderItemVO> getItemInfoList() {
		return this.itemInfoList;
	}
	public void setItemInfoList(List<ResaleOrderItemVO> itemInfoList) {
		this.itemInfoList = itemInfoList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderDetailUrl() {
		return this.orderDetailUrl;
	}
	public void setOrderDetailUrl(String orderDetailUrl) {
		this.orderDetailUrl = orderDetailUrl;
	}

	public String getOrderMemo() {
		return this.orderMemo;
	}
	public void setOrderMemo(String orderMemo) {
		this.orderMemo = orderMemo;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getServiceCategory() {
		return this.serviceCategory;
	}
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文体中心订单数据同步
 *
 * @author auto create
 * @since 1.0, 2021-11-09 09:56:37
 */
public class AlipayCommerceSportsVenueOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8538727538416837769L;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 订单交易状态,pay_succ-已支付（若支持多次核销则在全部核销之前都是已支付状态）,refund_succ-已退款,verify_succ-已使用。
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单类型，venue_reverse-场馆预订单
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 服务商内部唯一订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 收款方pid，对应交易的seller_id
	 */
	@ApiField("payee_id")
	private String payeeId;

	/**
	 * 订单商品信息列表
	 */
	@ApiListField("product_group_list")
	@ApiField("product_simple_info")
	private List<ProductSimpleInfo> productGroupList;

	/**
	 * 退款截止时间。默认为空表示不能由用户发起退款；如果不为空，则在该时间之前用户可以发起退款。
	 */
	@ApiField("refund_end_time")
	private String refundEndTime;

	/**
	 * 支付宝退款请求号，订单若为退款成功则该字段必填
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	/**
	 * 支付宝子场馆ID，场馆入驻时支付宝返回的子场馆ID
	 */
	@ApiField("sub_venue_id")
	private String subVenueId;

	/**
	 * 订单总金额(单位：元)
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 买家支付宝用户ID,2088开头的16位纯数字
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 支付宝主场馆ID，场馆入驻时支付宝返回的主场馆ID
	 */
	@ApiField("venue_id")
	private String venueId;

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPayeeId() {
		return this.payeeId;
	}
	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}

	public List<ProductSimpleInfo> getProductGroupList() {
		return this.productGroupList;
	}
	public void setProductGroupList(List<ProductSimpleInfo> productGroupList) {
		this.productGroupList = productGroupList;
	}

	public String getRefundEndTime() {
		return this.refundEndTime;
	}
	public void setRefundEndTime(String refundEndTime) {
		this.refundEndTime = refundEndTime;
	}

	public String getRefundRequestNo() {
		return this.refundRequestNo;
	}
	public void setRefundRequestNo(String refundRequestNo) {
		this.refundRequestNo = refundRequestNo;
	}

	public String getSubVenueId() {
		return this.subVenueId;
	}
	public void setSubVenueId(String subVenueId) {
		this.subVenueId = subVenueId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVenueId() {
		return this.venueId;
	}
	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}

}

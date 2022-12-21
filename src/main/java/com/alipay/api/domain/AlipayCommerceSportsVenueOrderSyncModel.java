package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文体中心订单数据同步
 *
 * @author auto create
 * @since 1.0, 2022-12-09 17:05:17
 */
public class AlipayCommerceSportsVenueOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4491574244371372478L;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 买家支付宝OPENID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单交易状态,pay_succ-已支付（若支持多次核销则在全部核销之前都是已支付状态）,refund_succ-已退款,verify_proc-使用中（已入场但是还未结束）,verify_succ-已使用,overdue-已过期（超过使用时间未使用且未退款）
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单类型，venue_reserve-场馆预订单
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 服务商内部唯一订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * isv子场馆id，与场馆入驻时一致，须保证系统内唯一。如果在场馆入驻时有子场馆则传入入住时的out_sub_venue_id；如果场馆入驻时不存在子场馆，则无须传入。
	 */
	@ApiField("out_sub_venue_id")
	private String outSubVenueId;

	/**
	 * isv场馆id，与场馆入驻时一致，须保证系统内唯一。和venue_id之间至少存在一个
	 */
	@ApiField("out_venue_id")
	private String outVenueId;

	/**
	 * 订单商品信息列表，目前仅支持1笔订单1条商品信息数据，即一笔订单只能包含1种商品。
	 */
	@ApiListField("product_group_list")
	@ApiField("product_simple_info")
	private List<ProductSimpleInfo> productGroupList;

	/**
	 * 支付宝子场馆ID，场馆入驻时支付宝返回的子场馆ID。如果在场馆入驻时有子场馆则传入入驻时返回的sub_venue_id；如果场馆入驻时不存在子场馆，则无须传入。
	 */
	@ApiField("sub_venue_id")
	private String subVenueId;

	/**
	 * 订单总金额(单位：元)
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 订单的交易信息列表，传入支付、退款等操作的信息。第一次同步必传；第一次同步之后如果没有交易变化则调用时可以不传本参数。每一条交易数据同步后不支持修改。
	 */
	@ApiListField("trade_info_list")
	@ApiField("venue_order_trade_info")
	private List<VenueOrderTradeInfo> tradeInfoList;

	/**
	 * 买家支付宝用户ID,2088开头的16位纯数字
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 支付宝主场馆ID，场馆入驻时支付宝返回的主场馆ID。和out_venue_id之间至少存在一个
	 */
	@ApiField("venue_id")
	private String venueId;

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public String getOutSubVenueId() {
		return this.outSubVenueId;
	}
	public void setOutSubVenueId(String outSubVenueId) {
		this.outSubVenueId = outSubVenueId;
	}

	public String getOutVenueId() {
		return this.outVenueId;
	}
	public void setOutVenueId(String outVenueId) {
		this.outVenueId = outVenueId;
	}

	public List<ProductSimpleInfo> getProductGroupList() {
		return this.productGroupList;
	}
	public void setProductGroupList(List<ProductSimpleInfo> productGroupList) {
		this.productGroupList = productGroupList;
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

	public List<VenueOrderTradeInfo> getTradeInfoList() {
		return this.tradeInfoList;
	}
	public void setTradeInfoList(List<VenueOrderTradeInfo> tradeInfoList) {
		this.tradeInfoList = tradeInfoList;
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

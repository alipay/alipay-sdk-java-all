package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单信息
 *
 * @author auto create
 * @since 1.0, 2021-01-28 22:53:43
 */
public class IoTBPaaSMerchantOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 2892896687373676954L;

	/**
	 * 优惠活动信息列表
	 */
	@ApiListField("activity_item_list")
	@ApiField("io_t_b_paa_s_merchant_order_item_info")
	private List<IoTBPaaSMerchantOrderItemInfo> activityItemList;

	/**
	 * 外送费
	 */
	@ApiField("courier_fee")
	private String courierFee;

	/**
	 * 顾客性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 外送地址,外卖订单才有
	 */
	@ApiField("order_address")
	private String orderAddress;

	/**
	 * 买家联系方式,外卖订单才有
	 */
	@ApiField("order_contact")
	private String orderContact;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商品列表
	 */
	@ApiListField("order_item_list")
	@ApiField("io_t_b_paa_s_merchant_order_item_info")
	private List<IoTBPaaSMerchantOrderItemInfo> orderItemList;

	/**
	 * 商品总数量
	 */
	@ApiField("order_item_total_quantity")
	private String orderItemTotalQuantity;

	/**
	 * 订单备注
	 */
	@ApiField("order_memo")
	private String orderMemo;

	/**
	 * 取餐号
	 */
	@ApiField("order_num")
	private String orderNum;

	/**
	 * 订单总价
	 */
	@ApiField("order_price")
	private String orderPrice;

	/**
	 * 订单实际价格
	 */
	@ApiField("order_real_price")
	private String orderRealPrice;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_time")
	private String orderTime;

	/**
	 * 到店订单类型:SHOP_SERVICE
到家订单类型:HOME_SERVICE
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 打包费
	 */
	@ApiField("package_fee")
	private String packageFee;

	/**
	 * 必填信息
	 */
	@ApiListField("require_info_list")
	@ApiField("io_t_b_paa_s_merchant_order_require_info")
	private List<IoTBPaaSMerchantOrderRequireInfo> requireInfoList;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 桌号
	 */
	@ApiField("table_name")
	private String tableName;

	/**
	 * 顾客姓名,脱敏处理
	 */
	@ApiField("user_name")
	private String userName;

	public List<IoTBPaaSMerchantOrderItemInfo> getActivityItemList() {
		return this.activityItemList;
	}
	public void setActivityItemList(List<IoTBPaaSMerchantOrderItemInfo> activityItemList) {
		this.activityItemList = activityItemList;
	}

	public String getCourierFee() {
		return this.courierFee;
	}
	public void setCourierFee(String courierFee) {
		this.courierFee = courierFee;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOrderAddress() {
		return this.orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public String getOrderContact() {
		return this.orderContact;
	}
	public void setOrderContact(String orderContact) {
		this.orderContact = orderContact;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<IoTBPaaSMerchantOrderItemInfo> getOrderItemList() {
		return this.orderItemList;
	}
	public void setOrderItemList(List<IoTBPaaSMerchantOrderItemInfo> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public String getOrderItemTotalQuantity() {
		return this.orderItemTotalQuantity;
	}
	public void setOrderItemTotalQuantity(String orderItemTotalQuantity) {
		this.orderItemTotalQuantity = orderItemTotalQuantity;
	}

	public String getOrderMemo() {
		return this.orderMemo;
	}
	public void setOrderMemo(String orderMemo) {
		this.orderMemo = orderMemo;
	}

	public String getOrderNum() {
		return this.orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getOrderPrice() {
		return this.orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderRealPrice() {
		return this.orderRealPrice;
	}
	public void setOrderRealPrice(String orderRealPrice) {
		this.orderRealPrice = orderRealPrice;
	}

	public String getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getPackageFee() {
		return this.packageFee;
	}
	public void setPackageFee(String packageFee) {
		this.packageFee = packageFee;
	}

	public List<IoTBPaaSMerchantOrderRequireInfo> getRequireInfoList() {
		return this.requireInfoList;
	}
	public void setRequireInfoList(List<IoTBPaaSMerchantOrderRequireInfo> requireInfoList) {
		this.requireInfoList = requireInfoList;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getTableName() {
		return this.tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}

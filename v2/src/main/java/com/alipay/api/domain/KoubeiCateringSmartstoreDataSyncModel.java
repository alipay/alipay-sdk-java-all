package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智慧门店的ISV数据记录回流
 *
 * @author auto create
 * @since 1.0, 2022-11-22 15:13:38
 */
public class KoubeiCateringSmartstoreDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2411256937574484684L;

	/**
	 * 烘焙商品操作模型，如果是传输烘焙商品操作数据，此模型需要赋值，其他业务无需关心此字段
	 */
	@ApiField("baking_item_operation_data")
	private BakingItemOperationData bakingItemOperationData;

	/**
	 * 浏览过的商品，格式英文逗号分隔
	 */
	@ApiField("browse_dishs")
	private String browseDishs;

	/**
	 * 浏览时长，单位分钟
	 */
	@ApiField("browse_time")
	private String browseTime;

	/**
	 * 是否购买蛋糕，Y成功 N不成功
	 */
	@ApiField("buy_result")
	private String buyResult;

	/**
	 * 商户开柜时间
	 */
	@ApiField("cabinet_open_time")
	private Date cabinetOpenTime;

	/**
	 * 用户取餐时间
	 */
	@ApiField("carry_time")
	private Date carryTime;

	/**
	 * 送餐完成时间
	 */
	@ApiField("delivery_end_time")
	private Date deliveryEndTime;

	/**
	 * 开始送餐时间
	 */
	@ApiField("delivery_start_time")
	private Date deliveryStartTime;

	/**
	 * 留言描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 订单优惠金额，单位元
	 */
	@ApiField("discount_price")
	private String discountPrice;

	/**
	 * 子订单优惠金额，单位元
	 */
	@ApiField("item_discount_price")
	private String itemDiscountPrice;

	/**
	 * 子订单号
	 */
	@ApiField("item_order_id")
	private String itemOrderId;

	/**
	 * 子订单名称
	 */
	@ApiField("item_order_name")
	private String itemOrderName;

	/**
	 * 子订单价格，单位元
	 */
	@ApiField("item_price")
	private String itemPrice;

	/**
	 * 子订单份数
	 */
	@ApiField("item_quantity")
	private String itemQuantity;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 主订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 开始点单时间
	 */
	@ApiField("order_start_time")
	private Date orderStartTime;

	/**
	 * 订单类型；门店堂食：dish，门店打包：pack，预约堂食：book_dish，预约打包：book_pack
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 支付方式，微信：wechat，支付宝：alipay，现金：cash，银行卡：card，储值卡：value
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 用餐人数
	 */
	@ApiField("people")
	private String people;

	/**
	 * 识别完成时间
	 */
	@ApiField("recognize_end_time")
	private String recognizeEndTime;

	/**
	 * 开始识别时间
	 */
	@ApiField("recognize_start_time")
	private String recognizeStartTime;

	/**
	 * 是否识别成功，Y成功 N不成功
	 */
	@ApiField("recognize_succeed")
	private String recognizeSucceed;

	/**
	 * 推荐菜品。格式：菜品名称，以英文逗号分隔
	 */
	@ApiField("recommend_dishs")
	private String recommendDishs;

	/**
	 * 退款金额，单位元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款理由
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款时间
	 */
	@ApiField("refund_time")
	private String refundTime;

	/**
	 * 场景
点餐：dishOrder
取餐柜：diningCabinet
零售柜：retailCabinet
图像识别：imageRecognize
RFID识别：RFID
人脸识别支付：facePay
蛋糕屏：cakeScreen
送餐机器人：diningRobot
烘焙商品操作：bakingItemOperation
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 桌号
	 */
	@ApiField("table_number")
	private String tableNumber;

	/**
	 * 订单总金额，单位元
	 */
	@ApiField("total_price")
	private String totalPrice;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public BakingItemOperationData getBakingItemOperationData() {
		return this.bakingItemOperationData;
	}
	public void setBakingItemOperationData(BakingItemOperationData bakingItemOperationData) {
		this.bakingItemOperationData = bakingItemOperationData;
	}

	public String getBrowseDishs() {
		return this.browseDishs;
	}
	public void setBrowseDishs(String browseDishs) {
		this.browseDishs = browseDishs;
	}

	public String getBrowseTime() {
		return this.browseTime;
	}
	public void setBrowseTime(String browseTime) {
		this.browseTime = browseTime;
	}

	public String getBuyResult() {
		return this.buyResult;
	}
	public void setBuyResult(String buyResult) {
		this.buyResult = buyResult;
	}

	public Date getCabinetOpenTime() {
		return this.cabinetOpenTime;
	}
	public void setCabinetOpenTime(Date cabinetOpenTime) {
		this.cabinetOpenTime = cabinetOpenTime;
	}

	public Date getCarryTime() {
		return this.carryTime;
	}
	public void setCarryTime(Date carryTime) {
		this.carryTime = carryTime;
	}

	public Date getDeliveryEndTime() {
		return this.deliveryEndTime;
	}
	public void setDeliveryEndTime(Date deliveryEndTime) {
		this.deliveryEndTime = deliveryEndTime;
	}

	public Date getDeliveryStartTime() {
		return this.deliveryStartTime;
	}
	public void setDeliveryStartTime(Date deliveryStartTime) {
		this.deliveryStartTime = deliveryStartTime;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDiscountPrice() {
		return this.discountPrice;
	}
	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getItemDiscountPrice() {
		return this.itemDiscountPrice;
	}
	public void setItemDiscountPrice(String itemDiscountPrice) {
		this.itemDiscountPrice = itemDiscountPrice;
	}

	public String getItemOrderId() {
		return this.itemOrderId;
	}
	public void setItemOrderId(String itemOrderId) {
		this.itemOrderId = itemOrderId;
	}

	public String getItemOrderName() {
		return this.itemOrderName;
	}
	public void setItemOrderName(String itemOrderName) {
		this.itemOrderName = itemOrderName;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemQuantity() {
		return this.itemQuantity;
	}
	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getOrderStartTime() {
		return this.orderStartTime;
	}
	public void setOrderStartTime(Date orderStartTime) {
		this.orderStartTime = orderStartTime;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPeople() {
		return this.people;
	}
	public void setPeople(String people) {
		this.people = people;
	}

	public String getRecognizeEndTime() {
		return this.recognizeEndTime;
	}
	public void setRecognizeEndTime(String recognizeEndTime) {
		this.recognizeEndTime = recognizeEndTime;
	}

	public String getRecognizeStartTime() {
		return this.recognizeStartTime;
	}
	public void setRecognizeStartTime(String recognizeStartTime) {
		this.recognizeStartTime = recognizeStartTime;
	}

	public String getRecognizeSucceed() {
		return this.recognizeSucceed;
	}
	public void setRecognizeSucceed(String recognizeSucceed) {
		this.recognizeSucceed = recognizeSucceed;
	}

	public String getRecommendDishs() {
		return this.recommendDishs;
	}
	public void setRecommendDishs(String recommendDishs) {
		this.recommendDishs = recommendDishs;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTableNumber() {
		return this.tableNumber;
	}
	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}

	public String getTotalPrice() {
		return this.totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

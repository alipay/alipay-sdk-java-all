package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步工牌消费信息
 *
 * @author auto create
 * @since 1.0, 2024-03-11 13:36:01
 */
public class AlipayDigitalmgmtDcmealMightydataInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3335615189436649181L;

	/**
	 * 交易时间毫秒级时间戳
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 园区名称
	 */
	@ApiField("campus_name")
	private String campusName;

	/**
	 * 城市名称，需要包含“市”，如杭州市
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 智盘平台菜品信息
	 */
	@ApiListField("dish_details")
	@ApiField("dcmeal_dish_detail")
	private List<DcmealDishDetail> dishDetails;

	/**
	 * 餐次，早参(breakfast),午餐(lunch)，晚餐(dinner)，夜宵(night)
	 */
	@ApiField("meal_type")
	private String mealType;

	/**
	 * 如果是刷卡，传卡号。 如果是企业码，传uuid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单类型，付款/退款，consume为付款，refund为退款
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 支付详情，具体参考接口文档，json字符串存储。
	 */
	@ApiListField("pay_details")
	@ApiField("dcmeal_pay_detail")
	private List<DcmealPayDetail> payDetails;

	/**
	 * 支付方式，刷卡(card)/刷脸(face)/扫码(qrcode)
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 订单发生的餐厅名称
	 */
	@ApiField("restaurant_name")
	private String restaurantName;

	/**
	 * 产生订单的档口名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 终端订单号
	 */
	@ApiField("term_document_id")
	private String termDocumentId;

	/**
	 * 发生支付的档口编码
	 */
	@ApiField("term_name")
	private String termName;

	/**
	 * 消费金额，单位元。保留两位小数
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 刷卡支付时可为空，企业码时为订单号，不可为空
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 如果是刷卡，传卡号。 如果是企业码，传uuid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 智盘平台seq，全局唯一
	 */
	@ApiField("uuid")
	private String uuid;

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getCampusName() {
		return this.campusName;
	}
	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<DcmealDishDetail> getDishDetails() {
		return this.dishDetails;
	}
	public void setDishDetails(List<DcmealDishDetail> dishDetails) {
		this.dishDetails = dishDetails;
	}

	public String getMealType() {
		return this.mealType;
	}
	public void setMealType(String mealType) {
		this.mealType = mealType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public List<DcmealPayDetail> getPayDetails() {
		return this.payDetails;
	}
	public void setPayDetails(List<DcmealPayDetail> payDetails) {
		this.payDetails = payDetails;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getRestaurantName() {
		return this.restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getTermDocumentId() {
		return this.termDocumentId;
	}
	public void setTermDocumentId(String termDocumentId) {
		this.termDocumentId = termDocumentId;
	}

	public String getTermName() {
		return this.termName;
	}
	public void setTermName(String termName) {
		this.termName = termName;
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

	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}

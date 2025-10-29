package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Voyager商户订单状态变更通知接口
 *
 * @author auto create
 * @since 1.0, 2025-08-22 10:10:14
 */
public class AlipayVoyagerIndustryOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1389988247526883951L;

	/**
	 * 买家信息
	 */
	@ApiField("buyer_info")
	private Buyer buyerInfo;

	/**
	 * 优惠金额
	 */
	@ApiField("discount_amount")
	private AmountDTO discountAmount;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("string")
	private List<String> extInfo;

	/**
	 * 行业编码。由voyager分配给各个小程序透传过来。
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 商品信息
	 */
	@ApiListField("item_order_list")
	@ApiField("travel_item_info")
	private List<TravelItemInfo> itemOrderList;

	/**
	 * 物流信息
	 */
	@ApiListField("logistics_info_list")
	@ApiField("traveler_logistics_info")
	private List<TravelerLogisticsInfo> logisticsInfoList;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识，可传user_id，不传open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单金额
	 */
	@ApiField("order_amount")
	private AmountDTO orderAmount;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private String orderCreateTime;

	/**
	 * 订单修改时间
	 */
	@ApiField("order_modified_time")
	private String orderModifiedTime;

	/**
	 * 支付时间
	 */
	@ApiField("order_pay_time")
	private String orderPayTime;

	/**
	 * 外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付金额
	 */
	@ApiField("pay_amount")
	private AmountDTO payAmount;

	/**
	 * 支付宝给商户的支付订单号
	 */
	@ApiField("payment_no")
	private String paymentNo;

	/**
	 * 来源APP
	 */
	@ApiField("source_app")
	private String sourceApp;

	/**
	 * 支付宝用户的userId，可传openid，不传userid。
	 */
	@ApiField("user_id")
	private String userId;

	public Buyer getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(Buyer buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

	public AmountDTO getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(AmountDTO discountAmount) {
		this.discountAmount = discountAmount;
	}

	public List<String> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<String> extInfo) {
		this.extInfo = extInfo;
	}

	public String getIndustryCode() {
		return this.industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public List<TravelItemInfo> getItemOrderList() {
		return this.itemOrderList;
	}
	public void setItemOrderList(List<TravelItemInfo> itemOrderList) {
		this.itemOrderList = itemOrderList;
	}

	public List<TravelerLogisticsInfo> getLogisticsInfoList() {
		return this.logisticsInfoList;
	}
	public void setLogisticsInfoList(List<TravelerLogisticsInfo> logisticsInfoList) {
		this.logisticsInfoList = logisticsInfoList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public AmountDTO getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(AmountDTO orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderModifiedTime() {
		return this.orderModifiedTime;
	}
	public void setOrderModifiedTime(String orderModifiedTime) {
		this.orderModifiedTime = orderModifiedTime;
	}

	public String getOrderPayTime() {
		return this.orderPayTime;
	}
	public void setOrderPayTime(String orderPayTime) {
		this.orderPayTime = orderPayTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public AmountDTO getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(AmountDTO payAmount) {
		this.payAmount = payAmount;
	}

	public String getPaymentNo() {
		return this.paymentNo;
	}
	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}

	public String getSourceApp() {
		return this.sourceApp;
	}
	public void setSourceApp(String sourceApp) {
		this.sourceApp = sourceApp;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

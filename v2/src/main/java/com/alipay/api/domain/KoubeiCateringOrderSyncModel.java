package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单同步
 *
 * @author auto create
 * @since 1.0, 2022-07-06 19:53:14
 */
public class KoubeiCateringOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3741452243681447769L;

	/**
	 * 订单向下调整金额
	 */
	@ApiField("adjust_amount")
	private String adjustAmount;

	/**
	 * 订单总金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * "可枚举的业务产品类型
(1)KB_ORDER_DISHES 立即就餐
(2) KB_RESERVATION 预约点餐"
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 可枚举的业务类型。
DINNER：正餐；
SNACK：快餐；
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 可枚举的就餐方式。
FOR_HERE：堂食；
TAKE_OUT：外卖；
TO_GO：外带
	 */
	@ApiField("dinner_type")
	private String dinnerType;

	/**
	 * 订单优惠金额；
包括但不限于：
(1) 单品优惠；
(2) 订单满减优惠；
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 订单优惠明细信息，包括优惠名称及对应的优惠金额；
	 */
	@ApiListField("discount_infos")
	@ApiField("discount_infos")
	private List<DiscountInfos> discountInfos;

	/**
	 * 菜品金额之和
	 */
	@ApiField("dish_amount")
	private String dishAmount;

	/**
	 * 菜品明细列表
	 */
	@ApiListField("dish_list")
	@ApiField("dish_list")
	private List<DishList> dishList;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 在线支付金额
	 */
	@ApiField("koubei_payment_amount")
	private String koubeiPaymentAmount;

	/**
	 * POS支付的金额，为POS侧支付成功的订单金额之和；
	 */
	@ApiField("offline_payment_amount")
	private String offlinePaymentAmount;

	/**
	 * 口碑的订单号，口碑推单时传入
特别说明：
(1)在POS侧未做任何接单线上推单前，这个值可能为空；比如，收银员开台并点菜；
(2)在POS侧接单后，口碑订单号写入POS侧；本服务查询时，需要能回传给口碑；
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 可枚举的点餐方式。
POS：pos点餐；
SCAN：扫码点菜；
PLATFORM：平台(外卖类的)
	 */
	@ApiField("order_style")
	private String orderStyle;

	/**
	 * 2018-01-29 10:00:00
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 其他可打折的金额
	 */
	@ApiField("other_amount_discountable")
	private String otherAmountDiscountable;

	/**
	 * 对其他金额的详细说明；表达服务费、餐台费等各种费用具体的金额。
	 */
	@ApiListField("other_amount_infos")
	@ApiField("other_amount_infos")
	private List<OtherAmountInfos> otherAmountInfos;

	/**
	 * 其他不可打折的金额
	 */
	@ApiField("other_amount_undiscountable")
	private String otherAmountUndiscountable;

	/**
	 * POS订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付类型。
ADVANCE_PAYMENT：先付；
AFTER_PAYMENT：后付；
	 */
	@ApiField("pay_style")
	private String payStyle;

	/**
	 * 支付信息
	 */
	@ApiListField("payment_list")
	@ApiField("payment_list")
	private List<PaymentList> paymentList;

	/**
	 * 就餐人数
	 */
	@ApiField("people_num")
	private Long peopleNum;

	/**
	 * POS订单的版本，用于控制POS与口碑订单信息同步，避免乱序的控制机制。
特别说明：
POS侧订单信息的变化都应该能反映到订单版本中。必须保证递增
	 */
	@ApiField("pos_version")
	private Long posVersion;

	/**
	 * 订单应收金额
	 */
	@ApiField("receivable_amount")
	private String receivableAmount;

	/**
	 * 退款信息
	 */
	@ApiListField("refund_list")
	@ApiField("refund_list")
	private List<RefundList> refundList;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * "可枚举的订单状态：
WAIT_PAY: 待支付
SUCCESS: 结账 
FINISH: 反结
CLOSE: 关单"
	 */
	@ApiField("status")
	private String status;

	/**
	 * 就餐的餐台号码
	 */
	@ApiField("table_no")
	private String tableNo;

	/**
	 * 订单累计已支付金额
	 */
	@ApiField("total_paymented_amount")
	private String totalPaymentedAmount;

	/**
	 * 是否使用线上优惠的标记
(1) Y : 这是默认选项；这种情况下，订单级优惠均可使用；
(2) N：当POS侧设置了手工优惠或者其他场景不希望使用线上订单级优惠的时候，设置此标识；
此字段的使用主要是规避商家重复出优惠的问题。
	 */
	@ApiField("use_online_promotion_flag")
	private String useOnlinePromotionFlag;

	public String getAdjustAmount() {
		return this.adjustAmount;
	}
	public void setAdjustAmount(String adjustAmount) {
		this.adjustAmount = adjustAmount;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getDinnerType() {
		return this.dinnerType;
	}
	public void setDinnerType(String dinnerType) {
		this.dinnerType = dinnerType;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public List<DiscountInfos> getDiscountInfos() {
		return this.discountInfos;
	}
	public void setDiscountInfos(List<DiscountInfos> discountInfos) {
		this.discountInfos = discountInfos;
	}

	public String getDishAmount() {
		return this.dishAmount;
	}
	public void setDishAmount(String dishAmount) {
		this.dishAmount = dishAmount;
	}

	public List<DishList> getDishList() {
		return this.dishList;
	}
	public void setDishList(List<DishList> dishList) {
		this.dishList = dishList;
	}

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

	public String getKoubeiPaymentAmount() {
		return this.koubeiPaymentAmount;
	}
	public void setKoubeiPaymentAmount(String koubeiPaymentAmount) {
		this.koubeiPaymentAmount = koubeiPaymentAmount;
	}

	public String getOfflinePaymentAmount() {
		return this.offlinePaymentAmount;
	}
	public void setOfflinePaymentAmount(String offlinePaymentAmount) {
		this.offlinePaymentAmount = offlinePaymentAmount;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStyle() {
		return this.orderStyle;
	}
	public void setOrderStyle(String orderStyle) {
		this.orderStyle = orderStyle;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getOtherAmountDiscountable() {
		return this.otherAmountDiscountable;
	}
	public void setOtherAmountDiscountable(String otherAmountDiscountable) {
		this.otherAmountDiscountable = otherAmountDiscountable;
	}

	public List<OtherAmountInfos> getOtherAmountInfos() {
		return this.otherAmountInfos;
	}
	public void setOtherAmountInfos(List<OtherAmountInfos> otherAmountInfos) {
		this.otherAmountInfos = otherAmountInfos;
	}

	public String getOtherAmountUndiscountable() {
		return this.otherAmountUndiscountable;
	}
	public void setOtherAmountUndiscountable(String otherAmountUndiscountable) {
		this.otherAmountUndiscountable = otherAmountUndiscountable;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPayStyle() {
		return this.payStyle;
	}
	public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}

	public List<PaymentList> getPaymentList() {
		return this.paymentList;
	}
	public void setPaymentList(List<PaymentList> paymentList) {
		this.paymentList = paymentList;
	}

	public Long getPeopleNum() {
		return this.peopleNum;
	}
	public void setPeopleNum(Long peopleNum) {
		this.peopleNum = peopleNum;
	}

	public Long getPosVersion() {
		return this.posVersion;
	}
	public void setPosVersion(Long posVersion) {
		this.posVersion = posVersion;
	}

	public String getReceivableAmount() {
		return this.receivableAmount;
	}
	public void setReceivableAmount(String receivableAmount) {
		this.receivableAmount = receivableAmount;
	}

	public List<RefundList> getRefundList() {
		return this.refundList;
	}
	public void setRefundList(List<RefundList> refundList) {
		this.refundList = refundList;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTableNo() {
		return this.tableNo;
	}
	public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}

	public String getTotalPaymentedAmount() {
		return this.totalPaymentedAmount;
	}
	public void setTotalPaymentedAmount(String totalPaymentedAmount) {
		this.totalPaymentedAmount = totalPaymentedAmount;
	}

	public String getUseOnlinePromotionFlag() {
		return this.useOnlinePromotionFlag;
	}
	public void setUseOnlinePromotionFlag(String useOnlinePromotionFlag) {
		this.useOnlinePromotionFlag = useOnlinePromotionFlag;
	}

}

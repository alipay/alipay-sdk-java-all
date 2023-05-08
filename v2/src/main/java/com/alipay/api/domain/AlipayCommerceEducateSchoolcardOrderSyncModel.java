package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园卡支付订单数据同步
 *
 * @author auto create
 * @since 1.0, 2022-11-16 16:41:50
 */
public class AlipayCommerceEducateSchoolcardOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3617457381545583776L;

	/**
	 * 实际金额（总支付金额）
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/**
	 * 小程序appid
	 */
	@ApiField("applet_app_id")
	private String appletAppId;

	/**
	 * 校园卡余额
	 */
	@ApiField("card_balance")
	private String cardBalance;

	/**
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 该笔订单真实的创建时间，需精确到毫秒。时间格式为 yyyy-MM-dd HH:mm:ss.SSS。同一笔订单保持不变
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 商品信息列表
	 */
	@ApiField("goods_orders")
	private GoodsOrder goodsOrders;

	/**
	 * 商家名称，不传默认展示学校名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 订单修改时间，时间格式为 yyyy-MM-dd HH:mm:ss.SSS。用于订单状态或数据变化较快的顺序控制，防止乱序。order_modified_time较晚的同步会被最终存储，order_modified_time相同的两次同步会被幂等处理。
	 */
	@ApiField("modified_time")
	private String modifiedTime;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单金额
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单详情链接
	 */
	@ApiField("order_detail_url")
	private String orderDetailUrl;

	/**
	 * 订单状态
消费成功 CONSUME_S ；已退款：REFUNDED；
开卡成功 CARD_ACTIVED；消费失败：UN_CHARGE
充值成功 RECHARGE_S
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付地点
	 */
	@ApiField("pay_address")
	private String payAddress;

	/**
	 * 付款方式，不传默认展示学校名称+校园卡+（卡号后四位）
	 */
	@ApiField("pay_mode")
	private String payMode;

	/**
	 * 返佣pid
	 */
	@ApiField("rake_back_pid")
	private String rakeBackPid;

	/**
	 * 学校内标
	 */
	@ApiField("school_id")
	private String schoolId;

	/**
	 * 学校pid
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 服务提供者名称
	 */
	@ApiField("service_provider_name")
	private String serviceProviderName;

	/**
	 * 业务类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getAppletAppId() {
		return this.appletAppId;
	}
	public void setAppletAppId(String appletAppId) {
		this.appletAppId = appletAppId;
	}

	public String getCardBalance() {
		return this.cardBalance;
	}
	public void setCardBalance(String cardBalance) {
		this.cardBalance = cardBalance;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public GoodsOrder getGoodsOrders() {
		return this.goodsOrders;
	}
	public void setGoodsOrders(GoodsOrder goodsOrders) {
		this.goodsOrders = goodsOrders;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
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

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayAddress() {
		return this.payAddress;
	}
	public void setPayAddress(String payAddress) {
		this.payAddress = payAddress;
	}

	public String getPayMode() {
		return this.payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getRakeBackPid() {
		return this.rakeBackPid;
	}
	public void setRakeBackPid(String rakeBackPid) {
		this.rakeBackPid = rakeBackPid;
	}

	public String getSchoolId() {
		return this.schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolPid() {
		return this.schoolPid;
	}
	public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}

	public String getServiceProviderName() {
		return this.serviceProviderName;
	}
	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

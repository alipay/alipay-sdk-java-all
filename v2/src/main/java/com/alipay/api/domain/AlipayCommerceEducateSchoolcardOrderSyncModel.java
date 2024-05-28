package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园卡支付订单数据同步
 *
 * @author auto create
 * @since 1.0, 2023-08-24 18:58:09
 */
public class AlipayCommerceEducateSchoolcardOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2374781335432784655L;

	/**
	 * 实际金额（总支付金额），单位为【元】
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
	 * 128
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 校园卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 该笔订单真实的创建时间，需精确到毫秒。
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
	 * 订单修改时间
	 */
	@ApiField("modified_time")
	private String modifiedTime;

	/**
	 * 用户open_id
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
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 外部业务号，由商家自定义，128个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
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
	 * 系统商编号。该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
	 */
	@ApiField("rake_back_pid")
	private String rakeBackPid;

	/**
	 * 学校内标，录入学校接口返回的参数
	 */
	@ApiField("school_id")
	private String schoolId;

	/**
	 * 学校收款账号
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
	 * 买家支付宝用户ID。
2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权;
其它场景下获取用户ID请参考：网页授权获取用户信息;
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

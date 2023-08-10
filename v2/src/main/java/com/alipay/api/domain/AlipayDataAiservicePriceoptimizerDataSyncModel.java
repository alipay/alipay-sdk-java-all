package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能定价数据回流
 *
 * @author auto create
 * @since 1.0, 2021-04-19 15:23:26
 */
public class AlipayDataAiservicePriceoptimizerDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2755752894924177575L;

	/**
	 * 优惠算法类型，如： alipay_algo:支付宝算法 mer_algo:接入方自有算法 random:随机算法 fixed_amount:固定金额
(可不传)
	 */
	@ApiField("algo_type")
	private String algoType;

	/**
	 * 内部接口版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 原价，单位为分(可不传)
	 */
	@ApiField("base_price")
	private Long basePrice;

	/**
	 * 事件时间(可不传)
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 优惠券核销数据回流时填写 交易类型为储值卡或周期卡类型时填写，如储值卡id
(可不传)
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 市,可不传
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 扩展信息，json字符串格式。
如：对于哈啰数据回流场景，这个字段内容为
原opdata字段内容，注意在json字符串中新增priority字段表示该卡是否经过排序, 数字越小，优先级越高，-1表示没有经过排序
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 优惠券领取数据回流时填写 优惠领取方式 优惠领取方式，如： by_click:手动点击领取、 auto_recive:自动推送、 promotion:优惠活动(无券)(可不传)
	 */
	@ApiField("get_coupon_method")
	private String getCouponMethod;

	/**
	 * 代理商id(可不传)
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 操作类型，用于区分不同的数据回流类型 
coupon:优惠领取 
trade:优惠核销
(可不传)
	 */
	@ApiField("op_type")
	private String opType;

	/**
	 * 优惠券核销数据回流时填写 单位为分。接入方内部优惠后的支付价格，不考虑其他渠道（如支付渠道）叠加的优惠
(可不传)
	 */
	@ApiField("payment_price")
	private Long paymentPrice;

	/**
	 * 优惠券核销数据回流时填写 支付渠道 alipay_account:支付宝支付 merchant_account:接入方账户余额 weixin_pay:微信支付
(可不传)
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 如 online_car:网约车 card50:50元储值卡(可不传)
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 优惠额度， 优惠类型为打折时，优惠额度取值是0-1之间的小数；为金额时单位为分。(可不传)
	 */
	@ApiField("promo_price")
	private Long promoPrice;

	/**
	 * 优惠券领取数据回流时填写 优惠领取入口(可不传)
	 */
	@ApiField("promo_source")
	private String promoSource;

	/**
	 * 优惠类型，如 present:赠送 discount:打折(或折扣券) reduction:立减(或现金券)(可不传)
	 */
	@ApiField("promo_type")
	private String promoType;

	/**
	 * 标识业务场景
bike_coupon_info:单车
ebike_coupon_info:电单车
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景的来源渠道，本场景传入hellobike
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 串联定价-领取-核销的唯一ID
	 */
	@ApiField("trace_id")
	private String traceId;

	/**
	 * 渠道 alipay_tinyapp:支付宝小程序 app:app客户端(可不传)
	 */
	@ApiField("trade_channel")
	private String tradeChannel;

	/**
	 * 最小定价单元id 接入方有细分的定价单元时填写，如站点ID，没有时为空(可不传)
	 */
	@ApiField("unit_id")
	private String unitId;

	/**
	 * 目标用户ID传入用户的支付宝user_id（如无支付宝user_id本字段可空）
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 优惠券领取数据回流时填写 优惠有效期(可不传)
	 */
	@ApiField("valid_time")
	private String validTime;

	public String getAlgoType() {
		return this.algoType;
	}
	public void setAlgoType(String algoType) {
		this.algoType = algoType;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public Long getBasePrice() {
		return this.basePrice;
	}
	public void setBasePrice(Long basePrice) {
		this.basePrice = basePrice;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGetCouponMethod() {
		return this.getCouponMethod;
	}
	public void setGetCouponMethod(String getCouponMethod) {
		this.getCouponMethod = getCouponMethod;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOpType() {
		return this.opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}

	public Long getPaymentPrice() {
		return this.paymentPrice;
	}
	public void setPaymentPrice(Long paymentPrice) {
		this.paymentPrice = paymentPrice;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Long getPromoPrice() {
		return this.promoPrice;
	}
	public void setPromoPrice(Long promoPrice) {
		this.promoPrice = promoPrice;
	}

	public String getPromoSource() {
		return this.promoSource;
	}
	public void setPromoSource(String promoSource) {
		this.promoSource = promoSource;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getTradeChannel() {
		return this.tradeChannel;
	}
	public void setTradeChannel(String tradeChannel) {
		this.tradeChannel = tradeChannel;
	}

	public String getUnitId() {
		return this.unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getValidTime() {
		return this.validTime;
	}
	public void setValidTime(String validTime) {
		this.validTime = validTime;
	}

}

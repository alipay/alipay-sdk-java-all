package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能定价数据回流服务
 *
 * @author auto create
 * @since 1.0, 2021-04-15 16:16:30
 */
public class AlipayDataAiserviceBikepriceDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1453487499978669575L;

	/**
	 * 渠道来源，跳转到渠道(流量位)的上一级页面(由调用方定义渠道枚举，给出对应英文代码或中文解释)
	 */
	@ApiField("ad_source")
	private String adSource;

	/**
	 * 骑行卡原价，单位为分
	 */
	@ApiField("base_price")
	private Long basePrice;

	/**
	 * 领取时间，格式为yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 优惠卡类型，枚举值为 mcard,qcard,hycard,ycard,tcard
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 卡型代码版本,0为旧版卡型代码(默认),1为新版卡型代码
	 */
	@ApiField("card_type_version")
	private Long cardTypeVersion;

	/**
	 * 城市码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 外部业务扩展参数,包括外部特征及外部扩展参数
	 */
	@ApiField("make_price_ext_params")
	private MakePriceExtParams makePriceExtParams;

	/**
	 * 操作类型，用于区分不同的数据回流类型
coupon:优惠领取
trade:优惠核销
	 */
	@ApiField("op_type")
	private String opType;

	/**
	 * 外部userId(哈啰)
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 业务端口，安卓、iOS、支付宝小程序、微信、H5、高德
	 */
	@ApiField("plat_form")
	private String platForm;

	/**
	 * 排序优先级,数字越小,优先级越高,没有经过排序的卡类型默认返回-1(预留字段)
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 领取渠道。
alipay_tinyapp:支付宝小程序
alipay_promo:支付宝大促活动
如有其它枚举值或者以后新增枚举值，请给出枚举值list和对应中文解释。
	 */
	@ApiField("promo_channel")
	private String promoChannel;

	/**
	 * 出价(即卡建议售价)，单位为分
	 */
	@ApiField("promotion_price")
	private Long promotionPrice;

	/**
	 * 优惠算法类型
alipay_algo:支付宝算法
hello_algo:哈罗算法
no_coupon_used:未使用优惠券
	 */
	@ApiField("promotion_type")
	private String promotionType;

	/**
	 * 标识业务场景
bike_coupon_info:单车
ebike_coupon_info:电单车
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景的来源渠道，本场景传入alipay_hellobike
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 券领取入口。
该参数取值为调用方自身的业务参数。(由调用方定义枚举，给出对应英文代码或中文解释)
	 */
	@ApiField("source")
	private String source;

	/**
	 * 系统平台代码,有支付宝,ios,安卓等
	 */
	@ApiField("system_code")
	private String systemCode;

	/**
	 * 串联定价-领取-核销的唯一ID
	 */
	@ApiField("trace_id")
	private String traceId;

	/**
	 * 新老用户标签
该参数取值为调用方自身的业务参数(由调用方定义枚举，给出对应英文代码或中文解释)
	 */
	@ApiField("user_attribute")
	private String userAttribute;

	/**
	 * 目标用户ID传入用户的支付宝user_id（如无支付宝user_id本字段可空）
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 优惠券有效期，格式为yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("valid_time")
	private String validTime;

	public String getAdSource() {
		return this.adSource;
	}
	public void setAdSource(String adSource) {
		this.adSource = adSource;
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

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Long getCardTypeVersion() {
		return this.cardTypeVersion;
	}
	public void setCardTypeVersion(Long cardTypeVersion) {
		this.cardTypeVersion = cardTypeVersion;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public MakePriceExtParams getMakePriceExtParams() {
		return this.makePriceExtParams;
	}
	public void setMakePriceExtParams(MakePriceExtParams makePriceExtParams) {
		this.makePriceExtParams = makePriceExtParams;
	}

	public String getOpType() {
		return this.opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getPlatForm() {
		return this.platForm;
	}
	public void setPlatForm(String platForm) {
		this.platForm = platForm;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getPromoChannel() {
		return this.promoChannel;
	}
	public void setPromoChannel(String promoChannel) {
		this.promoChannel = promoChannel;
	}

	public Long getPromotionPrice() {
		return this.promotionPrice;
	}
	public void setPromotionPrice(Long promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public String getPromotionType() {
		return this.promotionType;
	}
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
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

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSystemCode() {
		return this.systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getUserAttribute() {
		return this.userAttribute;
	}
	public void setUserAttribute(String userAttribute) {
		this.userAttribute = userAttribute;
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

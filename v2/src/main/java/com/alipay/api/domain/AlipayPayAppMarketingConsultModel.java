package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户前置营销内容咨询接口
 *
 * @author auto create
 * @since 1.0, 2024-07-19 20:00:51
 */
public class AlipayPayAppMarketingConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5252725218775913467L;

	/**
	 * 业务场景，用于区分商户具体的咨场景，示例：ORDER_PAGE：下单页营销咨询；其他新场景接入时需与支付宝协商约定
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 使用morse匿名技术对原始手机号MD5值进行盲化后的结果(可通过morse工具包生成)；
若接口调用采用morse匿名方式，此字段必须与混淆后的手机号列表(confused_mobile_list)字段一起传入，二者缺一不可
	 */
	@ApiField("blind_mobile")
	private String blindMobile;

	/**
	 * 混淆后的手机号MD5值列表；
若接口调用采用morse匿名方式，此字段必须与盲化的原始手机号MD5值(blind_mobile)字段一起传入，二者缺一不可；
	 */
	@ApiListField("confused_mobile_list")
	@ApiField("string")
	private List<String> confusedMobileList;

	/**
	 * 设备号，设备号类型由device_type字段指定；（设备号或morse匿名查询，两种匹配方式至少有一种参数不能为空）
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备号类型，与设备号device_id字段组合使用，默认为IMEI
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 手机号md5值密文；（已废弃不支持）
	 */
	@ApiField("encrypted_mobile")
	private String encryptedMobile;

	/**
	 * 订单包含的商品列表信息，json格式，其它说明详见商品明细说明；取值可参考alipay.trade.app.pay(app支付接口2.0)
	 */
	@ApiListField("goods_detail")
	@ApiField("goods_detail")
	private List<GoodsDetail> goodsDetail;

	/**
	 * 历史支付宝订单号
	 */
	@ApiField("history_alipay_trade_no")
	private String historyAlipayTradeNo;

	/**
	 * 商户用户id
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 已废弃不支持
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 是否需要查询反作弊等级值，默认为false不查询
	 */
	@ApiField("need_query_anti_rank")
	private String needQueryAntiRank;

	/**
	 * 是否需要查询营销偏好等级值，默认为false不查询
	 */
	@ApiField("need_query_marketing_rank")
	private String needQueryMarketingRank;

	/**
	 * 是否需要返回标签信息；默认为false不返回
	 */
	@ApiField("need_return_tag")
	private Boolean needReturnTag;

	/**
	 * OpenId是用户在应用下的唯一用户标识。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 销售产品码，商家和支付宝签约的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 优惠参数 注：仅与支付宝协商后可用；取值可参考alipay.trade.app.pay(app支付接口2.0)
	 */
	@ApiField("promo_params")
	private String promoParams;

	/**
	 * 收款支付宝账号对应的支付宝唯一用户号。
以2088开头的纯16位数字
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]（total_amount与undiscountable_amount两个字段需至少有一个不能为空）
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]（total_amount与undiscountable_amount两个字段需至少有一个不能为空）
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBlindMobile() {
		return this.blindMobile;
	}
	public void setBlindMobile(String blindMobile) {
		this.blindMobile = blindMobile;
	}

	public List<String> getConfusedMobileList() {
		return this.confusedMobileList;
	}
	public void setConfusedMobileList(List<String> confusedMobileList) {
		this.confusedMobileList = confusedMobileList;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getEncryptedMobile() {
		return this.encryptedMobile;
	}
	public void setEncryptedMobile(String encryptedMobile) {
		this.encryptedMobile = encryptedMobile;
	}

	public List<GoodsDetail> getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(List<GoodsDetail> goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getHistoryAlipayTradeNo() {
		return this.historyAlipayTradeNo;
	}
	public void setHistoryAlipayTradeNo(String historyAlipayTradeNo) {
		this.historyAlipayTradeNo = historyAlipayTradeNo;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNeedQueryAntiRank() {
		return this.needQueryAntiRank;
	}
	public void setNeedQueryAntiRank(String needQueryAntiRank) {
		this.needQueryAntiRank = needQueryAntiRank;
	}

	public String getNeedQueryMarketingRank() {
		return this.needQueryMarketingRank;
	}
	public void setNeedQueryMarketingRank(String needQueryMarketingRank) {
		this.needQueryMarketingRank = needQueryMarketingRank;
	}

	public Boolean getNeedReturnTag() {
		return this.needReturnTag;
	}
	public void setNeedReturnTag(Boolean needReturnTag) {
		this.needReturnTag = needReturnTag;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getPromoParams() {
		return this.promoParams;
	}
	public void setPromoParams(String promoParams) {
		this.promoParams = promoParams;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUndiscountableAmount() {
		return this.undiscountableAmount;
	}
	public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizTagEntity;
import com.alipay.api.domain.PayChannelPromoInfo;
import com.alipay.api.domain.DiscountQuotaInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.marketing.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 14:52:42
 */
public class AlipayPayAppMarketingConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4174189371651711865L;

	/** 
	 * 反作弊等级值；仅当请求入参need_query_anti_rank为true时才会返回
	 */
	@ApiField("anti_rank")
	private String antiRank;

	/** 
	 * 指定优惠信息；商户无需关注内容，调用收单支付接口时需将此字段的取值放在promo_params中透传带入，key为assignDiscounts
	 */
	@ApiField("assign_discounts")
	private String assignDiscounts;

	/** 
	 * 业务标签；当请求入参need_return_tag为true时才会返回
	 */
	@ApiField("biz_tag")
	private String bizTag;

	/** 
	 * name	String	人群标签名称	bindCard	用户匹配到的人群标签。枚举示例
引导绑卡：bindCard?引导绑信用卡：bindCreditCard?引导花呗签约：huabeiSign
extParams	Map<String,String>	扩展参数	{"url":"xxx"}	标签对应的扩展信息。类似本次新增的跳转链接地址
	 */
	@ApiListField("biz_tag_entity_list")
	@ApiField("biz_tag_entity")
	private List<BizTagEntity> bizTagEntityList;

	/** 
	 * 返回前置咨询用户命中的人群标签，如用户在花呗设首人群中，则透出ALICREDIT_PRIORITY，命中多个标签时以列表形式返回
	 */
	@ApiListField("biz_tag_list")
	@ApiField("string")
	private List<String> bizTagList;

	/** 
	 * 仅当请求使用morse匿名技术时会返回此字段；
morse匿名技术使用的盲签名，商户使用此值与私钥一起对混淆后的密文结果进行解密；解密后结果为json格式字符串，可以json反序列化后，获取对应的文案(key为text)；若无文案则解密后为空
	 */
	@ApiField("blind_signature")
	private String blindSignature;

	/** 
	 * 例如：亲情卡支付渠道信息、银行卡渠道优惠信息等
	 */
	@ApiListField("channel_info_list")
	@ApiField("pay_channel_promo_info")
	private List<PayChannelPromoInfo> channelInfoList;

	/** 
	 * 仅当请求使用morse匿名技术时会返回此字段；
morse匿名技术产出的混淆后的密文结果，需使用商户私钥及接口返回的盲签名对密文进行解密；解密后结果为json格式字符串，可以json反序列化后，获取对应的文案(key为text)；若无文案则解密后为空
	 */
	@ApiListField("confused_cipher_list")
	@ApiField("string")
	private List<String> confusedCipherList;

	/** 
	 * 优惠额度信息
	 */
	@ApiListField("discount_quota_infos")
	@ApiField("discount_quota_info")
	private List<DiscountQuotaInfo> discountQuotaInfos;

	/** 
	 * 已废弃不再使用
	 */
	@ApiField("image")
	private String image;

	/** 
	 * 营销偏好等级值；仅当请求入参need_query_marketing_rank为true时才会返回
	 */
	@ApiField("marketing_rank")
	private String marketingRank;

	/** 
	 * 支付运营扩展信息；商户无需关注内容，调用收单支付接口时需将此字段的取值放在business_params中透传带入，key为payOperationInfo
	 */
	@ApiField("pay_operation_info")
	private String payOperationInfo;

	/** 
	 * 前置咨询ID,用来标识本次请求
	 */
	@ApiField("pre_consult_id")
	private String preConsultId;

	/** 
	 * 已废弃不再使用
	 */
	@ApiField("pre_pay_token")
	private String prePayToken;

	/** 
	 * 营销文案文本内容（使用morse匿名方案时不返回此字段，需要从返回的密文中解密获取）
	 */
	@ApiField("text")
	private String text;

	public void setAntiRank(String antiRank) {
		this.antiRank = antiRank;
	}
	public String getAntiRank( ) {
		return this.antiRank;
	}

	public void setAssignDiscounts(String assignDiscounts) {
		this.assignDiscounts = assignDiscounts;
	}
	public String getAssignDiscounts( ) {
		return this.assignDiscounts;
	}

	public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
	}
	public String getBizTag( ) {
		return this.bizTag;
	}

	public void setBizTagEntityList(List<BizTagEntity> bizTagEntityList) {
		this.bizTagEntityList = bizTagEntityList;
	}
	public List<BizTagEntity> getBizTagEntityList( ) {
		return this.bizTagEntityList;
	}

	public void setBizTagList(List<String> bizTagList) {
		this.bizTagList = bizTagList;
	}
	public List<String> getBizTagList( ) {
		return this.bizTagList;
	}

	public void setBlindSignature(String blindSignature) {
		this.blindSignature = blindSignature;
	}
	public String getBlindSignature( ) {
		return this.blindSignature;
	}

	public void setChannelInfoList(List<PayChannelPromoInfo> channelInfoList) {
		this.channelInfoList = channelInfoList;
	}
	public List<PayChannelPromoInfo> getChannelInfoList( ) {
		return this.channelInfoList;
	}

	public void setConfusedCipherList(List<String> confusedCipherList) {
		this.confusedCipherList = confusedCipherList;
	}
	public List<String> getConfusedCipherList( ) {
		return this.confusedCipherList;
	}

	public void setDiscountQuotaInfos(List<DiscountQuotaInfo> discountQuotaInfos) {
		this.discountQuotaInfos = discountQuotaInfos;
	}
	public List<DiscountQuotaInfo> getDiscountQuotaInfos( ) {
		return this.discountQuotaInfos;
	}

	public void setImage(String image) {
		this.image = image;
	}
	public String getImage( ) {
		return this.image;
	}

	public void setMarketingRank(String marketingRank) {
		this.marketingRank = marketingRank;
	}
	public String getMarketingRank( ) {
		return this.marketingRank;
	}

	public void setPayOperationInfo(String payOperationInfo) {
		this.payOperationInfo = payOperationInfo;
	}
	public String getPayOperationInfo( ) {
		return this.payOperationInfo;
	}

	public void setPreConsultId(String preConsultId) {
		this.preConsultId = preConsultId;
	}
	public String getPreConsultId( ) {
		return this.preConsultId;
	}

	public void setPrePayToken(String prePayToken) {
		this.prePayToken = prePayToken;
	}
	public String getPrePayToken( ) {
		return this.prePayToken;
	}

	public void setText(String text) {
		this.text = text;
	}
	public String getText( ) {
		return this.text;
	}

}

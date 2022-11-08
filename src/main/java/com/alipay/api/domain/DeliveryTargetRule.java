package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投放计划定向规则。
 *
 * @author auto create
 * @since 1.0, 2022-08-08 10:33:37
 */
public class DeliveryTargetRule extends AlipayObject {

	private static final long serialVersionUID = 7799479375397484611L;

	/**
	 * 指定品牌id。
说明：如商户需选择某个品牌下维护的收款账号，请上传相关品牌id
	 */
	@ApiListField("brand_id_list")
	@ApiField("string")
	private List<String> brandIdList;

	/**
	 * 投放可用范围，当delivery_recall_mode=CITY_RECALL的时候必填。填写时deliveryAvailableScopeType必填。
	 */
	@ApiField("delivery_available_scope")
	private DeliveryAvailableScope deliveryAvailableScope;

	/**
	 * 推广城市规则
	 */
	@ApiField("delivery_city_code_rule")
	private DeliveryCityCodeRule deliveryCityCodeRule;

	/**
	 * 曝光商户选取列表。
说明：需要传入您期望曝光的商户的商户号，传入为空时默认使用投放优惠券活动的适用范围。
限制：曝光商户号需与投放归属商户号相同，或传入有跨主体授权关系的商户号或有弱绑定关系的M3账号
	 */
	@ApiListField("delivery_merchant_infos")
	@ApiField("delivery_merchant_info")
	private List<DeliveryMerchantInfo> deliveryMerchantInfos;

	/**
	 * 指定支付成功页模式。
枚举值：
MANUAL_INPUT_MERCHANT：指定收款账号
IN_SERVICE_VOUCHER_MERCHANT：优惠券可核收款账号（仅支持支付券）
收款账号相关规则:接入指南
	 */
	@ApiField("delivery_merchant_mode")
	private String deliveryMerchantMode;

	/**
	 * 指定支付有礼曝光商户规则。
	 */
	@ApiField("delivery_merchant_rule")
	private DeliveryMerchantRule deliveryMerchantRule;

	/**
	 * 推荐定向曝光订单优惠标记。
1. 创建交易订单时，上传符合的订单优惠标。在业务参数信息“business_params”的子字段“delivery_promo_tags”填充订单优惠标。“统一收单交易支付接口”详情查看：https://opendocs.alipay.com/open/02ekfp?scene=32。
2. 订单优惠标，检验规则：
* 单个优惠标最大长度32字节。多个标记值以英文逗号分隔。
* 单个优惠标仅支持字母/数字/下划线。
3. 订单优惠标规则和其他推荐规则同时叠加。
	 */
	@ApiField("delivery_promo_tags")
	private String deliveryPromoTags;

	/**
	 * 投放召回模式，现在支持CITY_RECALL（城市召回)和SHOP_RECALL（门店召回)两种模式。城市召回即当前城市投放，用户当前城市可领取；门店模式即门店附近投放，用户距离门店附近可领取。
	 */
	@ApiField("delivery_recall_mode")
	private String deliveryRecallMode;

	/**
	 * 小程序推广可用。枚举值：SERVICE_DIRECT
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	public List<String> getBrandIdList() {
		return this.brandIdList;
	}
	public void setBrandIdList(List<String> brandIdList) {
		this.brandIdList = brandIdList;
	}

	public DeliveryAvailableScope getDeliveryAvailableScope() {
		return this.deliveryAvailableScope;
	}
	public void setDeliveryAvailableScope(DeliveryAvailableScope deliveryAvailableScope) {
		this.deliveryAvailableScope = deliveryAvailableScope;
	}

	public DeliveryCityCodeRule getDeliveryCityCodeRule() {
		return this.deliveryCityCodeRule;
	}
	public void setDeliveryCityCodeRule(DeliveryCityCodeRule deliveryCityCodeRule) {
		this.deliveryCityCodeRule = deliveryCityCodeRule;
	}

	public List<DeliveryMerchantInfo> getDeliveryMerchantInfos() {
		return this.deliveryMerchantInfos;
	}
	public void setDeliveryMerchantInfos(List<DeliveryMerchantInfo> deliveryMerchantInfos) {
		this.deliveryMerchantInfos = deliveryMerchantInfos;
	}

	public String getDeliveryMerchantMode() {
		return this.deliveryMerchantMode;
	}
	public void setDeliveryMerchantMode(String deliveryMerchantMode) {
		this.deliveryMerchantMode = deliveryMerchantMode;
	}

	public DeliveryMerchantRule getDeliveryMerchantRule() {
		return this.deliveryMerchantRule;
	}
	public void setDeliveryMerchantRule(DeliveryMerchantRule deliveryMerchantRule) {
		this.deliveryMerchantRule = deliveryMerchantRule;
	}

	public String getDeliveryPromoTags() {
		return this.deliveryPromoTags;
	}
	public void setDeliveryPromoTags(String deliveryPromoTags) {
		this.deliveryPromoTags = deliveryPromoTags;
	}

	public String getDeliveryRecallMode() {
		return this.deliveryRecallMode;
	}
	public void setDeliveryRecallMode(String deliveryRecallMode) {
		this.deliveryRecallMode = deliveryRecallMode;
	}

	public String getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

}

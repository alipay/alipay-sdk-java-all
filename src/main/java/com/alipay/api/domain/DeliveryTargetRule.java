package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投放计划定向规则。
 *
 * @author auto create
 * @since 1.0, 2022-05-16 10:10:42
 */
public class DeliveryTargetRule extends AlipayObject {

	private static final long serialVersionUID = 4697275114452972762L;

	/**
	 * 投放可用范围，当delivery_recall_mode=CITY_RECALL的时候必填。填写时deliveryAvailableScopeType必填。
	 */
	@ApiField("delivery_available_scope")
	private DeliveryAvailableScope deliveryAvailableScope;

	/**
	 * 曝光商户选取列表。
说明：需要传入您期望曝光的商户的商户号，传入为空时默认使用投放优惠券活动的适用范围。
限制：曝光商户号需与投放归属商户号相同，或传入有跨主体授权关系的商户号或有弱绑定关系的M3账号
	 */
	@ApiListField("delivery_merchant_infos")
	@ApiField("delivery_merchant_info")
	private List<DeliveryMerchantInfo> deliveryMerchantInfos;

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

	public DeliveryAvailableScope getDeliveryAvailableScope() {
		return this.deliveryAvailableScope;
	}
	public void setDeliveryAvailableScope(DeliveryAvailableScope deliveryAvailableScope) {
		this.deliveryAvailableScope = deliveryAvailableScope;
	}

	public List<DeliveryMerchantInfo> getDeliveryMerchantInfos() {
		return this.deliveryMerchantInfos;
	}
	public void setDeliveryMerchantInfos(List<DeliveryMerchantInfo> deliveryMerchantInfos) {
		this.deliveryMerchantInfos = deliveryMerchantInfos;
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

}

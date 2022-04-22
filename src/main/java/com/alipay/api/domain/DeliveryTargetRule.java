package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投放计划定向规则。
 *
 * @author auto create
 * @since 1.0, 2022-01-18 14:03:45
 */
public class DeliveryTargetRule extends AlipayObject {

	private static final long serialVersionUID = 6566485924845983634L;

	/**
	 * 曝光商户选取列表。
说明：需要传入您期望曝光的商户的商户号，传入为空时默认使用投放优惠券活动的适用范围。
限制：曝光商户号需与投放归属商户号相同，或传入有跨主体授权关系的商户号或有弱绑定关系的M3账号
	 */
	@ApiListField("delivery_merchant_infos")
	@ApiField("delivery_merchant_info")
	private List<DeliveryMerchantInfo> deliveryMerchantInfos;

	public List<DeliveryMerchantInfo> getDeliveryMerchantInfos() {
		return this.deliveryMerchantInfos;
	}
	public void setDeliveryMerchantInfos(List<DeliveryMerchantInfo> deliveryMerchantInfos) {
		this.deliveryMerchantInfos = deliveryMerchantInfos;
	}

}

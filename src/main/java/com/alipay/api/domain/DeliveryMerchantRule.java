package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 推广收款账号规则
 *
 * @author auto create
 * @since 1.0, 2022-08-08 10:33:37
 */
public class DeliveryMerchantRule extends AlipayObject {

	private static final long serialVersionUID = 2723381414165457945L;

	/**
	 * 指定品牌id。 说明：如商户需选择某个品牌下维护的收款账号，请上传相关品牌id
	 */
	@ApiListField("brand_id_list")
	@ApiField("string")
	private List<String> brandIdList;

	/**
	 * 曝光商户选取列表。 说明：需要传入您期望曝光的商户的商户号，传入为空时默认使用投放优惠券活动的适用范围。 限制：曝光商户号需与投放归属商户号相同，或传入有跨主体授权关系的商户号或有弱绑定关系的M3账号
	 */
	@ApiListField("delivery_merchant_infos")
	@ApiField("delivery_merchant_info")
	private List<DeliveryMerchantInfo> deliveryMerchantInfos;

	/**
	 * 指定支付成功页模式。 枚举值： MANUAL_INPUT_MERCHANT：指定收款账号 IN_SERVICE_VOUCHER_MERCHANT：优惠券可核收款账号（仅支持支付券） 收款账号相关规则:接入指南
	 */
	@ApiField("delivery_merchant_mode")
	private String deliveryMerchantMode;

	public List<String> getBrandIdList() {
		return this.brandIdList;
	}
	public void setBrandIdList(List<String> brandIdList) {
		this.brandIdList = brandIdList;
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

}

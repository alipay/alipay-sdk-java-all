package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投放状态查询
 *
 * @author auto create
 * @since 1.0, 2022-03-02 11:13:44
 */
public class AlipayMarketingActivityDeliveryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7812864477351218732L;

	/**
	 * 当前服务商查询投放的商户信息。
商户自研模式，则该对象可以不填写。
服务商自研模式，则对象中的bussinessType设置为ISV，默认使用当前操作人的信息作为商户信息；
服务商代运营模式，则对象中的bussinessType设置为ISV_FOR_MERCHANT。
	 */
	@ApiField("belong_merchant_info")
	private DeliveryAgencyMerchantInfo belongMerchantInfo;

	/**
	 * [已废弃]
待查询的投放配置列表。
最大数量限制20个。
	 */
	@ApiListField("delivery_config_list")
	@ApiField("delivery_config")
	private List<DeliveryConfig> deliveryConfigList;

	/**
	 * 投放计划id
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	public DeliveryAgencyMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(DeliveryAgencyMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public List<DeliveryConfig> getDeliveryConfigList() {
		return this.deliveryConfigList;
	}
	public void setDeliveryConfigList(List<DeliveryConfig> deliveryConfigList) {
		this.deliveryConfigList = deliveryConfigList;
	}

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

}

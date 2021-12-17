package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投放状态查询
 *
 * @author auto create
 * @since 1.0, 2021-07-20 17:51:25
 */
public class AlipayMarketingActivityDeliveryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2436577223367485949L;

	/**
	 * 当前服务商所代理的商户信息. 在投放查询时，会使用商户信息来进行权限的判断. 如果代理商户信息中的businessType为ISV模式.则默认使用当前操作人的信息作为商户信息
	 */
	@ApiField("belong_merchant_info")
	private DeliveryAgencyMerchantInfo belongMerchantInfo;

	/**
	 * 待查询的投放配置列表。
最大数量限制20个。
	 */
	@ApiListField("delivery_config_list")
	@ApiField("delivery_config")
	private List<DeliveryConfig> deliveryConfigList;

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

}

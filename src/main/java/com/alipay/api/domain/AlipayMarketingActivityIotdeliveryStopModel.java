package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停止IOT投放计划
 *
 * @author auto create
 * @since 1.0, 2022-06-27 15:39:32
 */
public class AlipayMarketingActivityIotdeliveryStopModel extends AlipayObject {

	private static final long serialVersionUID = 6595249572723358427L;

	/**
	 * 服务商代商户创建投放必选。
bussinessType设置为ISV_FOR_MERCHANT。
	 */
	@ApiField("belong_merchant_info")
	private IotDeliveryAgencyMerchantInfo belongMerchantInfo;

	/**
	 * 投放计划id
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	public IotDeliveryAgencyMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(IotDeliveryAgencyMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

}

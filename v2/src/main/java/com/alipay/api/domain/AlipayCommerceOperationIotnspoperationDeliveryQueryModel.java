package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广计划查询接口
 *
 * @author auto create
 * @since 1.0, 2025-02-13 14:39:00
 */
public class AlipayCommerceOperationIotnspoperationDeliveryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8123449126144141526L;

	/**
	 * 枚举值：
·SELF_MODE 商户自接入模式
·AGENCY_MODE 服务商代接入模式
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 碰一下推广计划id
	 */
	@ApiField("n_delivery_id")
	private String nDeliveryId;

	public String getMerchantAccessMode() {
		return this.merchantAccessMode;
	}
	public void setMerchantAccessMode(String merchantAccessMode) {
		this.merchantAccessMode = merchantAccessMode;
	}

	public String getnDeliveryId() {
		return this.nDeliveryId;
	}
	public void setnDeliveryId(String nDeliveryId) {
		this.nDeliveryId = nDeliveryId;
	}

}

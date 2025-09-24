package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收报价履约配置信息
 *
 * @author auto create
 * @since 1.0, 2025-09-22 11:09:50
 */
public class RecycleDeliveryConfigDTO extends AlipayObject {

	private static final long serialVersionUID = 7683245954586381514L;

	/**
	 * 履约价格
	 */
	@ApiField("delivery_price")
	private RecycleDeliveryPriceDTO deliveryPrice;

	/**
	 * 中国省份编码，110000 代表北京，310000代表上海
	 */
	@ApiField("province_code")
	private String provinceCode;

	public RecycleDeliveryPriceDTO getDeliveryPrice() {
		return this.deliveryPrice;
	}
	public void setDeliveryPrice(RecycleDeliveryPriceDTO deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}

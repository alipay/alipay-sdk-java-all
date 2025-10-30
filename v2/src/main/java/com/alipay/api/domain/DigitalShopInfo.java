package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字化门店信息
 *
 * @author auto create
 * @since 1.0, 2024-10-23 20:31:41
 */
public class DigitalShopInfo extends AlipayObject {

	private static final long serialVersionUID = 1127469198263315953L;

	/**
	 * 门店地址
	 */
	@ApiField("digital_shop_address")
	private String digitalShopAddress;

	/**
	 * 数字化门店id，门店唯一标识
	 */
	@ApiField("digital_shop_id")
	private String digitalShopId;

	/**
	 * 门店名称
	 */
	@ApiField("digital_shop_name")
	private String digitalShopName;

	public String getDigitalShopAddress() {
		return this.digitalShopAddress;
	}
	public void setDigitalShopAddress(String digitalShopAddress) {
		this.digitalShopAddress = digitalShopAddress;
	}

	public String getDigitalShopId() {
		return this.digitalShopId;
	}
	public void setDigitalShopId(String digitalShopId) {
		this.digitalShopId = digitalShopId;
	}

	public String getDigitalShopName() {
		return this.digitalShopName;
	}
	public void setDigitalShopName(String digitalShopName) {
		this.digitalShopName = digitalShopName;
	}

}

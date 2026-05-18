package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁门店进件数字化门店
 *
 * @author auto create
 * @since 1.0, 2026-05-09 00:05:21
 */
public class AntMerchantExpandChannelpoiCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7138654298252347829L;

	/**
	 * 数字化门店信息
	 */
	@ApiField("digital_poi")
	private DigitalPoi digitalPoi;

	/**
	 * null
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	public DigitalPoi getDigitalPoi() {
		return this.digitalPoi;
	}
	public void setDigitalPoi(DigitalPoi digitalPoi) {
		this.digitalPoi = digitalPoi;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}

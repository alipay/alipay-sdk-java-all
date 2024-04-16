package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询快消行业商品详情
 *
 * @author auto create
 * @since 1.0, 2017-11-30 10:18:27
 */
public class KoubeiRetailItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5223631263154243384L;

	/**
	 * 城市编码，6位国际码
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 支付宝商品ID，即展示的券
	 */
	@ApiField("item_id")
	private String itemId;

	public String getCityId() {
		return this.cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}

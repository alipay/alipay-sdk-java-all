package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告内容查询
 *
 * @author auto create
 * @since 1.0, 2018-07-31 20:47:25
 */
public class KoubeiAdvertDeliveryDiscountAuthwebBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7411119152583757677L;

	/**
	 * 分配的固定的渠道CODE，需要找运营申请
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 纬度，根据经纬度查询附近的券
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，根据经纬度查询附近的券
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 门店ID，如果设置门店，则查询门店下发行的券
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}

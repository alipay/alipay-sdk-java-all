package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告投放优惠查询接口
 *
 * @author auto create
 * @since 1.0, 2018-07-31 20:46:26
 */
public class KoubeiAdvertDeliveryDiscountWebBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5521456676763973247L;

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
	 * 手机号码，根据手机号码查询支付宝账户ID
	 */
	@ApiField("mobile")
	private String mobile;

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

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}

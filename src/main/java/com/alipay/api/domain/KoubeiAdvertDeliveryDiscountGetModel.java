package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告推荐接口
 *
 * @author auto create
 * @since 1.0, 2018-03-01 15:55:14
 */
public class KoubeiAdvertDeliveryDiscountGetModel extends AlipayObject {

	private static final long serialVersionUID = 1632692124236295199L;

	/**
	 * 媒体编号，使用前需要找业务申请 ，不申请直接调用会失败
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 城市编码，国标码，比如310100是上海
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 纬度，以高德地图为准， 小数点后保留六位
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，以高德地图为准， 小数点后保留六位
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 被推荐用户的手机号码，不能与user_id同时存在
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 支付宝口碑门店ID
如果提供门店ID，则优先查询门店下发的券。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 获取推荐广告列表个数，值小于等于100个
	 */
	@ApiField("size")
	private String size;

	/**
	 * 蚂蚁统一会员ID，以2088开头的16位数字
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

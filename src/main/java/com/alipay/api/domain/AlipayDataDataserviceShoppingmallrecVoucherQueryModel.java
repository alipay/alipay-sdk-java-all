package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商场券推荐
 *
 * @author auto create
 * @since 1.0, 2017-08-15 19:53:24
 */
public class AlipayDataDataserviceShoppingmallrecVoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5334316368414825349L;

	/**
	 * 纬度；注：高德坐标系。经纬度是门店搜索和活动推荐的重要参数，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度；注：高德坐标系。经纬度是门店搜索和活动推荐的重要参数，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 系统内商场的唯一标识id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 本次请求的全局唯一标识, 支持英文字母和数字, 由开发者自行定义
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 系统内支付宝用户唯一标识id. 支付宝用户号是以2088开头的纯数字组成
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

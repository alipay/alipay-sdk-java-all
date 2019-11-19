package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基于LBS的优惠券输出接口
 *
 * @author auto create
 * @since 1.0, 2017-11-03 16:59:45
 */
public class AlipayDataDataserviceLbsDiscountBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1587277875968749425L;

	/**
	 * 媒体编号，使用前需要找业务申请 ，不申请直接调用会失败
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 手机IMEI号，imei、user_id、mobile三者必须且只能填一个
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 手机号码，imei、user_id、mobile三者必须且只能填一个
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 输出的券列表大小
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 支付宝用户ID，imei、user_id、mobile三者必须且只能填一个
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getImei() {
		return this.imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
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

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

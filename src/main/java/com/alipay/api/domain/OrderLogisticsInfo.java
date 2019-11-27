package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务的物流信息
 *
 * @author auto create
 * @since 1.0, 2017-03-14 16:17:32
 */
public class OrderLogisticsInfo extends AlipayObject {

	private static final long serialVersionUID = 8549348266753286474L;

	/**
	 * 消费者下单线下服务时，填写的服务地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 联系人
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 订单的物流扩展信息，包括服务开始时间、服务结束时间
	 */
	@ApiField("ext_info")
	private OrderLogisticsExtInfo extInfo;

	/**
	 * 消费者地址纬度（高德坐标系，高德经纬度查询：http://lbs.amap.com/console/show/picker）
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 消费者地址经度（高德坐标系，高德经纬度查询：http://lbs.amap.com/console/show/picker）
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 消费者与商家绑定的手机号码（阿里小号，用户保护消费者隐私。参考链接：https://aliqin.tmall.com/help/detail.htm?kid=5849806）
	 */
	@ApiField("merchant_bind_mobile")
	private String merchantBindMobile;

	/**
	 * 联系电话
	 */
	@ApiField("mobile")
	private String mobile;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public OrderLogisticsExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(OrderLogisticsExtInfo extInfo) {
		this.extInfo = extInfo;
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

	public String getMerchantBindMobile() {
		return this.merchantBindMobile;
	}
	public void setMerchantBindMobile(String merchantBindMobile) {
		this.merchantBindMobile = merchantBindMobile;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}

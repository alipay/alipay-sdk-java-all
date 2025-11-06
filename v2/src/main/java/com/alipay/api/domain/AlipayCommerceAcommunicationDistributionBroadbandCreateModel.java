package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商宽带创建订单
 *
 * @author auto create
 * @since 1.0, 2025-10-13 10:16:56
 */
public class AlipayCommerceAcommunicationDistributionBroadbandCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7893524887294653621L;

	/**
	 * 地址详情
	 */
	@ApiField("address_detail")
	private String addressDetail;

	/**
	 * 宽带办理人姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 办理人二代身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 渠道参数
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 宽带办理联系电话
	 */
	@ApiField("contact_phone_number")
	private String contactPhoneNumber;

	/**
	 * 区域编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 合作方订单号，用于控制幂等
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 区分具体分省运营商
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 验证码
	 */
	@ApiField("sms_code")
	private String smsCode;

	public String getAddressDetail() {
		return this.addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

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

	public String getContactPhoneNumber() {
		return this.contactPhoneNumber;
	}
	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSmsCode() {
		return this.smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

}

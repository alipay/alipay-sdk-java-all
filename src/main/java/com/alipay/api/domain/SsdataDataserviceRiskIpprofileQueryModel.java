package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * “蚁盾”智能IP检测服务
 *
 * @author auto create
 * @since 1.0, 2019-07-29 16:06:57
 */
public class SsdataDataserviceRiskIpprofileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8296878829383159342L;

	/**
	 * 身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 交易发生的城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 交易发生的区
	 */
	@ApiField("district")
	private String district;

	/**
	 * IP地址
	 */
	@ApiField("ip_address")
	private String ipAddress;

	/**
	 * 调用服务的商户id ，如果是第三方服务商，需要将其实际的商户id透传过来，如果是普通商户传入自己的appid即可
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 手机号码
	 */
	@ApiField("phone")
	private String phone;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}

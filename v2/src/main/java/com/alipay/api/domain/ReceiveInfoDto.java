package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收件人信息
 *
 * @author auto create
 * @since 1.0, 2023-08-18 10:20:09
 */
public class ReceiveInfoDto extends AlipayObject {

	private static final long serialVersionUID = 8114322327346429633L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 邮编
	 */
	@ApiField("postcode")
	private String postcode;

	/**
	 * 收件人
	 */
	@ApiField("receive")
	private String receive;

	/**
	 * 电话
	 */
	@ApiField("telephone")
	private String telephone;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return this.postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getReceive() {
		return this.receive;
	}
	public void setReceive(String receive) {
		this.receive = receive;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}

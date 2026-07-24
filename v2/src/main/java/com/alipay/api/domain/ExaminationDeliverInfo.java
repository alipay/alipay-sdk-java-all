package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检查检验类快递信息字段
 *
 * @author auto create
 * @since 1.0, 2026-04-10 16:25:12
 */
public class ExaminationDeliverInfo extends AlipayObject {

	private static final long serialVersionUID = 8772464913569821797L;

	/**
	 * 收货人详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 物料订单号
	 */
	@ApiField("carrier_order_no")
	private String carrierOrderNo;

	/**
	 * 收货人电话
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 收货人姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCarrierOrderNo() {
		return this.carrierOrderNo;
	}
	public void setCarrierOrderNo(String carrierOrderNo) {
		this.carrierOrderNo = carrierOrderNo;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}

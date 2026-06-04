package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手机号运营商信息
 *
 * @author auto create
 * @since 1.0, 2026-03-16 10:27:44
 */
public class MobileInfo extends AlipayObject {

	private static final long serialVersionUID = 2533226615993685313L;

	/**
	 * 运营商代码
	 */
	@ApiField("carrier")
	private String carrier;

	/**
	 * 归属省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 子运营商名称
	 */
	@ApiField("sub_operator")
	private String subOperator;

	public String getCarrier() {
		return this.carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getSubOperator() {
		return this.subOperator;
	}
	public void setSubOperator(String subOperator) {
		this.subOperator = subOperator;
	}

}

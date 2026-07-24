package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商积分分省达量状态同步
 *
 * @author auto create
 * @since 1.0, 2026-07-17 10:47:52
 */
public class AlipayCommerceAcommunicationPointsAvailablestatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7468996495142911757L;

	/**
	 * 运营商名称
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 积分可兑换状态
	 */
	@ApiField("status")
	private String status;

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

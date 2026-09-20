package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询服务包服务项信息
 *
 * @author auto create
 * @since 1.0, 2026-09-08 15:27:54
 */
public class AlipayCommerceMedicalHmServiceitemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4637574557667846917L;

	/**
	 * 服务包订单ID。通过履约单号换取服务订单id
	 */
	@ApiField("package_order_id")
	private String packageOrderId;

	public String getPackageOrderId() {
		return this.packageOrderId;
	}
	public void setPackageOrderId(String packageOrderId) {
		this.packageOrderId = packageOrderId;
	}

}

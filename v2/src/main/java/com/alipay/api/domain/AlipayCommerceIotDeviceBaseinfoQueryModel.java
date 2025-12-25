package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询设备基础信息
 *
 * @author auto create
 * @since 1.0, 2024-11-26 10:24:29
 */
public class AlipayCommerceIotDeviceBaseinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2347936166751142435L;

	/**
	 * 设备SN
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 厂商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}

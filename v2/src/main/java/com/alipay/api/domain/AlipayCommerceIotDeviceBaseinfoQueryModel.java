package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询设备基础信息
 *
 * @author auto create
 * @since 1.0, 2021-09-22 20:57:56
 */
public class AlipayCommerceIotDeviceBaseinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3489632288459912699L;

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

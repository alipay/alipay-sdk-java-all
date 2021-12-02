package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT设备基础信息
 *
 * @author auto create
 * @since 1.0, 2021-08-24 09:34:57
 */
public class IotDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 2682797126852917653L;

	/**
	 * 设备SN，如MB01P16N00318，MB01P16N00426，MB01P16N00719
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 设备供应商ID
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

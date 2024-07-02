package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告投放状态拉取-设备信息
 *
 * @author auto create
 * @since 1.0, 2021-09-03 09:53:56
 */
public class IotQueryDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 4523296142138913351L;

	/**
	 * 设备SN
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

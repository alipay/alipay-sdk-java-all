package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备绑定所需要的账号信息
 *
 * @author auto create
 * @since 1.0, 2025-01-27 22:47:46
 */
public class DeviceRecordInfo extends AlipayObject {

	private static final long serialVersionUID = 2197659731757497221L;

	/**
	 * 设备绑定的时候传的账户类型
	 */
	@ApiField("records_type")
	private String recordsType;

	/**
	 * 与records_type对应的参数值。
如直连商家 PID：2088101156429885
	 */
	@ApiField("records_value")
	private String recordsValue;

	public String getRecordsType() {
		return this.recordsType;
	}
	public void setRecordsType(String recordsType) {
		this.recordsType = recordsType;
	}

	public String getRecordsValue() {
		return this.recordsValue;
	}
	public void setRecordsValue(String recordsValue) {
		this.recordsValue = recordsValue;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 病历总结
 *
 * @author auto create
 * @since 1.0, 2024-12-11 17:00:29
 */
public class AlipayCommerceMedicalHdfMedlibGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 8387211231583442423L;

	/**
	 * 入参数据
	 */
	@ApiField("data")
	private String data;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

}

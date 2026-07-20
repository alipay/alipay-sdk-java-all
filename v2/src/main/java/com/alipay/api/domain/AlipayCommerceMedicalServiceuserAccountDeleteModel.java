package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿福医生注销
 *
 * @author auto create
 * @since 1.0, 2026-06-24 20:22:56
 */
public class AlipayCommerceMedicalServiceuserAccountDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1139247767427451664L;

	/**
	 * 好大夫id
	 */
	@ApiField("hdf_out_id")
	private String hdfOutId;

	public String getHdfOutId() {
		return this.hdfOutId;
	}
	public void setHdfOutId(String hdfOutId) {
		this.hdfOutId = hdfOutId;
	}

}

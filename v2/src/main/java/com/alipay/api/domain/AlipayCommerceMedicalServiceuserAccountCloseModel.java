package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿福医生账户注销接口
 *
 * @author auto create
 * @since 1.0, 2026-06-23 18:12:56
 */
public class AlipayCommerceMedicalServiceuserAccountCloseModel extends AlipayObject {

	private static final long serialVersionUID = 6866364169925176478L;

	/**
	 * 外部ID加密值
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

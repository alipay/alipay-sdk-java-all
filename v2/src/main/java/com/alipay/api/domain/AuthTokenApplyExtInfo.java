package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额外参数
 *
 * @author auto create
 * @since 1.0, 2025-06-12 19:17:28
 */
public class AuthTokenApplyExtInfo extends AlipayObject {

	private static final long serialVersionUID = 1277333776228972195L;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询地区列表
 *
 * @author auto create
 * @since 1.0, 2024-06-20 15:15:30
 */
public class AlipayCloudCloudpromoMallDivisionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7554488237433828778L;

	/**
	 * 地区编码
	 */
	@ApiField("division_code")
	private String divisionCode;

	public String getDivisionCode() {
		return this.divisionCode;
	}
	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

}

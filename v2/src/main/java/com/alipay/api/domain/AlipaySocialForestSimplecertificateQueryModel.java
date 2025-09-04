package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户义务植树证书信息
 *
 * @author auto create
 * @since 1.0, 2024-03-14 19:27:22
 */
public class AlipaySocialForestSimplecertificateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4464769946417988841L;

	/**
	 * 年份
	 */
	@ApiField("year")
	private String year;

	public String getYear() {
		return this.year;
	}
	public void setYear(String year) {
		this.year = year;
	}

}

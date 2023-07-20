package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户义务植树证书信息
 *
 * @author auto create
 * @since 1.0, 2020-12-24 16:23:02
 */
public class AlipaySocialForestSimplecertificateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6775689891953645752L;

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

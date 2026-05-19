package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saleforce查询客户接口
 *
 * @author auto create
 * @since 1.0, 2026-04-14 14:26:47
 */
public class AnttechOceanbaseObglobalSfcustomerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6832742997512666778L;

	/**
	 * 国家
	 */
	@ApiField("country")
	private String country;

	/**
	 * 完整客户名称
	 */
	@ApiField("ep_full_name")
	private String epFullName;

	/**
	 * 客户名称
	 */
	@ApiField("ep_name")
	private String epName;

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getEpFullName() {
		return this.epFullName;
	}
	public void setEpFullName(String epFullName) {
		this.epFullName = epFullName;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

}

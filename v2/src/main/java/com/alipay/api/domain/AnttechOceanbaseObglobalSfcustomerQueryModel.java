package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saleforce查询客户接口
 *
 * @author auto create
 * @since 1.0, 2026-05-22 17:17:45
 */
public class AnttechOceanbaseObglobalSfcustomerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1147857181257519461L;

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

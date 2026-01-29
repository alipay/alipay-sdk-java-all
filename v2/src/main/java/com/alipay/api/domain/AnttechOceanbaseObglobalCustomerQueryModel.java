package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * CRM客户信息查询
 *
 * @author auto create
 * @since 1.0, 2025-12-01 19:27:41
 */
public class AnttechOceanbaseObglobalCustomerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2584658431987229968L;

	/**
	 * 客户名称
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 客户常用名
	 */
	@ApiField("customer_short_name")
	private String customerShortName;

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerShortName() {
		return this.customerShortName;
	}
	public void setCustomerShortName(String customerShortName) {
		this.customerShortName = customerShortName;
	}

}

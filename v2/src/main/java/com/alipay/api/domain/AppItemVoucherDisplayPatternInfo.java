package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券展示方式
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class AppItemVoucherDisplayPatternInfo extends AlipayObject {

	private static final long serialVersionUID = 4312968486848574648L;

	/**
	 * 客服电话
	 */
	@ApiField("customer_service_mobile")
	private String customerServiceMobile;

	/**
	 * 券描述信息
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	public String getCustomerServiceMobile() {
		return this.customerServiceMobile;
	}
	public void setCustomerServiceMobile(String customerServiceMobile) {
		this.customerServiceMobile = customerServiceMobile;
	}

	public String getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

}

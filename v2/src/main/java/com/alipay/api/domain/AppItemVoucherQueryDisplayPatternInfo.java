package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序商品券展示查询
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:19
 */
public class AppItemVoucherQueryDisplayPatternInfo extends AlipayObject {

	private static final long serialVersionUID = 2815878928391237339L;

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

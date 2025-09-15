package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 折扣充API模式客服相关信息
 *
 * @author auto create
 * @since 1.0, 2025-09-01 16:35:23
 */
public class ToBDiscountCustomerServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 2873615776646171271L;

	/**
	 * 当前订单对应的客服链接
	 */
	@ApiField("customer_service_link")
	private String customerServiceLink;

	/**
	 * 客服电话
	 */
	@ApiField("customer_service_mobile")
	private String customerServiceMobile;

	public String getCustomerServiceLink() {
		return this.customerServiceLink;
	}
	public void setCustomerServiceLink(String customerServiceLink) {
		this.customerServiceLink = customerServiceLink;
	}

	public String getCustomerServiceMobile() {
		return this.customerServiceMobile;
	}
	public void setCustomerServiceMobile(String customerServiceMobile) {
		this.customerServiceMobile = customerServiceMobile;
	}

}

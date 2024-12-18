package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款扩展参数
 *
 * @author auto create
 * @since 1.0, 2019-06-10 19:40:33
 */
public class RefundExtendParams extends AlipayObject {

	private static final long serialVersionUID = 8747267989178785678L;

	/**
	 * 芝麻外部类目
	 */
	@ApiField("credit_category_id")
	private String creditCategoryId;

	/**
	 * 信用服务ID
	 */
	@ApiField("credit_service_id")
	private String creditServiceId;

	public String getCreditCategoryId() {
		return this.creditCategoryId;
	}
	public void setCreditCategoryId(String creditCategoryId) {
		this.creditCategoryId = creditCategoryId;
	}

	public String getCreditServiceId() {
		return this.creditServiceId;
	}
	public void setCreditServiceId(String creditServiceId) {
		this.creditServiceId = creditServiceId;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券可用小程序
 *
 * @author auto create
 * @since 1.0, 2022-09-27 13:22:21
 */
public class VoucherAvailableAppInfo extends AlipayObject {

	private static final long serialVersionUID = 1811775251393155439L;

	/**
	 * 可核销的支付宝小程序id
	 */
	@ApiListField("available_app_ids")
	@ApiField("string")
	private List<String> availableAppIds;

	public List<String> getAvailableAppIds() {
		return this.availableAppIds;
	}
	public void setAvailableAppIds(List<String> availableAppIds) {
		this.availableAppIds = availableAppIds;
	}

}

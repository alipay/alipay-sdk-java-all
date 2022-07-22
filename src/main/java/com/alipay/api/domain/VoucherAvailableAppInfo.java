package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券可用小程序
 *
 * @author auto create
 * @since 1.0, 2022-07-20 18:19:05
 */
public class VoucherAvailableAppInfo extends AlipayObject {

	private static final long serialVersionUID = 2679976992879958244L;

	/**
	 * 可核销的支付宝小程序id 限制： 1、必须是支付宝小程序 2、如果包含重复的小程序id会自动进行去重操作。
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

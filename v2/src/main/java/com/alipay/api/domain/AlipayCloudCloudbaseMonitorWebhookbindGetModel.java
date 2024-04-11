package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个 webhook 绑定查询
 *
 * @author auto create
 * @since 1.0, 2024-04-11 09:46:06
 */
public class AlipayCloudCloudbaseMonitorWebhookbindGetModel extends AlipayObject {

	private static final long serialVersionUID = 1515527215296634434L;

	/**
	 * 绑定id
	 */
	@ApiField("id")
	private String id;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}

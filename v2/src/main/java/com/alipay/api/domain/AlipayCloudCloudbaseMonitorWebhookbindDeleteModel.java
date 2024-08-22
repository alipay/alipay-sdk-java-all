package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除 webhook 绑定
 *
 * @author auto create
 * @since 1.0, 2024-05-08 14:34:21
 */
public class AlipayCloudCloudbaseMonitorWebhookbindDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7668877867878552834L;

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

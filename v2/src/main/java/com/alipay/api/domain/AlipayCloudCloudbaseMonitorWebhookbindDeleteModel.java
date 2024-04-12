package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除 webhook 绑定
 *
 * @author auto create
 * @since 1.0, 2024-04-11 09:44:46
 */
public class AlipayCloudCloudbaseMonitorWebhookbindDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1345721729254736928L;

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

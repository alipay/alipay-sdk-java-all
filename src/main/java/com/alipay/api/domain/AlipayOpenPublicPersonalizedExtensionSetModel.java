package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个性化扩展区上下线接口
 *
 * @author auto create
 * @since 1.0, 2021-06-23 10:49:00
 */
public class AlipayOpenPublicPersonalizedExtensionSetModel extends AlipayObject {

	private static final long serialVersionUID = 6843244971321888626L;

	/**
	 * 扩展区套id，调用创建个性化扩展区接口时返回
	 */
	@ApiField("extension_key")
	private String extensionKey;

	/**
	 * 扩展区操作类型，支持2个值：ON、OFF，ON代表上线操作，OFF代表下线操作。当上线一个扩展区时，若存在同样的标签规则，且状态为上线的扩展区，该扩展区会自动下线
	 */
	@ApiField("status")
	private String status;

	public String getExtensionKey() {
		return this.extensionKey;
	}
	public void setExtensionKey(String extensionKey) {
		this.extensionKey = extensionKey;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

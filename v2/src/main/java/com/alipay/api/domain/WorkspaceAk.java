package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ak对象
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:03:12
 */
public class WorkspaceAk extends AlipayObject {

	private static final long serialVersionUID = 5485665651971729319L;

	/**
	 * ak
	 */
	@ApiField("access_key_id")
	private String accessKeyId;

	/**
	 * sk
	 */
	@ApiField("access_key_secret")
	private String accessKeySecret;

	public String getAccessKeyId() {
		return this.accessKeyId;
	}
	public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
	}

	public String getAccessKeySecret() {
		return this.accessKeySecret;
	}
	public void setAccessKeySecret(String accessKeySecret) {
		this.accessKeySecret = accessKeySecret;
	}

}

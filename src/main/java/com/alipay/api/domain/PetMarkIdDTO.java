package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物用户标识
 *
 * @author auto create
 * @since 1.0, 2021-12-17 17:11:14
 */
public class PetMarkIdDTO extends AlipayObject {

	private static final long serialVersionUID = 2252981849963516717L;

	/**
	 * encryptionMarkId md5 后的微信端唯一标识
	 */
	@ApiField("encryption_mark_id")
	private String encryptionMarkId;

	/**
	 * 微信端唯一标识
	 */
	@ApiField("mark_id")
	private String markId;

	public String getEncryptionMarkId() {
		return this.encryptionMarkId;
	}
	public void setEncryptionMarkId(String encryptionMarkId) {
		this.encryptionMarkId = encryptionMarkId;
	}

	public String getMarkId() {
		return this.markId;
	}
	public void setMarkId(String markId) {
		this.markId = markId;
	}

}

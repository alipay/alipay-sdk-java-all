package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证业务扩展字段
 *
 * @author auto create
 * @since 1.0, 2025-06-05 10:40:28
 */
public class InsOpenVoucherBizDataDTO extends AlipayObject {

	private static final long serialVersionUID = 4554762827734255261L;

	/**
	 * 加密后的手机号
	 */
	@ApiField("encrypt_phone")
	private String encryptPhone;

	/**
	 * 宠物机构id
	 */
	@ApiField("pet_inst_id")
	private String petInstId;

	public String getEncryptPhone() {
		return this.encryptPhone;
	}
	public void setEncryptPhone(String encryptPhone) {
		this.encryptPhone = encryptPhone;
	}

	public String getPetInstId() {
		return this.petInstId;
	}
	public void setPetInstId(String petInstId) {
		this.petInstId = petInstId;
	}

}

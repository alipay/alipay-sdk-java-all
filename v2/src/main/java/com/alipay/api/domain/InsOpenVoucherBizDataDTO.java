package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证业务扩展字段
 *
 * @author auto create
 * @since 1.0, 2024-07-04 15:45:13
 */
public class InsOpenVoucherBizDataDTO extends AlipayObject {

	private static final long serialVersionUID = 3386279971453716338L;

	/**
	 * 加密后的手机号
	 */
	@ApiField("encrypt_phone")
	private String encryptPhone;

	public String getEncryptPhone() {
		return this.encryptPhone;
	}
	public void setEncryptPhone(String encryptPhone) {
		this.encryptPhone = encryptPhone;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息交换
 *
 * @author auto create
 * @since 1.0, 2025-05-15 18:15:52
 */
public class AlipayEbppIndustrySocialUserinformationExchangeModel extends AlipayObject {

	private static final long serialVersionUID = 1368951116642163419L;

	/**
	 * 社保签发号
	 */
	@ApiField("ins_card_id_encrypt")
	private String insCardIdEncrypt;

	/**
	 * 解密iv
	 */
	@ApiField("sm_4_iv")
	private String sm4Iv;

	public String getInsCardIdEncrypt() {
		return this.insCardIdEncrypt;
	}
	public void setInsCardIdEncrypt(String insCardIdEncrypt) {
		this.insCardIdEncrypt = insCardIdEncrypt;
	}

	public String getSm4Iv() {
		return this.sm4Iv;
	}
	public void setSm4Iv(String sm4Iv) {
		this.sm4Iv = sm4Iv;
	}

}

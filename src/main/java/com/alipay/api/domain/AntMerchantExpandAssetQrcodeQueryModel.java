package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 码值信息查询接口
 *
 * @author auto create
 * @since 1.0, 2021-11-25 16:11:15
 */
public class AntMerchantExpandAssetQrcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8695812184375553823L;

	/**
	 * 二维码编码
	 */
	@ApiField("code")
	private String code;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

}

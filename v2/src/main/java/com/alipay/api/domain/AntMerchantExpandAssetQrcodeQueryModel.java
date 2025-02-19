package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 码值信息查询接口
 *
 * @author auto create
 * @since 1.0, 2023-02-06 14:18:59
 */
public class AntMerchantExpandAssetQrcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6679159272965332359L;

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

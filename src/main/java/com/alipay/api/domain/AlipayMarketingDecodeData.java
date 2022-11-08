package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扫码存放码值的类型
 *
 * @author auto create
 * @since 1.0, 2017-04-28 11:12:12
 */
public class AlipayMarketingDecodeData extends AlipayObject {

	private static final long serialVersionUID = 4167537353924189273L;

	/**
	 * 钱包二维码码值
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

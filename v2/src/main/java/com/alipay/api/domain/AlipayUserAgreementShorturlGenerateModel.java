package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户协议签约短链生成接口
 *
 * @author auto create
 * @since 1.0, 2026-03-16 15:32:44
 */
public class AlipayUserAgreementShorturlGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 3312544739487119376L;

	/**
	 * 原始签约长链接
	 */
	@ApiField("long_url")
	private String longUrl;

	public String getLongUrl() {
		return this.longUrl;
	}
	public void setLongUrl(String longUrl) {
		this.longUrl = longUrl;
	}

}

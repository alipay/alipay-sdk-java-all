package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核实流程签名
 *
 * @author auto create
 * @since 1.0, 2025-03-20 16:43:34
 */
public class AlipayBossBaseProcessSignVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 3557827177625217879L;

	/**
	 * 流程唯一ID
	 */
	@ApiField("puid")
	private String puid;

	/**
	 * mnotify签名直接回传
	 */
	@ApiField("sign_content")
	private String signContent;

	public String getPuid() {
		return this.puid;
	}
	public void setPuid(String puid) {
		this.puid = puid;
	}

	public String getSignContent() {
		return this.signContent;
	}
	public void setSignContent(String signContent) {
		this.signContent = signContent;
	}

}

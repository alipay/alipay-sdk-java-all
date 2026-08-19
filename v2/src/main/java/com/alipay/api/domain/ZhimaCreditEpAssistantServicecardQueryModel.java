package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信助手服务卡片查询
 *
 * @author auto create
 * @since 1.0, 2026-07-27 10:12:55
 */
public class ZhimaCreditEpAssistantServicecardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4766312357231857971L;

	/**
	 * 渠道侧商户唯一ID，1688为aliId
	 */
	@ApiField("ali_id")
	private String aliId;

	public String getAliId() {
		return this.aliId;
	}
	public void setAliId(String aliId) {
		this.aliId = aliId;
	}

}

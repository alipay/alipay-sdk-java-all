package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 动态模板参数
 *
 * @author auto create
 * @since 1.0, 2021-05-11 12:04:04
 */
public class ExtTemplateConf extends AlipayObject {

	private static final long serialVersionUID = 6119541255875411778L;

	/**
	 * 淘宝uid
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 先享后买id
	 */
	@ApiField("xxhm_info_id")
	private String xxhmInfoId;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getXxhmInfoId() {
		return this.xxhmInfoId;
	}
	public void setXxhmInfoId(String xxhmInfoId) {
		this.xxhmInfoId = xxhmInfoId;
	}

}

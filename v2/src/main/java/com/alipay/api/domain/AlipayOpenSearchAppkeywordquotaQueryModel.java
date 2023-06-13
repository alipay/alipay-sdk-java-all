package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小程序可配置关键词数  
 *
 * @author auto create
 * @since 1.0, 2023-06-12 16:11:24
 */
public class AlipayOpenSearchAppkeywordquotaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5452512587832135114L;

	/**
	 * 小程序id
	 */
	@ApiField("target_appid")
	private String targetAppid;

	public String getTargetAppid() {
		return this.targetAppid;
	}
	public void setTargetAppid(String targetAppid) {
		this.targetAppid = targetAppid;
	}

}

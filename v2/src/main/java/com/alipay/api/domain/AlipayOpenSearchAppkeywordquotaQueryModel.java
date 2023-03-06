package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小程序可配置关键词数  
 *
 * @author auto create
 * @since 1.0, 2022-12-12 11:01:39
 */
public class AlipayOpenSearchAppkeywordquotaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6426389121525952164L;

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

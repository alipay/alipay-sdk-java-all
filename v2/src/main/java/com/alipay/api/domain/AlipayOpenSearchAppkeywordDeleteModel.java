package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除搜索关键词
 *
 * @author auto create
 * @since 1.0, 2022-12-12 11:03:23
 */
public class AlipayOpenSearchAppkeywordDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6484846517164337933L;

	/**
	 * 关键词配置ID
	 */
	@ApiField("config_id")
	private String configId;

	/**
	 * 小程序id
	 */
	@ApiField("target_appid")
	private String targetAppid;

	public String getConfigId() {
		return this.configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}

	public String getTargetAppid() {
		return this.targetAppid;
	}
	public void setTargetAppid(String targetAppid) {
		this.targetAppid = targetAppid;
	}

}

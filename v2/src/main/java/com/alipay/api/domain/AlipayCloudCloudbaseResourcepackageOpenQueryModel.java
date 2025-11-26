package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开通查询资源包列表
 *
 * @author auto create
 * @since 1.0, 2023-08-22 21:05:38
 */
public class AlipayCloudCloudbaseResourcepackageOpenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8578823299856798162L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单元
 *
 * @author auto create
 * @since 1.0, 2021-05-08 11:48:50
 */
public class AlipayDataDataserviceAdGroupQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7121274256558671758L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 外部唯一单元编号
	 */
	@ApiField("group_outer_id")
	private String groupOuterId;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getGroupOuterId() {
		return this.groupOuterId;
	}
	public void setGroupOuterId(String groupOuterId) {
		this.groupOuterId = groupOuterId;
	}

}

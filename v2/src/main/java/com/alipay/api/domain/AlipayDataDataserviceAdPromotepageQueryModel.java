package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询留资页列表
 *
 * @author auto create
 * @since 1.0, 2023-11-08 16:26:24
 */
public class AlipayDataDataserviceAdPromotepageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7776849484696774795L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 灯火商家ID
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 推广页类型
	 */
	@ApiField("type")
	private String type;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

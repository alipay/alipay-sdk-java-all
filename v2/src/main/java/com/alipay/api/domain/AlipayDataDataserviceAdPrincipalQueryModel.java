package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商家信息
 *
 * @author auto create
 * @since 1.0, 2021-05-08 11:49:23
 */
public class AlipayDataDataserviceAdPrincipalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8387994773816968745L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 商家id
	 */
	@ApiField("principal_id")
	private Long principalId;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public Long getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}

}

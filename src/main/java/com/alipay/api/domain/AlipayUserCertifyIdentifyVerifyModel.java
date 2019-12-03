package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户身份信息校验
 *
 * @author auto create
 * @since 1.0, 2019-10-30 14:38:32
 */
public class AlipayUserCertifyIdentifyVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 7527129939278478515L;

	/**
	 * 分配给业务的场景码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

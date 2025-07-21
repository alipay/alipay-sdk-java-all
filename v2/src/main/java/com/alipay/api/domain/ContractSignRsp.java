package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子合同签署信息返回结果信息
 *
 * @author auto create
 * @since 1.0, 2023-01-30 11:33:02
 */
public class ContractSignRsp extends AlipayObject {

	private static final long serialVersionUID = 3461365766946675946L;

	/**
	 * 用户id映射openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 签署地址
	 */
	@ApiField("sign_url")
	private String signUrl;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSignUrl() {
		return this.signUrl;
	}
	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}

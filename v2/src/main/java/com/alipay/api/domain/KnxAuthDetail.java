package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 康乃心授权信息
 *
 * @author auto create
 * @since 1.0, 2026-05-14 16:17:49
 */
public class KnxAuthDetail extends AlipayObject {

	private static final long serialVersionUID = 4264527386436927672L;

	/**
	 * 用户授权内容
	 */
	@ApiField("auth_content")
	private String authContent;

	/**
	 * 授权用户
	 */
	@ApiField("auth_name")
	private String authName;

	/**
	 * 用户授权获取档案成员时间
	 */
	@ApiField("auth_time")
	private String authTime;

	public String getAuthContent() {
		return this.authContent;
	}
	public void setAuthContent(String authContent) {
		this.authContent = authContent;
	}

	public String getAuthName() {
		return this.authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public String getAuthTime() {
		return this.authTime;
	}
	public void setAuthTime(String authTime) {
		this.authTime = authTime;
	}

}

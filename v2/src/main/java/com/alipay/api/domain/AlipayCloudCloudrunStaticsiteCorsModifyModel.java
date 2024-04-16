package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配置跨域
 *
 * @author auto create
 * @since 1.0, 2024-03-14 15:01:23
 */
public class AlipayCloudCloudrunStaticsiteCorsModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7796281973687949456L;

	/**
	 * 允许跨域域名列表。
域名列表支持配置*，表示任意来源。
值非*的场景下，格式必须包含协议头http://或者https://，支持带端口。
	 */
	@ApiListField("access_control_allow_origins")
	@ApiField("string")
	private List<String> accessControlAllowOrigins;

	/**
	 * 预检请求有效期，单位秒，范围[0, 86400]。
	 */
	@ApiField("access_control_max_age")
	private Long accessControlMaxAge;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 是否开启跨域配置
	 */
	@ApiField("enable")
	private Boolean enable;

	/**
	 * 环境ID，唯一，开通小程序云系统会生成环境ID，请从开通页面获取
	 */
	@ApiField("env")
	private String env;

	public List<String> getAccessControlAllowOrigins() {
		return this.accessControlAllowOrigins;
	}
	public void setAccessControlAllowOrigins(List<String> accessControlAllowOrigins) {
		this.accessControlAllowOrigins = accessControlAllowOrigins;
	}

	public Long getAccessControlMaxAge() {
		return this.accessControlMaxAge;
	}
	public void setAccessControlMaxAge(Long accessControlMaxAge) {
		this.accessControlMaxAge = accessControlMaxAge;
	}

	public String getAssumeToken() {
		return this.assumeToken;
	}
	public void setAssumeToken(String assumeToken) {
		this.assumeToken = assumeToken;
	}

	public Boolean getEnable() {
		return this.enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

}

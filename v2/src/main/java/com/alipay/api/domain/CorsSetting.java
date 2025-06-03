package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 跨域配置
 *
 * @author auto create
 * @since 1.0, 2023-08-02 14:18:04
 */
public class CorsSetting extends AlipayObject {

	private static final long serialVersionUID = 4145162978882743743L;

	/**
	 * 允许跨域域名列表
	 */
	@ApiListField("access_control_allow_origins")
	@ApiField("string")
	private List<String> accessControlAllowOrigins;

	/**
	 * 预检请求有效期，单位秒
	 */
	@ApiField("access_control_max_age")
	private Long accessControlMaxAge;

	/**
	 * 是否开启跨域配置
	 */
	@ApiField("enabled")
	private Boolean enabled;

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

	public Boolean getEnabled() {
		return this.enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}

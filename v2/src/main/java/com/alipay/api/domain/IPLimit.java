package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * IP黑白名单配置
 *
 * @author auto create
 * @since 1.0, 2023-08-02 14:17:51
 */
public class IPLimit extends AlipayObject {

	private static final long serialVersionUID = 8396373528563971755L;

	/**
	 * 是否开启
	 */
	@ApiField("enabled")
	private Boolean enabled;

	/**
	 * IP列表
	 */
	@ApiListField("ip_list")
	@ApiField("string")
	private List<String> ipList;

	/**
	 * 限制类型
	 */
	@ApiField("limit_type")
	private String limitType;

	public Boolean getEnabled() {
		return this.enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public List<String> getIpList() {
		return this.ipList;
	}
	public void setIpList(List<String> ipList) {
		this.ipList = ipList;
	}

	public String getLimitType() {
		return this.limitType;
	}
	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云凤蝶空间域名信息
 *
 * @author auto create
 * @since 1.0, 2018-10-22 16:58:26
 */
public class FengdieSpaceDomains extends AlipayObject {

	private static final long serialVersionUID = 3277551249158423548L;

	/**
	 * 发布的域名，在云凤蝶上创建的站点发布时采用的 url 域名
	 */
	@ApiField("domain")
	private String domain;

	/**
	 * 是否是当前云凤蝶空间的默认发布域名，Y 则表示该空间下的站点默认以此域名生成站点url
	 */
	@ApiField("is_default")
	private String isDefault;

	/**
	 * 当前域名状态，是否可用，值为 OPEN 或 DISCARDED
	 */
	@ApiField("status")
	private String status;

	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getIsDefault() {
		return this.isDefault;
	}
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

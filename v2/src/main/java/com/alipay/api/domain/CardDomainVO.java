package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡域模型
 *
 * @author auto create
 * @since 1.0, 2015-09-22 11:07:41
 */
public class CardDomainVO extends AlipayObject {

	private static final long serialVersionUID = 7727447337935219595L;

	/**
	 * 值域域名的描述值，固定为”金融”
	 */
	@ApiField("description")
	private String description;

	/**
	 * 值域域名，固定为“FINANCE”
	 */
	@ApiField("domain_name")
	private String domainName;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDomainName() {
		return this.domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

}

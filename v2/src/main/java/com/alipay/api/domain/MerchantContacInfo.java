package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-10 16:06:23
 */
public class MerchantContacInfo extends AlipayObject {

	private static final long serialVersionUID = 2696314971521863585L;

	/**
	 * null
	 */
	@ApiListField("contact_ways")
	@ApiField("contact_way_item")
	private List<ContactWayItem> contactWays;

	/**
	 * 联系人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系人类型
	 */
	@ApiField("type")
	private String type;

	public List<ContactWayItem> getContactWays() {
		return this.contactWays;
	}
	public void setContactWays(List<ContactWayItem> contactWays) {
		this.contactWays = contactWays;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

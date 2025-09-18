package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 联系人
 *
 * @author auto create
 * @since 1.0, 2024-09-05 11:58:31
 */
public class ContactPerson extends AlipayObject {

	private static final long serialVersionUID = 3518427376768735916L;

	/**
	 * 联系方式列表
	 */
	@ApiListField("contact_ways")
	@ApiField("contact_way_info")
	private List<ContactWayInfo> contactWays;

	/**
	 * 店铺联系人的名称
	 */
	@ApiField("name")
	private String name;

	public List<ContactWayInfo> getContactWays() {
		return this.contactWays;
	}
	public void setContactWays(List<ContactWayInfo> contactWays) {
		this.contactWays = contactWays;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

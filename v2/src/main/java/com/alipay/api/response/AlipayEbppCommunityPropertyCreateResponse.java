package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExternalContact;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.property.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:51
 */
public class AlipayEbppCommunityPropertyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6173639317857797695L;

	/** 
	 * 外部联系人
	 */
	@ApiField("contacts")
	private ExternalContact contacts;

	/** 
	 * 物业公司名称拼音首字母大写+YYYYMMDD+防重位
	 */
	@ApiField("property_short_name")
	private String propertyShortName;

	public void setContacts(ExternalContact contacts) {
		this.contacts = contacts;
	}
	public ExternalContact getContacts( ) {
		return this.contacts;
	}

	public void setPropertyShortName(String propertyShortName) {
		this.propertyShortName = propertyShortName;
	}
	public String getPropertyShortName( ) {
		return this.propertyShortName;
	}

}

package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.contact.follow.list response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobileStdPublicContactFollowListResponse extends AlipayResponse {

	private static final long serialVersionUID = 8667652327293836468L;

	/** 
	 * 联系人关注者列表
	 */
	@ApiListField("contact_follow_list")
	@ApiField("string")
	private List<String> contactFollowList;

	public void setContactFollowList(List<String> contactFollowList) {
		this.contactFollowList = contactFollowList;
	}
	public List<String> getContactFollowList( ) {
		return this.contactFollowList;
	}

}

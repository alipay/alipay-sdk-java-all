package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.contact.follow.list response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 01:07:40
 */
public class AlipayMobilePublicContactFollowListResponse extends AlipayResponse {

	private static final long serialVersionUID = 5458598755491361942L;

	/** 
	 * 返回结果码，如200，标识成功
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 联系人关注者列表
	 */
	@ApiListField("contact_follow_list")
	@ApiField("string")
	private List<String> contactFollowList;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setContactFollowList(List<String> contactFollowList) {
		this.contactFollowList = contactFollowList;
	}
	public List<String> getContactFollowList( ) {
		return this.contactFollowList;
	}

}

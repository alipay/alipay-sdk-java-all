package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppMemberInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.members.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:37
 */
public class AlipayOpenAppMembersQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3111784495668142482L;

	/** 
	 * 小程序成员模型
	 */
	@ApiListField("app_member_info_list")
	@ApiField("app_member_info")
	private List<AppMemberInfo> appMemberInfoList;

	public void setAppMemberInfoList(List<AppMemberInfo> appMemberInfoList) {
		this.appMemberInfoList = appMemberInfoList;
	}
	public List<AppMemberInfo> getAppMemberInfoList( ) {
		return this.appMemberInfoList;
	}

}

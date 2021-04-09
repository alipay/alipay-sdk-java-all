package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupInfo;
import com.alipay.api.domain.MemberInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.group.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySocialBaseChatGroupCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1125296164672432144L;

	/** 
	 * 群信息
	 */
	@ApiField("group_info")
	private GroupInfo groupInfo;

	/** 
	 * 群成员信息列表
	 */
	@ApiListField("member_infos")
	@ApiField("member_info")
	private List<MemberInfo> memberInfos;

	public void setGroupInfo(GroupInfo groupInfo) {
		this.groupInfo = groupInfo;
	}
	public GroupInfo getGroupInfo( ) {
		return this.groupInfo;
	}

	public void setMemberInfos(List<MemberInfo> memberInfos) {
		this.memberInfos = memberInfos;
	}
	public List<MemberInfo> getMemberInfos( ) {
		return this.memberInfos;
	}

}

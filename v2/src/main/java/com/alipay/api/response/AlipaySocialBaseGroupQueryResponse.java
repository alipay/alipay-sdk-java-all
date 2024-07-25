package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupMemberInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.group.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-05 11:02:32
 */
public class AlipaySocialBaseGroupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1612911411277911478L;

	/** 
	 * 群id
	 */
	@ApiField("group_id")
	private String groupId;

	/** 
	 * 群的群成员总数
	 */
	@ApiField("group_member_count")
	private Long groupMemberCount;

	/** 
	 * 群成员列表
	 */
	@ApiListField("group_members")
	@ApiField("group_member_info")
	private List<GroupMemberInfo> groupMembers;

	/** 
	 * 群的名称
	 */
	@ApiField("group_name")
	private String groupName;

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupId( ) {
		return this.groupId;
	}

	public void setGroupMemberCount(Long groupMemberCount) {
		this.groupMemberCount = groupMemberCount;
	}
	public Long getGroupMemberCount( ) {
		return this.groupMemberCount;
	}

	public void setGroupMembers(List<GroupMemberInfo> groupMembers) {
		this.groupMembers = groupMembers;
	}
	public List<GroupMemberInfo> getGroupMembers( ) {
		return this.groupMembers;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupName( ) {
		return this.groupName;
	}

}

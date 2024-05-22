package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家群变动通知
 *
 * @author auto create
 * @since 1.0, 2024-03-14 10:06:56
 */
public class GroupChangedNotice extends AlipayObject {

	private static final long serialVersionUID = 5485499154823771479L;

	/**
	 * 消息创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 群ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 当是成员入群或退群时有值。表示成员变更数量
	 */
	@ApiField("mem_change_cnt")
	private Long memChangeCnt;

	/**
	 * 当是成员入群或退群时有值。变更的成员列表
	 */
	@ApiListField("mem_change_list")
	@ApiField("group_member_detail")
	private List<GroupMemberDetail> memChangeList;

	/**
	 * 变更信息。成员入群: add_member，成员退群: del_member，群名变更: change_name
	 */
	@ApiField("update_info")
	private String updateInfo;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Long getMemChangeCnt() {
		return this.memChangeCnt;
	}
	public void setMemChangeCnt(Long memChangeCnt) {
		this.memChangeCnt = memChangeCnt;
	}

	public List<GroupMemberDetail> getMemChangeList() {
		return this.memChangeList;
	}
	public void setMemChangeList(List<GroupMemberDetail> memChangeList) {
		this.memChangeList = memChangeList;
	}

	public String getUpdateInfo() {
		return this.updateInfo;
	}
	public void setUpdateInfo(String updateInfo) {
		this.updateInfo = updateInfo;
	}

}

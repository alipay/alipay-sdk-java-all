package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家群用户进群、退群、群名称更改等事件通知商户
 *
 * @author auto create
 * @since 1.0, 2024-11-20 10:03:26
 */
public class GroupChangedNotice extends AlipayObject {

	private static final long serialVersionUID = 4664795664138972256L;

	/**
	 * 消息创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 群ID（冗余字段，可忽略，参考group_instance_id）
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 群id
	 */
	@ApiField("group_instance_id")
	private String groupInstanceId;

	/**
	 * 定义群组分类，便于后台管理运营识别，可与下面设置的群名称保持一致；例：xx门店群，内部测试群
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 群组id
	 */
	@ApiField("group_oid")
	private String groupOid;

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
	 * 商家pid
	 */
	@ApiField("pid")
	private String pid;

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

	public String getGroupInstanceId() {
		return this.groupInstanceId;
	}
	public void setGroupInstanceId(String groupInstanceId) {
		this.groupInstanceId = groupInstanceId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupOid() {
		return this.groupOid;
	}
	public void setGroupOid(String groupOid) {
		this.groupOid = groupOid;
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

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUpdateInfo() {
		return this.updateInfo;
	}
	public void setUpdateInfo(String updateInfo) {
		this.updateInfo = updateInfo;
	}

}

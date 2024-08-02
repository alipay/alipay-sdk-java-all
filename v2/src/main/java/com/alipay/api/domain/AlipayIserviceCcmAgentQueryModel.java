package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 客服查询接口
 *
 * @author auto create
 * @since 1.0, 2024-07-02 10:23:17
 */
public class AlipayIserviceCcmAgentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5317498846982852466L;

	/**
	 * 热线接入方式
	 */
	@ApiField("answering_mode")
	private String answeringMode;

	/**
	 * 部门id
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 在线扩展技能组id
	 */
	@ApiListField("chat_ext_group_ids")
	@ApiField("string")
	private List<String> chatExtGroupIds;

	/**
	 * 在线技能组id
	 */
	@ApiListField("chat_group_ids")
	@ApiField("string")
	private List<String> chatGroupIds;

	/**
	 * 在线服务等级
	 */
	@ApiListField("chat_level_ids")
	@ApiField("string")
	private List<String> chatLevelIds;

	/**
	 * 客服邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 热线扩展技能组id
	 */
	@ApiListField("hotline_group_ids")
	@ApiField("string")
	private List<String> hotlineGroupIds;

	/**
	 * 查询结果的页码，起始值为 1，默认值为 1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询时设置的每页记录数，最大值 100 行，默认为 10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 客服姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 客服角色id
	 */
	@ApiListField("role_ids")
	@ApiField("string")
	private List<String> roleIds;

	public String getAnsweringMode() {
		return this.answeringMode;
	}
	public void setAnsweringMode(String answeringMode) {
		this.answeringMode = answeringMode;
	}

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public List<String> getChatExtGroupIds() {
		return this.chatExtGroupIds;
	}
	public void setChatExtGroupIds(List<String> chatExtGroupIds) {
		this.chatExtGroupIds = chatExtGroupIds;
	}

	public List<String> getChatGroupIds() {
		return this.chatGroupIds;
	}
	public void setChatGroupIds(List<String> chatGroupIds) {
		this.chatGroupIds = chatGroupIds;
	}

	public List<String> getChatLevelIds() {
		return this.chatLevelIds;
	}
	public void setChatLevelIds(List<String> chatLevelIds) {
		this.chatLevelIds = chatLevelIds;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getHotlineGroupIds() {
		return this.hotlineGroupIds;
	}
	public void setHotlineGroupIds(List<String> hotlineGroupIds) {
		this.hotlineGroupIds = hotlineGroupIds;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public List<String> getRoleIds() {
		return this.roleIds;
	}
	public void setRoleIds(List<String> roleIds) {
		this.roleIds = roleIds;
	}

}

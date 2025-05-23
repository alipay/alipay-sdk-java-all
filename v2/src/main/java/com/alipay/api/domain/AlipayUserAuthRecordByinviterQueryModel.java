package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据邀请人查询邀请单信息
 *
 * @author auto create
 * @since 1.0, 2024-07-12 13:29:50
 */
public class AlipayUserAuthRecordByinviterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2155718119629329978L;

	/**
	 * true：过滤过期数据；
	 */
	@ApiField("check_expire")
	private Boolean checkExpire;

	/**
	 * 被邀请人id
	 */
	@ApiField("invited_id")
	private String invitedId;

	/**
	 * 被邀请人id
	 */
	@ApiField("invited_openid")
	private String invitedOpenid;

	/**
	 * 被邀请人状态
	 */
	@ApiListField("invited_status")
	@ApiField("string")
	private List<String> invitedStatus;

	/**
	 * 邀请人id
	 */
	@ApiField("inviter_id")
	private String inviterId;

	/**
	 * 邀请人id
	 */
	@ApiField("inviter_openid")
	private String inviterOpenid;

	/**
	 * 邀请人状态
	 */
	@ApiListField("inviter_status")
	@ApiField("string")
	private List<String> inviterStatus;

	/**
	 * 分页索引
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小，单位条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 集集鸡蛋业务场景，字段取值是技术约定的字符串；必须；不可枚举类型；
	 */
	@ApiField("scene_id")
	private String sceneId;

	public Boolean getCheckExpire() {
		return this.checkExpire;
	}
	public void setCheckExpire(Boolean checkExpire) {
		this.checkExpire = checkExpire;
	}

	public String getInvitedId() {
		return this.invitedId;
	}
	public void setInvitedId(String invitedId) {
		this.invitedId = invitedId;
	}

	public String getInvitedOpenid() {
		return this.invitedOpenid;
	}
	public void setInvitedOpenid(String invitedOpenid) {
		this.invitedOpenid = invitedOpenid;
	}

	public List<String> getInvitedStatus() {
		return this.invitedStatus;
	}
	public void setInvitedStatus(List<String> invitedStatus) {
		this.invitedStatus = invitedStatus;
	}

	public String getInviterId() {
		return this.inviterId;
	}
	public void setInviterId(String inviterId) {
		this.inviterId = inviterId;
	}

	public String getInviterOpenid() {
		return this.inviterOpenid;
	}
	public void setInviterOpenid(String inviterOpenid) {
		this.inviterOpenid = inviterOpenid;
	}

	public List<String> getInviterStatus() {
		return this.inviterStatus;
	}
	public void setInviterStatus(List<String> inviterStatus) {
		this.inviterStatus = inviterStatus;
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

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}

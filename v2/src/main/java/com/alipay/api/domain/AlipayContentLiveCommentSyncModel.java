package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步评论
 *
 * @author auto create
 * @since 1.0, 2025-07-28 15:34:17
 */
public class AlipayContentLiveCommentSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1541626749535468135L;

	/**
	 * tab侧的直播间id（加密后）
	 */
	@ApiField("alipay_live_id")
	private String alipayLiveId;

	/**
	 * 评论发送给目标用户的ID，课代表角色发的评论这里指加密后的支付宝用户2088
	 */
	@ApiField("alipay_target_id")
	private String alipayTargetId;

	/**
	 * 评论内容
	 */
	@ApiField("comment_text")
	private String commentText;

	/**
	 * 评论人昵称
	 */
	@ApiField("commenter_name")
	private String commenterName;

	/**
	 * 评论人身份
	 */
	@ApiField("commenter_role")
	private String commenterRole;

	/**
	 * 外部评论id
	 */
	@ApiField("out_comment_id")
	private String outCommentId;

	/**
	 * 外部直播间ID，比如好大夫侧的直播ID
	 */
	@ApiField("out_live_id")
	private String outLiveId;

	/**
	 * 外部用户id
	 */
	@ApiField("out_user_identity")
	private String outUserIdentity;

	/**
	 * 评论来源
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 去问医生小尾巴跳转链接
	 */
	@ApiField("tail_link_url")
	private String tailLinkUrl;

	/**
	 * 评论可见范围，ALL：所有人可见【默认】，ONLY_ONESELF
	 */
	@ApiField("visible_scope")
	private String visibleScope;

	public String getAlipayLiveId() {
		return this.alipayLiveId;
	}
	public void setAlipayLiveId(String alipayLiveId) {
		this.alipayLiveId = alipayLiveId;
	}

	public String getAlipayTargetId() {
		return this.alipayTargetId;
	}
	public void setAlipayTargetId(String alipayTargetId) {
		this.alipayTargetId = alipayTargetId;
	}

	public String getCommentText() {
		return this.commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public String getCommenterName() {
		return this.commenterName;
	}
	public void setCommenterName(String commenterName) {
		this.commenterName = commenterName;
	}

	public String getCommenterRole() {
		return this.commenterRole;
	}
	public void setCommenterRole(String commenterRole) {
		this.commenterRole = commenterRole;
	}

	public String getOutCommentId() {
		return this.outCommentId;
	}
	public void setOutCommentId(String outCommentId) {
		this.outCommentId = outCommentId;
	}

	public String getOutLiveId() {
		return this.outLiveId;
	}
	public void setOutLiveId(String outLiveId) {
		this.outLiveId = outLiveId;
	}

	public String getOutUserIdentity() {
		return this.outUserIdentity;
	}
	public void setOutUserIdentity(String outUserIdentity) {
		this.outUserIdentity = outUserIdentity;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getTailLinkUrl() {
		return this.tailLinkUrl;
	}
	public void setTailLinkUrl(String tailLinkUrl) {
		this.tailLinkUrl = tailLinkUrl;
	}

	public String getVisibleScope() {
		return this.visibleScope;
	}
	public void setVisibleScope(String visibleScope) {
		this.visibleScope = visibleScope;
	}

}

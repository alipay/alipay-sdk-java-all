package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步评论
 *
 * @author auto create
 * @since 1.0, 2025-05-13 13:57:54
 */
public class AlipayContentLiveCommentSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7813634736546752588L;

	/**
	 * tab侧的直播间id（加密后）
	 */
	@ApiField("alipay_live_id")
	private String alipayLiveId;

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

	public String getAlipayLiveId() {
		return this.alipayLiveId;
	}
	public void setAlipayLiveId(String alipayLiveId) {
		this.alipayLiveId = alipayLiveId;
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

}

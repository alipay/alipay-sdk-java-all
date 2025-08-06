package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫评论同步到医疗与tab3
 *
 * @author auto create
 * @since 1.0, 2025-04-22 21:03:56
 */
public class AlipayCommerceMedicalHdfCommentSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6639116629891741518L;

	/**
	 * tab3侧的直播间id（加密后）
	 */
	@ApiField("alipay_live_id")
	private String alipayLiveId;

	/**
	 * 评论来源：tab3｜hdf
如果是ai智能体，用户在哪一端发的消息认为是哪个source
	 */
	@ApiField("comment_source")
	private String commentSource;

	/**
	 * 评论内容
	 */
	@ApiField("comment_text")
	private String commentText;

	/**
	 * 评论人的昵称
	 */
	@ApiField("commenter_name")
	private String commenterName;

	/**
	 * 评论人身份
anchor：主播
aiAgent：AI智能体
audience：普通观众
assistant：主播助理
	 */
	@ApiField("commenter_role")
	private String commenterRole;

	/**
	 * 外部评论ID(好大夫侧的评论ID)
	 */
	@ApiField("out_comment_id")
	private String outCommentId;

	/**
	 * 外部直播间ID (比如好大夫侧的直播ID)
	 */
	@ApiField("out_live_id")
	private String outLiveId;

	/**
	 * 外部用户唯一标识(比如好大夫侧的用户加密后ID)
	 */
	@ApiField("out_user_encode_id")
	private String outUserEncodeId;

	public String getAlipayLiveId() {
		return this.alipayLiveId;
	}
	public void setAlipayLiveId(String alipayLiveId) {
		this.alipayLiveId = alipayLiveId;
	}

	public String getCommentSource() {
		return this.commentSource;
	}
	public void setCommentSource(String commentSource) {
		this.commentSource = commentSource;
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

	public String getOutUserEncodeId() {
		return this.outUserEncodeId;
	}
	public void setOutUserEncodeId(String outUserEncodeId) {
		this.outUserEncodeId = outUserEncodeId;
	}

}

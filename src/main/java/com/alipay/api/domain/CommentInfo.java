package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 评论信息
 *
 * @author auto create
 * @since 1.0, 2016-10-27 15:11:02
 */
public class CommentInfo extends AlipayObject {

	private static final long serialVersionUID = 6616888739777197233L;

	/**
	 * 请求流水号，用于幂等控制，防重复提交。
取值规则：uid+@+时间戳long型值
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 评论ID
	 */
	@ApiField("comment_id")
	private String commentId;

	/**
	 * 评论的文字内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 图片信息
1、type为image时，此项非空
2、type非image时，此项数据无效
	 */
	@ApiField("img_infos")
	private CommentImageInfo imgInfos;

	/**
	 * 链接信息
1、type为link时，此项非空
2、type非link时，此项数据无效
	 */
	@ApiField("link_info")
	private CommentLinkInfo linkInfo;

	/**
	 * 点赞数
	 */
	@ApiField("praise_count")
	private Long praiseCount;

	/**
	 * 回复数
	 */
	@ApiField("reply_count")
	private Long replyCount;

	/**
	 * 打赏数
	 */
	@ApiField("reward_count")
	private Long rewardCount;

	/**
	 * 评分，取值为整数（可根据展示规则自定义满分值）
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 评论的类型（四选一）：
text：纯文本，
image：图片，
video：视频，
link：链接
	 */
	@ApiField("type")
	private String type;

	/**
	 * 评论发表人的用户信息
	 */
	@ApiField("user_info")
	private MicroUserInfo userInfo;

	/**
	 * video信息
1、type为video时，此项非空
2、type非video时，此项数据无效
	 */
	@ApiField("video_info")
	private CommentVideoInfo videoInfo;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCommentId() {
		return this.commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public CommentImageInfo getImgInfos() {
		return this.imgInfos;
	}
	public void setImgInfos(CommentImageInfo imgInfos) {
		this.imgInfos = imgInfos;
	}

	public CommentLinkInfo getLinkInfo() {
		return this.linkInfo;
	}
	public void setLinkInfo(CommentLinkInfo linkInfo) {
		this.linkInfo = linkInfo;
	}

	public Long getPraiseCount() {
		return this.praiseCount;
	}
	public void setPraiseCount(Long praiseCount) {
		this.praiseCount = praiseCount;
	}

	public Long getReplyCount() {
		return this.replyCount;
	}
	public void setReplyCount(Long replyCount) {
		this.replyCount = replyCount;
	}

	public Long getRewardCount() {
		return this.rewardCount;
	}
	public void setRewardCount(Long rewardCount) {
		this.rewardCount = rewardCount;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public MicroUserInfo getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(MicroUserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public CommentVideoInfo getVideoInfo() {
		return this.videoInfo;
	}
	public void setVideoInfo(CommentVideoInfo videoInfo) {
		this.videoInfo = videoInfo;
	}

}

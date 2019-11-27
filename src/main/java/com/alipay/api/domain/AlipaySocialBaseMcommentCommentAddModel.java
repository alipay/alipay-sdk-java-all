package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 微动态发布接口
 *
 * @author auto create
 * @since 1.0, 2016-11-07 14:25:43
 */
public class AlipaySocialBaseMcommentCommentAddModel extends AlipayObject {

	private static final long serialVersionUID = 1812761892369545783L;

	/**
	 * 请求流水号，用于幂等控制，防重复提交。
取值规则：uid+@+时间戳long型值
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 评论的文字内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 图片信息
1、type为image时，此项为必填项
2、type非image时，此项数据无效
	 */
	@ApiListField("img_infos")
	@ApiField("comment_image_info")
	private List<CommentImageInfo> imgInfos;

	/**
	 * 链接信息
1、type为link时，此项为必填项
2、type非link时，此项数据无效
	 */
	@ApiField("link_info")
	private CommentLinkInfo linkInfo;

	/**
	 * 评分，取值为整数（可根据展示规则自定义满分值）
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 被评论对象ID
	 */
	@ApiField("target_id")
	private String targetId;

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
	 * 评论发表者的支付宝ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * video信息
1、type为video时，此项为必填项
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

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public List<CommentImageInfo> getImgInfos() {
		return this.imgInfos;
	}
	public void setImgInfos(List<CommentImageInfo> imgInfos) {
		this.imgInfos = imgInfos;
	}

	public CommentLinkInfo getLinkInfo() {
		return this.linkInfo;
	}
	public void setLinkInfo(CommentLinkInfo linkInfo) {
		this.linkInfo = linkInfo;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public CommentVideoInfo getVideoInfo() {
		return this.videoInfo;
	}
	public void setVideoInfo(CommentVideoInfo videoInfo) {
		this.videoInfo = videoInfo;
	}

}

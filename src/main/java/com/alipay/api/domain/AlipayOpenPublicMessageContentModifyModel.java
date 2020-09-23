package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改图文消息素材接口
 *
 * @author auto create
 * @since 1.0, 2018-02-09 15:53:43
 */
public class AlipayOpenPublicMessageContentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5513879695111314927L;

	/**
	 * 活动利益点，图文类型ctype为activity类型时才需要传，最多10个字符
	 */
	@ApiField("benefit")
	private String benefit;

	/**
	 * 消息正文（支持富文本）
	 */
	@ApiField("content")
	private String content;

	/**
	 * 内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 是否允许评论 T:允许 F:不允许，默认不允许
	 */
	@ApiField("could_comment")
	private String couldComment;

	/**
	 * 封面图url, 尺寸为996*450，最大不超过3M，支持格式:.jpg、.png ，请先调用<ahref="https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload"> 图片上传接口</a>获得图片url。
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 图文类型  activity: 活动图文，不填默认普通图文
	 */
	@ApiField("ctype")
	private String ctype;

	/**
	 * 关键词列表，英文逗号分隔，最多不超过5个
	 */
	@ApiField("ext_tags")
	private String extTags;

	/**
	 * 可预览支付宝账号列表，需要预览时才填写， 英文逗号分隔，最多不超过10个
	 */
	@ApiField("login_ids")
	private String loginIds;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public String getBenefit() {
		return this.benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getCouldComment() {
		return this.couldComment;
	}
	public void setCouldComment(String couldComment) {
		this.couldComment = couldComment;
	}

	public String getCover() {
		return this.cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getCtype() {
		return this.ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public String getExtTags() {
		return this.extTags;
	}
	public void setExtTags(String extTags) {
		this.extTags = extTags;
	}

	public String getLoginIds() {
		return this.loginIds;
	}
	public void setLoginIds(String loginIds) {
		this.loginIds = loginIds;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}

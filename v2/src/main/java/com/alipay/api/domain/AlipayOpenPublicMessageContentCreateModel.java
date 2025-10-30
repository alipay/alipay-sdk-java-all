package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增图文消息素材接口
 *
 * @author auto create
 * @since 1.0, 2024-02-26 17:29:03
 */
public class AlipayOpenPublicMessageContentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2533497649742464713L;

	/**
	 * 活动利益点，最多10个字符。仅 ctype 为 activity 类型时才需传入。
	 */
	@ApiField("benefit")
	private String benefit;

	/**
	 * 消息正文（支持富文本）
	 */
	@ApiField("content")
	private String content;

	/**
	 * 是否允许评论。枚举支持：
*T：允许。
*F：不允许，默认不允许。
	 */
	@ApiField("could_comment")
	private String couldComment;

	/**
	 * 封面图url，需传入 <a href="https://opendocs.alipay.com/apis/api_3/alipay.offline.material.image.upload">图片上传接口</a>上传图片获取的 image_url。
注意：尺寸为 996*450，最大不超过3M，支持格式：jpg、.png 。
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 图文类型，不填默认普通图文。还支持 activity（活动图文）。
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

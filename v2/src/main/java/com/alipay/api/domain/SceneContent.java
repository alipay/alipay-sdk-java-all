package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内容中台场景页文章信息
 *
 * @author auto create
 * @since 1.0, 2018-01-02 19:44:01
 */
public class SceneContent extends AlipayObject {

	private static final long serialVersionUID = 2514214283812453564L;

	/**
	 * 文章分类
	 */
	@ApiField("article_classify")
	private Long articleClassify;

	/**
	 * 文章作者
	 */
	@ApiField("author")
	private String author;

	/**
	 * 文章id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 文章封面图片
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 文章图片列表
	 */
	@ApiListField("image_list")
	@ApiField("string")
	private List<String> imageList;

	/**
	 * 生活号id
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * public_name为生活号名称，属于公开信息，无需脱敏
	 */
	@ApiField("public_name")
	private String publicName;

	/**
	 * 跳转链接
	 */
	@ApiField("scheme")
	private String scheme;

	/**
	 * 推荐埋点
	 */
	@ApiField("scm")
	private String scm;

	/**
	 * 文章摘要
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 文章标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 文章点赞数
	 */
	@ApiField("total_praise_count")
	private Long totalPraiseCount;

	/**
	 * 文章回复数
	 */
	@ApiField("total_reply_count")
	private Long totalReplyCount;

	/**
	 * 文章阅读数
	 */
	@ApiField("total_view_count")
	private Long totalViewCount;

	/**
	 * 文章类型
	 */
	@ApiField("type")
	private String type;

	public Long getArticleClassify() {
		return this.articleClassify;
	}
	public void setArticleClassify(Long articleClassify) {
		this.articleClassify = articleClassify;
	}

	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getCover() {
		return this.cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

	public List<String> getImageList() {
		return this.imageList;
	}
	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getPublicName() {
		return this.publicName;
	}
	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

	public String getScheme() {
		return this.scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getScm() {
		return this.scm;
	}
	public void setScm(String scm) {
		this.scm = scm;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getTotalPraiseCount() {
		return this.totalPraiseCount;
	}
	public void setTotalPraiseCount(Long totalPraiseCount) {
		this.totalPraiseCount = totalPraiseCount;
	}

	public Long getTotalReplyCount() {
		return this.totalReplyCount;
	}
	public void setTotalReplyCount(Long totalReplyCount) {
		this.totalReplyCount = totalReplyCount;
	}

	public Long getTotalViewCount() {
		return this.totalViewCount;
	}
	public void setTotalViewCount(Long totalViewCount) {
		this.totalViewCount = totalViewCount;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

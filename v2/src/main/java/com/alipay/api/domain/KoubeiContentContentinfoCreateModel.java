package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑openapi内容创建
 *
 * @author auto create
 * @since 1.0, 2019-03-15 10:30:20
 */
public class KoubeiContentContentinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4455154968725274144L;

	/**
	 * 内容跳转地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 内容的作者
	 */
	@ApiField("author")
	private PrincipalForOpenapi author;

	/**
	 * 业务类型,图文+视频填入:ZG_ARTICLE   讲师填入:ZG_TEACHER
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 内容描述
	 */
	@ApiField("content_desc")
	private String contentDesc;

	/**
	 * 内容关联对象列表, 如店铺、商品等
	 */
	@ApiListField("content_object_relation_list")
	@ApiField("content_object_relation_for_openapi")
	private List<ContentObjectRelationForOpenapi> contentObjectRelationList;

	/**
	 * 内容类型
如果是文咨询、讲师，设置为：COMPOSITE
如果是视频，设置为：VIDEO
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 封面图片地址
	 */
	@ApiListField("cover_pics")
	@ApiField("string")
	private List<String> coverPics;

	/**
	 * 拓展字段枚举
PRICE,价格,
DISCOUNT_PRICE,优惠价格,
CREATE_TIME,创建时间, val=时间戳，到毫秒
ENABLE_TIME,发布时间,val=时间戳，到毫秒
MODIFY_TIME,最后修改时间,val=时间戳，到毫秒
VIDEO,视频,
SOURCE,来源,
	 */
	@ApiField("ext_into")
	private String extInto;

	/**
	 * 内容拓展列表,主要存放一些比较长的内容，如文章、帖子等
	 */
	@ApiListField("extensions")
	@ApiField("content_extension_for_openapi")
	private List<ContentExtensionForOpenapi> extensions;

	/**
	 * 外部文章id,外部讲师id
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 内容标记列表,如内容投放城市、推荐等
	 */
	@ApiListField("label_list")
	@ApiField("label_for_openapi")
	private List<LabelForOpenapi> labelList;

	/**
	 * 请求唯一id,UUID生成,外部系统幂等用
	 */
	@ApiField("request_token")
	private String requestToken;

	/**
	 * 状态枚举:
INIT,初始态,
AUDITING,审核中,
INFOSEC_AUDITING,风控审核中,
ENABLE,有效,
DISABLE,无效,
AUDIT_DENY,审核拒绝
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public PrincipalForOpenapi getAuthor() {
		return this.author;
	}
	public void setAuthor(PrincipalForOpenapi author) {
		this.author = author;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getContentDesc() {
		return this.contentDesc;
	}
	public void setContentDesc(String contentDesc) {
		this.contentDesc = contentDesc;
	}

	public List<ContentObjectRelationForOpenapi> getContentObjectRelationList() {
		return this.contentObjectRelationList;
	}
	public void setContentObjectRelationList(List<ContentObjectRelationForOpenapi> contentObjectRelationList) {
		this.contentObjectRelationList = contentObjectRelationList;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public List<String> getCoverPics() {
		return this.coverPics;
	}
	public void setCoverPics(List<String> coverPics) {
		this.coverPics = coverPics;
	}

	public String getExtInto() {
		return this.extInto;
	}
	public void setExtInto(String extInto) {
		this.extInto = extInto;
	}

	public List<ContentExtensionForOpenapi> getExtensions() {
		return this.extensions;
	}
	public void setExtensions(List<ContentExtensionForOpenapi> extensions) {
		this.extensions = extensions;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public List<LabelForOpenapi> getLabelList() {
		return this.labelList;
	}
	public void setLabelList(List<LabelForOpenapi> labelList) {
		this.labelList = labelList;
	}

	public String getRequestToken() {
		return this.requestToken;
	}
	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}

package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 磋商成员评论
 *
 * @author auto create
 * @since 1.0, 2023-11-06 17:55:29
 */
public class OpenApiMatterCommentDTO extends AlipayObject {

	private static final long serialVersionUID = 2488194913291812361L;

	/**
	 * 评论附件
	 */
	@ApiListField("attachment_list")
	@ApiField("open_api_matter_attachment_d_t_o")
	private List<OpenApiMatterAttachmentDTO> attachmentList;

	/**
	 * 评论编码
	 */
	@ApiField("comment_code")
	private String commentCode;

	/**
	 * 发布的内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 事项编码
	 */
	@ApiField("matter_code")
	private String matterCode;

	/**
	 * 发布人工号
	 */
	@ApiField("publisher_id")
	private String publisherId;

	/**
	 * 发布人花名
	 */
	@ApiField("publisher_name")
	private String publisherName;

	/**
	 * 回复的评论编码
	 */
	@ApiField("replied_comment_code")
	private String repliedCommentCode;

	/**
	 * 回复的内容
	 */
	@ApiField("replied_content")
	private String repliedContent;

	public List<OpenApiMatterAttachmentDTO> getAttachmentList() {
		return this.attachmentList;
	}
	public void setAttachmentList(List<OpenApiMatterAttachmentDTO> attachmentList) {
		this.attachmentList = attachmentList;
	}

	public String getCommentCode() {
		return this.commentCode;
	}
	public void setCommentCode(String commentCode) {
		this.commentCode = commentCode;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getMatterCode() {
		return this.matterCode;
	}
	public void setMatterCode(String matterCode) {
		this.matterCode = matterCode;
	}

	public String getPublisherId() {
		return this.publisherId;
	}
	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return this.publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getRepliedCommentCode() {
		return this.repliedCommentCode;
	}
	public void setRepliedCommentCode(String repliedCommentCode) {
		this.repliedCommentCode = repliedCommentCode;
	}

	public String getRepliedContent() {
		return this.repliedContent;
	}
	public void setRepliedContent(String repliedContent) {
		this.repliedContent = repliedContent;
	}

}

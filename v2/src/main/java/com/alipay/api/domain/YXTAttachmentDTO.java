package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-27 10:44:37
 */
public class YXTAttachmentDTO extends AlipayObject {

	private static final long serialVersionUID = 8156449732492198415L;

	/**
	 * 附件id
	 */
	@ApiField("attachment_id")
	private Long attachmentId;

	/**
	 * 课程附件的资源名
	 */
	@ApiField("attachment_name")
	private String attachmentName;

	/**
	 * 视频时长，单位s
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 附件序号
	 */
	@ApiField("sort")
	private Long sort;

	public Long getAttachmentId() {
		return this.attachmentId;
	}
	public void setAttachmentId(Long attachmentId) {
		this.attachmentId = attachmentId;
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

}

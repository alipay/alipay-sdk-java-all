package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检查检验须知
 *
 * @author auto create
 * @since 1.0, 2026-09-14 14:13:01
 */
public class NoticeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8549687382664418999L;

	/**
	 * 须知内容
	 */
	@ApiField("notice_content")
	private String noticeContent;

	/**
	 * 须知图片地址
	 */
	@ApiField("notice_pic_url")
	private String noticePicUrl;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public String getNoticeContent() {
		return this.noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getNoticePicUrl() {
		return this.noticePicUrl;
	}
	public void setNoticePicUrl(String noticePicUrl) {
		this.noticePicUrl = noticePicUrl;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}

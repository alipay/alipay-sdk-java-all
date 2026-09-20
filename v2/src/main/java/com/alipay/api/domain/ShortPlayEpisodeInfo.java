package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 短剧剧集信息。
 *
 * @author auto create
 * @since 1.0, 2026-09-04 10:58:40
 */
public class ShortPlayEpisodeInfo extends AlipayObject {

	private static final long serialVersionUID = 3832577494452718464L;

	/**
	 * 剧集封面媒资ID（支付宝上传接口返回的 file_id）
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 剧集视频媒资ID（支付宝上传接口返回的 file_id）
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 集数序号，要求从 1 开始连贯递增，最大序号等于总集数。
	 */
	@ApiField("seq")
	private Long seq;

	/**
	 * 剧集标题，最多30个字。
	 */
	@ApiField("title")
	private String title;

	public String getCover() {
		return this.cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public Long getSeq() {
		return this.seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 短剧视频上传接口
 *
 * @author auto create
 * @since 1.0, 2026-01-23 10:07:43
 */
public class AlipaySocialBaseLifecreationShortplayUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1746945461151513362L;

	/**
	 * 生活号+号ID。如果发送类型=自研/三方发送，不要传入；发送类型=mcn发送，请传入public_id【mcn机构绑定达人号ID】
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 内容正文，纯文本，正文长度不超过1000个字
	 */
	@ApiField("source_content")
	private String sourceContent;

	/**
	 * 素材列表，需提交两个素材类型，一个是视频类型，一个是封面类型
	 */
	@ApiListField("source_media_infos")
	@ApiField("short_play_source_media_info")
	private List<ShortPlaySourceMediaInfo> sourceMediaInfos;

	/**
	 * 标题长度的最大字数为30个字
	 */
	@ApiField("source_title")
	private String sourceTitle;

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getSourceContent() {
		return this.sourceContent;
	}
	public void setSourceContent(String sourceContent) {
		this.sourceContent = sourceContent;
	}

	public List<ShortPlaySourceMediaInfo> getSourceMediaInfos() {
		return this.sourceMediaInfos;
	}
	public void setSourceMediaInfos(List<ShortPlaySourceMediaInfo> sourceMediaInfos) {
		this.sourceMediaInfos = sourceMediaInfos;
	}

	public String getSourceTitle() {
		return this.sourceTitle;
	}
	public void setSourceTitle(String sourceTitle) {
		this.sourceTitle = sourceTitle;
	}

}

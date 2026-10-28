package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附件视频播放信息查询
 *
 * @author auto create
 * @since 1.0, 2026-10-27 10:47:58
 */
public class AlipayDigitalmgmtEmbenefitVideoplayinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8545599712761593489L;

	/**
	 * 附件ID
	 */
	@ApiField("attachment_id")
	private Long attachmentId;

	public Long getAttachmentId() {
		return this.attachmentId;
	}
	public void setAttachmentId(Long attachmentId) {
		this.attachmentId = attachmentId;
	}

}

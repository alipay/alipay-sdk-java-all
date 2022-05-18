package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序审核结果原因
 *
 * @author auto create
 * @since 1.0, 2021-11-25 16:24:51
 */
public class MiniAppAuditReason extends AlipayObject {

	private static final long serialVersionUID = 5631464155478712674L;

	/**
	 * 审核图片列表
	 */
	@ApiListField("audit_images")
	@ApiField("string")
	private List<String> auditImages;

	/**
	 * 驳回原因列表
	 */
	@ApiListField("memos")
	@ApiField("mini_app_audit_reason_memo")
	private List<MiniAppAuditReasonMemo> memos;

	public List<String> getAuditImages() {
		return this.auditImages;
	}
	public void setAuditImages(List<String> auditImages) {
		this.auditImages = auditImages;
	}

	public List<MiniAppAuditReasonMemo> getMemos() {
		return this.memos;
	}
	public void setMemos(List<MiniAppAuditReasonMemo> memos) {
		this.memos = memos;
	}

}

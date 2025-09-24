package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 审核拒绝扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-07-14 21:01:47
 */
public class CreativeRefuseExtendInfoRes extends AlipayObject {

	private static final long serialVersionUID = 4256217415696395924L;

	/**
	 * 审核拒绝的原因文案
	 */
	@ApiListField("audit_refuse_reason_list")
	@ApiField("string")
	private List<String> auditRefuseReasonList;

	/**
	 * 审核拒绝图片链接
	 */
	@ApiListField("image_url_list")
	@ApiField("string")
	private List<String> imageUrlList;

	public List<String> getAuditRefuseReasonList() {
		return this.auditRefuseReasonList;
	}
	public void setAuditRefuseReasonList(List<String> auditRefuseReasonList) {
		this.auditRefuseReasonList = auditRefuseReasonList;
	}

	public List<String> getImageUrlList() {
		return this.imageUrlList;
	}
	public void setImageUrlList(List<String> imageUrlList) {
		this.imageUrlList = imageUrlList;
	}

}

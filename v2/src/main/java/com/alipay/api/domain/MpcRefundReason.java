package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云逆向理由集合
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:14:08
 */
public class MpcRefundReason extends AlipayObject {

	private static final long serialVersionUID = 3515891738463896147L;

	/**
	 * 是否要求上传凭证
	 */
	@ApiField("proof_required")
	private Boolean proofRequired;

	/**
	 * 理由文本 id
	 */
	@ApiField("reason_text_id")
	private String reasonTextId;

	/**
	 * 理由文本
	 */
	@ApiField("reason_tips")
	private String reasonTips;

	/**
	 * 是否要求留言
	 */
	@ApiField("refund_desc_required")
	private Boolean refundDescRequired;

	public Boolean getProofRequired() {
		return this.proofRequired;
	}
	public void setProofRequired(Boolean proofRequired) {
		this.proofRequired = proofRequired;
	}

	public String getReasonTextId() {
		return this.reasonTextId;
	}
	public void setReasonTextId(String reasonTextId) {
		this.reasonTextId = reasonTextId;
	}

	public String getReasonTips() {
		return this.reasonTips;
	}
	public void setReasonTips(String reasonTips) {
		this.reasonTips = reasonTips;
	}

	public Boolean getRefundDescRequired() {
		return this.refundDescRequired;
	}
	public void setRefundDescRequired(Boolean refundDescRequired) {
		this.refundDescRequired = refundDescRequired;
	}

}

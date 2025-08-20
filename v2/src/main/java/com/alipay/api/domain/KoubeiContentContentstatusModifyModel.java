package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容状态修改
 *
 * @author auto create
 * @since 1.0, 2019-03-15 10:29:58
 */
public class KoubeiContentContentstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2712537551464692672L;

	/**
	 * 口碑端内容唯一id，必填
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 需要修改的内容状态，必填.内容状态是审核拒绝(AUDIT_DENY),才可以修改否则不能修改.
状态枚举:
INIT,初始态,
AUDITING,审核中,
INFOSEC_AUDITING,风控审核中,
ENABLE,有效,
DISABLE,无效,
AUDIT_DENY,审核拒绝
	 */
	@ApiField("status")
	private String status;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

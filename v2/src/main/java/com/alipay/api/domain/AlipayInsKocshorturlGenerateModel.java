package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成koc链路拼接动参后投保链接的短链
 *
 * @author auto create
 * @since 1.0, 2024-08-15 11:34:55
 */
public class AlipayInsKocshorturlGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 2476917646874922766L;

	/**
	 * 机构标识，由我方为机构分配，用于校验和配置隔离
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 机构对应的保保号id，需在系统中落过记录且绑定机构
	 */
	@ApiField("koc_uid")
	private String kocUid;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 唯一标识|用户请求ID (partnerID|requestID，限制数字、字母，分隔符用竖线"|"；字段长度<50字符)
	 */
	@ApiField("request_id")
	private String requestId;

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getKocUid() {
		return this.kocUid;
	}
	public void setKocUid(String kocUid) {
		this.kocUid = kocUid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}

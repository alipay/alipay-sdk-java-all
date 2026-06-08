package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.marketing.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-23 16:02:44
 */
public class AlipayCommerceIotMarketingTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7794785822814246165L;

	/** 
	 * 模版状态
WAITTING_AUDIT(0, "WAITTING_AUDIT", "待审核", "待审核"),
    AUDITING(1, "AUDITING", "审核中", "审核中"),
    AUDIT_SUCCESS(2, "AUDIT_SUCCESS", "审核成功", "审核成功"),
    AUDIT_FAIL(3, "AUDIT_FAIL", "审核失败", "审核失败"),
    ONLINE(4, "ONLINE", "已上线", "上线操作"),
    OFFLINE(5, "OFFLINE", "已失效", "下线操作"),
    ONLINE_ERROR(6, "ONLINE_ERROR", "上线失败", "上线失败");
	 */
	@ApiField("status_code")
	private Long statusCode;

	/** 
	 * 模版id
	 */
	@ApiField("template_id")
	private String templateId;

	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}
	public Long getStatusCode( ) {
		return this.statusCode;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

}

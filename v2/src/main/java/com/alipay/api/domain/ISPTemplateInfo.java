package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商模版信息
 *
 * @author auto create
 * @since 1.0, 2026-03-23 15:42:17
 */
public class ISPTemplateInfo extends AlipayObject {

	private static final long serialVersionUID = 8862923269583641933L;

	/**
	 * 模版有效期结束时间戳
	 */
	@ApiField("end_time")
	private Long endTime;

	/**
	 * 图片文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 模版图片展位
电子海报:NORMAL_DISPLAY
支付结果页:PAY_SUCCESS_RESULT
商户信息海报:MERCHANT_INFO_POSTER
	 */
	@ApiField("space_code")
	private String spaceCode;

	/**
	 * 模版有效期开始时间戳
	 */
	@ApiField("start_time")
	private Long startTime;

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

	/**
	 * 模版名称
	 */
	@ApiField("template_name")
	private String templateName;

	public Long getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getSpaceCode() {
		return this.spaceCode;
	}
	public void setSpaceCode(String spaceCode) {
		this.spaceCode = spaceCode;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}

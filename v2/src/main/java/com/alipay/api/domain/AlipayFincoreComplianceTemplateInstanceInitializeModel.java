package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模板实例初始化
 *
 * @author auto create
 * @since 1.0, 2023-08-31 19:41:36
 */
public class AlipayFincoreComplianceTemplateInstanceInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 2476264232428394242L;

	/**
	 * 业务单据号
	 */
	@ApiField("biz_business_id")
	private String bizBusinessId;

	/**
	 * 业务参数对象，用来填充模板
	 */
	@ApiField("biz_object_def_json")
	private String bizObjectDefJson;

	/**
	 * 非必填内容，不传时，以businessId作为幂等键
	 */
	@ApiField("idempotent")
	private String idempotent;

	/**
	 * 是否需要doc文件结果
	 */
	@ApiField("need_file")
	private Boolean needFile;

	/**
	 * 是否需要结果生成html文件
	 */
	@ApiField("need_html")
	private Boolean needHtml;

	/**
	 * 系统来源Id
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 模板编码
	 */
	@ApiListField("template_codes")
	@ApiField("string")
	private List<String> templateCodes;

	/**
	 * 模板库编码，需要找owner获取自己业务系统模板库的编码
	 */
	@ApiField("template_lib_code")
	private String templateLibCode;

	/**
	 * 租户名称
	 */
	@ApiField("tenant")
	private String tenant;

	public String getBizBusinessId() {
		return this.bizBusinessId;
	}
	public void setBizBusinessId(String bizBusinessId) {
		this.bizBusinessId = bizBusinessId;
	}

	public String getBizObjectDefJson() {
		return this.bizObjectDefJson;
	}
	public void setBizObjectDefJson(String bizObjectDefJson) {
		this.bizObjectDefJson = bizObjectDefJson;
	}

	public String getIdempotent() {
		return this.idempotent;
	}
	public void setIdempotent(String idempotent) {
		this.idempotent = idempotent;
	}

	public Boolean getNeedFile() {
		return this.needFile;
	}
	public void setNeedFile(Boolean needFile) {
		this.needFile = needFile;
	}

	public Boolean getNeedHtml() {
		return this.needHtml;
	}
	public void setNeedHtml(Boolean needHtml) {
		this.needHtml = needHtml;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public List<String> getTemplateCodes() {
		return this.templateCodes;
	}
	public void setTemplateCodes(List<String> templateCodes) {
		this.templateCodes = templateCodes;
	}

	public String getTemplateLibCode() {
		return this.templateLibCode;
	}
	public void setTemplateLibCode(String templateLibCode) {
		this.templateLibCode = templateLibCode;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}

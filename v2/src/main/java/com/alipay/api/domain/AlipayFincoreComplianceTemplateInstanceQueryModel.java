package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版实例查询
 *
 * @author auto create
 * @since 1.0, 2024-06-12 11:09:51
 */
public class AlipayFincoreComplianceTemplateInstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1543394542693616453L;

	/**
	 * 业务实例id
	 */
	@ApiField("biz_business_id")
	private String bizBusinessId;

	/**
	 * 模版业务实例id
	 */
	@ApiField("biz_instance_id")
	private String bizInstanceId;

	/**
	 * 是否需要pdf格式文件
	 */
	@ApiField("need_pdf_file")
	private Boolean needPdfFile;

	/**
	 * 系统来源
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getBizBusinessId() {
		return this.bizBusinessId;
	}
	public void setBizBusinessId(String bizBusinessId) {
		this.bizBusinessId = bizBusinessId;
	}

	public String getBizInstanceId() {
		return this.bizInstanceId;
	}
	public void setBizInstanceId(String bizInstanceId) {
		this.bizInstanceId = bizInstanceId;
	}

	public Boolean getNeedPdfFile() {
		return this.needPdfFile;
	}
	public void setNeedPdfFile(Boolean needPdfFile) {
		this.needPdfFile = needPdfFile;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}

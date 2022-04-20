package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件下载
 *
 * @author auto create
 * @since 1.0, 2021-11-12 14:32:56
 */
public class AlipayBossProdContractDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 3818434269953783546L;

	/**
	 * 请求id
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 文件的fileKey
	 */
	@ApiField("file_key")
	private String fileKey;

	/**
	 * 当前系统名称
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getFileKey() {
		return this.fileKey;
	}
	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
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

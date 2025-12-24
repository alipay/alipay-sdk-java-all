package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 景区审核信息查询结果
 *
 * @author auto create
 * @since 1.0, 2021-06-10 15:24:56
 */
public class ScenicAuditInfo extends AlipayObject {

	private static final long serialVersionUID = 8482175486256934718L;

	/**
	 * 审核信息
	 */
	@ApiField("audit_msg")
	private String auditMsg;

	/**
	 * 审核结果
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 内外id映射关系创建时间
	 */
	@ApiField("import_gmt_create")
	private String importGmtCreate;

	/**
	 * 服务商景区ID
	 */
	@ApiField("outer_id_isv")
	private String outerIdIsv;

	/**
	 * 支付宝域内维护的景区外部id
	 */
	@ApiField("outer_id_zfb")
	private String outerIdZfb;

	/**
	 * 服务商负责的景区小程序APPID
	 */
	@ApiField("scenic_app_id")
	private String scenicAppId;

	/**
	 * 支付宝域景区ID
	 */
	@ApiField("scenic_id")
	private String scenicId;

	public String getAuditMsg() {
		return this.auditMsg;
	}
	public void setAuditMsg(String auditMsg) {
		this.auditMsg = auditMsg;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getImportGmtCreate() {
		return this.importGmtCreate;
	}
	public void setImportGmtCreate(String importGmtCreate) {
		this.importGmtCreate = importGmtCreate;
	}

	public String getOuterIdIsv() {
		return this.outerIdIsv;
	}
	public void setOuterIdIsv(String outerIdIsv) {
		this.outerIdIsv = outerIdIsv;
	}

	public String getOuterIdZfb() {
		return this.outerIdZfb;
	}
	public void setOuterIdZfb(String outerIdZfb) {
		this.outerIdZfb = outerIdZfb;
	}

	public String getScenicAppId() {
		return this.scenicAppId;
	}
	public void setScenicAppId(String scenicAppId) {
		this.scenicAppId = scenicAppId;
	}

	public String getScenicId() {
		return this.scenicId;
	}
	public void setScenicId(String scenicId) {
		this.scenicId = scenicId;
	}

}

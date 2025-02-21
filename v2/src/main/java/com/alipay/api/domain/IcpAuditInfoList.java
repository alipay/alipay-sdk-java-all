package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序备案审批项列表信息
 *
 * @author auto create
 * @since 1.0, 2023-12-27 10:55:19
 */
public class IcpAuditInfoList extends AlipayObject {

	private static final long serialVersionUID = 1844252348142358944L;

	/**
	 * 小程序前置审批文件材料凭证media_id（参考：备案文件材料上传接口）
	 */
	@ApiField("audit_material")
	private String auditMaterial;

	/**
	 * 小程序前置审批号
	 */
	@ApiField("audit_number")
	private String auditNumber;

	/**
	 * 小程序前置审批项类型（参考：获取小程序前置审批项接口）
	 */
	@ApiField("audit_type")
	private String auditType;

	public String getAuditMaterial() {
		return this.auditMaterial;
	}
	public void setAuditMaterial(String auditMaterial) {
		this.auditMaterial = auditMaterial;
	}

	public String getAuditNumber() {
		return this.auditNumber;
	}
	public void setAuditNumber(String auditNumber) {
		this.auditNumber = auditNumber;
	}

	public String getAuditType() {
		return this.auditType;
	}
	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

}

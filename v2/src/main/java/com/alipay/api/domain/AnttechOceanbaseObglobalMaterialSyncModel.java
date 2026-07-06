package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * OB物料同步
 *
 * @author auto create
 * @since 1.0, 2026-04-15 15:57:46
 */
public class AnttechOceanbaseObglobalMaterialSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3418552576833256771L;

	/**
	 * 附件名称
	 */
	@ApiField("attachment_name")
	private String attachmentName;

	/**
	 * null
	 */
	@ApiListField("attachments")
	@ApiField("material_query_attachment_d_t_o")
	private List<MaterialQueryAttachmentDTO> attachments;

	/**
	 * 认证单位
	 */
	@ApiField("certification_unit")
	private String certificationUnit;

	/**
	 * 显示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 资料查询编号
	 */
	@ApiField("material_no")
	private String materialNo;

	/**
	 * 资料类型
	 */
	@ApiField("material_type")
	private String materialType;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 有效期
	 */
	@ApiField("valid_until")
	private String validUntil;

	public String getAttachmentName() {
		return this.attachmentName;
	}
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public List<MaterialQueryAttachmentDTO> getAttachments() {
		return this.attachments;
	}
	public void setAttachments(List<MaterialQueryAttachmentDTO> attachments) {
		this.attachments = attachments;
	}

	public String getCertificationUnit() {
		return this.certificationUnit;
	}
	public void setCertificationUnit(String certificationUnit) {
		this.certificationUnit = certificationUnit;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getMaterialNo() {
		return this.materialNo;
	}
	public void setMaterialNo(String materialNo) {
		this.materialNo = materialNo;
	}

	public String getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getValidUntil() {
		return this.validUntil;
	}
	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
	}

}

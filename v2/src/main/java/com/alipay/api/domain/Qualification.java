package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-15 21:29:22
 */
public class Qualification extends AlipayObject {

	private static final long serialVersionUID = 1541851952992288749L;

	/**
	 * 锚定物实例
	 */
	@ApiField("anchor_instance")
	private AnchorInstance anchorInstance;

	/**
	 * 资格申领状态
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 已经申领成功
	 */
	@ApiField("apply_status_desc")
	private String applyStatusDesc;

	/**
	 * 领取的资格信息
	 */
	@ApiField("asset_info")
	private String assetInfo;

	/**
	 * 资格ID
	 */
	@ApiField("qual_id")
	private String qualId;

	/**
	 * 资格实例
	 */
	@ApiField("qualification_instance")
	private QualInstanceDTO qualificationInstance;

	/**
	 * 资格模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public AnchorInstance getAnchorInstance() {
		return this.anchorInstance;
	}
	public void setAnchorInstance(AnchorInstance anchorInstance) {
		this.anchorInstance = anchorInstance;
	}

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getApplyStatusDesc() {
		return this.applyStatusDesc;
	}
	public void setApplyStatusDesc(String applyStatusDesc) {
		this.applyStatusDesc = applyStatusDesc;
	}

	public String getAssetInfo() {
		return this.assetInfo;
	}
	public void setAssetInfo(String assetInfo) {
		this.assetInfo = assetInfo;
	}

	public String getQualId() {
		return this.qualId;
	}
	public void setQualId(String qualId) {
		this.qualId = qualId;
	}

	public QualInstanceDTO getQualificationInstance() {
		return this.qualificationInstance;
	}
	public void setQualificationInstance(QualInstanceDTO qualificationInstance) {
		this.qualificationInstance = qualificationInstance;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}

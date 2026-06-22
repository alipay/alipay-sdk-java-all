package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-29 14:27:49
 */
public class AxfItemCategoryQualificationReq extends AlipayObject {

	private static final long serialVersionUID = 7888561343791729371L;

	/**
	 * null
	 */
	@ApiListField("attachment_ids")
	@ApiField("string")
	private List<String> attachmentIds;

	/**
	 * 法人身份证号
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 法人身份证
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 营业执照号
	 */
	@ApiField("org_cert_no")
	private String orgCertNo;

	/**
	 * 资质内容。参考类目模版响应接口所需资质参数描述。如果需要图片先走图片上传接口获取图片id 当前字段已废弃(当前字段已废弃，请勿传入)
	 */
	@ApiField("qualification_content")
	@Deprecated
	private String qualificationContent;

	/**
	 * 资质类型
	 */
	@ApiField("qualification_type")
	private String qualificationType;

	public List<String> getAttachmentIds() {
		return this.attachmentIds;
	}
	public void setAttachmentIds(List<String> attachmentIds) {
		this.attachmentIds = attachmentIds;
	}

	public String getLegalCertNo() {
		return this.legalCertNo;
	}
	public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}

	public String getLegalName() {
		return this.legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getOrgCertNo() {
		return this.orgCertNo;
	}
	public void setOrgCertNo(String orgCertNo) {
		this.orgCertNo = orgCertNo;
	}

	public String getQualificationContent() {
		return this.qualificationContent;
	}
	public void setQualificationContent(String qualificationContent) {
		this.qualificationContent = qualificationContent;
	}

	public String getQualificationType() {
		return this.qualificationType;
	}
	public void setQualificationType(String qualificationType) {
		this.qualificationType = qualificationType;
	}

}

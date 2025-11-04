package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模板版本保存
 *
 * @author auto create
 * @since 1.0, 2025-01-10 15:52:44
 */
public class AlipaySecurityProdTemplateVersioncontentSaveModel extends AlipayObject {

	private static final long serialVersionUID = 7761264711348579694L;

	/**
	 * 是否直接发布
	 */
	@ApiField("direct_publish")
	private Boolean directPublish;

	/**
	 * 操作人工号
	 */
	@ApiField("emp_id")
	private String empId;

	/**
	 * 文件地址
	 */
	@ApiField("file_key")
	private String fileKey;

	/**
	 * 预览地址
	 */
	@ApiField("preview_address")
	private String previewAddress;

	/**
	 * 来源系统
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	/**
	 * 模板编码
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * {
  "creatorNo": "360563",
  "enumId": null,
  "includeAttr": null,
  "creatorName": "豫洛",
  "elementCode": "CP20240514213023006482",
  "templateCode": "T20240514210354040105",
  "type": "COMPONENT",
  "content": "<component id=\"CP20240514213023006482\" placeholder=\"【甲方名称】\" type=\"INPUT\" enableEdit=\"Y\" required=\"Y\"/>",
  "sortValue": 257,
  "publicName": "CP20240514213023006482_TE20240514213023040606",
  "uk": "TE20240514213023040606",
  "name": "【甲方名称】",
  "templateVersion": "1",
  "tenant": "ANT_ZHIKE"
}
	 */
	@ApiListField("template_element_list")
	@ApiField("template_element_link_d_t_o")
	private List<TemplateElementLinkDTO> templateElementList;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 模板版本
	 */
	@ApiField("version_no")
	private String versionNo;

	public Boolean getDirectPublish() {
		return this.directPublish;
	}
	public void setDirectPublish(Boolean directPublish) {
		this.directPublish = directPublish;
	}

	public String getEmpId() {
		return this.empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFileKey() {
		return this.fileKey;
	}
	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}

	public String getPreviewAddress() {
		return this.previewAddress;
	}
	public void setPreviewAddress(String previewAddress) {
		this.previewAddress = previewAddress;
	}

	public String getSourceSystemId() {
		return this.sourceSystemId;
	}
	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public List<TemplateElementLinkDTO> getTemplateElementList() {
		return this.templateElementList;
	}
	public void setTemplateElementList(List<TemplateElementLinkDTO> templateElementList) {
		this.templateElementList = templateElementList;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

}

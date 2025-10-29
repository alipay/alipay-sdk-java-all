package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起理赔申请的申请材料
 *
 * @author auto create
 * @since 1.0, 2025-10-28 14:27:28
 */
public class ClaimReportApplyIdentityMaterials extends AlipayObject {

	private static final long serialVersionUID = 3696392345186782897L;

	/**
	 * 补充材料话术
	 */
	@ApiField("description")
	private String description;

	/**
	 * 材料内容
	 */
	@ApiField("material_content")
	private String materialContent;

	/**
	 * 申请材料类型
● DISCHARGE_SUMMARY：出院小结
● HOSPITALIZATION_INVOICE：住院发票第一联原件
● HOSPITALIZATION_EXPENSES_TOTAL：住院总费用清单
● CASE_HISTORY：住院病历
● MEDICAL_INSURANCE_SETTLEMENT：医保结算单原件
● OTHER：其他
	 */
	@ApiField("material_type")
	private String materialType;

	/**
	 * 材料地址
	 */
	@ApiField("pic_urls")
	private String picUrls;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getMaterialContent() {
		return this.materialContent;
	}
	public void setMaterialContent(String materialContent) {
		this.materialContent = materialContent;
	}

	public String getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getPicUrls() {
		return this.picUrls;
	}
	public void setPicUrls(String picUrls) {
		this.picUrls = picUrls;
	}

}

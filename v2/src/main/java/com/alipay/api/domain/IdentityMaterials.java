package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商保码-理赔案件申请-申请材料
 *
 * @author auto create
 * @since 1.0, 2025-09-08 17:48:29
 */
public class IdentityMaterials extends AlipayObject {

	private static final long serialVersionUID = 1197477912792994276L;

	/**
	 * 补充材料话术
	 */
	@ApiField("description")
	private String description;

	/**
	 * 申请材料类型
● DISCHARGE_SUMMARY：出院小结 ● HOSPITALIZATION_INVOICE：住院发票第一联原件 ● HOSPITALIZATION_EXPENSES_TOTAL：住院总费用清单 ● CASE_HISTORY：住院病历 ● MEDICAL_INSURANCE_SETTLEMENT：医保结算单原件 ● OTHER：其他
	 */
	@ApiField("material_type")
	private String materialType;

	/**
	 * 申请材料地址
	 */
	@ApiListField("pic_urls")
	@ApiField("string")
	private List<String> picUrls;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public List<String> getPicUrls() {
		return this.picUrls;
	}
	public void setPicUrls(List<String> picUrls) {
		this.picUrls = picUrls;
	}

}

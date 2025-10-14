package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起理赔申请的申请材料
 *
 * @author auto create
 * @since 1.0, 2025-06-24 19:19:34
 */
public class ClaimReportApplyIdentityMaterials extends AlipayObject {

	private static final long serialVersionUID = 6827281777879353313L;

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

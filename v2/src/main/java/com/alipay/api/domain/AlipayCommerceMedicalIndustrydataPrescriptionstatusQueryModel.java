package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 处方单状态查询接口
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:25:24
 */
public class AlipayCommerceMedicalIndustrydataPrescriptionstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6475557656624353773L;

	/**
	 * 外部机构自己的处方编码
	 */
	@ApiField("ext_prescription_code")
	private String extPrescriptionCode;

	/**
	 * 支付宝问诊订单号
	 */
	@ApiField("inquiry_id")
	private String inquiryId;

	/**
	 * 平台编号，支付宝分配
	 */
	@ApiField("platform_code")
	private String platformCode;

	public String getExtPrescriptionCode() {
		return this.extPrescriptionCode;
	}
	public void setExtPrescriptionCode(String extPrescriptionCode) {
		this.extPrescriptionCode = extPrescriptionCode;
	}

	public String getInquiryId() {
		return this.inquiryId;
	}
	public void setInquiryId(String inquiryId) {
		this.inquiryId = inquiryId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

}

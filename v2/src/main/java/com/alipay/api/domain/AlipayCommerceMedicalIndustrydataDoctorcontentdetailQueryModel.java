package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询医生文章直播观看数据接口
 *
 * @author auto create
 * @since 1.0, 2024-05-14 10:44:51
 */
public class AlipayCommerceMedicalIndustrydataDoctorcontentdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4683372658486755742L;

	/**
	 * 外部医生ID
	 */
	@ApiField("merchant_doctor_id")
	private String merchantDoctorId;

	/**
	 * 平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	public String getMerchantDoctorId() {
		return this.merchantDoctorId;
	}
	public void setMerchantDoctorId(String merchantDoctorId) {
		this.merchantDoctorId = merchantDoctorId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

}

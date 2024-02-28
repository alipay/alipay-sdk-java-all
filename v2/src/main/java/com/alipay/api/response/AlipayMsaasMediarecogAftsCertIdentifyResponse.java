package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.afts.cert.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:23:48
 */
public class AlipayMsaasMediarecogAftsCertIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2842439267425793841L;

	/** 
	 * 浮点数，属于该证件类型的概率
	 */
	@ApiField("cert_probability")
	private Long certProbability;

	/** 
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 发动机号
	 */
	@ApiField("ocr_engine_number")
	private String ocrEngineNumber;

	/** 
	 * 姓名
	 */
	@ApiField("ocr_name")
	private String ocrName;

	/** 
	 * 车牌
	 */
	@ApiField("ocr_plate_number")
	private String ocrPlateNumber;

	/** 
	 * 车架号
	 */
	@ApiField("ocr_vehicle_id")
	private String ocrVehicleId;

	public void setCertProbability(Long certProbability) {
		this.certProbability = certProbability;
	}
	public Long getCertProbability( ) {
		return this.certProbability;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setOcrEngineNumber(String ocrEngineNumber) {
		this.ocrEngineNumber = ocrEngineNumber;
	}
	public String getOcrEngineNumber( ) {
		return this.ocrEngineNumber;
	}

	public void setOcrName(String ocrName) {
		this.ocrName = ocrName;
	}
	public String getOcrName( ) {
		return this.ocrName;
	}

	public void setOcrPlateNumber(String ocrPlateNumber) {
		this.ocrPlateNumber = ocrPlateNumber;
	}
	public String getOcrPlateNumber( ) {
		return this.ocrPlateNumber;
	}

	public void setOcrVehicleId(String ocrVehicleId) {
		this.ocrVehicleId = ocrVehicleId;
	}
	public String getOcrVehicleId( ) {
		return this.ocrVehicleId;
	}

}

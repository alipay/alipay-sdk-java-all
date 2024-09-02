package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆认证状态查询结果
 *
 * @author auto create
 * @since 1.0, 2022-09-29 10:42:17
 */
public class PlateNoCertDto extends AlipayObject {

	private static final long serialVersionUID = 8453293939528317579L;

	/**
	 * true，false
	 */
	@ApiField("cert_result")
	private Boolean certResult;

	/**
	 * 车牌号码
	 */
	@ApiField("plate_no")
	private String plateNo;

	public Boolean getCertResult() {
		return this.certResult;
	}
	public void setCertResult(Boolean certResult) {
		this.certResult = certResult;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

}

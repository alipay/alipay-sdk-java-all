package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车场业务归属配置
 *
 * @author auto create
 * @since 1.0, 2019-06-13 13:47:16
 */
public class AlipayEcoMycarParkingBusinessModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1347789638312977937L;

	/**
	 * 停车场无感业务归属appid。appid在停车平台配置过ISV信息。
	 */
	@ApiField("agreement_appid")
	private String agreementAppid;

	/**
	 * 支付宝返回停车场id
	 */
	@ApiField("parking_id")
	private String parkingId;

	public String getAgreementAppid() {
		return this.agreementAppid;
	}
	public void setAgreementAppid(String agreementAppid) {
		this.agreementAppid = agreementAppid;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

}

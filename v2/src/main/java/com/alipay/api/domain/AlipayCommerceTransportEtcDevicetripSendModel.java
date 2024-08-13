package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC实时通行记录推送
 *
 * @author auto create
 * @since 1.0, 2024-05-15 15:57:10
 */
public class AlipayCommerceTransportEtcDevicetripSendModel extends AlipayObject {

	private static final long serialVersionUID = 3854449328253277495L;

	/**
	 * ETC设备卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * ETC设备号
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * 实时行程记录
	 */
	@ApiField("trip_ino")
	private EtcDeviceTripInfo tripIno;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public EtcDeviceTripInfo getTripIno() {
		return this.tripIno;
	}
	public void setTripIno(EtcDeviceTripInfo tripIno) {
		this.tripIno = tripIno;
	}

}

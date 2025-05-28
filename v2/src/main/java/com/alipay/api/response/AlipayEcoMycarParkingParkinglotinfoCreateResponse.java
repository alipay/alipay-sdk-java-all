package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.parkinglotinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 15:12:27
 */
public class AlipayEcoMycarParkingParkinglotinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7539754862594772482L;

	/** 
	 * 具体错误码 参数异常：INVALID_PARAMETER 没有权限操作：NO_PERMISSION_ERROR 请求受理结果未知：BIZ_UNKNOWN 请求受理失败：BIZ_FAIL 系统繁忙：SYSTEM_ERROR
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 具体错误原因
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	/** 
	 * 支付宝返回停车场id。成功不为空，失败返回空
	 */
	@ApiField("parking_id")
	private String parkingId;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}
	public String getBizMsg( ) {
		return this.bizMsg;
	}

	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}
	public String getParkingId( ) {
		return this.parkingId;
	}

}

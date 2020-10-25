package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.waybill.istddetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-27 22:00:38
 */
public class AlipayCommerceLogisticsWaybillIstddetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4487247334348627476L;

	/** 
	 * 预计还剩多久送达 单位：秒
	 */
	@ApiField("reach_duration")
	private Long reachDuration;

	/** 
	 * 骑手位置纬度
	 */
	@ApiField("rider_lat")
	private Long riderLat;

	/** 
	 * 骑手位置经度
	 */
	@ApiField("rider_lng")
	private Long riderLng;

	/** 
	 * 骑手电话
	 */
	@ApiField("rider_mobile_no")
	private String riderMobileNo;

	/** 
	 * 骑手姓名
	 */
	@ApiField("rider_name")
	private String riderName;

	/** 
	 * 即时配送运单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 即时配送公司返回的错误码
	 */
	@ApiField("third_error_code")
	private String thirdErrorCode;

	/** 
	 * 即时配送公司返回的错误描述
	 */
	@ApiField("third_error_msg")
	private String thirdErrorMsg;

	public void setReachDuration(Long reachDuration) {
		this.reachDuration = reachDuration;
	}
	public Long getReachDuration( ) {
		return this.reachDuration;
	}

	public void setRiderLat(Long riderLat) {
		this.riderLat = riderLat;
	}
	public Long getRiderLat( ) {
		return this.riderLat;
	}

	public void setRiderLng(Long riderLng) {
		this.riderLng = riderLng;
	}
	public Long getRiderLng( ) {
		return this.riderLng;
	}

	public void setRiderMobileNo(String riderMobileNo) {
		this.riderMobileNo = riderMobileNo;
	}
	public String getRiderMobileNo( ) {
		return this.riderMobileNo;
	}

	public void setRiderName(String riderName) {
		this.riderName = riderName;
	}
	public String getRiderName( ) {
		return this.riderName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setThirdErrorCode(String thirdErrorCode) {
		this.thirdErrorCode = thirdErrorCode;
	}
	public String getThirdErrorCode( ) {
		return this.thirdErrorCode;
	}

	public void setThirdErrorMsg(String thirdErrorMsg) {
		this.thirdErrorMsg = thirdErrorMsg;
	}
	public String getThirdErrorMsg( ) {
		return this.thirdErrorMsg;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.waybill.istddetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:38
 */
public class AlipayCommerceLogisticsWaybillIstddetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6849995277663558557L;

	/** 
	 * 预计还剩多久送达 单位：秒
	 */
	@ApiField("reach_duration")
	private Long reachDuration;

	/** 
	 * 骑手位置纬度
	 */
	@ApiField("rider_lat")
	private String riderLat;

	/** 
	 * 骑手位置经度
	 */
	@ApiField("rider_lng")
	private String riderLng;

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

	public void setReachDuration(Long reachDuration) {
		this.reachDuration = reachDuration;
	}
	public Long getReachDuration( ) {
		return this.reachDuration;
	}

	public void setRiderLat(String riderLat) {
		this.riderLat = riderLat;
	}
	public String getRiderLat( ) {
		return this.riderLat;
	}

	public void setRiderLng(String riderLng) {
		this.riderLng = riderLng;
	}
	public String getRiderLng( ) {
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

}

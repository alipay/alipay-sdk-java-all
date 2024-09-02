package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.waybill.istddetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-02 10:39:15
 */
public class AlipayCommerceLogisticsWaybillIstddetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2472182369987551419L;

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
	 * 骑手实时定位H5链接字段，在骑手已接单后，将可展示骑手实时位置的H5页面链接同步商户
	 */
	@ApiField("rider_poi_link")
	private String riderPoiLink;

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

	public void setRiderPoiLink(String riderPoiLink) {
		this.riderPoiLink = riderPoiLink;
	}
	public String getRiderPoiLink( ) {
		return this.riderPoiLink;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

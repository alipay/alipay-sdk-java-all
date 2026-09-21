package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaxiOrderDetail;
import com.alipay.api.domain.TaxiRewardDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.bibifan.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-04 13:52:49
 */
public class AlipayCommerceTransportTaxiBibifanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2344992738761145213L;

	/** 
	 * 司机匹配的支付宝账户 现在暂时为伪uid
	 */
	@ApiField("driver_id")
	private String driverId;

	/** 
	 * 是否报名笔笔返
	 */
	@ApiField("is_enrolled")
	private Boolean isEnrolled;

	/** 
	 * null
	 */
	@ApiListField("taxi_order_details")
	@ApiField("taxi_order_detail")
	private List<TaxiOrderDetail> taxiOrderDetails;

	/** 
	 * null
	 */
	@ApiListField("taxi_reward_details")
	@ApiField("taxi_reward_detail")
	private List<TaxiRewardDetail> taxiRewardDetails;

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	public String getDriverId( ) {
		return this.driverId;
	}

	public void setIsEnrolled(Boolean isEnrolled) {
		this.isEnrolled = isEnrolled;
	}
	public Boolean getIsEnrolled( ) {
		return this.isEnrolled;
	}

	public void setTaxiOrderDetails(List<TaxiOrderDetail> taxiOrderDetails) {
		this.taxiOrderDetails = taxiOrderDetails;
	}
	public List<TaxiOrderDetail> getTaxiOrderDetails( ) {
		return this.taxiOrderDetails;
	}

	public void setTaxiRewardDetails(List<TaxiRewardDetail> taxiRewardDetails) {
		this.taxiRewardDetails = taxiRewardDetails;
	}
	public List<TaxiRewardDetail> getTaxiRewardDetails( ) {
		return this.taxiRewardDetails;
	}

}

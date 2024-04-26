package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EtcTripInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etcenterprise.trip.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:16
 */
public class AlipayCommerceTransportEtcenterpriseTripQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7728185178249648448L;

	/** 
	 * SUCCESS：订单申请成功； FAIL:申请失败
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 其他业务异常信息描述
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	/** 
	 * 行程单据列表
	 */
	@ApiListField("trip_list")
	@ApiField("etc_trip_info")
	private List<EtcTripInfo> tripList;

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

	public void setTripList(List<EtcTripInfo> tripList) {
		this.tripList = tripList;
	}
	public List<EtcTripInfo> getTripList( ) {
		return this.tripList;
	}

}

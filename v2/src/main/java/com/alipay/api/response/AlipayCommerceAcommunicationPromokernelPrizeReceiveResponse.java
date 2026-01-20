package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CampOrderInfo;
import com.alipay.api.domain.PrizeSendOrderDetailRes;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.promokernel.prize.receive response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-14 16:02:27
 */
public class AlipayCommerceAcommunicationPromokernelPrizeReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5822133131772247746L;

	/** 
	 * 活动单据信息
	 */
	@ApiField("camp_order_info")
	private CampOrderInfo campOrderInfo;

	/** 
	 * null
	 */
	@ApiListField("prize_send_order_detail_list")
	@ApiField("prize_send_order_detail_res")
	private List<PrizeSendOrderDetailRes> prizeSendOrderDetailList;

	public void setCampOrderInfo(CampOrderInfo campOrderInfo) {
		this.campOrderInfo = campOrderInfo;
	}
	public CampOrderInfo getCampOrderInfo( ) {
		return this.campOrderInfo;
	}

	public void setPrizeSendOrderDetailList(List<PrizeSendOrderDetailRes> prizeSendOrderDetailList) {
		this.prizeSendOrderDetailList = prizeSendOrderDetailList;
	}
	public List<PrizeSendOrderDetailRes> getPrizeSendOrderDetailList( ) {
		return this.prizeSendOrderDetailList;
	}

}

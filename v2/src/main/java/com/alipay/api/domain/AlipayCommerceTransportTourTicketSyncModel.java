package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门票数据同步
 *
 * @author auto create
 * @since 1.0, 2026-04-15 17:22:45
 */
public class AlipayCommerceTransportTourTicketSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6144531382327498273L;

	/**
	 * 景点Id
	 */
	@ApiField("scenic_id")
	private String scenicId;

	/**
	 * null
	 */
	@ApiListField("ticket_info_list")
	@ApiField("tour_ticket_info")
	private List<TourTicketInfo> ticketInfoList;

	public String getScenicId() {
		return this.scenicId;
	}
	public void setScenicId(String scenicId) {
		this.scenicId = scenicId;
	}

	public List<TourTicketInfo> getTicketInfoList() {
		return this.ticketInfoList;
	}
	public void setTicketInfoList(List<TourTicketInfo> ticketInfoList) {
		this.ticketInfoList = ticketInfoList;
	}

}

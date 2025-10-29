package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.card.exchange.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-10 17:27:32
 */
public class AlipayCommerceMedicalCardExchangeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2826833852882995699L;

	/** 
	 * 开通兑换详情
	 */
	@ApiListField("open_info_list")
	@ApiField("open_info_d_t_o")
	private List<OpenInfoDTO> openInfoList;

	/** 
	 * 1-已开通   2-未开通
	 */
	@ApiField("open_status")
	private Long openStatus;

	/** 
	 * 时间戳，毫秒
	 */
	@ApiField("open_time")
	private Long openTime;

	public void setOpenInfoList(List<OpenInfoDTO> openInfoList) {
		this.openInfoList = openInfoList;
	}
	public List<OpenInfoDTO> getOpenInfoList( ) {
		return this.openInfoList;
	}

	public void setOpenStatus(Long openStatus) {
		this.openStatus = openStatus;
	}
	public Long getOpenStatus( ) {
		return this.openStatus;
	}

	public void setOpenTime(Long openTime) {
		this.openTime = openTime;
	}
	public Long getOpenTime( ) {
		return this.openTime;
	}

}

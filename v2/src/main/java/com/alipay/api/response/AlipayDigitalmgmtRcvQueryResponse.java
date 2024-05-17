package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RcvDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.rcv.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:27
 */
public class AlipayDigitalmgmtRcvQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5476663853658469657L;

	/** 
	 * rcv详情
	 */
	@ApiField("rcv_dto")
	private RcvDto rcvDto;

	public void setRcvDto(RcvDto rcvDto) {
		this.rcvDto = rcvDto;
	}
	public RcvDto getRcvDto( ) {
		return this.rcvDto;
	}

}

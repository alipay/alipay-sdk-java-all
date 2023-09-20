package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RcvDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.rcv.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-15 10:01:44
 */
public class AlipayDigitalmgmtRcvQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6114817697772113551L;

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

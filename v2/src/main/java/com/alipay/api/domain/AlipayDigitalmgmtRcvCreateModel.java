package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建采购接收货单据
 *
 * @author auto create
 * @since 1.0, 2025-08-07 19:09:50
 */
public class AlipayDigitalmgmtRcvCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3246923315381199815L;

	/**
	 * 创建rcv参数
	 */
	@ApiField("rcv_create_dto")
	private RcvCreateDto rcvCreateDto;

	public RcvCreateDto getRcvCreateDto() {
		return this.rcvCreateDto;
	}
	public void setRcvCreateDto(RcvCreateDto rcvCreateDto) {
		this.rcvCreateDto = rcvCreateDto;
	}

}

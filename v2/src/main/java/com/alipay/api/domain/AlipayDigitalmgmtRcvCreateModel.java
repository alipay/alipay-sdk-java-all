package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建采购接收货单据
 *
 * @author auto create
 * @since 1.0, 2023-09-15 09:59:04
 */
public class AlipayDigitalmgmtRcvCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2246365447942762933L;

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

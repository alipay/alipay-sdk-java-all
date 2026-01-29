package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下pr单
 *
 * @author auto create
 * @since 1.0, 2025-02-21 12:04:49
 */
public class AlipayDigitalmgmtPunchoutPrCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6325965251646274383L;

	/**
	 * pur_req,用于下pr单
	 */
	@ApiField("pur_req")
	private MallReceivePrRequest purReq;

	public MallReceivePrRequest getPurReq() {
		return this.purReq;
	}
	public void setPurReq(MallReceivePrRequest purReq) {
		this.purReq = purReq;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下pr单
 *
 * @author auto create
 * @since 1.0, 2024-05-08 10:56:38
 */
public class AlipayDigitalmgmtPunchoutPrCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3625169191256912137L;

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

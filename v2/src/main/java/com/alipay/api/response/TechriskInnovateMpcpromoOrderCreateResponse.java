package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MpcOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.mpcpromo.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-21 15:41:54
 */
public class TechriskInnovateMpcpromoOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1844565626711527818L;

	/** 
	 * 小程序云订单
	 */
	@ApiField("mpc_order")
	private MpcOrderVO mpcOrder;

	public void setMpcOrder(MpcOrderVO mpcOrder) {
		this.mpcOrder = mpcOrder;
	}
	public MpcOrderVO getMpcOrder( ) {
		return this.mpcOrder;
	}

}

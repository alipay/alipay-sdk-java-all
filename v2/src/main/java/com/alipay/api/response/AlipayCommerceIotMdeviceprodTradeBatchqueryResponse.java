package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceTradeResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.trade.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:37
 */
public class AlipayCommerceIotMdeviceprodTradeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6361191439844656698L;

	/** 
	 * iot交易设备信息列表
	 */
	@ApiListField("result_list")
	@ApiField("device_trade_response")
	private List<DeviceTradeResponse> resultList;

	public void setResultList(List<DeviceTradeResponse> resultList) {
		this.resultList = resultList;
	}
	public List<DeviceTradeResponse> getResultList( ) {
		return this.resultList;
	}

}

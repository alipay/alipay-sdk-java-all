package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DriverTradeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.driverqrcodetrade.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:27
 */
public class AlipayCommerceTransportTaxiDriverqrcodetradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7641817523242426162L;

	/** 
	 * 出租车司机收钱码交易数据列表
	 */
	@ApiListField("driver_qrcode_trade_info_list")
	@ApiField("driver_trade_info")
	private List<DriverTradeInfo> driverQrcodeTradeInfoList;

	public void setDriverQrcodeTradeInfoList(List<DriverTradeInfo> driverQrcodeTradeInfoList) {
		this.driverQrcodeTradeInfoList = driverQrcodeTradeInfoList;
	}
	public List<DriverTradeInfo> getDriverQrcodeTradeInfoList( ) {
		return this.driverQrcodeTradeInfoList;
	}

}

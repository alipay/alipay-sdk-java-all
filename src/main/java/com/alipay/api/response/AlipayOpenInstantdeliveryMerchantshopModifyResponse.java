package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LogisticsShopStatusDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.instantdelivery.merchantshop.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-27 21:35:11
 */
public class AlipayOpenInstantdeliveryMerchantshopModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3321966112573346387L;

	/** 
	 * 门店创建返回的结果
	 */
	@ApiListField("logistics_shop_status")
	@ApiField("logistics_shop_status_d_t_o")
	private List<LogisticsShopStatusDTO> logisticsShopStatus;

	public void setLogisticsShopStatus(List<LogisticsShopStatusDTO> logisticsShopStatus) {
		this.logisticsShopStatus = logisticsShopStatus;
	}
	public List<LogisticsShopStatusDTO> getLogisticsShopStatus( ) {
		return this.logisticsShopStatus;
	}

}

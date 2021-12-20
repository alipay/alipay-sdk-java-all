package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KmsBakingSalesForecastDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.kms.baking.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-24 15:51:55
 */
public class KoubeiCateringKmsBakingBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7867269123341739849L;

	/** 
	 * 烘焙商品销量预测
	 */
	@ApiListField("baking_sales_forecast_data")
	@ApiField("kms_baking_sales_forecast_d_t_o")
	private List<KmsBakingSalesForecastDTO> bakingSalesForecastData;

	public void setBakingSalesForecastData(List<KmsBakingSalesForecastDTO> bakingSalesForecastData) {
		this.bakingSalesForecastData = bakingSalesForecastData;
	}
	public List<KmsBakingSalesForecastDTO> getBakingSalesForecastData( ) {
		return this.bakingSalesForecastData;
	}

}

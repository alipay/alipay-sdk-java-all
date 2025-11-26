package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenXlightCrowdCategory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcrowd.interestcategory.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-13 11:07:29
 */
public class AlipayDataDataserviceAdcrowdInterestcategoryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8811748834662164435L;

	/** 
	 * 行为兴趣人群类目数据
	 */
	@ApiListField("data")
	@ApiField("open_xlight_crowd_category")
	private List<OpenXlightCrowdCategory> data;

	public void setData(List<OpenXlightCrowdCategory> data) {
		this.data = data;
	}
	public List<OpenXlightCrowdCategory> getData( ) {
		return this.data;
	}

}

package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenXlightCrowdCategory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcrowd.behaviorcategory.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-13 11:07:29
 */
public class AlipayDataDataserviceAdcrowdBehaviorcategoryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6358133283947822966L;

	/** 
	 * 该参数表示行为兴趣人群类目，包含人群包id，名称，覆盖人群
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

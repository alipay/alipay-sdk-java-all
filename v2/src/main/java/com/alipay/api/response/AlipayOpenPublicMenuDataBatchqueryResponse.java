package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MenuAnalysisData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.menu.data.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 01:22:39
 */
public class AlipayOpenPublicMenuDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5366862362243651264L;

	/** 
	 * 菜单分析数据列表
	 */
	@ApiListField("data_list")
	@ApiField("menu_analysis_data")
	private List<MenuAnalysisData> dataList;

	public void setDataList(List<MenuAnalysisData> dataList) {
		this.dataList = dataList;
	}
	public List<MenuAnalysisData> getDataList( ) {
		return this.dataList;
	}

}

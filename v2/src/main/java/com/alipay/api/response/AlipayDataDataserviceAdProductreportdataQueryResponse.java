package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AdReportProductDataDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.productreportdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-23 09:53:00
 */
public class AlipayDataDataserviceAdProductreportdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7584426741355483239L;

	/** 
	 * null
	 */
	@ApiListField("data_list")
	@ApiField("ad_report_product_data_detail")
	private List<AdReportProductDataDetail> dataList;

	/** 
	 * 分页查询的记录总条数
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(List<AdReportProductDataDetail> dataList) {
		this.dataList = dataList;
	}
	public List<AdReportProductDataDetail> getDataList( ) {
		return this.dataList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}

package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AdReportDataDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.reportdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-10 15:02:39
 */
public class AlipayDataDataserviceAdReportdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4412216373511886533L;

	/** 
	 * 查询结果数据列表，当无投放未产生展现消数据时，查询数据为空
	 */
	@ApiListField("data_list")
	@ApiField("ad_report_data_detail")
	private List<AdReportDataDetail> dataList;

	/** 
	 * 分页查询的记录总条数
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(List<AdReportDataDetail> dataList) {
		this.dataList = dataList;
	}
	public List<AdReportDataDetail> getDataList( ) {
		return this.dataList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}

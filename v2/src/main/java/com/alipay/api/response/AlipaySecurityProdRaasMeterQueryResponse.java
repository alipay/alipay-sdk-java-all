package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RaasMeterSyncData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.raas.meter.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-25 09:36:57
 */
public class AlipaySecurityProdRaasMeterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7349359177665786557L;

	/** 
	 * 返回的数据集
	 */
	@ApiListField("biz_report_datas")
	@ApiField("raas_meter_sync_data")
	private List<RaasMeterSyncData> bizReportDatas;

	/** 
	 * 计量待上报的总笔数
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setBizReportDatas(List<RaasMeterSyncData> bizReportDatas) {
		this.bizReportDatas = bizReportDatas;
	}
	public List<RaasMeterSyncData> getBizReportDatas( ) {
		return this.bizReportDatas;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}

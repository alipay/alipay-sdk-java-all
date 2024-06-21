package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.hrcominsu.insuclaim.offline.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:25:20
 */
public class AlipayDigitalmgmtHrcominsuInsuclaimOfflineSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4285161953571612347L;

	/** 
	 * report_no_list+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiListField("report_no_list")
	@ApiField("string")
	private List<String> reportNoList;

	public void setReportNoList(List<String> reportNoList) {
		this.reportNoList = reportNoList;
	}
	public List<String> getReportNoList( ) {
		return this.reportNoList;
	}

}

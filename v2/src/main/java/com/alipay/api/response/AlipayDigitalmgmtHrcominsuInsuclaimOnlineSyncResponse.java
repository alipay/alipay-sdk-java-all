package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.hrcominsu.insuclaim.online.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:57
 */
public class AlipayDigitalmgmtHrcominsuInsuclaimOnlineSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6189828271431122951L;

	/** 
	 * report_biz_no_list+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiListField("report_biz_no_list")
	@ApiField("string")
	private List<String> reportBizNoList;

	public void setReportBizNoList(List<String> reportBizNoList) {
		this.reportBizNoList = reportBizNoList;
	}
	public List<String> getReportBizNoList( ) {
		return this.reportBizNoList;
	}

}

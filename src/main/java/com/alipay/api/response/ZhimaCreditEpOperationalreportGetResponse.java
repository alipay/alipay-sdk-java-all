package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OperationalReport;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.operationalreport.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaCreditEpOperationalreportGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8246311685158268616L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 0:经营记录返回的字段数量小于业务要求的字段数量； 1:经营记录返回的字段数量大于或等于业务要求的字段数量
	 */
	@ApiField("is_valid")
	private String isValid;

	/** 
	 * 经营记录数据列表
	 */
	@ApiListField("report_data")
	@ApiField("operational_report")
	private List<OperationalReport> reportData;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}
	public String getIsValid( ) {
		return this.isValid;
	}

	public void setReportData(List<OperationalReport> reportData) {
		this.reportData = reportData;
	}
	public List<OperationalReport> getReportData( ) {
		return this.reportData;
	}

}

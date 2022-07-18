package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReportInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.insurance.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-14 12:17:28
 */
public class AnttechBlockchainDefinInsuranceReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2723591136974485161L;

	/** 
	 * 个性化参数
	 */
	@ApiField("parm")
	private String parm;

	/** 
	 * 案件信息列表
	 */
	@ApiListField("report_info_list")
	@ApiField("report_info")
	private List<ReportInfo> reportInfoList;

	/** 
	 * 请求交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setParm(String parm) {
		this.parm = parm;
	}
	public String getParm( ) {
		return this.parm;
	}

	public void setReportInfoList(List<ReportInfo> reportInfoList) {
		this.reportInfoList = reportInfoList;
	}
	public List<ReportInfo> getReportInfoList( ) {
		return this.reportInfoList;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}

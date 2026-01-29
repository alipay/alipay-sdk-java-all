package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentKolDailyReportVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.open.app.kol.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 11:37:41
 */
public class ZhimaOpenAppKolReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8772847915386625567L;

	/** 
	 * null
	 */
	@ApiListField("report_list")
	@ApiField("rent_kol_daily_report_v_o")
	private List<RentKolDailyReportVO> reportList;

	public void setReportList(List<RentKolDailyReportVO> reportList) {
		this.reportList = reportList;
	}
	public List<RentKolDailyReportVO> getReportList( ) {
		return this.reportList;
	}

}

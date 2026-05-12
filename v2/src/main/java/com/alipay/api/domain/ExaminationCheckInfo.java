package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 检查检验检验信息
 *
 * @author auto create
 * @since 1.0, 2026-04-10 16:25:12
 */
public class ExaminationCheckInfo extends AlipayObject {

	private static final long serialVersionUID = 5237695429191964881L;

	/**
	 * 检测单ID
	 */
	@ApiField("check_no")
	private String checkNo;

	/**
	 * 报告信息结合
	 */
	@ApiListField("report_info_list")
	@ApiField("fulfillment_item_pdf_info")
	private List<FulfillmentItemPdfInfo> reportInfoList;

	public String getCheckNo() {
		return this.checkNo;
	}
	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}

	public List<FulfillmentItemPdfInfo> getReportInfoList() {
		return this.reportInfoList;
	}
	public void setReportInfoList(List<FulfillmentItemPdfInfo> reportInfoList) {
		this.reportInfoList = reportInfoList;
	}

}

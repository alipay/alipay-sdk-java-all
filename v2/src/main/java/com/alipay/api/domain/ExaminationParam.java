package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ISV履约同步的检查检验类对象
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:44:51
 */
public class ExaminationParam extends AlipayObject {

	private static final long serialVersionUID = 2283682444314731916L;

	/**
	 * 预计出报告结束时间
	 */
	@ApiField("expected_report_end_time")
	private String expectedReportEndTime;

	/**
	 * 预计出报告开始时间
	 */
	@ApiField("expected_report_start_time")
	private String expectedReportStartTime;

	/**
	 * 外部商品ID集合与pdf链接关系 当前字段已废弃(功能拆分，其他接口上传)
	 */
	@ApiListField("item_id_to_pdf")
	@ApiField("fulfillment_item_pdf_info")
	@Deprecated
	private List<FulfillmentItemPdfInfo> itemIdToPdf;

	/**
	 * 预约码
	 */
	@ApiField("verify_code")
	private String verifyCode;

	public String getExpectedReportEndTime() {
		return this.expectedReportEndTime;
	}
	public void setExpectedReportEndTime(String expectedReportEndTime) {
		this.expectedReportEndTime = expectedReportEndTime;
	}

	public String getExpectedReportStartTime() {
		return this.expectedReportStartTime;
	}
	public void setExpectedReportStartTime(String expectedReportStartTime) {
		this.expectedReportStartTime = expectedReportStartTime;
	}

	public List<FulfillmentItemPdfInfo> getItemIdToPdf() {
		return this.itemIdToPdf;
	}
	public void setItemIdToPdf(List<FulfillmentItemPdfInfo> itemIdToPdf) {
		this.itemIdToPdf = itemIdToPdf;
	}

	public String getVerifyCode() {
		return this.verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

}

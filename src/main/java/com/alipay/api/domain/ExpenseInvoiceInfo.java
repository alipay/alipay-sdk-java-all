package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费控报销发票凭证数据
 *
 * @author auto create
 * @since 1.0, 2021-08-27 17:09:53
 */
public class ExpenseInvoiceInfo extends AlipayObject {

	private static final long serialVersionUID = 5817487176139754276L;

	/**
	 * 员工ID
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 电子发票结构化信息
	 */
	@ApiField("invoice_output_info")
	private InvoiceOutputInfo invoiceOutputInfo;

	/**
	 * 增值税发票、定额发票、卷式发票、过路费
	 */
	@ApiField("ocr_normal_scan_info")
	private OcrNormalScanInfo ocrNormalScanInfo;

	/**
	 * 飞机票结构化信息
	 */
	@ApiField("ocr_plane_scan_info")
	private OcrPlaneScanInfo ocrPlaneScanInfo;

	/**
	 * 出租车票结构化信息
	 */
	@ApiField("ocr_taxi_scan_info")
	private OcrTaxiScanInfo ocrTaxiScanInfo;

	/**
	 * 火车票结构化信息
	 */
	@ApiField("ocr_train_scan_info")
	private OcrTrainScanInfo ocrTrainScanInfo;

	/**
	 * 凭证文件信息
	 */
	@ApiField("voucher_file_info")
	private VoucherFileInfo voucherFileInfo;

	/**
	 * 凭证ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public InvoiceOutputInfo getInvoiceOutputInfo() {
		return this.invoiceOutputInfo;
	}
	public void setInvoiceOutputInfo(InvoiceOutputInfo invoiceOutputInfo) {
		this.invoiceOutputInfo = invoiceOutputInfo;
	}

	public OcrNormalScanInfo getOcrNormalScanInfo() {
		return this.ocrNormalScanInfo;
	}
	public void setOcrNormalScanInfo(OcrNormalScanInfo ocrNormalScanInfo) {
		this.ocrNormalScanInfo = ocrNormalScanInfo;
	}

	public OcrPlaneScanInfo getOcrPlaneScanInfo() {
		return this.ocrPlaneScanInfo;
	}
	public void setOcrPlaneScanInfo(OcrPlaneScanInfo ocrPlaneScanInfo) {
		this.ocrPlaneScanInfo = ocrPlaneScanInfo;
	}

	public OcrTaxiScanInfo getOcrTaxiScanInfo() {
		return this.ocrTaxiScanInfo;
	}
	public void setOcrTaxiScanInfo(OcrTaxiScanInfo ocrTaxiScanInfo) {
		this.ocrTaxiScanInfo = ocrTaxiScanInfo;
	}

	public OcrTrainScanInfo getOcrTrainScanInfo() {
		return this.ocrTrainScanInfo;
	}
	public void setOcrTrainScanInfo(OcrTrainScanInfo ocrTrainScanInfo) {
		this.ocrTrainScanInfo = ocrTrainScanInfo;
	}

	public VoucherFileInfo getVoucherFileInfo() {
		return this.voucherFileInfo;
	}
	public void setVoucherFileInfo(VoucherFileInfo voucherFileInfo) {
		this.voucherFileInfo = voucherFileInfo;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}

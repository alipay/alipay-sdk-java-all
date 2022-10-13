package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票包明细模型
 *
 * @author auto create
 * @since 1.0, 2020-08-07 16:46:42
 */
public class PackageItemOpenInfo extends AlipayObject {

	private static final long serialVersionUID = 5643444537396693553L;

	/**
	 * 账单数据
	 */
	@ApiField("consume_output_info")
	private ConsumeOutputInfo consumeOutputInfo;

	/**
	 * 发票文件下载链接
	 */
	@ApiField("file_download_url")
	private String fileDownloadUrl;

	/**
	 * 文件类型，如pdf，ofd，jpg
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 电子发票的数据
	 */
	@ApiField("invoice_output_info")
	private InvoiceOutputInfo invoiceOutputInfo;

	/**
	 * 项目来源，如：ocr\einvoice\consume
	 */
	@ApiField("item_source")
	private String itemSource;

	/**
	 * 项目子类，如：出租车、火车、飞机等
	 */
	@ApiField("item_sub_type")
	private String itemSubType;

	/**
	 * 项目大类，如：餐饮美食、酒店住宿、差旅出行等
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 增值税发票、定额发票、卷式发票、过路费ocr的扫描数据
	 */
	@ApiField("ocr_normal_scan_info")
	private OcrNormalScanInfo ocrNormalScanInfo;

	/**
	 * 飞机票ocr的数据
	 */
	@ApiField("ocr_plane_scan_info")
	private OcrPlaneScanInfo ocrPlaneScanInfo;

	/**
	 * 出租车发票ocr的数据
	 */
	@ApiField("ocr_taxi_scan_info")
	private OcrTaxiScanInfo ocrTaxiScanInfo;

	/**
	 * 火车票ocr的数据
	 */
	@ApiField("ocr_train_scan_info")
	private OcrTrainScanInfo ocrTrainScanInfo;

	public ConsumeOutputInfo getConsumeOutputInfo() {
		return this.consumeOutputInfo;
	}
	public void setConsumeOutputInfo(ConsumeOutputInfo consumeOutputInfo) {
		this.consumeOutputInfo = consumeOutputInfo;
	}

	public String getFileDownloadUrl() {
		return this.fileDownloadUrl;
	}
	public void setFileDownloadUrl(String fileDownloadUrl) {
		this.fileDownloadUrl = fileDownloadUrl;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public InvoiceOutputInfo getInvoiceOutputInfo() {
		return this.invoiceOutputInfo;
	}
	public void setInvoiceOutputInfo(InvoiceOutputInfo invoiceOutputInfo) {
		this.invoiceOutputInfo = invoiceOutputInfo;
	}

	public String getItemSource() {
		return this.itemSource;
	}
	public void setItemSource(String itemSource) {
		this.itemSource = itemSource;
	}

	public String getItemSubType() {
		return this.itemSubType;
	}
	public void setItemSubType(String itemSubType) {
		this.itemSubType = itemSubType;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
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

}

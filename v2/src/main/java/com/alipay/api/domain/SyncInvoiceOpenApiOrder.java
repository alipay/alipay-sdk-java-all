package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步发票入参
 *
 * @author auto create
 * @since 1.0, 2024-12-02 11:04:53
 */
public class SyncInvoiceOpenApiOrder extends AlipayObject {

	private static final long serialVersionUID = 6716218758425329976L;

	/**
	 * 上车时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("boarding_time")
	private String boardingTime;

	/**
	 * 购方地址电话
	 */
	@ApiField("buyer_address_tel")
	private String buyerAddressTel;

	/**
	 * 购方银行信息
	 */
	@ApiField("buyer_bank_info")
	private String buyerBankInfo;

	/**
	 * 购方公司名称
	 */
	@ApiField("buyer_company_name")
	private String buyerCompanyName;

	/**
	 * 购方ou
	 */
	@ApiField("buyer_ou_code")
	private String buyerOuCode;

	/**
	 * 购方税号
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/**
	 * 认证状态，使用调用方的枚举值
	 */
	@ApiField("certify_state")
	private String certifyState;

	/**
	 * 校验码
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 验真状态，使用调用方的状态枚举
	 */
	@ApiField("check_state")
	private String checkState;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 乘车日期,格式yyyyMMdd
	 */
	@ApiField("drive_date")
	private String driveDate;

	/**
	 * 终点站
	 */
	@ApiField("end_station")
	private String endStation;

	/**
	 * 文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 附件url
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 燃油附件费，单位为元
	 */
	@ApiField("fuel_surcharge")
	private String fuelSurcharge;

	/**
	 * 增值税发票为含税金额,其他票种的价格、合计金额等可通过此字段传入
	 */
	@ApiField("invoice_amt")
	private String invoiceAmt;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期,格式:yyyyMMdd
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 外部发票id
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票介质
	 */
	@ApiField("invoice_material")
	private String invoiceMaterial;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票备注
	 */
	@ApiField("invoice_note")
	private String invoiceNote;

	/**
	 * 报销信息
	 */
	@ApiListField("invoice_reimburse_info_order_list")
	@ApiField("invoice_reimburse_info_open_api_order")
	private List<InvoiceReimburseInfoOpenApiOrder> invoiceReimburseInfoOrderList;

	/**
	 * 发票类型，使用调用平台自己的发票类型枚举
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 下车时间,格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("off_time")
	private String offTime;

	/**
	 * 平台code
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 报销状态,使用调用方的枚举
	 */
	@ApiField("reimburse_state")
	private String reimburseState;

	/**
	 * 座次
	 */
	@ApiField("seat")
	private String seat;

	/**
	 * 销方地址电话
	 */
	@ApiField("seller_address_tel")
	private String sellerAddressTel;

	/**
	 * 销方银行信息
	 */
	@ApiField("seller_bank_info")
	private String sellerBankInfo;

	/**
	 * 销方公司名称
	 */
	@ApiField("seller_company_name")
	private String sellerCompanyName;

	/**
	 * 销方税号
	 */
	@ApiField("seller_tax_no")
	private String sellerTaxNo;

	/**
	 * 出发站
	 */
	@ApiField("start_station")
	private String startStation;

	/**
	 * 发票行
	 */
	@ApiListField("sync_invoice_line_order_list")
	@ApiField("sync_invoice_line_open_api_order")
	private List<SyncInvoiceLineOpenApiOrder> syncInvoiceLineOrderList;

	/**
	 * 税额
	 */
	@ApiField("tax_amt")
	private String taxAmt;

	/**
	 * 不含税金额
	 */
	@ApiField("tax_exclusive_amt")
	private String taxExclusiveAmt;

	public String getBoardingTime() {
		return this.boardingTime;
	}
	public void setBoardingTime(String boardingTime) {
		this.boardingTime = boardingTime;
	}

	public String getBuyerAddressTel() {
		return this.buyerAddressTel;
	}
	public void setBuyerAddressTel(String buyerAddressTel) {
		this.buyerAddressTel = buyerAddressTel;
	}

	public String getBuyerBankInfo() {
		return this.buyerBankInfo;
	}
	public void setBuyerBankInfo(String buyerBankInfo) {
		this.buyerBankInfo = buyerBankInfo;
	}

	public String getBuyerCompanyName() {
		return this.buyerCompanyName;
	}
	public void setBuyerCompanyName(String buyerCompanyName) {
		this.buyerCompanyName = buyerCompanyName;
	}

	public String getBuyerOuCode() {
		return this.buyerOuCode;
	}
	public void setBuyerOuCode(String buyerOuCode) {
		this.buyerOuCode = buyerOuCode;
	}

	public String getBuyerTaxNo() {
		return this.buyerTaxNo;
	}
	public void setBuyerTaxNo(String buyerTaxNo) {
		this.buyerTaxNo = buyerTaxNo;
	}

	public String getCertifyState() {
		return this.certifyState;
	}
	public void setCertifyState(String certifyState) {
		this.certifyState = certifyState;
	}

	public String getCheckCode() {
		return this.checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getCheckState() {
		return this.checkState;
	}
	public void setCheckState(String checkState) {
		this.checkState = checkState;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDriveDate() {
		return this.driveDate;
	}
	public void setDriveDate(String driveDate) {
		this.driveDate = driveDate;
	}

	public String getEndStation() {
		return this.endStation;
	}
	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFuelSurcharge() {
		return this.fuelSurcharge;
	}
	public void setFuelSurcharge(String fuelSurcharge) {
		this.fuelSurcharge = fuelSurcharge;
	}

	public String getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(String invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceMaterial() {
		return this.invoiceMaterial;
	}
	public void setInvoiceMaterial(String invoiceMaterial) {
		this.invoiceMaterial = invoiceMaterial;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceNote() {
		return this.invoiceNote;
	}
	public void setInvoiceNote(String invoiceNote) {
		this.invoiceNote = invoiceNote;
	}

	public List<InvoiceReimburseInfoOpenApiOrder> getInvoiceReimburseInfoOrderList() {
		return this.invoiceReimburseInfoOrderList;
	}
	public void setInvoiceReimburseInfoOrderList(List<InvoiceReimburseInfoOpenApiOrder> invoiceReimburseInfoOrderList) {
		this.invoiceReimburseInfoOrderList = invoiceReimburseInfoOrderList;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getOffTime() {
		return this.offTime;
	}
	public void setOffTime(String offTime) {
		this.offTime = offTime;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getReimburseState() {
		return this.reimburseState;
	}
	public void setReimburseState(String reimburseState) {
		this.reimburseState = reimburseState;
	}

	public String getSeat() {
		return this.seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getSellerAddressTel() {
		return this.sellerAddressTel;
	}
	public void setSellerAddressTel(String sellerAddressTel) {
		this.sellerAddressTel = sellerAddressTel;
	}

	public String getSellerBankInfo() {
		return this.sellerBankInfo;
	}
	public void setSellerBankInfo(String sellerBankInfo) {
		this.sellerBankInfo = sellerBankInfo;
	}

	public String getSellerCompanyName() {
		return this.sellerCompanyName;
	}
	public void setSellerCompanyName(String sellerCompanyName) {
		this.sellerCompanyName = sellerCompanyName;
	}

	public String getSellerTaxNo() {
		return this.sellerTaxNo;
	}
	public void setSellerTaxNo(String sellerTaxNo) {
		this.sellerTaxNo = sellerTaxNo;
	}

	public String getStartStation() {
		return this.startStation;
	}
	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public List<SyncInvoiceLineOpenApiOrder> getSyncInvoiceLineOrderList() {
		return this.syncInvoiceLineOrderList;
	}
	public void setSyncInvoiceLineOrderList(List<SyncInvoiceLineOpenApiOrder> syncInvoiceLineOrderList) {
		this.syncInvoiceLineOrderList = syncInvoiceLineOrderList;
	}

	public String getTaxAmt() {
		return this.taxAmt;
	}
	public void setTaxAmt(String taxAmt) {
		this.taxAmt = taxAmt;
	}

	public String getTaxExclusiveAmt() {
		return this.taxExclusiveAmt;
	}
	public void setTaxExclusiveAmt(String taxExclusiveAmt) {
		this.taxExclusiveAmt = taxExclusiveAmt;
	}

}

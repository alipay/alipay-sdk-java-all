package com.alipay.api.request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCommerceEcTcnInvoiceapplyUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.commerce.ec.tcn.invoiceapply.upload request
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:04
 */
public class AlipayCommerceEcTcnInvoiceapplyUploadRequest implements AlipayUploadRequest<AlipayCommerceEcTcnInvoiceapplyUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 申请ID
	 */
	private String applyId;

	/** 
	* 购方地址
	 */
	private String buyerAddress;

	/** 
	* 购方银行账号
	 */
	private String buyerBankAccount;

	/** 
	* 购方开户行
	 */
	private String buyerBankName;

	/** 
	* 购方名称
	 */
	private String buyerName;

	/** 
	* 购方税号
	 */
	private String buyerTaxNo;

	/** 
	* 购方电话
	 */
	private String buyerTel;

	/** 
	* 发票校验码
	 */
	private String checkCode;

	/** 
	* 文件字节流数据
	 */
	private FileItem fileData;

	/** 
	* 文件类型
	 */
	private String fileType;

	/** 
	* 开票金额
	 */
	private String invoiceAmount;

	/** 
	* 小数点保留6位，开票金额（不含税）
	 */
	private String invoiceAmountWithoutTax;

	/** 
	* 发票代码
	 */
	private String invoiceCode;

	/** 
	* 开票时间
	 */
	private Date invoiceDate;

	/** 
	* 发票介质类型
	 */
	private String invoiceKind;

	/** 
	* 发票号码
	 */
	private String invoiceNo;

	/** 
	* 税额
	 */
	private String invoiceTaxAmount;

	/** 
	* 发票税率
	 */
	private String invoiceTaxRate;

	/** 
	* 发票类型
	 */
	private String invoiceType;

	/** 
	* 原发票代码
	 */
	private String originalInvoiceCode;

	/** 
	* 原发票号码
	 */
	private String originalInvoiceNo;

	/** 
	* 冲红备注
	 */
	private String redRemarks;

	/** 
	* 销方地址
	 */
	private String sellerAddress;

	/** 
	* 销方银行账号
	 */
	private String sellerBankAccount;

	/** 
	* 销方开户行
	 */
	private String sellerBankName;

	/** 
	* 销方名称
	 */
	private String sellerName;

	/** 
	* 销方税号
	 */
	private String sellerTaxNo;

	/** 
	* 销方电话
	 */
	private String sellerTel;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId() {
		return this.applyId;
	}

	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}
	public String getBuyerAddress() {
		return this.buyerAddress;
	}

	public void setBuyerBankAccount(String buyerBankAccount) {
		this.buyerBankAccount = buyerBankAccount;
	}
	public String getBuyerBankAccount() {
		return this.buyerBankAccount;
	}

	public void setBuyerBankName(String buyerBankName) {
		this.buyerBankName = buyerBankName;
	}
	public String getBuyerBankName() {
		return this.buyerBankName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerName() {
		return this.buyerName;
	}

	public void setBuyerTaxNo(String buyerTaxNo) {
		this.buyerTaxNo = buyerTaxNo;
	}
	public String getBuyerTaxNo() {
		return this.buyerTaxNo;
	}

	public void setBuyerTel(String buyerTel) {
		this.buyerTel = buyerTel;
	}
	public String getBuyerTel() {
		return this.buyerTel;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}
	public String getCheckCode() {
		return this.checkCode;
	}

	public void setFileData(FileItem fileData) {
		this.fileData = fileData;
	}
	public FileItem getFileData() {
		return this.fileData;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileType() {
		return this.fileType;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}

	public void setInvoiceAmountWithoutTax(String invoiceAmountWithoutTax) {
		this.invoiceAmountWithoutTax = invoiceAmountWithoutTax;
	}
	public String getInvoiceAmountWithoutTax() {
		return this.invoiceAmountWithoutTax;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	public String getInvoiceCode() {
		return this.invoiceCode;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public Date getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}
	public String getInvoiceKind() {
		return this.invoiceKind;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceTaxAmount(String invoiceTaxAmount) {
		this.invoiceTaxAmount = invoiceTaxAmount;
	}
	public String getInvoiceTaxAmount() {
		return this.invoiceTaxAmount;
	}

	public void setInvoiceTaxRate(String invoiceTaxRate) {
		this.invoiceTaxRate = invoiceTaxRate;
	}
	public String getInvoiceTaxRate() {
		return this.invoiceTaxRate;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getInvoiceType() {
		return this.invoiceType;
	}

	public void setOriginalInvoiceCode(String originalInvoiceCode) {
		this.originalInvoiceCode = originalInvoiceCode;
	}
	public String getOriginalInvoiceCode() {
		return this.originalInvoiceCode;
	}

	public void setOriginalInvoiceNo(String originalInvoiceNo) {
		this.originalInvoiceNo = originalInvoiceNo;
	}
	public String getOriginalInvoiceNo() {
		return this.originalInvoiceNo;
	}

	public void setRedRemarks(String redRemarks) {
		this.redRemarks = redRemarks;
	}
	public String getRedRemarks() {
		return this.redRemarks;
	}

	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}
	public String getSellerAddress() {
		return this.sellerAddress;
	}

	public void setSellerBankAccount(String sellerBankAccount) {
		this.sellerBankAccount = sellerBankAccount;
	}
	public String getSellerBankAccount() {
		return this.sellerBankAccount;
	}

	public void setSellerBankName(String sellerBankName) {
		this.sellerBankName = sellerBankName;
	}
	public String getSellerBankName() {
		return this.sellerBankName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerTaxNo(String sellerTaxNo) {
		this.sellerTaxNo = sellerTaxNo;
	}
	public String getSellerTaxNo() {
		return this.sellerTaxNo;
	}

	public void setSellerTel(String sellerTel) {
		this.sellerTel = sellerTel;
	}
	public String getSellerTel() {
		return this.sellerTel;
	}
	private String terminalType;
	private String terminalInfo;
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
    private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}
	
    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.commerce.ec.tcn.invoiceapply.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("apply_id", this.applyId);
		txtParams.put("buyer_address", this.buyerAddress);
		txtParams.put("buyer_bank_account", this.buyerBankAccount);
		txtParams.put("buyer_bank_name", this.buyerBankName);
		txtParams.put("buyer_name", this.buyerName);
		txtParams.put("buyer_tax_no", this.buyerTaxNo);
		txtParams.put("buyer_tel", this.buyerTel);
		txtParams.put("check_code", this.checkCode);
		txtParams.put("file_type", this.fileType);
		txtParams.put("invoice_amount", this.invoiceAmount);
		txtParams.put("invoice_amount_without_tax", this.invoiceAmountWithoutTax);
		txtParams.put("invoice_code", this.invoiceCode);
		txtParams.put("invoice_date", this.invoiceDate);
		txtParams.put("invoice_kind", this.invoiceKind);
		txtParams.put("invoice_no", this.invoiceNo);
		txtParams.put("invoice_tax_amount", this.invoiceTaxAmount);
		txtParams.put("invoice_tax_rate", this.invoiceTaxRate);
		txtParams.put("invoice_type", this.invoiceType);
		txtParams.put("original_invoice_code", this.originalInvoiceCode);
		txtParams.put("original_invoice_no", this.originalInvoiceNo);
		txtParams.put("red_remarks", this.redRemarks);
		txtParams.put("seller_address", this.sellerAddress);
		txtParams.put("seller_bank_account", this.sellerBankAccount);
		txtParams.put("seller_bank_name", this.sellerBankName);
		txtParams.put("seller_name", this.sellerName);
		txtParams.put("seller_tax_no", this.sellerTaxNo);
		txtParams.put("seller_tel", this.sellerTel);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
	
	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("file_data", this.fileData);
		return params;
	}

	public Class<AlipayCommerceEcTcnInvoiceapplyUploadResponse> getResponseClass() {
		return AlipayCommerceEcTcnInvoiceapplyUploadResponse.class;
	}
	
	 public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}

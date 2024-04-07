package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEbppInvoiceMerchantApplyUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ebpp.invoice.merchant.apply.upload request
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:12
 */
public class AlipayEbppInvoiceMerchantApplyUploadRequest implements AlipayUploadRequest<AlipayEbppInvoiceMerchantApplyUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 发票申请ID
	 */
	private String applyId;

	/** 
	* 批次ID
	 */
	private String batchId;

	/** 
	* 合计含税金额（开票金额）
	 */
	private String invoiceAmount;

	/** 
	* 发票代码
	 */
	private String invoiceCode;

	/** 
	* 开票日期
	 */
	private String invoiceDate;

	/** 
	* 发票板式文件数据
	 */
	private FileItem invoiceFileData;

	/** 
	* 发票板式文件类型
	 */
	private String invoiceFileType;

	/** 
	* 开票发票类型
	 */
	private Long invoiceKind;

	/** 
	* 发票号码
	 */
	private String invoiceNo;

	/** 
	* 发票(开票)类型
	 */
	private String invoiceType;

	/** 
	* 原发票代码
	 */
	private String normalInvoiceCode;

	/** 
	* 原发票号码
	 */
	private String normalInvoiceNo;

	/** 
	* 销方地址
	 */
	private String payeeAddress;

	/** 
	* 销方银行账号
	 */
	private String payeeBankAccountId;

	/** 
	* 销方开户行名称
	 */
	private String payeeBankName;

	/** 
	* 销方名称
	 */
	private String payeeName;

	/** 
	* 销方联系电话
	 */
	private String payeePhone;

	/** 
	* 销方税务登记证号
	 */
	private String payeeRegisterNo;

	/** 
	* 购方名称
	 */
	private String payerName;

	/** 
	* 购方税号
	 */
	private String payerRegisterNo;

	/** 
	* 合计金额（不含税）
	 */
	private String sumPrice;

	/** 
	* 税额
	 */
	private String sumTax;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId() {
		return this.applyId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatchId() {
		return this.batchId;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	public String getInvoiceCode() {
		return this.invoiceCode;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceFileData(FileItem invoiceFileData) {
		this.invoiceFileData = invoiceFileData;
	}
	public FileItem getInvoiceFileData() {
		return this.invoiceFileData;
	}

	public void setInvoiceFileType(String invoiceFileType) {
		this.invoiceFileType = invoiceFileType;
	}
	public String getInvoiceFileType() {
		return this.invoiceFileType;
	}

	public void setInvoiceKind(Long invoiceKind) {
		this.invoiceKind = invoiceKind;
	}
	public Long getInvoiceKind() {
		return this.invoiceKind;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getInvoiceType() {
		return this.invoiceType;
	}

	public void setNormalInvoiceCode(String normalInvoiceCode) {
		this.normalInvoiceCode = normalInvoiceCode;
	}
	public String getNormalInvoiceCode() {
		return this.normalInvoiceCode;
	}

	public void setNormalInvoiceNo(String normalInvoiceNo) {
		this.normalInvoiceNo = normalInvoiceNo;
	}
	public String getNormalInvoiceNo() {
		return this.normalInvoiceNo;
	}

	public void setPayeeAddress(String payeeAddress) {
		this.payeeAddress = payeeAddress;
	}
	public String getPayeeAddress() {
		return this.payeeAddress;
	}

	public void setPayeeBankAccountId(String payeeBankAccountId) {
		this.payeeBankAccountId = payeeBankAccountId;
	}
	public String getPayeeBankAccountId() {
		return this.payeeBankAccountId;
	}

	public void setPayeeBankName(String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}
	public String getPayeeBankName() {
		return this.payeeBankName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public String getPayeeName() {
		return this.payeeName;
	}

	public void setPayeePhone(String payeePhone) {
		this.payeePhone = payeePhone;
	}
	public String getPayeePhone() {
		return this.payeePhone;
	}

	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}
	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	public String getPayerName() {
		return this.payerName;
	}

	public void setPayerRegisterNo(String payerRegisterNo) {
		this.payerRegisterNo = payerRegisterNo;
	}
	public String getPayerRegisterNo() {
		return this.payerRegisterNo;
	}

	public void setSumPrice(String sumPrice) {
		this.sumPrice = sumPrice;
	}
	public String getSumPrice() {
		return this.sumPrice;
	}

	public void setSumTax(String sumTax) {
		this.sumTax = sumTax;
	}
	public String getSumTax() {
		return this.sumTax;
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
		return "alipay.ebpp.invoice.merchant.apply.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("apply_id", this.applyId);
		txtParams.put("batch_id", this.batchId);
		txtParams.put("invoice_amount", this.invoiceAmount);
		txtParams.put("invoice_code", this.invoiceCode);
		txtParams.put("invoice_date", this.invoiceDate);
		txtParams.put("invoice_file_type", this.invoiceFileType);
		txtParams.put("invoice_kind", this.invoiceKind);
		txtParams.put("invoice_no", this.invoiceNo);
		txtParams.put("invoice_type", this.invoiceType);
		txtParams.put("normal_invoice_code", this.normalInvoiceCode);
		txtParams.put("normal_invoice_no", this.normalInvoiceNo);
		txtParams.put("payee_address", this.payeeAddress);
		txtParams.put("payee_bank_account_id", this.payeeBankAccountId);
		txtParams.put("payee_bank_name", this.payeeBankName);
		txtParams.put("payee_name", this.payeeName);
		txtParams.put("payee_phone", this.payeePhone);
		txtParams.put("payee_register_no", this.payeeRegisterNo);
		txtParams.put("payer_name", this.payerName);
		txtParams.put("payer_register_no", this.payerRegisterNo);
		txtParams.put("sum_price", this.sumPrice);
		txtParams.put("sum_tax", this.sumTax);
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
		params.put("invoice_file_data", this.invoiceFileData);
		return params;
	}

	public Class<AlipayEbppInvoiceMerchantApplyUploadResponse> getResponseClass() {
		return AlipayEbppInvoiceMerchantApplyUploadResponse.class;
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

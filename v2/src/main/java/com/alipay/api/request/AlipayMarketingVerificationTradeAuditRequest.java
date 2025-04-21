package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMarketingVerificationTradeAuditResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.marketing.verification.trade.audit request
 * 
 * @author auto create
 * @since 1.0, 2025-04-11 12:02:27
 */
public class AlipayMarketingVerificationTradeAuditRequest implements AlipayUploadRequest<AlipayMarketingVerificationTradeAuditResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 支付宝交易号，用于识别交易信息
	 */
	private String alipayTradeNo;

	/** 
	* 审计相关业务信息，若审计结果未提交或未通过，则每次请求覆盖上次业务参数。审计已通过则不允许重新提交。
	 */
	private String bizInfo;

	/** 
	* 送货清单，转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem deliveryListContent;

	/** 
	* 辅助文件信息，如四码照片，转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem evidentiaryContent;

	/** 
	* 发票信息转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem invoiceContent;

	/** 
	* 外部订单号
	 */
	private String outTradeNo;

	/** 
	* 销货清单，转为字节流传递，要求为jpg、jpeg、png格式
	 */
	private FileItem salesListContent;

	/** 
	* 支付宝分配的场景编码，用于识别活动场景及区域等信息
	 */
	private String sceneCode;

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}

	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}
	public String getBizInfo() {
		return this.bizInfo;
	}

	public void setDeliveryListContent(FileItem deliveryListContent) {
		this.deliveryListContent = deliveryListContent;
	}
	public FileItem getDeliveryListContent() {
		return this.deliveryListContent;
	}

	public void setEvidentiaryContent(FileItem evidentiaryContent) {
		this.evidentiaryContent = evidentiaryContent;
	}
	public FileItem getEvidentiaryContent() {
		return this.evidentiaryContent;
	}

	public void setInvoiceContent(FileItem invoiceContent) {
		this.invoiceContent = invoiceContent;
	}
	public FileItem getInvoiceContent() {
		return this.invoiceContent;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo() {
		return this.outTradeNo;
	}

	public void setSalesListContent(FileItem salesListContent) {
		this.salesListContent = salesListContent;
	}
	public FileItem getSalesListContent() {
		return this.salesListContent;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode() {
		return this.sceneCode;
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
		return "alipay.marketing.verification.trade.audit";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("alipay_trade_no", this.alipayTradeNo);
		txtParams.put("biz_info", this.bizInfo);
		txtParams.put("out_trade_no", this.outTradeNo);
		txtParams.put("scene_code", this.sceneCode);
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
		params.put("delivery_list_content", this.deliveryListContent);
		params.put("evidentiary_content", this.evidentiaryContent);
		params.put("invoice_content", this.invoiceContent);
		params.put("sales_list_content", this.salesListContent);
		return params;
	}

	public Class<AlipayMarketingVerificationTradeAuditResponse> getResponseClass() {
		return AlipayMarketingVerificationTradeAuditResponse.class;
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

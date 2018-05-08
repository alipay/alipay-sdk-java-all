package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayFlashsalesStockSyncUpdateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.flashsales.stock.sync.update request
 * 
 * @author auto create
 * @since 1.0, 2014-08-22 15:32:32
 */
public class AlipayFlashsalesStockSyncUpdateRequest implements AlipayRequest<AlipayFlashsalesStockSyncUpdateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 商户的商品id
	 */
	private String outProductId;

	/** 
	* 服务窗id
	 */
	private String publicId;

	/** 
	* 库存数量
	 */
	private Long stock;

	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}
	public String getOutProductId() {
		return this.outProductId;
	}

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	public String getPublicId() {
		return this.publicId;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}
	public Long getStock() {
		return this.stock;
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

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.flashsales.stock.sync.update";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("out_product_id", this.outProductId);
		txtParams.put("public_id", this.publicId);
		txtParams.put("stock", this.stock);
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

	public Class<AlipayFlashsalesStockSyncUpdateResponse> getResponseClass() {
		return AlipayFlashsalesStockSyncUpdateResponse.class;
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

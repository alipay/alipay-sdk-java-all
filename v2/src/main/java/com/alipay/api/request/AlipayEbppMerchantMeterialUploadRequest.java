package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEbppMerchantMeterialUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ebpp.merchant.meterial.upload request
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:28:58
 */
public class AlipayEbppMerchantMeterialUploadRequest implements AlipayUploadRequest<AlipayEbppMerchantMeterialUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 文件二进制
	 */
	private FileItem content;

	/** 
	* 实体创建时对应的code，如小区或物业的shortName。当entity_type=RELATIONSHIP时，entity_code=关系id
	 */
	private String entityCode;

	/** 
	* 实体类型：
COMMUNITY_COMPANY("COMMUNITY_COMPANY", "物业"),
OMMUNITY_INFO("COMMUNITY_INFO", "小区"),
COMMUNITY_ISV("COMMUNITY_ISV", "ISV"),
RELATIONSHIP("RELATIONSHIP", "物业小区绑定关系"),
EXTERNAL_BILL_INFO("EXTERNAL_BILL_INFO", "账单"),;
	 */
	private String entityType;

	/** 
	* 文件描述
	 */
	private String fileDesc;

	/** 
	* 文件名
	 */
	private String fileName;

	/** 
	* 备注
	 */
	private String memo;

	public void setContent(FileItem content) {
		this.content = content;
	}
	public FileItem getContent() {
		return this.content;
	}

	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}
	public String getEntityCode() {
		return this.entityCode;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public String getEntityType() {
		return this.entityType;
	}

	public void setFileDesc(String fileDesc) {
		this.fileDesc = fileDesc;
	}
	public String getFileDesc() {
		return this.fileDesc;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName() {
		return this.fileName;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
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
		return "alipay.ebpp.merchant.meterial.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("entity_code", this.entityCode);
		txtParams.put("entity_type", this.entityType);
		txtParams.put("file_desc", this.fileDesc);
		txtParams.put("file_name", this.fileName);
		txtParams.put("memo", this.memo);
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
		params.put("content", this.content);
		return params;
	}

	public Class<AlipayEbppMerchantMeterialUploadResponse> getResponseClass() {
		return AlipayEbppMerchantMeterialUploadResponse.class;
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

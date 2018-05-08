package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEcapiprodDrawndnContractGetResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.contract.get request
 * 
 * @author auto create
 * @since 1.0, 2016-03-29 11:34:32
 */
public class AlipayEcapiprodDrawndnContractGetRequest implements AlipayRequest<AlipayEcapiprodDrawndnContractGetResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 支用编号
	 */
	private String drawndnNo;

	/** 
	* 客户身份证号码，为18位，最后X必须为大写
	 */
	private String entityCode;

	/** 
	* 客户姓名
	 */
	private String entityName;

	/** 
	* 融资平台分配给ISV的编码
	 */
	private String isvCode;

	/** 
	* 融资平台分配给小贷公司的机构编码
	 */
	private String orgCode;

	public void setDrawndnNo(String drawndnNo) {
		this.drawndnNo = drawndnNo;
	}
	public String getDrawndnNo() {
		return this.drawndnNo;
	}

	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}
	public String getEntityCode() {
		return this.entityCode;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getEntityName() {
		return this.entityName;
	}

	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}
	public String getIsvCode() {
		return this.isvCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgCode() {
		return this.orgCode;
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
		return "alipay.ecapiprod.drawndn.contract.get";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("drawndn_no", this.drawndnNo);
		txtParams.put("entity_code", this.entityCode);
		txtParams.put("entity_name", this.entityName);
		txtParams.put("isv_code", this.isvCode);
		txtParams.put("org_code", this.orgCode);
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

	public Class<AlipayEcapiprodDrawndnContractGetResponse> getResponseClass() {
		return AlipayEcapiprodDrawndnContractGetResponse.class;
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

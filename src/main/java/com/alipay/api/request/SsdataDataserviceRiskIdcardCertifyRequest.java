package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.SsdataDataserviceRiskIdcardCertifyResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: ssdata.dataservice.risk.idcard.certify request
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class SsdataDataserviceRiskIdcardCertifyRequest implements AlipayUploadRequest<SsdataDataserviceRiskIdcardCertifyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务唯一识别码  ，手动修改配置，验证用户信息时(即：当上传的图片为空时）biz_no需要设置为第一次调用接口放回的bis_token值
	 */
	private String bizNo;

	/** 
	* 身份证名字
	 */
	private String certName;

	/** 
	* 身份证号码
	 */
	private String certNo;

	/** 
	* 身份证反面图片
	 */
	private FileItem idcardConsPic;

	/** 
	* 身份证正面图片
	 */
	private FileItem idcardProsPic;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo() {
		return this.bizNo;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getCertName() {
		return this.certName;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo() {
		return this.certNo;
	}

	public void setIdcardConsPic(FileItem idcardConsPic) {
		this.idcardConsPic = idcardConsPic;
	}
	public FileItem getIdcardConsPic() {
		return this.idcardConsPic;
	}

	public void setIdcardProsPic(FileItem idcardProsPic) {
		this.idcardProsPic = idcardProsPic;
	}
	public FileItem getIdcardProsPic() {
		return this.idcardProsPic;
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
		return "ssdata.dataservice.risk.idcard.certify";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_no", this.bizNo);
		txtParams.put("cert_name", this.certName);
		txtParams.put("cert_no", this.certNo);
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
		params.put("idcard_cons_pic", this.idcardConsPic);
		params.put("idcard_pros_pic", this.idcardProsPic);
		return params;
	}

	public Class<SsdataDataserviceRiskIdcardCertifyResponse> getResponseClass() {
		return SsdataDataserviceRiskIdcardCertifyResponse.class;
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

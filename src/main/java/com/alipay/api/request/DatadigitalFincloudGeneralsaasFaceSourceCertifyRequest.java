package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.DatadigitalFincloudGeneralsaasFaceSourceCertifyResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.source.certify request
 * 
 * @author auto create
 * @since 1.0, 2022-10-31 18:07:55
 */
public class DatadigitalFincloudGeneralsaasFaceSourceCertifyRequest implements AlipayUploadRequest<DatadigitalFincloudGeneralsaasFaceSourceCertifyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 用户姓名，与身份证上的姓名相匹配
	 */
	private String certName;

	/** 
	* 证件号码，如大陆身份证号码
	 */
	private String certNo;

	/** 
	* 证件信息类型，大陆身份证：IDENTITY_CARD
	 */
	private String certType;

	/** 
	* 二进制流图片，大小限制1M
	 */
	private FileItem fileContent;

	/** 
	* 客户业务单据号
	 */
	private String outerBizNo;

	/** 
	* 手机号，特殊场景下，在验证过程中需用户输入手机来接受系统发送的安全验证短信。默认不传即可。
	 */
	private String phone;

	/** 
	* true：需要留底；false：无需留底。默认留底
	 */
	private Boolean reserved;

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

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType() {
		return this.certType;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setOuterBizNo(String outerBizNo) {
		this.outerBizNo = outerBizNo;
	}
	public String getOuterBizNo() {
		return this.outerBizNo;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return this.phone;
	}

	public void setReserved(Boolean reserved) {
		this.reserved = reserved;
	}
	public Boolean getReserved() {
		return this.reserved;
	}
	private String terminalType;
	private String terminalInfo;
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
    private boolean needEncrypt=true;
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
		return "datadigital.fincloud.generalsaas.face.source.certify";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("cert_name", this.certName);
		txtParams.put("cert_no", this.certNo);
		txtParams.put("cert_type", this.certType);
		txtParams.put("outer_biz_no", this.outerBizNo);
		txtParams.put("phone", this.phone);
		txtParams.put("reserved", this.reserved);
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
		params.put("file_content", this.fileContent);
		return params;
	}

	public Class<DatadigitalFincloudGeneralsaasFaceSourceCertifyResponse> getResponseClass() {
		return DatadigitalFincloudGeneralsaasFaceSourceCertifyResponse.class;
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

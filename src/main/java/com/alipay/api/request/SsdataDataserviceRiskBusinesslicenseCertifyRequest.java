package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.SsdataDataserviceRiskBusinesslicenseCertifyResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: ssdata.dataservice.risk.businesslicense.certify request
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class SsdataDataserviceRiskBusinesslicenseCertifyRequest implements AlipayUploadRequest<SsdataDataserviceRiskBusinesslicenseCertifyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 营业执照的公司地址 【非图片认证时此参数必填】
	 */
	private String address;

	/** 
	* 业务唯一识别码，总体流程为图片认证，如果有疑义可以再次触发接口，进行手动修改配置验证用户信息(即：当上传的图片为空时），此时biz_id需要设置为图片认证时返回的bis_token值，不然将重复计费  【非图片认证时此参数必填】
	 */
	private String bizId;

	/** 
	* 营业执照上的统一信用码【非图片认证时此参数必填】
	 */
	private String creditCode;

	/** 
	* 营业执照法人名称 【非图片认证时此参数必填】
	 */
	private String entLegalName;

	/** 
	* 营业执照上的企业名称 【非图片认证时此参数必填】
	 */
	private String entName;

	/** 
	* 二进制文件流 ,图片大小小于10M（图片越大上传耗时比较大），格式jpg,png、bmp等常用图片格式都可以，如果设置图片，即为图片认证，图片认证时其他字段可全部为空  【图片认证时此参数必填】
	 */
	private FileItem entProsPic;

	/** 
	* 营业执照营业期限，两个时间段的数据，永久有效填写9999123199991231 ，只有注册时间请填写注册时间，如果有效时间为区间请以yyyyMMddyyyyMMdd的格式填写两个时间【非图片认证时此参数必填】
	 */
	private String expires;

	/** 
	* 有效期终止时间，永久有效或者只有注册时间请填写99991231 【图片认证与非图片认证均可选】与expires是补充作用
	 */
	private String expiresEnd;

	/** 
	* 有效期起始时间 ，长期请填写99991231，只有注册时间请填写注册时间【图片认证与非图片认证均可选】与expires是补充作用
	 */
	private String expiresStart;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId() {
		return this.bizId;
	}

	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}
	public String getCreditCode() {
		return this.creditCode;
	}

	public void setEntLegalName(String entLegalName) {
		this.entLegalName = entLegalName;
	}
	public String getEntLegalName() {
		return this.entLegalName;
	}

	public void setEntName(String entName) {
		this.entName = entName;
	}
	public String getEntName() {
		return this.entName;
	}

	public void setEntProsPic(FileItem entProsPic) {
		this.entProsPic = entProsPic;
	}
	public FileItem getEntProsPic() {
		return this.entProsPic;
	}

	public void setExpires(String expires) {
		this.expires = expires;
	}
	public String getExpires() {
		return this.expires;
	}

	public void setExpiresEnd(String expiresEnd) {
		this.expiresEnd = expiresEnd;
	}
	public String getExpiresEnd() {
		return this.expiresEnd;
	}

	public void setExpiresStart(String expiresStart) {
		this.expiresStart = expiresStart;
	}
	public String getExpiresStart() {
		return this.expiresStart;
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
		return "ssdata.dataservice.risk.businesslicense.certify";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("address", this.address);
		txtParams.put("biz_id", this.bizId);
		txtParams.put("credit_code", this.creditCode);
		txtParams.put("ent_legal_name", this.entLegalName);
		txtParams.put("ent_name", this.entName);
		txtParams.put("expires", this.expires);
		txtParams.put("expires_end", this.expiresEnd);
		txtParams.put("expires_start", this.expiresStart);
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
		params.put("ent_pros_pic", this.entProsPic);
		return params;
	}

	public Class<SsdataDataserviceRiskBusinesslicenseCertifyResponse> getResponseClass() {
		return SsdataDataserviceRiskBusinesslicenseCertifyResponse.class;
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

package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMarketingCampaignRuleTagCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.marketing.campaign.rule.tag.create request
 * 
 * @author auto create
 * @since 1.0, 2017-02-22 20:02:42
 */
public class AlipayMarketingCampaignRuleTagCreateRequest implements AlipayUploadRequest<AlipayMarketingCampaignRuleTagCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 每行格式如下的csv文件，以,隔开，文件最大50M
2088004384251514,2088102344258114,13888888888,aaa@bbb.com,34032198407138000,北京市海淀区
分别意义：16位随机数字,userid,手机号码,邮件地址,身份证号,地区
	 */
	private FileItem customerdata;

	/** 
	* 签约商户下属子机构唯一编号
	 */
	private String mpid;

	/** 
	* 针对自定义人群的操作，可以创建或者删除，当创建时，自定义标签可为空
	 */
	private String operatetype;

	/** 
	* 自定义标签id，创建时可为空
	 */
	private String selftag;

	/** 
	* 自定义人群标签的描述信息（操作为CREATE时使用）
	 */
	private String tagdesc;

	public void setCustomerdata(FileItem customerdata) {
		this.customerdata = customerdata;
	}
	public FileItem getCustomerdata() {
		return this.customerdata;
	}

	public void setMpid(String mpid) {
		this.mpid = mpid;
	}
	public String getMpid() {
		return this.mpid;
	}

	public void setOperatetype(String operatetype) {
		this.operatetype = operatetype;
	}
	public String getOperatetype() {
		return this.operatetype;
	}

	public void setSelftag(String selftag) {
		this.selftag = selftag;
	}
	public String getSelftag() {
		return this.selftag;
	}

	public void setTagdesc(String tagdesc) {
		this.tagdesc = tagdesc;
	}
	public String getTagdesc() {
		return this.tagdesc;
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
		return "alipay.marketing.campaign.rule.tag.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("mpid", this.mpid);
		txtParams.put("operatetype", this.operatetype);
		txtParams.put("selftag", this.selftag);
		txtParams.put("tagdesc", this.tagdesc);
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
		params.put("customerdata", this.customerdata);
		return params;
	}

	public Class<AlipayMarketingCampaignRuleTagCreateResponse> getResponseClass() {
		return AlipayMarketingCampaignRuleTagCreateResponse.class;
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

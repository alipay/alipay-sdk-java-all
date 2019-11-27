package com.alipay.api.request;

import java.util.List;
import com.alipay.api.domain.ContactModel;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenAgentZhimarentSignResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.agent.zhimarent.sign request
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenAgentZhimarentSignRequest implements AlipayUploadRequest<AlipayOpenAgentZhimarentSignResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* APP demo，格式为.apk；或者应用说明文档, 格式为.doc .docx .pdf格式
	 */
	private String appDemo;

	/** 
	* 商户的APP应用名称
	 */
	private String appName;

	/** 
	* 代商户操作事务编号，通过alipay.open.isv.agent.create接口进行创建。
	 */
	private String batchNo;

	/** 
	* 自定义使用场景描述，usage_scene选项中无符合描述，填写自定义使用场景描述(usage_scene不填写，则custom_usage_scene必填)
	 */
	private String customUsageScene;

	/** 
	* 数据反馈接口人
	 */
	private ContactModel drContact;

	/** 
	* 例如：浙江飞猪网络技术有限公司，企业别称请填写【飞猪】。
	 */
	private String enterpriseAlias;

	/** 
	* 企业LOGO-图片，最小1KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem enterpriseLogo;

	/** 
	* 所属MCCCode，详情可参考
<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.59bgD2&treeId=222&articleId=105364&docType=1#s1
">商家经营类目</a> 中的“经营类目编码”
	 */
	private String mccCode;

	/** 
	* 异议处理接口人
	 */
	private ContactModel ohContact;

	/** 
	* 用户服务联动机制接口人
	 */
	private ContactModel prContact;

	/** 
	* 企业特殊资质图片，可参考
<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.59bgD2&treeId=222&articleId=105364&docType=1#s1
">商家经营类目</a> 中的“需要的特殊资质证书”，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem specialLicensePic;

	/** 
	* 使用场景描述，签约芝麻信用产品的用途，可选值："信用回收","信用组物", "信用长租", "永不停服"
	 */
	private List<String> usageScene;

	public void setAppDemo(String appDemo) {
		this.appDemo = appDemo;
	}
	public String getAppDemo() {
		return this.appDemo;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName() {
		return this.appName;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo() {
		return this.batchNo;
	}

	public void setCustomUsageScene(String customUsageScene) {
		this.customUsageScene = customUsageScene;
	}
	public String getCustomUsageScene() {
		return this.customUsageScene;
	}

	public void setDrContact(ContactModel drContact) {
		this.drContact = drContact;
	}
	public ContactModel getDrContact() {
		return this.drContact;
	}

	public void setEnterpriseAlias(String enterpriseAlias) {
		this.enterpriseAlias = enterpriseAlias;
	}
	public String getEnterpriseAlias() {
		return this.enterpriseAlias;
	}

	public void setEnterpriseLogo(FileItem enterpriseLogo) {
		this.enterpriseLogo = enterpriseLogo;
	}
	public FileItem getEnterpriseLogo() {
		return this.enterpriseLogo;
	}

	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}
	public String getMccCode() {
		return this.mccCode;
	}

	public void setOhContact(ContactModel ohContact) {
		this.ohContact = ohContact;
	}
	public ContactModel getOhContact() {
		return this.ohContact;
	}

	public void setPrContact(ContactModel prContact) {
		this.prContact = prContact;
	}
	public ContactModel getPrContact() {
		return this.prContact;
	}

	public void setSpecialLicensePic(FileItem specialLicensePic) {
		this.specialLicensePic = specialLicensePic;
	}
	public FileItem getSpecialLicensePic() {
		return this.specialLicensePic;
	}

	public void setUsageScene(List<String> usageScene) {
		this.usageScene = usageScene;
	}
	public List<String> getUsageScene() {
		return this.usageScene;
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
		return "alipay.open.agent.zhimarent.sign";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("app_demo", this.appDemo);
		txtParams.put("app_name", this.appName);
		txtParams.put("batch_no", this.batchNo);
		txtParams.put("custom_usage_scene", this.customUsageScene);
		txtParams.put("dr_contact", this.drContact == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.drContact, true));
		txtParams.put("enterprise_alias", this.enterpriseAlias);
		txtParams.put("mcc_code", this.mccCode);
		txtParams.put("oh_contact", this.ohContact == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.ohContact, true));
		txtParams.put("pr_contact", this.prContact == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.prContact, true));
		txtParams.put("usage_scene", this.usageScene == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.usageScene, true));
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
		params.put("enterprise_logo", this.enterpriseLogo);
		params.put("special_license_pic", this.specialLicensePic);
		return params;
	}

	public Class<AlipayOpenAgentZhimarentSignResponse> getResponseClass() {
		return AlipayOpenAgentZhimarentSignResponse.class;
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

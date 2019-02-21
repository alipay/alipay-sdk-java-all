package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipaySecurityProdAfsrcVulCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.security.prod.afsrc.vul.create request
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdAfsrcVulCreateRequest implements AlipayUploadRequest<AlipaySecurityProdAfsrcVulCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 漏洞附件
	 */
	private FileItem attachment;

	/** 
	* 漏洞所属业务
	 */
	private Long business;

	/** 
	* 漏洞所属公司
	 */
	private Long company;

	/** 
	* 漏洞详情
	 */
	private String detail;

	/** 
	* HavanaId(淘宝uid)
	 */
	private Long hid;

	/** 
	* 用户上报漏洞等级
	 */
	private Long level;

	/** 
	* 白帽子提交漏洞时填写的手机号
	 */
	private String mobilePhone;

	/** 
	* 漏洞名称
	 */
	private String name;

	/** 
	* 用户昵称
	 */
	private String nick;

	/** 
	* 漏洞状态
	 */
	private Long status;

	/** 
	* 漏洞提交时间
	 */
	private String submitTime;

	/** 
	* 子平台漏洞一级类型 ID
	 */
	private String typeSubFirstId;

	/** 
	* 一级漏洞类型名称
	 */
	private String typeSubFirstName;

	/** 
	* 子平台漏洞二级类型 ID
	 */
	private String typeSubSecondId;

	/** 
	* 二级漏洞类型名称
	 */
	private String typeSubSecondName;

	/** 
	* 统一平台漏洞一级类型 ID
	 */
	private Long typeUnionFirstId;

	/** 
	* 统一平台漏洞二级类型 ID
	 */
	private Long typeUnionSecondId;

	/** 
	* 漏洞 URL
	 */
	private String url;

	/** 
	* 支付宝 ID
	 */
	private String userId;

	public void setAttachment(FileItem attachment) {
		this.attachment = attachment;
	}
	public FileItem getAttachment() {
		return this.attachment;
	}

	public void setBusiness(Long business) {
		this.business = business;
	}
	public Long getBusiness() {
		return this.business;
	}

	public void setCompany(Long company) {
		this.company = company;
	}
	public Long getCompany() {
		return this.company;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getDetail() {
		return this.detail;
	}

	public void setHid(Long hid) {
		this.hid = hid;
	}
	public Long getHid() {
		return this.hid;
	}

	public void setLevel(Long level) {
		this.level = level;
	}
	public Long getLevel() {
		return this.level;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus() {
		return this.status;
	}

	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}
	public String getSubmitTime() {
		return this.submitTime;
	}

	public void setTypeSubFirstId(String typeSubFirstId) {
		this.typeSubFirstId = typeSubFirstId;
	}
	public String getTypeSubFirstId() {
		return this.typeSubFirstId;
	}

	public void setTypeSubFirstName(String typeSubFirstName) {
		this.typeSubFirstName = typeSubFirstName;
	}
	public String getTypeSubFirstName() {
		return this.typeSubFirstName;
	}

	public void setTypeSubSecondId(String typeSubSecondId) {
		this.typeSubSecondId = typeSubSecondId;
	}
	public String getTypeSubSecondId() {
		return this.typeSubSecondId;
	}

	public void setTypeSubSecondName(String typeSubSecondName) {
		this.typeSubSecondName = typeSubSecondName;
	}
	public String getTypeSubSecondName() {
		return this.typeSubSecondName;
	}

	public void setTypeUnionFirstId(Long typeUnionFirstId) {
		this.typeUnionFirstId = typeUnionFirstId;
	}
	public Long getTypeUnionFirstId() {
		return this.typeUnionFirstId;
	}

	public void setTypeUnionSecondId(Long typeUnionSecondId) {
		this.typeUnionSecondId = typeUnionSecondId;
	}
	public Long getTypeUnionSecondId() {
		return this.typeUnionSecondId;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return this.url;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
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
		return "alipay.security.prod.afsrc.vul.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("business", this.business);
		txtParams.put("company", this.company);
		txtParams.put("detail", this.detail);
		txtParams.put("hid", this.hid);
		txtParams.put("level", this.level);
		txtParams.put("mobile_phone", this.mobilePhone);
		txtParams.put("name", this.name);
		txtParams.put("nick", this.nick);
		txtParams.put("status", this.status);
		txtParams.put("submit_time", this.submitTime);
		txtParams.put("type_sub_first_id", this.typeSubFirstId);
		txtParams.put("type_sub_first_name", this.typeSubFirstName);
		txtParams.put("type_sub_second_id", this.typeSubSecondId);
		txtParams.put("type_sub_second_name", this.typeSubSecondName);
		txtParams.put("type_union_first_id", this.typeUnionFirstId);
		txtParams.put("type_union_second_id", this.typeUnionSecondId);
		txtParams.put("url", this.url);
		txtParams.put("user_id", this.userId);
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
		params.put("attachment", this.attachment);
		return params;
	}

	public Class<AlipaySecurityProdAfsrcVulCreateResponse> getResponseClass() {
		return AlipaySecurityProdAfsrcVulCreateResponse.class;
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

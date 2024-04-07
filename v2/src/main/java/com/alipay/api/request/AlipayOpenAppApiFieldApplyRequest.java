package com.alipay.api.request;

import com.alipay.api.domain.AuthFieldApply;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenAppApiFieldApplyResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.app.api.field.apply request
 * 
 * @author auto create
 * @since 1.0, 2024-03-22 16:57:22
 */
public class AlipayOpenAppApiFieldApplyRequest implements AlipayUploadRequest<AlipayOpenAppApiFieldApplyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 字段申请表单，其中api_name，field_name，package_code三个字段参数通过alipay.open.app.api.query接口查询获得，scene_code 则可通过alipay.open.app.api.scene.query接口查询获得。
	 */
	private AuthFieldApply authFieldApply;

	/** 
	* 请上传应用使用图片必须包括如何登录、如何授权输出此字段、如何使用等内容。图片支持格式:png,jpg,jpeg,图片不超过10M。
video或picture_x不可同时为空，至少需传入1个。
	 */
	private FileItem picture1;

	/** 
	* 请上传应用使用图片必须包括如何登录、如何授权输出此字段、如何使用等内容。图片支持格式:png,jpg,jpeg,图片不超过10M。
video或picture_x不可同时为空，至少需传入1个。
	 */
	private FileItem picture2;

	/** 
	* 请上传应用使用图片必须包括如何登录、如何授权输出此字段、如何使用等内容。图片支持格式:png,jpg,jpeg,图片不超过10M。
video或picture_x不可同时为空，至少需传入1个。
	 */
	private FileItem picture3;

	/** 
	* 请上传应用使用图片必须包括如何登录、如何授权输出此字段、如何使用等内容。图片支持格式:png,jpg,jpeg,图片不超过10M。
video或picture_x不可同时为空，至少需传入1个。
	 */
	private FileItem picture4;

	/** 
	* 请上传应用使用图片必须包括如何登录、如何授权输出此字段、如何使用等内容。图片支持格式:png,jpg,jpeg,图片不超过10M。
video或picture_x不可同时为空，至少需传入1个。
	 */
	private FileItem picture5;

	/** 
	* 请上传应用使用视频，必须包括如何登录、如何授权输出此字段、如何使用等内容。视频支持格式:MP4,视频不超过10M。
video或picture_x不可同时为空，至少需传入1个。
	 */
	private FileItem video;

	public void setAuthFieldApply(AuthFieldApply authFieldApply) {
		this.authFieldApply = authFieldApply;
	}
	public AuthFieldApply getAuthFieldApply() {
		return this.authFieldApply;
	}

	public void setPicture1(FileItem picture1) {
		this.picture1 = picture1;
	}
	public FileItem getPicture1() {
		return this.picture1;
	}

	public void setPicture2(FileItem picture2) {
		this.picture2 = picture2;
	}
	public FileItem getPicture2() {
		return this.picture2;
	}

	public void setPicture3(FileItem picture3) {
		this.picture3 = picture3;
	}
	public FileItem getPicture3() {
		return this.picture3;
	}

	public void setPicture4(FileItem picture4) {
		this.picture4 = picture4;
	}
	public FileItem getPicture4() {
		return this.picture4;
	}

	public void setPicture5(FileItem picture5) {
		this.picture5 = picture5;
	}
	public FileItem getPicture5() {
		return this.picture5;
	}

	public void setVideo(FileItem video) {
		this.video = video;
	}
	public FileItem getVideo() {
		return this.video;
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
		return "alipay.open.app.api.field.apply";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("auth_field_apply", this.authFieldApply == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.authFieldApply, true));
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
		params.put("picture_1", this.picture1);
		params.put("picture_2", this.picture2);
		params.put("picture_3", this.picture3);
		params.put("picture_4", this.picture4);
		params.put("picture_5", this.picture5);
		params.put("video", this.video);
		return params;
	}

	public Class<AlipayOpenAppApiFieldApplyResponse> getResponseClass() {
		return AlipayOpenAppApiFieldApplyResponse.class;
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

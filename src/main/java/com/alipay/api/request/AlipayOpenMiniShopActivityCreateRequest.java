package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenMiniShopActivityCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.mini.shop.activity.create request
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenMiniShopActivityCreateRequest implements AlipayUploadRequest<AlipayOpenMiniShopActivityCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 活动资源图片
	 */
	private FileItem bannerImage;

	/** 
	* 活动结束时间
	 */
	private String endTime;

	/** 
	* 跳转插件appId
	 */
	private String pluginId;

	/** 
	* 活动开始时间
	 */
	private String startTime;

	/** 
	* 实际跳转相对路径
	 */
	private String targetUrl;

	public void setBannerImage(FileItem bannerImage) {
		this.bannerImage = bannerImage;
	}
	public FileItem getBannerImage() {
		return this.bannerImage;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime() {
		return this.endTime;
	}

	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}
	public String getPluginId() {
		return this.pluginId;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime() {
		return this.startTime;
	}

	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}
	public String getTargetUrl() {
		return this.targetUrl;
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
		return "alipay.open.mini.shop.activity.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("end_time", this.endTime);
		txtParams.put("plugin_id", this.pluginId);
		txtParams.put("start_time", this.startTime);
		txtParams.put("target_url", this.targetUrl);
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
		params.put("banner_image", this.bannerImage);
		return params;
	}

	public Class<AlipayOpenMiniShopActivityCreateResponse> getResponseClass() {
		return AlipayOpenMiniShopActivityCreateResponse.class;
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

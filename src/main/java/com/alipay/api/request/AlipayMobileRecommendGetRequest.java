package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMobileRecommendGetResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.mobile.recommend.get request
 * 
 * @author auto create
 * @since 1.0, 2015-03-11 15:19:54
 */
public class AlipayMobileRecommendGetRequest implements AlipayRequest<AlipayMobileRecommendGetResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 请求上下文扩展信息，需要与接口负责人约定。格式为json对象。
	 */
	private String extInfo;

	/** 
	* 期望获取的最多推荐数量, 默认获取一个推荐内容, 0表示获取所有推荐内容
	 */
	private String limit;

	/** 
	* 所使用的场景id，请向接口负责人申请
	 */
	private String sceneId;

	/** 
	* 获取推荐信息的开始位置, 默认从0开始
	 */
	private String startIdx;

	/** 
	* 用户openid
	 */
	private String userId;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo() {
		return this.extInfo;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getLimit() {
		return this.limit;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}
	public String getSceneId() {
		return this.sceneId;
	}

	public void setStartIdx(String startIdx) {
		this.startIdx = startIdx;
	}
	public String getStartIdx() {
		return this.startIdx;
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

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.mobile.recommend.get";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("ext_info", this.extInfo);
		txtParams.put("limit", this.limit);
		txtParams.put("scene_id", this.sceneId);
		txtParams.put("start_idx", this.startIdx);
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

	public Class<AlipayMobileRecommendGetResponse> getResponseClass() {
		return AlipayMobileRecommendGetResponse.class;
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

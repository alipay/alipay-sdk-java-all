package com.alipay.api.request;

import java.util.Date;
import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayPromoEventSendResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.promo.event.send request
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayPromoEventSendRequest implements AlipayRequest<AlipayPromoEventSendResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 动作子类型，二级动作
	 */
	private String actionSubType;

	/** 
	* 同步的动作
	 */
	private String actionType;

	/** 
	* 扩展字段,以逗号分隔的属性列表如bizOrderNo,number,nick
	 */
	private String ext;

	/** 
	* 商户当前用户登录名
	 */
	private String loginId;

	/** 
	* 设备类型如：pc,phone,pad,other
	 */
	private String termType;

	/** 
	* 创建时间，动作发生的时间，
	 */
	private Date time;

	/** 
	* 支付宝的userId
	 */
	private String userId;

	public void setActionSubType(String actionSubType) {
		this.actionSubType = actionSubType;
	}
	public String getActionSubType() {
		return this.actionSubType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public String getActionType() {
		return this.actionType;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getExt() {
		return this.ext;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginId() {
		return this.loginId;
	}

	public void setTermType(String termType) {
		this.termType = termType;
	}
	public String getTermType() {
		return this.termType;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	public Date getTime() {
		return this.time;
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
		return "alipay.promo.event.send";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("action_sub_type", this.actionSubType);
		txtParams.put("action_type", this.actionType);
		txtParams.put("ext", this.ext);
		txtParams.put("login_id", this.loginId);
		txtParams.put("term_type", this.termType);
		txtParams.put("time", this.time);
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

	public Class<AlipayPromoEventSendResponse> getResponseClass() {
		return AlipayPromoEventSendResponse.class;
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

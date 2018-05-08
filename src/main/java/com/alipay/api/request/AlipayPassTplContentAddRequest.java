package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayPassTplContentAddResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.pass.tpl.content.add request
 * 
 * @author auto create
 * @since 1.0, 2017-12-07 16:32:21
 */
public class AlipayPassTplContentAddRequest implements AlipayRequest<AlipayPassTplContentAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 支付宝用户识别信息：
当 recognition_type=1时， recognition_info={“partner_id”:”2088102114633762”,“out_trade_no”:”1234567”}；
当recognition_type=3时，recognition_info={“mobile”:”136XXXXXXXX“}
当recognition_type=4时， recognition_info={“open_id”:”afbd8d9bb12fc02c5094d8ea89d1fae8“}
	 */
	private String recognitionInfo;

	/** 
	* Alipass添加对象识别类型【1--订单信息;3--支付宝用户绑定手机号；4--支付宝OpenId;】
	 */
	private String recognitionType;

	/** 
	* 支付宝pass模版ID
	 */
	private String tplId;

	/** 
	* 模版动态参数信息【支付宝pass模版参数键值对JSON字符串】
	 */
	private String tplParams;

	public void setRecognitionInfo(String recognitionInfo) {
		this.recognitionInfo = recognitionInfo;
	}
	public String getRecognitionInfo() {
		return this.recognitionInfo;
	}

	public void setRecognitionType(String recognitionType) {
		this.recognitionType = recognitionType;
	}
	public String getRecognitionType() {
		return this.recognitionType;
	}

	public void setTplId(String tplId) {
		this.tplId = tplId;
	}
	public String getTplId() {
		return this.tplId;
	}

	public void setTplParams(String tplParams) {
		this.tplParams = tplParams;
	}
	public String getTplParams() {
		return this.tplParams;
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
		return "alipay.pass.tpl.content.add";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("recognition_info", this.recognitionInfo);
		txtParams.put("recognition_type", this.recognitionType);
		txtParams.put("tpl_id", this.tplId);
		txtParams.put("tpl_params", this.tplParams);
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

	public Class<AlipayPassTplContentAddResponse> getResponseClass() {
		return AlipayPassTplContentAddResponse.class;
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

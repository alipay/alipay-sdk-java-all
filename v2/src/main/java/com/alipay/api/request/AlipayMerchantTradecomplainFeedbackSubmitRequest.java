package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMerchantTradecomplainFeedbackSubmitResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.merchant.tradecomplain.feedback.submit request
 * 
 * @author auto create
 * @since 1.0, 2023-11-06 10:52:20
 */
public class AlipayMerchantTradecomplainFeedbackSubmitRequest implements AlipayRequest<AlipayMerchantTradecomplainFeedbackSubmitResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 支付宝侧投诉单号
	 */
	private String complainEventId;

	/** 
	* 反馈类目ID
00:使用体验保障金退款；
02:通过其他方式退款;
03:已发货;
04:其他;
05:已完成售后服务;
06:非我方责任范围；
	 */
	private String feedbackCode;

	/** 
	* 反馈内容，字数不超过200个字
	 */
	private String feedbackContent;

	/** 
	* 商家处理投诉时反馈凭证的图片id，多个逗号隔开（图片id可以通过"商户上传处理图片"接口获取）
	 */
	private String feedbackImages;

	/** 
	* 处理投诉人，字数不超过6个字
	 */
	private String operator;

	public void setComplainEventId(String complainEventId) {
		this.complainEventId = complainEventId;
	}
	public String getComplainEventId() {
		return this.complainEventId;
	}

	public void setFeedbackCode(String feedbackCode) {
		this.feedbackCode = feedbackCode;
	}
	public String getFeedbackCode() {
		return this.feedbackCode;
	}

	public void setFeedbackContent(String feedbackContent) {
		this.feedbackContent = feedbackContent;
	}
	public String getFeedbackContent() {
		return this.feedbackContent;
	}

	public void setFeedbackImages(String feedbackImages) {
		this.feedbackImages = feedbackImages;
	}
	public String getFeedbackImages() {
		return this.feedbackImages;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getOperator() {
		return this.operator;
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
		return "alipay.merchant.tradecomplain.feedback.submit";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("complain_event_id", this.complainEventId);
		txtParams.put("feedback_code", this.feedbackCode);
		txtParams.put("feedback_content", this.feedbackContent);
		txtParams.put("feedback_images", this.feedbackImages);
		txtParams.put("operator", this.operator);
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

	public Class<AlipayMerchantTradecomplainFeedbackSubmitResponse> getResponseClass() {
		return AlipayMerchantTradecomplainFeedbackSubmitResponse.class;
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

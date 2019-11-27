package com.alipay.api.request;

import java.util.List;
import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMemberCardTemplateSaveResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.member.card.template.save request
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMemberCardTemplateSaveRequest implements AlipayRequest<AlipayMemberCardTemplateSaveResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 支付宝会员卡模板Id
	 */
	private String alipayTemplateId;

	/** 
	* 使用说明
	 */
	private String applyExplain;

	/** 
	* 权益描述集合，json结构，单个权益描述可选Key如下：
title：权益标题；
benefitDesc：权益描述
benefitRange：特权使用范围-- GLOBAL：通用特权； CITY：城市特权； SHOP：门店特权。
city：城市码，当benefit_range为CITY时，该属性不能为空。
shop：门店码，当benefitRange为SHOP时，该属性不能为空。
	 */
	private List<String> benifitConfigList;

	/** 
	* 发卡机构。
ALIPAY：支付宝
PARTNER：合作商户
	 */
	private String cardInst;

	/** 
	* 卡商户信息，json格式。
目前仅支持如下key：
merchantUniId：商户唯一标识
merchantUniIdType：支持以下3种取值。
  LOGON_ID：商户登录ID，邮箱或者手机号格式；
  UID：商户的支付宝用户号，以2088开头的16位纯数字组成；
  BINDING_MOBILE：商户支付宝账号绑定的手机号。

注意：
本参数主要用于发卡平台接入场景，request_from为PLATFORM时，不能为空。
	 */
	private String cardMerchantInfo;

	/** 
	* 会员卡名称
	 */
	private String cardName;

	/** 
	* 卡类型。
MEMBER_CARD：会员卡
FUND_CARD：资金卡
	 */
	private String cardType;

	/** 
	* 统一服务电话
	 */
	private String contactTel;

	/** 
	* 卡显示配置，json结构，可选key如下：
displayBalance：是否显示余额，布尔值，下同；
displayLevel：是否展示等级；
displayPoint：是否显示积分；
displayStore：是否展示门店信息；
displayTelephone：是否展示统一联系电话
	 */
	private String displayConfig;

	/** 
	* 扩展信息，json格式。
	 */
	private String extInfo;

	/** 
	* 资金卡发行面额配置集合，json结构,当card_type为FUND_CARD时，该配置不能为空，单个发行面额可选key如下：
denomination：面额
discount：折扣
validDate：面额日期，格式为yyyy-MM-dd HH:mm:ss。
	 */
	private List<String> issuedConfigList;

	/** 
	* 商家简介
	 */
	private String merchantIntroduction;

	/** 
	* 外部商户卡模板Id
	 */
	private String outTemplateId;

	/** 
	* 请求来源。
PLATFORM：发卡平台商
PARTNER：直联商户
	 */
	private String requestFrom;

	/** 
	* 模板状态，目前只支持发行状态。
发行：PUBLISH
	 */
	private String status;

	/** 
	* 卡样式配置，json结构，可选Key如下：
logoUrl：图片链接，图片为正方形，推荐大小92*92
backgroundUrl：背景链接，图片为长方形，推荐大小534*318
	 */
	private String styleConfig;

	/** 
	* 有效期类型
Interval：固定时间段；
DeadLine：截止时间
	 */
	private String validDateType;

	/** 
	* 有效期值
Interval：0-永久,比如1\12\24（月为单位）；
DeadLine：格式为yyyy-MM-dd HH:mm:ss
	 */
	private String validDateValue;

	/** 
	* 核销方式。
QRCODE：二维码
DQRCODE：动态二维码
WAVE：声波
BARCORE：条码
DBARCORE：动态条码
TEXT：文本
	 */
	private String writeOffType;

	public void setAlipayTemplateId(String alipayTemplateId) {
		this.alipayTemplateId = alipayTemplateId;
	}
	public String getAlipayTemplateId() {
		return this.alipayTemplateId;
	}

	public void setApplyExplain(String applyExplain) {
		this.applyExplain = applyExplain;
	}
	public String getApplyExplain() {
		return this.applyExplain;
	}

	public void setBenifitConfigList(List<String> benifitConfigList) {
		this.benifitConfigList = benifitConfigList;
	}
	public List<String> getBenifitConfigList() {
		return this.benifitConfigList;
	}

	public void setCardInst(String cardInst) {
		this.cardInst = cardInst;
	}
	public String getCardInst() {
		return this.cardInst;
	}

	public void setCardMerchantInfo(String cardMerchantInfo) {
		this.cardMerchantInfo = cardMerchantInfo;
	}
	public String getCardMerchantInfo() {
		return this.cardMerchantInfo;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardName() {
		return this.cardName;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType() {
		return this.cardType;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	public String getContactTel() {
		return this.contactTel;
	}

	public void setDisplayConfig(String displayConfig) {
		this.displayConfig = displayConfig;
	}
	public String getDisplayConfig() {
		return this.displayConfig;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo() {
		return this.extInfo;
	}

	public void setIssuedConfigList(List<String> issuedConfigList) {
		this.issuedConfigList = issuedConfigList;
	}
	public List<String> getIssuedConfigList() {
		return this.issuedConfigList;
	}

	public void setMerchantIntroduction(String merchantIntroduction) {
		this.merchantIntroduction = merchantIntroduction;
	}
	public String getMerchantIntroduction() {
		return this.merchantIntroduction;
	}

	public void setOutTemplateId(String outTemplateId) {
		this.outTemplateId = outTemplateId;
	}
	public String getOutTemplateId() {
		return this.outTemplateId;
	}

	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}
	public String getRequestFrom() {
		return this.requestFrom;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public void setStyleConfig(String styleConfig) {
		this.styleConfig = styleConfig;
	}
	public String getStyleConfig() {
		return this.styleConfig;
	}

	public void setValidDateType(String validDateType) {
		this.validDateType = validDateType;
	}
	public String getValidDateType() {
		return this.validDateType;
	}

	public void setValidDateValue(String validDateValue) {
		this.validDateValue = validDateValue;
	}
	public String getValidDateValue() {
		return this.validDateValue;
	}

	public void setWriteOffType(String writeOffType) {
		this.writeOffType = writeOffType;
	}
	public String getWriteOffType() {
		return this.writeOffType;
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
		return "alipay.member.card.template.save";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("alipay_template_id", this.alipayTemplateId);
		txtParams.put("apply_explain", this.applyExplain);
		txtParams.put("benifit_config_list", this.benifitConfigList == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.benifitConfigList, true));
		txtParams.put("card_inst", this.cardInst);
		txtParams.put("card_merchant_info", this.cardMerchantInfo);
		txtParams.put("card_name", this.cardName);
		txtParams.put("card_type", this.cardType);
		txtParams.put("contact_tel", this.contactTel);
		txtParams.put("display_config", this.displayConfig);
		txtParams.put("ext_info", this.extInfo);
		txtParams.put("issued_config_list", this.issuedConfigList == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.issuedConfigList, true));
		txtParams.put("merchant_introduction", this.merchantIntroduction);
		txtParams.put("out_template_id", this.outTemplateId);
		txtParams.put("request_from", this.requestFrom);
		txtParams.put("status", this.status);
		txtParams.put("style_config", this.styleConfig);
		txtParams.put("valid_date_type", this.validDateType);
		txtParams.put("valid_date_value", this.validDateValue);
		txtParams.put("write_off_type", this.writeOffType);
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

	public Class<AlipayMemberCardTemplateSaveResponse> getResponseClass() {
		return AlipayMemberCardTemplateSaveResponse.class;
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

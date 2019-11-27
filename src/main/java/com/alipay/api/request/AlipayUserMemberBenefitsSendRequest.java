package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayUserMemberBenefitsSendResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.user.member.benefits.send request
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayUserMemberBenefitsSendRequest implements AlipayRequest<AlipayUserMemberBenefitsSendResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 会员卡卡号
	 */
	private String bizCardNo;

	/** 
	* 特权详情
	 */
	private String desc;

	/** 
	* 失效日期。 格式：yyyy-mm-dd。
	 */
	private String endDate;

	/** 
	* 优惠券发放张数
	 */
	private Long sendNum;

	/** 
	* 流水号。 用于控制权益发放的幂等性。
	 */
	private String serialNo;

	/** 
	* 生效日期。 格式：yyyy-mm-d
	 */
	private String startDate;

	/** 
	* 特权名称
	 */
	private String title;

	/** 
	* 自定义核销码，如果为空则由支付宝自动生成
	 */
	private String verifyCode;

	/** 
	* 核销方式，可多选。 支持：test-纯文本，barcode-条码，qucode-二维码，wave-...
	 */
	private String verifyTypes;

	public void setBizCardNo(String bizCardNo) {
		this.bizCardNo = bizCardNo;
	}
	public String getBizCardNo() {
		return this.bizCardNo;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return this.desc;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndDate() {
		return this.endDate;
	}

	public void setSendNum(Long sendNum) {
		this.sendNum = sendNum;
	}
	public Long getSendNum() {
		return this.sendNum;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getSerialNo() {
		return this.serialNo;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate() {
		return this.startDate;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	public String getVerifyCode() {
		return this.verifyCode;
	}

	public void setVerifyTypes(String verifyTypes) {
		this.verifyTypes = verifyTypes;
	}
	public String getVerifyTypes() {
		return this.verifyTypes;
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
		return "alipay.user.member.benefits.send";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_card_no", this.bizCardNo);
		txtParams.put("desc", this.desc);
		txtParams.put("end_date", this.endDate);
		txtParams.put("send_num", this.sendNum);
		txtParams.put("serial_no", this.serialNo);
		txtParams.put("start_date", this.startDate);
		txtParams.put("title", this.title);
		txtParams.put("verify_code", this.verifyCode);
		txtParams.put("verify_types", this.verifyTypes);
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

	public Class<AlipayUserMemberBenefitsSendResponse> getResponseClass() {
		return AlipayUserMemberBenefitsSendResponse.class;
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

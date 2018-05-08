package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayDiscoveryTaxiOrderConfirmResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.discovery.taxi.order.confirm request
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:59
 */
public class AlipayDiscoveryTaxiOrderConfirmRequest implements AlipayRequest<AlipayDiscoveryTaxiOrderConfirmResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 司机纬度
	 */
	private String driverLat;

	/** 
	* 司机车牌
	 */
	private String driverLicense;

	/** 
	* 司机经度
	 */
	private String driverLng;

	/** 
	* 司机姓名
	 */
	private String driverName;

	/** 
	* 司机手机号
	 */
	private String driverPhone;

	/** 
	* 是否支持支付宝付款
	 */
	private Boolean isAlipaySupport;

	/** 
	* 打车订单ID
	 */
	private String outBizNo;

	/** 
	* 商户ID
	 */
	private String partnerId;

	/** 
	* 收款账号
	 */
	private String seller;

	public void setDriverLat(String driverLat) {
		this.driverLat = driverLat;
	}
	public String getDriverLat() {
		return this.driverLat;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}
	public String getDriverLicense() {
		return this.driverLicense;
	}

	public void setDriverLng(String driverLng) {
		this.driverLng = driverLng;
	}
	public String getDriverLng() {
		return this.driverLng;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverName() {
		return this.driverName;
	}

	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}
	public String getDriverPhone() {
		return this.driverPhone;
	}

	public void setIsAlipaySupport(Boolean isAlipaySupport) {
		this.isAlipaySupport = isAlipaySupport;
	}
	public Boolean getIsAlipaySupport() {
		return this.isAlipaySupport;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId() {
		return this.partnerId;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getSeller() {
		return this.seller;
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
		return "alipay.discovery.taxi.order.confirm";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("driver_lat", this.driverLat);
		txtParams.put("driver_license", this.driverLicense);
		txtParams.put("driver_lng", this.driverLng);
		txtParams.put("driver_name", this.driverName);
		txtParams.put("driver_phone", this.driverPhone);
		txtParams.put("is_alipay_support", this.isAlipaySupport);
		txtParams.put("out_biz_no", this.outBizNo);
		txtParams.put("partner_id", this.partnerId);
		txtParams.put("seller", this.seller);
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

	public Class<AlipayDiscoveryTaxiOrderConfirmResponse> getResponseClass() {
		return AlipayDiscoveryTaxiOrderConfirmResponse.class;
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

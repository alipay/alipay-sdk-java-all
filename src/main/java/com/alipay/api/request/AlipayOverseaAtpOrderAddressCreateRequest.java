package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOverseaAtpOrderAddressCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.oversea.atp.order.address.create request
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayOverseaAtpOrderAddressCreateRequest implements AlipayRequest<AlipayOverseaAtpOrderAddressCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 详细地址
	 */
	private String address;

	/** 
	* 地区
	 */
	private String area;

	/** 
	* 证件号码
	 */
	private String certNo;

	/** 
	* 证件类型
	 */
	private String certType;

	/** 
	* 城市
	 */
	private String city;

	/** 
	* email
	 */
	private String email;

	/** 
	* 创建时间
	 */
	private String gmtCreate;

	/** 
	* 修改时间
	 */
	private String gmtModified;

	/** 
	* 标志来源
	 */
	private String markFrom;

	/** 
	* 支付宝绑定的手机号码
	 */
	private String mobile;

	/** 
	* 转运订单号
	 */
	private String orderId;

	/** 
	* 省份
	 */
	private String province;

	/** 
	* 用户ID
	 */
	private String userId;

	/** 
	* 用户名称
	 */
	private String userName;

	/** 
	* 邮政编码
	 */
	private String zipCode;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}

	public void setArea(String area) {
		this.area = area;
	}
	public String getArea() {
		return this.area;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo() {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType() {
		return this.certType;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return this.city;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setMarkFrom(String markFrom) {
		this.markFrom = markFrom;
	}
	public String getMarkFrom() {
		return this.markFrom;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile() {
		return this.mobile;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId() {
		return this.orderId;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince() {
		return this.province;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return this.userName;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getZipCode() {
		return this.zipCode;
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
		return "alipay.oversea.atp.order.address.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("address", this.address);
		txtParams.put("area", this.area);
		txtParams.put("cert_no", this.certNo);
		txtParams.put("cert_type", this.certType);
		txtParams.put("city", this.city);
		txtParams.put("email", this.email);
		txtParams.put("gmt_create", this.gmtCreate);
		txtParams.put("gmt_modified", this.gmtModified);
		txtParams.put("mark_from", this.markFrom);
		txtParams.put("mobile", this.mobile);
		txtParams.put("order_id", this.orderId);
		txtParams.put("province", this.province);
		txtParams.put("user_id", this.userId);
		txtParams.put("user_name", this.userName);
		txtParams.put("zip_code", this.zipCode);
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

	public Class<AlipayOverseaAtpOrderAddressCreateResponse> getResponseClass() {
		return AlipayOverseaAtpOrderAddressCreateResponse.class;
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

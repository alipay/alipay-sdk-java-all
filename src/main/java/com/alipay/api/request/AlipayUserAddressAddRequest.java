package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayUserAddressAddResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.user.address.add request
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayUserAddressAddRequest implements AlipayRequest<AlipayUserAddressAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 收获详细地址
	 */
	private String address;

	/** 
	* 所在区的名称
	 */
	private String area;

	/** 
	* 城市
	 */
	private String city;

	/** 
	* 数据来源：海外
	 */
	private String from;

	/** 
	* 邮政编码
	 */
	private String post;

	/** 
	* 省份
	 */
	private String prov;

	/** 
	* 用户UID
	 */
	private String userId;

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

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return this.city;
	}

	public void setFrom(String from) {
		this.from = from;
	}
	public String getFrom() {
		return this.from;
	}

	public void setPost(String post) {
		this.post = post;
	}
	public String getPost() {
		return this.post;
	}

	public void setProv(String prov) {
		this.prov = prov;
	}
	public String getProv() {
		return this.prov;
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
		return "alipay.user.address.add";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("address", this.address);
		txtParams.put("area", this.area);
		txtParams.put("city", this.city);
		txtParams.put("from", this.from);
		txtParams.put("post", this.post);
		txtParams.put("prov", this.prov);
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

	public Class<AlipayUserAddressAddResponse> getResponseClass() {
		return AlipayUserAddressAddResponse.class;
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

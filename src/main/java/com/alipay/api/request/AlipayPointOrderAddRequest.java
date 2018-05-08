package com.alipay.api.request;

import java.util.Date;
import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayPointOrderAddResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.point.order.add request
 * 
 * @author auto create
 * @since 1.0, 2017-07-11 11:00:47
 */
public class AlipayPointOrderAddRequest implements AlipayRequest<AlipayPointOrderAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 向用户展示集分宝发放备注
	 */
	private String memo;

	/** 
	* isv提供的发放订单号，由数字和字母组成，最大长度为32位，需要保证每笔订单发放的唯一性，支付宝对该参数做唯一性校验。如果订单号已存在，支付宝将返回订单号已经存在的错误
	 */
	private String merchantOrderNo;

	/** 
	* 发放集分宝时间
	 */
	private Date orderTime;

	/** 
	* 发放集分宝的数量
	 */
	private Long pointCount;

	/** 
	* 用户标识符，用于指定集分宝发放的用户，和user_symbol_type一起使用，确定一个唯一的支付宝用户
	 */
	private String userSymbol;

	/** 
	* 用户标识符类型，现在支持ALIPAY_USER_ID:表示支付宝用户ID,ALIPAY_LOGON_ID:表示支付宝登陆号
	 */
	private String userSymbolType;

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setPointCount(Long pointCount) {
		this.pointCount = pointCount;
	}
	public Long getPointCount() {
		return this.pointCount;
	}

	public void setUserSymbol(String userSymbol) {
		this.userSymbol = userSymbol;
	}
	public String getUserSymbol() {
		return this.userSymbol;
	}

	public void setUserSymbolType(String userSymbolType) {
		this.userSymbolType = userSymbolType;
	}
	public String getUserSymbolType() {
		return this.userSymbolType;
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
		return "alipay.point.order.add";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("memo", this.memo);
		txtParams.put("merchant_order_no", this.merchantOrderNo);
		txtParams.put("order_time", this.orderTime);
		txtParams.put("point_count", this.pointCount);
		txtParams.put("user_symbol", this.userSymbol);
		txtParams.put("user_symbol_type", this.userSymbolType);
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

	public Class<AlipayPointOrderAddResponse> getResponseClass() {
		return AlipayPointOrderAddResponse.class;
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

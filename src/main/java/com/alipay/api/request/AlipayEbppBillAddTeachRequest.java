package com.alipay.api.request;

import java.util.List;
import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEbppBillAddTeachResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ebpp.bill.add.teach request
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEbppBillAddTeachRequest implements AlipayRequest<AlipayEbppBillAddTeachResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* bank_bill_no
	 */
	private String bankBillNo;

	/** 
	* 201203
	 */
	private String billDate;

	/** 
	* 3388102012376451
	 */
	private String billKey;

	/** 
	* BJCEB
	 */
	private String chargeInst;

	/** 
	* extend_field
	 */
	private String extendField;

	/** 
	* 出机构的业务流水号，需要保证唯一性
	 */
	private String merchantOrderNo;

	/** 
	* 15987838584
	 */
	private String mobile;

	/** 
	* 支付宝订单类型。公共事业缴纳JF,信用卡还款HK
	 */
	private String orderType;

	/** 
	* owner_name
	 */
	private String ownerName;

	/** 
	* 23.45
	 */
	private List<String> payAmount;

	/** 
	* 8
	 */
	private String serviceAmount;

	/** 
	* eee
	 */
	private String subOrderType;

	/** 
	* 浙江,杭徽高速
	 */
	private String trafficLocation;

	/** 
	* traffic_regulations
	 */
	private String trafficRegulations;

	public void setBankBillNo(String bankBillNo) {
		this.bankBillNo = bankBillNo;
	}
	public String getBankBillNo() {
		return this.bankBillNo;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getBillDate() {
		return this.billDate;
	}

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	public String getBillKey() {
		return this.billKey;
	}

	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}
	public String getChargeInst() {
		return this.chargeInst;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField() {
		return this.extendField;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile() {
		return this.mobile;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType() {
		return this.orderType;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerName() {
		return this.ownerName;
	}

	public void setPayAmount(List<String> payAmount) {
		this.payAmount = payAmount;
	}
	public List<String> getPayAmount() {
		return this.payAmount;
	}

	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}
	public String getServiceAmount() {
		return this.serviceAmount;
	}

	public void setSubOrderType(String subOrderType) {
		this.subOrderType = subOrderType;
	}
	public String getSubOrderType() {
		return this.subOrderType;
	}

	public void setTrafficLocation(String trafficLocation) {
		this.trafficLocation = trafficLocation;
	}
	public String getTrafficLocation() {
		return this.trafficLocation;
	}

	public void setTrafficRegulations(String trafficRegulations) {
		this.trafficRegulations = trafficRegulations;
	}
	public String getTrafficRegulations() {
		return this.trafficRegulations;
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
		return "alipay.ebpp.bill.add.teach";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("bank_bill_no", this.bankBillNo);
		txtParams.put("bill_date", this.billDate);
		txtParams.put("bill_key", this.billKey);
		txtParams.put("charge_inst", this.chargeInst);
		txtParams.put("extend_field", this.extendField);
		txtParams.put("merchant_order_no", this.merchantOrderNo);
		txtParams.put("mobile", this.mobile);
		txtParams.put("order_type", this.orderType);
		txtParams.put("owner_name", this.ownerName);
		txtParams.put("pay_amount", this.payAmount == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.payAmount, true));
		txtParams.put("service_amount", this.serviceAmount);
		txtParams.put("sub_order_type", this.subOrderType);
		txtParams.put("traffic_location", this.trafficLocation);
		txtParams.put("traffic_regulations", this.trafficRegulations);
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

	public Class<AlipayEbppBillAddTeachResponse> getResponseClass() {
		return AlipayEbppBillAddTeachResponse.class;
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

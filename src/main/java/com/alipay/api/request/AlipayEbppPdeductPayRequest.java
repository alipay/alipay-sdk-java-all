package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEbppPdeductPayResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.pay request
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 16:45:48
 */
public class AlipayEbppPdeductPayRequest implements AlipayRequest<AlipayEbppPdeductPayResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 渠道码，如用户通过机构通过服务窗进来签约则是PUBLICFORM，此值可随意传，只要不空就行
	 */
	private String agentChannel;

	/** 
	* 二级渠道码，预留字段
	 */
	private String agentCode;

	/** 
	* 支付宝代扣协议Id
	 */
	private String agreementId;

	/** 
	* 账期
	 */
	private String billDate;

	/** 
	* 户号，缴费单位用于标识每一户的唯一性的
	 */
	private String billKey;

	/** 
	* 扩展参数。必须以key value形式定义，
转为json为格式：{"key1":"value1","key2":"value2",
"key3":"value3","key4":"value4"}
 后端会直接转换为MAP对象，转换异常会报参数格式错误
	 */
	private String extendField;

	/** 
	* 滞纳金
	 */
	private String fineAmount;

	/** 
	* 备注信息
	 */
	private String memo;

	/** 
	* 商户外部业务流水号
	 */
	private String outOrderNo;

	/** 
	* 扣款金额，支付总金额，包含滞纳金
	 */
	private String payAmount;

	/** 
	* 商户PartnerId
	 */
	private String pid;

	/** 
	* 用户ID
	 */
	private String userId;

	public void setAgentChannel(String agentChannel) {
		this.agentChannel = agentChannel;
	}
	public String getAgentChannel() {
		return this.agentChannel;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId() {
		return this.agreementId;
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

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField() {
		return this.extendField;
	}

	public void setFineAmount(String fineAmount) {
		this.fineAmount = fineAmount;
	}
	public String getFineAmount() {
		return this.fineAmount;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount() {
		return this.payAmount;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid() {
		return this.pid;
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
		return "alipay.ebpp.pdeduct.pay";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("agent_channel", this.agentChannel);
		txtParams.put("agent_code", this.agentCode);
		txtParams.put("agreement_id", this.agreementId);
		txtParams.put("bill_date", this.billDate);
		txtParams.put("bill_key", this.billKey);
		txtParams.put("extend_field", this.extendField);
		txtParams.put("fine_amount", this.fineAmount);
		txtParams.put("memo", this.memo);
		txtParams.put("out_order_no", this.outOrderNo);
		txtParams.put("pay_amount", this.payAmount);
		txtParams.put("pid", this.pid);
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

	public Class<AlipayEbppPdeductPayResponse> getResponseClass() {
		return AlipayEbppPdeductPayResponse.class;
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

package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayEbppPdeductSignAddResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.sign.add request
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 07:27:40
 */
public class AlipayEbppPdeductSignAddRequest implements AlipayRequest<AlipayEbppPdeductSignAddResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 机构签约代扣来源渠道
PUBLICPLATFORM：服务窗
	 */
	private String agentChannel;

	/** 
	* 从服务窗发起则为publicId的值
	 */
	private String agentCode;

	/** 
	* 户号，机构针对于每户的水、电都会有唯一的标识户号
	 */
	private String billKey;

	/** 
	* 业务类型。枚举支持：
*JF：公共事业缴纳。
*WUYE：物业缴费。
*HK：信用卡还款。
*TX：通讯缴费。
*IND：保险缴费。
	 */
	private String bizType;

	/** 
	* 支付宝缴费系统中的出账机构ID
	 */
	private String chargeInst;

	/** 
	* 代扣产品码。 缴费业务场景中，传入INST_DIRECT_DEDUCT。保险业务场景中, 传入INSURANCE_MERCHANT_DEDUCT。
	 */
	private String deductProdCode;

	/** 
	* 签约类型可为空
	 */
	private String deductType;

	/** 
	* 外部用户实名认证相关信息, 用于做签约时的实名校验。 
注： 

name: 姓名
cert_type: 身份证：IDENTITY_CARD、护照：PASSPORT、军官证：OFFICER_CARD、士兵证：SOLDIER_CARD、户口本：HOKOU等
cert_no: 证件号码
need_check_info取值 T/F，只有为T时才做强制校验。
mobile:手机号，目前暂不使用此字段做校验
min_age: 允许的最小买家年龄,min_age为整数，必须大于等于0.
	 */
	private String extUserInfo;

	/** 
	* 扩展字段
	 */
	private String extendField;

	/** 
	* 通知方式设置，可为空
	 */
	private String notifyConfig;

	/** 
	* 用户UserId在应用AppId下的唯一用户标识
	 */
	private String openId;

	/** 
	* 外部产生的协议ID
	 */
	private String outAgreementId;

	/** 
	* 户名，户主真实姓名
	 */
	private String ownerName;

	/** 
	* 支付工具设置，目前可为空
	 */
	private String payConfig;

	/** 
	* 支付密码鉴权token，需要用户首先处于登陆态，然后访问https://ebppprod.alipay.com/deduct/enterMobileicPayPassword.htm?cb=自己指定的回跳连接地址，访问页面后会进到独立密码校验页，用户输入密码校验成功后，会生成token回调到指定的回跳地址，如果设置cb=www.alipay.com则最后回调的内容是www.alipay.com?token=312314ADFDSFAS，然后签约时直接取得地址后token的值即可。
	 */
	private String payPasswordToken;

	/** 
	* 商户id，商户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
	 */
	private String pid;

	/** 
	* 签约到期时间。空表示无限期，一期固定传空。
	 */
	private String signExpireDate;

	/** 
	* 业务子类型。业务子类型是业务类型的下一级概念。枚举支持：
*WATER：缴水费。
*ELECTRIC：缴电费。
*GAS：缴燃气费。
*COMMUN：缴固话宽带费。
*CATV：缴有线电视费。
*TRAFFIC：缴交通罚款。
*WUYE：缴物业费。
*RC：定期还车贷代扣。
*RH：定期还房贷代扣。
*RR：定期还房租代扣。
*RN：定期还网贷代扣。
*CZ：手机充值代扣。
*CAR：车险。
*LIFE：寿险。
*HEALTH：健康险。
例如：WATER表示JF下面的水费。
	 */
	private String subBizType;

	/** 
	* 用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
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

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	public String getBillKey() {
		return this.billKey;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType() {
		return this.bizType;
	}

	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}
	public String getChargeInst() {
		return this.chargeInst;
	}

	public void setDeductProdCode(String deductProdCode) {
		this.deductProdCode = deductProdCode;
	}
	public String getDeductProdCode() {
		return this.deductProdCode;
	}

	public void setDeductType(String deductType) {
		this.deductType = deductType;
	}
	public String getDeductType() {
		return this.deductType;
	}

	public void setExtUserInfo(String extUserInfo) {
		this.extUserInfo = extUserInfo;
	}
	public String getExtUserInfo() {
		return this.extUserInfo;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField() {
		return this.extendField;
	}

	public void setNotifyConfig(String notifyConfig) {
		this.notifyConfig = notifyConfig;
	}
	public String getNotifyConfig() {
		return this.notifyConfig;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId() {
		return this.openId;
	}

	public void setOutAgreementId(String outAgreementId) {
		this.outAgreementId = outAgreementId;
	}
	public String getOutAgreementId() {
		return this.outAgreementId;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerName() {
		return this.ownerName;
	}

	public void setPayConfig(String payConfig) {
		this.payConfig = payConfig;
	}
	public String getPayConfig() {
		return this.payConfig;
	}

	public void setPayPasswordToken(String payPasswordToken) {
		this.payPasswordToken = payPasswordToken;
	}
	public String getPayPasswordToken() {
		return this.payPasswordToken;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid() {
		return this.pid;
	}

	public void setSignExpireDate(String signExpireDate) {
		this.signExpireDate = signExpireDate;
	}
	public String getSignExpireDate() {
		return this.signExpireDate;
	}

	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}
	public String getSubBizType() {
		return this.subBizType;
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
		return "alipay.ebpp.pdeduct.sign.add";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("agent_channel", this.agentChannel);
		txtParams.put("agent_code", this.agentCode);
		txtParams.put("bill_key", this.billKey);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("charge_inst", this.chargeInst);
		txtParams.put("deduct_prod_code", this.deductProdCode);
		txtParams.put("deduct_type", this.deductType);
		txtParams.put("ext_user_info", this.extUserInfo);
		txtParams.put("extend_field", this.extendField);
		txtParams.put("notify_config", this.notifyConfig);
		txtParams.put("open_id", this.openId);
		txtParams.put("out_agreement_id", this.outAgreementId);
		txtParams.put("owner_name", this.ownerName);
		txtParams.put("pay_config", this.payConfig);
		txtParams.put("pay_password_token", this.payPasswordToken);
		txtParams.put("pid", this.pid);
		txtParams.put("sign_expire_date", this.signExpireDate);
		txtParams.put("sub_biz_type", this.subBizType);
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

	public Class<AlipayEbppPdeductSignAddResponse> getResponseClass() {
		return AlipayEbppPdeductSignAddResponse.class;
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

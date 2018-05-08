package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipaySecurityRiskDetectResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.security.risk.detect request
 * 
 * @author auto create
 * @since 1.0, 2016-03-04 14:55:25
 */
public class AlipaySecurityRiskDetectRequest implements AlipayRequest<AlipaySecurityRiskDetectResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 买家账户编号
	 */
	private String buyerAccountNo;

	/** 
	* 买家绑定银行卡号
	 */
	private String buyerBindBankcard;

	/** 
	* 买家绑定银行卡的卡类型
	 */
	private String buyerBindBankcardType;

	/** 
	* 买家绑定手机号
	 */
	private String buyerBindMobile;

	/** 
	* 买家账户在商家的等级，范围：VIP（高级买家）, NORMAL(普通买家）。为空默认NORMAL
	 */
	private String buyerGrade;

	/** 
	* 买家证件号码
	 */
	private String buyerIdentityNo;

	/** 
	* 买家证件类型
	 */
	private String buyerIdentityType;

	/** 
	* 买家真实姓名
	 */
	private String buyerRealName;

	/** 
	* 买家注册时间
	 */
	private String buyerRegDate;

	/** 
	* 买家注册时留的Email
	 */
	private String buyerRegEmail;

	/** 
	* 买家注册手机号
	 */
	private String buyerRegMobile;

	/** 
	* 买家业务处理时使用的银行卡号
	 */
	private String buyerSceneBankcard;

	/** 
	* 买家业务处理时使用的银行卡类型
	 */
	private String buyerSceneBankcardType;

	/** 
	* 买家业务处理时使用的邮箱
	 */
	private String buyerSceneEmail;

	/** 
	* 买家业务处理时使用的手机号
	 */
	private String buyerSceneMobile;

	/** 
	* 币种
	 */
	private String currency;

	/** 
	* 客户端的基带版本
	 */
	private String envClientBaseBand;

	/** 
	* 客户端连接的基站信息,格式为：CELLID^LAC
	 */
	private String envClientBaseStation;

	/** 
	* 客户端的经纬度坐标,格式为：精度^维度
	 */
	private String envClientCoordinates;

	/** 
	* 操作的客户端的imei
	 */
	private String envClientImei;

	/** 
	* 操作的客户端IMSI识别码
	 */
	private String envClientImsi;

	/** 
	* IOS设备的UDID
	 */
	private String envClientIosUdid;

	/** 
	* 操作的客户端ip
	 */
	private String envClientIp;

	/** 
	* 操作的客户端mac
	 */
	private String envClientMac;

	/** 
	* 操作的客户端分辨率，格式为：水平像素^垂直像素；如：800^600
	 */
	private String envClientScreen;

	/** 
	* 客户端设备的统一识别码UUID
	 */
	private String envClientUuid;

	/** 
	* 订单产品数量，购买产品的数量（不可为小数）
	 */
	private String itemQuantity;

	/** 
	* 订单产品单价，取值范围为[0.01,100000000.00]，精确到小数点后两位。 curren...
	 */
	private String itemUnitPrice;

	/** 
	* JS SDK生成的 tokenID
	 */
	private String jsTokenId;

	/** 
	* 订单总金额，取值范围为[0.01,100000000.00]，精确到小数点后两位。
	 */
	private String orderAmount;

	/** 
	* 订单商品所在类目
	 */
	private String orderCategory;

	/** 
	* 订单下单时间
	 */
	private String orderCredateTime;

	/** 
	* 订单商品所在城市
	 */
	private String orderItemCity;

	/** 
	* 订单产品名称
	 */
	private String orderItemName;

	/** 
	* 商户订单唯一标识号
	 */
	private String orderNo;

	/** 
	* 签约的支付宝账号对应的支付宝唯一用户号
	 */
	private String partnerId;

	/** 
	* 订单收货人地址
	 */
	private String receiverAddress;

	/** 
	* 订单收货人地址城市
	 */
	private String receiverCity;

	/** 
	* 订单收货人地址所在区
	 */
	private String receiverDistrict;

	/** 
	* 订单收货人邮箱
	 */
	private String receiverEmail;

	/** 
	* 订单收货人手机
	 */
	private String receiverMobile;

	/** 
	* 订单收货人姓名
	 */
	private String receiverName;

	/** 
	* 订单收货人地址省份
	 */
	private String receiverState;

	/** 
	* 订单收货人地址邮编
	 */
	private String receiverZip;

	/** 
	* 场景编码
	 */
	private String sceneCode;

	/** 
	* 卖家账户编号
	 */
	private String sellerAccountNo;

	/** 
	* 卖家绑定银行卡号
	 */
	private String sellerBindBankcard;

	/** 
	* 卖家绑定的银行卡的卡类型
	 */
	private String sellerBindBankcardType;

	/** 
	* 卖家绑定手机号
	 */
	private String sellerBindMobile;

	/** 
	* 卖家证件号码
	 */
	private String sellerIdentityNo;

	/** 
	* 卖家证件类型
	 */
	private String sellerIdentityType;

	/** 
	* 卖家真实姓名
	 */
	private String sellerRealName;

	/** 
	* 卖家注册时间,格式为：yyyy-MM-dd。
	 */
	private String sellerRegDate;

	/** 
	* 卖家注册Email
	 */
	private String sellerRegEmail;

	/** 
	* 卖家注册手机号
	 */
	private String sellerRegMoile;

	/** 
	* 订单物流方式
	 */
	private String transportType;

	public void setBuyerAccountNo(String buyerAccountNo) {
		this.buyerAccountNo = buyerAccountNo;
	}
	public String getBuyerAccountNo() {
		return this.buyerAccountNo;
	}

	public void setBuyerBindBankcard(String buyerBindBankcard) {
		this.buyerBindBankcard = buyerBindBankcard;
	}
	public String getBuyerBindBankcard() {
		return this.buyerBindBankcard;
	}

	public void setBuyerBindBankcardType(String buyerBindBankcardType) {
		this.buyerBindBankcardType = buyerBindBankcardType;
	}
	public String getBuyerBindBankcardType() {
		return this.buyerBindBankcardType;
	}

	public void setBuyerBindMobile(String buyerBindMobile) {
		this.buyerBindMobile = buyerBindMobile;
	}
	public String getBuyerBindMobile() {
		return this.buyerBindMobile;
	}

	public void setBuyerGrade(String buyerGrade) {
		this.buyerGrade = buyerGrade;
	}
	public String getBuyerGrade() {
		return this.buyerGrade;
	}

	public void setBuyerIdentityNo(String buyerIdentityNo) {
		this.buyerIdentityNo = buyerIdentityNo;
	}
	public String getBuyerIdentityNo() {
		return this.buyerIdentityNo;
	}

	public void setBuyerIdentityType(String buyerIdentityType) {
		this.buyerIdentityType = buyerIdentityType;
	}
	public String getBuyerIdentityType() {
		return this.buyerIdentityType;
	}

	public void setBuyerRealName(String buyerRealName) {
		this.buyerRealName = buyerRealName;
	}
	public String getBuyerRealName() {
		return this.buyerRealName;
	}

	public void setBuyerRegDate(String buyerRegDate) {
		this.buyerRegDate = buyerRegDate;
	}
	public String getBuyerRegDate() {
		return this.buyerRegDate;
	}

	public void setBuyerRegEmail(String buyerRegEmail) {
		this.buyerRegEmail = buyerRegEmail;
	}
	public String getBuyerRegEmail() {
		return this.buyerRegEmail;
	}

	public void setBuyerRegMobile(String buyerRegMobile) {
		this.buyerRegMobile = buyerRegMobile;
	}
	public String getBuyerRegMobile() {
		return this.buyerRegMobile;
	}

	public void setBuyerSceneBankcard(String buyerSceneBankcard) {
		this.buyerSceneBankcard = buyerSceneBankcard;
	}
	public String getBuyerSceneBankcard() {
		return this.buyerSceneBankcard;
	}

	public void setBuyerSceneBankcardType(String buyerSceneBankcardType) {
		this.buyerSceneBankcardType = buyerSceneBankcardType;
	}
	public String getBuyerSceneBankcardType() {
		return this.buyerSceneBankcardType;
	}

	public void setBuyerSceneEmail(String buyerSceneEmail) {
		this.buyerSceneEmail = buyerSceneEmail;
	}
	public String getBuyerSceneEmail() {
		return this.buyerSceneEmail;
	}

	public void setBuyerSceneMobile(String buyerSceneMobile) {
		this.buyerSceneMobile = buyerSceneMobile;
	}
	public String getBuyerSceneMobile() {
		return this.buyerSceneMobile;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency() {
		return this.currency;
	}

	public void setEnvClientBaseBand(String envClientBaseBand) {
		this.envClientBaseBand = envClientBaseBand;
	}
	public String getEnvClientBaseBand() {
		return this.envClientBaseBand;
	}

	public void setEnvClientBaseStation(String envClientBaseStation) {
		this.envClientBaseStation = envClientBaseStation;
	}
	public String getEnvClientBaseStation() {
		return this.envClientBaseStation;
	}

	public void setEnvClientCoordinates(String envClientCoordinates) {
		this.envClientCoordinates = envClientCoordinates;
	}
	public String getEnvClientCoordinates() {
		return this.envClientCoordinates;
	}

	public void setEnvClientImei(String envClientImei) {
		this.envClientImei = envClientImei;
	}
	public String getEnvClientImei() {
		return this.envClientImei;
	}

	public void setEnvClientImsi(String envClientImsi) {
		this.envClientImsi = envClientImsi;
	}
	public String getEnvClientImsi() {
		return this.envClientImsi;
	}

	public void setEnvClientIosUdid(String envClientIosUdid) {
		this.envClientIosUdid = envClientIosUdid;
	}
	public String getEnvClientIosUdid() {
		return this.envClientIosUdid;
	}

	public void setEnvClientIp(String envClientIp) {
		this.envClientIp = envClientIp;
	}
	public String getEnvClientIp() {
		return this.envClientIp;
	}

	public void setEnvClientMac(String envClientMac) {
		this.envClientMac = envClientMac;
	}
	public String getEnvClientMac() {
		return this.envClientMac;
	}

	public void setEnvClientScreen(String envClientScreen) {
		this.envClientScreen = envClientScreen;
	}
	public String getEnvClientScreen() {
		return this.envClientScreen;
	}

	public void setEnvClientUuid(String envClientUuid) {
		this.envClientUuid = envClientUuid;
	}
	public String getEnvClientUuid() {
		return this.envClientUuid;
	}

	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public String getItemQuantity() {
		return this.itemQuantity;
	}

	public void setItemUnitPrice(String itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}
	public String getItemUnitPrice() {
		return this.itemUnitPrice;
	}

	public void setJsTokenId(String jsTokenId) {
		this.jsTokenId = jsTokenId;
	}
	public String getJsTokenId() {
		return this.jsTokenId;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderAmount() {
		return this.orderAmount;
	}

	public void setOrderCategory(String orderCategory) {
		this.orderCategory = orderCategory;
	}
	public String getOrderCategory() {
		return this.orderCategory;
	}

	public void setOrderCredateTime(String orderCredateTime) {
		this.orderCredateTime = orderCredateTime;
	}
	public String getOrderCredateTime() {
		return this.orderCredateTime;
	}

	public void setOrderItemCity(String orderItemCity) {
		this.orderItemCity = orderItemCity;
	}
	public String getOrderItemCity() {
		return this.orderItemCity;
	}

	public void setOrderItemName(String orderItemName) {
		this.orderItemName = orderItemName;
	}
	public String getOrderItemName() {
		return this.orderItemName;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo() {
		return this.orderNo;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId() {
		return this.partnerId;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getReceiverAddress() {
		return this.receiverAddress;
	}

	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}
	public String getReceiverCity() {
		return this.receiverCity;
	}

	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}
	public String getReceiverDistrict() {
		return this.receiverDistrict;
	}

	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}
	public String getReceiverEmail() {
		return this.receiverEmail;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}
	public String getReceiverMobile() {
		return this.receiverMobile;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}
	public String getReceiverState() {
		return this.receiverState;
	}

	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}
	public String getReceiverZip() {
		return this.receiverZip;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode() {
		return this.sceneCode;
	}

	public void setSellerAccountNo(String sellerAccountNo) {
		this.sellerAccountNo = sellerAccountNo;
	}
	public String getSellerAccountNo() {
		return this.sellerAccountNo;
	}

	public void setSellerBindBankcard(String sellerBindBankcard) {
		this.sellerBindBankcard = sellerBindBankcard;
	}
	public String getSellerBindBankcard() {
		return this.sellerBindBankcard;
	}

	public void setSellerBindBankcardType(String sellerBindBankcardType) {
		this.sellerBindBankcardType = sellerBindBankcardType;
	}
	public String getSellerBindBankcardType() {
		return this.sellerBindBankcardType;
	}

	public void setSellerBindMobile(String sellerBindMobile) {
		this.sellerBindMobile = sellerBindMobile;
	}
	public String getSellerBindMobile() {
		return this.sellerBindMobile;
	}

	public void setSellerIdentityNo(String sellerIdentityNo) {
		this.sellerIdentityNo = sellerIdentityNo;
	}
	public String getSellerIdentityNo() {
		return this.sellerIdentityNo;
	}

	public void setSellerIdentityType(String sellerIdentityType) {
		this.sellerIdentityType = sellerIdentityType;
	}
	public String getSellerIdentityType() {
		return this.sellerIdentityType;
	}

	public void setSellerRealName(String sellerRealName) {
		this.sellerRealName = sellerRealName;
	}
	public String getSellerRealName() {
		return this.sellerRealName;
	}

	public void setSellerRegDate(String sellerRegDate) {
		this.sellerRegDate = sellerRegDate;
	}
	public String getSellerRegDate() {
		return this.sellerRegDate;
	}

	public void setSellerRegEmail(String sellerRegEmail) {
		this.sellerRegEmail = sellerRegEmail;
	}
	public String getSellerRegEmail() {
		return this.sellerRegEmail;
	}

	public void setSellerRegMoile(String sellerRegMoile) {
		this.sellerRegMoile = sellerRegMoile;
	}
	public String getSellerRegMoile() {
		return this.sellerRegMoile;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}
	public String getTransportType() {
		return this.transportType;
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
		return "alipay.security.risk.detect";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("buyer_account_no", this.buyerAccountNo);
		txtParams.put("buyer_bind_bankcard", this.buyerBindBankcard);
		txtParams.put("buyer_bind_bankcard_type", this.buyerBindBankcardType);
		txtParams.put("buyer_bind_mobile", this.buyerBindMobile);
		txtParams.put("buyer_grade", this.buyerGrade);
		txtParams.put("buyer_identity_no", this.buyerIdentityNo);
		txtParams.put("buyer_identity_type", this.buyerIdentityType);
		txtParams.put("buyer_real_name", this.buyerRealName);
		txtParams.put("buyer_reg_date", this.buyerRegDate);
		txtParams.put("buyer_reg_email", this.buyerRegEmail);
		txtParams.put("buyer_reg_mobile", this.buyerRegMobile);
		txtParams.put("buyer_scene_bankcard", this.buyerSceneBankcard);
		txtParams.put("buyer_scene_bankcard_type", this.buyerSceneBankcardType);
		txtParams.put("buyer_scene_email", this.buyerSceneEmail);
		txtParams.put("buyer_scene_mobile", this.buyerSceneMobile);
		txtParams.put("currency", this.currency);
		txtParams.put("env_client_base_band", this.envClientBaseBand);
		txtParams.put("env_client_base_station", this.envClientBaseStation);
		txtParams.put("env_client_coordinates", this.envClientCoordinates);
		txtParams.put("env_client_imei", this.envClientImei);
		txtParams.put("env_client_imsi", this.envClientImsi);
		txtParams.put("env_client_ios_udid", this.envClientIosUdid);
		txtParams.put("env_client_ip", this.envClientIp);
		txtParams.put("env_client_mac", this.envClientMac);
		txtParams.put("env_client_screen", this.envClientScreen);
		txtParams.put("env_client_uuid", this.envClientUuid);
		txtParams.put("item_quantity", this.itemQuantity);
		txtParams.put("item_unit_price", this.itemUnitPrice);
		txtParams.put("js_token_id", this.jsTokenId);
		txtParams.put("order_amount", this.orderAmount);
		txtParams.put("order_category", this.orderCategory);
		txtParams.put("order_credate_time", this.orderCredateTime);
		txtParams.put("order_item_city", this.orderItemCity);
		txtParams.put("order_item_name", this.orderItemName);
		txtParams.put("order_no", this.orderNo);
		txtParams.put("partner_id", this.partnerId);
		txtParams.put("receiver_address", this.receiverAddress);
		txtParams.put("receiver_city", this.receiverCity);
		txtParams.put("receiver_district", this.receiverDistrict);
		txtParams.put("receiver_email", this.receiverEmail);
		txtParams.put("receiver_mobile", this.receiverMobile);
		txtParams.put("receiver_name", this.receiverName);
		txtParams.put("receiver_state", this.receiverState);
		txtParams.put("receiver_zip", this.receiverZip);
		txtParams.put("scene_code", this.sceneCode);
		txtParams.put("seller_account_no", this.sellerAccountNo);
		txtParams.put("seller_bind_bankcard", this.sellerBindBankcard);
		txtParams.put("seller_bind_bankcard_type", this.sellerBindBankcardType);
		txtParams.put("seller_bind_mobile", this.sellerBindMobile);
		txtParams.put("seller_identity_no", this.sellerIdentityNo);
		txtParams.put("seller_identity_type", this.sellerIdentityType);
		txtParams.put("seller_real_name", this.sellerRealName);
		txtParams.put("seller_reg_date", this.sellerRegDate);
		txtParams.put("seller_reg_email", this.sellerRegEmail);
		txtParams.put("seller_reg_moile", this.sellerRegMoile);
		txtParams.put("transport_type", this.transportType);
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

	public Class<AlipaySecurityRiskDetectResponse> getResponseClass() {
		return AlipaySecurityRiskDetectResponse.class;
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

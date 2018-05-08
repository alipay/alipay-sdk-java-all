package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayAcquirePrecreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.acquire.precreate request
 * 
 * @author auto create
 * @since 1.0, 2014-05-28 11:57:10
 */
public class AlipayAcquirePrecreateRequest implements AlipayRequest<AlipayAcquirePrecreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body
	 */
	private String body;

	/** 
	* 描述多渠道收单的渠道明细信息，json格式
	 */
	private String channelParameters;

	/** 
	* 订单金额币种。目前只支持传入156（人民币）。
如果为空，则默认设置为156
	 */
	private String currency;

	/** 
	* 公用业务扩展信息。用于商户的特定业务信息的传递，只有商户与支付宝约定了传递此参数且约定了参数含义，此参数才有效。
比如可传递二维码支付场景下的门店ID等信息，以json格式传输。
	 */
	private String extendParams;

	/** 
	* 描述商品明细信息，json格式。
	 */
	private String goodsDetail;

	/** 
	* 订单支付超时时间。设置未付款交易的超时时间，一旦超时，该笔交易就会自动被关闭。
取值范围：1m～15d。
m-分钟，h-小时，d-天，1c-当天（无论交易何时创建，都在0点关闭）。
该参数数值不接受小数点，如1.5h，可转换为90m。
该功能需要联系支付宝配置关闭时间。
	 */
	private String itBPay;

	/** 
	* 操作员的类型：
0：支付宝操作员
1：商户的操作员
如果传入其它值或者为空，则默认设置为1
	 */
	private String operatorCode;

	/** 
	* 卖家的操作员ID
	 */
	private String operatorId;

	/** 
	* 支付宝合作商户网站唯一订单号
	 */
	private String outTradeNo;

	/** 
	* 订单中商品的单价。
如果请求时传入本参数，则必须满足total_fee=price×quantity的条件
	 */
	private String price;

	/** 
	* 订单中商品的数量。
如果请求时传入本参数，则必须满足total_fee=price×quantity的条件
	 */
	private String quantity;

	/** 
	* 分账信息。
描述分账明细信息，json格式
	 */
	private String royaltyParameters;

	/** 
	* 分账类型。卖家的分账类型，目前只支持传入ROYALTY（普通分账类型）
	 */
	private String royaltyType;

	/** 
	* 卖家支付宝账号，可以为email或者手机号。如果seller_id不为空，则以seller_id的值作为卖家账号，忽略本参数
	 */
	private String sellerEmail;

	/** 
	* 卖家支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字。如果和seller_email同时为空，则本参数默认填充partner的值
	 */
	private String sellerId;

	/** 
	* 收银台页面上，商品展示的超链接
	 */
	private String showUrl;

	/** 
	* 商品购买
	 */
	private String subject;

	/** 
	* 订单金额。该笔订单的资金总额，取值范围[0.01,100000000]，精确到小数点后2位。
	 */
	private String totalFee;

	public void setBody(String body) {
		this.body = body;
	}
	public String getBody() {
		return this.body;
	}

	public void setChannelParameters(String channelParameters) {
		this.channelParameters = channelParameters;
	}
	public String getChannelParameters() {
		return this.channelParameters;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency() {
		return this.currency;
	}

	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}
	public String getExtendParams() {
		return this.extendParams;
	}

	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}
	public String getGoodsDetail() {
		return this.goodsDetail;
	}

	public void setItBPay(String itBPay) {
		this.itBPay = itBPay;
	}
	public String getItBPay() {
		return this.itBPay;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}
	public String getOperatorCode() {
		return this.operatorCode;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo() {
		return this.outTradeNo;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public String getPrice() {
		return this.price;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getQuantity() {
		return this.quantity;
	}

	public void setRoyaltyParameters(String royaltyParameters) {
		this.royaltyParameters = royaltyParameters;
	}
	public String getRoyaltyParameters() {
		return this.royaltyParameters;
	}

	public void setRoyaltyType(String royaltyType) {
		this.royaltyType = royaltyType;
	}
	public String getRoyaltyType() {
		return this.royaltyType;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	public String getSellerEmail() {
		return this.sellerEmail;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerId() {
		return this.sellerId;
	}

	public void setShowUrl(String showUrl) {
		this.showUrl = showUrl;
	}
	public String getShowUrl() {
		return this.showUrl;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return this.subject;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}
	public String getTotalFee() {
		return this.totalFee;
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
		return "alipay.acquire.precreate";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("body", this.body);
		txtParams.put("channel_parameters", this.channelParameters);
		txtParams.put("currency", this.currency);
		txtParams.put("extend_params", this.extendParams);
		txtParams.put("goods_detail", this.goodsDetail);
		txtParams.put("it_b_pay", this.itBPay);
		txtParams.put("operator_code", this.operatorCode);
		txtParams.put("operator_id", this.operatorId);
		txtParams.put("out_trade_no", this.outTradeNo);
		txtParams.put("price", this.price);
		txtParams.put("quantity", this.quantity);
		txtParams.put("royalty_parameters", this.royaltyParameters);
		txtParams.put("royalty_type", this.royaltyType);
		txtParams.put("seller_email", this.sellerEmail);
		txtParams.put("seller_id", this.sellerId);
		txtParams.put("show_url", this.showUrl);
		txtParams.put("subject", this.subject);
		txtParams.put("total_fee", this.totalFee);
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

	public Class<AlipayAcquirePrecreateResponse> getResponseClass() {
		return AlipayAcquirePrecreateResponse.class;
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

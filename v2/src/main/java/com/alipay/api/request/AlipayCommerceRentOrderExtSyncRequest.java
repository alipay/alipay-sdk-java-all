package com.alipay.api.request;

import java.util.List;
import com.alipay.api.domain.SellerSyncRentBuyerExtInfo;
import com.alipay.api.domain.SellerSyncRentDeliveryExtInfo;
import com.alipay.api.domain.SellerSyncRentFinancingExtInfo;
import com.alipay.api.domain.RentHistoricalAssetFinancingExtInfoDTO;
import com.alipay.api.domain.SellerSyncRentItemExtInfo;
import com.alipay.api.domain.SellerSyncRentOrderExtInfo;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCommerceRentOrderExtSyncResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.commerce.rent.order.ext.sync request
 * 
 * @author auto create
 * @since 1.0, 2025-08-11 11:18:17
 */
public class AlipayCommerceRentOrderExtSyncRequest implements AlipayUploadRequest<AlipayCommerceRentOrderExtSyncResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 买家的身份证反面照片
	 */
	private FileItem buyerCertBackPic;

	/** 
	* 买家的身份证正面照片
	 */
	private FileItem buyerCertFrontPic;

	/** 
	* 买家扩展信息
	 */
	private SellerSyncRentBuyerExtInfo buyerExtInfo;

	/** 
	* 买家支付宝用户ID
	 */
	private String buyerId;

	/** 
	* 买家的活体检测照片
	 */
	private FileItem buyerLivePic;

	/** 
	* 买家支付宝OPENID
	 */
	private String buyerOpenId;

	/** 
	* 物流扩展信息
	 */
	private SellerSyncRentDeliveryExtInfo deliveryExtInfo;

	/** 
	* 收货确认图片
	 */
	private FileItem deliveryReceivedPic;

	/** 
	* null
	 */
	private List<SellerSyncRentFinancingExtInfo> financingExtInfo;

	/** 
	* 租赁协议
	 */
	private FileItem financingRentProtocol;

	/** 
	* 历史资产融资扩展信息
	 */
	private RentHistoricalAssetFinancingExtInfoDTO historicalAssetFinancingExtInfo;

	/** 
	* 商品扩展信息
	 */
	private SellerSyncRentItemExtInfo itemExtInfo;

	/** 
	* 订单扩展信息
	 */
	private SellerSyncRentOrderExtInfo orderExtInfo;

	/** 
	* 交易组件订单Id，取值：租赁下单接口返回的orderId
	 */
	private String orderId;

	/** 
	* 外部业务单号，取值：业务方自己的单据号
	 */
	private String outBizId;

	/** 
	* 同步场景(枚举值)
	 */
	private String syncScene;

	public void setBuyerCertBackPic(FileItem buyerCertBackPic) {
		this.buyerCertBackPic = buyerCertBackPic;
	}
	public FileItem getBuyerCertBackPic() {
		return this.buyerCertBackPic;
	}

	public void setBuyerCertFrontPic(FileItem buyerCertFrontPic) {
		this.buyerCertFrontPic = buyerCertFrontPic;
	}
	public FileItem getBuyerCertFrontPic() {
		return this.buyerCertFrontPic;
	}

	public void setBuyerExtInfo(SellerSyncRentBuyerExtInfo buyerExtInfo) {
		this.buyerExtInfo = buyerExtInfo;
	}
	public SellerSyncRentBuyerExtInfo getBuyerExtInfo() {
		return this.buyerExtInfo;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId() {
		return this.buyerId;
	}

	public void setBuyerLivePic(FileItem buyerLivePic) {
		this.buyerLivePic = buyerLivePic;
	}
	public FileItem getBuyerLivePic() {
		return this.buyerLivePic;
	}

	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}
	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}

	public void setDeliveryExtInfo(SellerSyncRentDeliveryExtInfo deliveryExtInfo) {
		this.deliveryExtInfo = deliveryExtInfo;
	}
	public SellerSyncRentDeliveryExtInfo getDeliveryExtInfo() {
		return this.deliveryExtInfo;
	}

	public void setDeliveryReceivedPic(FileItem deliveryReceivedPic) {
		this.deliveryReceivedPic = deliveryReceivedPic;
	}
	public FileItem getDeliveryReceivedPic() {
		return this.deliveryReceivedPic;
	}

	public void setFinancingExtInfo(List<SellerSyncRentFinancingExtInfo> financingExtInfo) {
		this.financingExtInfo = financingExtInfo;
	}
	public List<SellerSyncRentFinancingExtInfo> getFinancingExtInfo() {
		return this.financingExtInfo;
	}

	public void setFinancingRentProtocol(FileItem financingRentProtocol) {
		this.financingRentProtocol = financingRentProtocol;
	}
	public FileItem getFinancingRentProtocol() {
		return this.financingRentProtocol;
	}

	public void setHistoricalAssetFinancingExtInfo(RentHistoricalAssetFinancingExtInfoDTO historicalAssetFinancingExtInfo) {
		this.historicalAssetFinancingExtInfo = historicalAssetFinancingExtInfo;
	}
	public RentHistoricalAssetFinancingExtInfoDTO getHistoricalAssetFinancingExtInfo() {
		return this.historicalAssetFinancingExtInfo;
	}

	public void setItemExtInfo(SellerSyncRentItemExtInfo itemExtInfo) {
		this.itemExtInfo = itemExtInfo;
	}
	public SellerSyncRentItemExtInfo getItemExtInfo() {
		return this.itemExtInfo;
	}

	public void setOrderExtInfo(SellerSyncRentOrderExtInfo orderExtInfo) {
		this.orderExtInfo = orderExtInfo;
	}
	public SellerSyncRentOrderExtInfo getOrderExtInfo() {
		return this.orderExtInfo;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId() {
		return this.orderId;
	}

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}
	public String getOutBizId() {
		return this.outBizId;
	}

	public void setSyncScene(String syncScene) {
		this.syncScene = syncScene;
	}
	public String getSyncScene() {
		return this.syncScene;
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
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.commerce.rent.order.ext.sync";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("buyer_ext_info", this.buyerExtInfo == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.buyerExtInfo, true));
		txtParams.put("buyer_id", this.buyerId);
		txtParams.put("buyer_open_id", this.buyerOpenId);
		txtParams.put("delivery_ext_info", this.deliveryExtInfo == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.deliveryExtInfo, true));
		txtParams.put("financing_ext_info", this.financingExtInfo == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.financingExtInfo, true));
		txtParams.put("historical_asset_financing_ext_info", this.historicalAssetFinancingExtInfo == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.historicalAssetFinancingExtInfo, true));
		txtParams.put("item_ext_info", this.itemExtInfo == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.itemExtInfo, true));
		txtParams.put("order_ext_info", this.orderExtInfo == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.orderExtInfo, true));
		txtParams.put("order_id", this.orderId);
		txtParams.put("out_biz_id", this.outBizId);
		txtParams.put("sync_scene", this.syncScene);
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

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("buyer_cert_back_pic", this.buyerCertBackPic);
		params.put("buyer_cert_front_pic", this.buyerCertFrontPic);
		params.put("buyer_live_pic", this.buyerLivePic);
		params.put("delivery_received_pic", this.deliveryReceivedPic);
		params.put("financing_rent_protocol", this.financingRentProtocol);
		return params;
	}

	public Class<AlipayCommerceRentOrderExtSyncResponse> getResponseClass() {
		return AlipayCommerceRentOrderExtSyncResponse.class;
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

package com.alipay.api.request;

import com.alipay.api.domain.BelongMerchantInfo;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMarketingMaterialImageUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.marketing.material.image.upload request
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:04
 */
public class AlipayMarketingMaterialImageUploadRequest implements AlipayUploadRequest<AlipayMarketingMaterialImageUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 服务商代商户创建投放必选
bussinessType设置为ISV_FOR_MERCHANT。
	 */
	private BelongMerchantInfo belongMerchantInfo;

	/** 
	* 图片的byte字节数组。图片大小限制为2M
	 */
	private FileItem fileContent;

	/** 
	* 文件业务标识。

枚举值
alipay.marketing.activity.delivery.create接口中
delivery_base_info.delivery_material.delivery_single_material.delivery_image
当delivery_booth_code=PUBLIC_UNION，上传图片接口需指定file_key=PUBLIC_UNION_CHANNEL_PIC。上传图片尺寸600*600，支持格式：png、jpg、jpeg、bmp，大小不超过200kb；
当delivery_booth_code=PAYMENT_RESULT，上传图片接口需指定file_key=DELIVERY_CHANNEL_PIC。上传图片尺寸600*600，支持格式：png、jpg、jpeg、bmp，大小不超过200kb。
上传图片更多要求参考文档： https://render.alipay.com/p/c/18tpirlg12e8?operateFrom=BALIPAY

alipay.marketing.activity.ordervoucher.create接口中
voucher_display_info.brand_logo字段,file_key=PROMO_BRAND_LOGO，上传图片尺寸600*600，支持格式：png、jpg、jpeg、bmp，大小不超过2MB
voucher_display_info.voucher_image字段,file_key=PROMO_VOUCHER_IMAGE,上传图片尺寸600*600，支持格式：png、jpg、jpeg、bmp，大小不超过2MB
	 */
	private String fileKey;

	/** 
	* 商户接入模式
	 */
	private String merchantAccessMode;

	public void setBelongMerchantInfo(BelongMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}
	public BelongMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}
	public String getFileKey() {
		return this.fileKey;
	}

	public void setMerchantAccessMode(String merchantAccessMode) {
		this.merchantAccessMode = merchantAccessMode;
	}
	public String getMerchantAccessMode() {
		return this.merchantAccessMode;
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
		return "alipay.marketing.material.image.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("belong_merchant_info", this.belongMerchantInfo == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.belongMerchantInfo, true));
		txtParams.put("file_key", this.fileKey);
		txtParams.put("merchant_access_mode", this.merchantAccessMode);
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
		params.put("file_content", this.fileContent);
		return params;
	}

	public Class<AlipayMarketingMaterialImageUploadResponse> getResponseClass() {
		return AlipayMarketingMaterialImageUploadResponse.class;
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

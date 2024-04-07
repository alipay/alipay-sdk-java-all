package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenSpMerchantInconsistentApproveResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.sp.merchant.inconsistent.approve request
 * 
 * @author auto create
 * @since 1.0, 2024-03-07 10:56:59
 */
public class AlipayOpenSpMerchantInconsistentApproveRequest implements AlipayRequest<AlipayOpenSpMerchantInconsistentApproveResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 身份证背面照，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href="https://opendocs.alipay.com/apis/01ea4t">alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。
	 */
	private String backCard;

	/** 
	* 实际经营人承诺函照片，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href="https://opendocs.alipay.com/apis/01ea4t">alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。 该资质是否必传请参见报名资质要求。
	 */
	private String commitmentLetter;

	/** 
	* 身份证正面照，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式. 请传<a href="https://opendocs.alipay.com/apis/01ea4t">alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。
	 */
	private String frontCard;

	/** 
	* 手持营业执照合照，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href="https://opendocs.alipay.com/apis/01ea4t">alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。 该资质是否必传请参见报名资质要求。
	 */
	private String handheldBusinessLicense;

	/** 
	* 手持身份证合照，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href="https://opendocs.alipay.com/apis/01ea4t">alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。 该资质是否必传请参见报名资质要求。
	 */
	private String handheldCard;

	/** 
	* 服务优选商品编码
	 */
	private String itemCode;

	/** 
	* 商家pid
	 */
	private String merchantPid;

	/** 
	* 商家小程序appId
	 */
	private String miniAppid;

	/** 
	* 外部业务号，需不重复
	 */
	private String outBizNo;

	/** 
	* 推广服务商(S2)pid
	 */
	private String promotorPid;

	public void setBackCard(String backCard) {
		this.backCard = backCard;
	}
	public String getBackCard() {
		return this.backCard;
	}

	public void setCommitmentLetter(String commitmentLetter) {
		this.commitmentLetter = commitmentLetter;
	}
	public String getCommitmentLetter() {
		return this.commitmentLetter;
	}

	public void setFrontCard(String frontCard) {
		this.frontCard = frontCard;
	}
	public String getFrontCard() {
		return this.frontCard;
	}

	public void setHandheldBusinessLicense(String handheldBusinessLicense) {
		this.handheldBusinessLicense = handheldBusinessLicense;
	}
	public String getHandheldBusinessLicense() {
		return this.handheldBusinessLicense;
	}

	public void setHandheldCard(String handheldCard) {
		this.handheldCard = handheldCard;
	}
	public String getHandheldCard() {
		return this.handheldCard;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemCode() {
		return this.itemCode;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid() {
		return this.merchantPid;
	}

	public void setMiniAppid(String miniAppid) {
		this.miniAppid = miniAppid;
	}
	public String getMiniAppid() {
		return this.miniAppid;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setPromotorPid(String promotorPid) {
		this.promotorPid = promotorPid;
	}
	public String getPromotorPid() {
		return this.promotorPid;
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
		return "alipay.open.sp.merchant.inconsistent.approve";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("back_card", this.backCard);
		txtParams.put("commitment_letter", this.commitmentLetter);
		txtParams.put("front_card", this.frontCard);
		txtParams.put("handheld_business_license", this.handheldBusinessLicense);
		txtParams.put("handheld_card", this.handheldCard);
		txtParams.put("item_code", this.itemCode);
		txtParams.put("merchant_pid", this.merchantPid);
		txtParams.put("mini_appid", this.miniAppid);
		txtParams.put("out_biz_no", this.outBizNo);
		txtParams.put("promotor_pid", this.promotorPid);
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

	public Class<AlipayOpenSpMerchantInconsistentApproveResponse> getResponseClass() {
		return AlipayOpenSpMerchantInconsistentApproveResponse.class;
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

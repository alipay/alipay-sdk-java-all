package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayFundMbpcardFileUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.fund.mbpcard.file.upload request
 * 
 * @author auto create
 * @since 1.0, 2024-02-01 16:31:58
 */
public class AlipayFundMbpcardFileUploadRequest implements AlipayUploadRequest<AlipayFundMbpcardFileUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务场景，对应不同配置
	 */
	private String bizScene;

	/** 
	* 二进制字节流，最大为10M
	 */
	private FileItem imageContent;

	/** 
	* 待识别的图片标签，不传不做OCR识别
ELEC_ADD_TAX_SIMPLE : 增值税普票-电子版
PAPER_ADD_TAX_SIMPLE：增值税普票-纸质版
PAPER_QUOTA：手撕定额发票
	 */
	private String imageOcrTag;

	/** 
	* 文件类型，支持格式：bmp、jpg、jpeg、png、gif、pdf
	 */
	private String imageType;

	/** 
	* 产品码，业务特征属性
	 */
	private String productCode;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene() {
		return this.bizScene;
	}

	public void setImageContent(FileItem imageContent) {
		this.imageContent = imageContent;
	}
	public FileItem getImageContent() {
		return this.imageContent;
	}

	public void setImageOcrTag(String imageOcrTag) {
		this.imageOcrTag = imageOcrTag;
	}
	public String getImageOcrTag() {
		return this.imageOcrTag;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getImageType() {
		return this.imageType;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode() {
		return this.productCode;
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
		return "alipay.fund.mbpcard.file.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_scene", this.bizScene);
		txtParams.put("image_ocr_tag", this.imageOcrTag);
		txtParams.put("image_type", this.imageType);
		txtParams.put("product_code", this.productCode);
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
		params.put("image_content", this.imageContent);
		return params;
	}

	public Class<AlipayFundMbpcardFileUploadResponse> getResponseClass() {
		return AlipayFundMbpcardFileUploadResponse.class;
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

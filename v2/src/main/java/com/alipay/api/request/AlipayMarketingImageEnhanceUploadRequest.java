package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMarketingImageEnhanceUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.marketing.image.enhance.upload request
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 09:41:57
 */
public class AlipayMarketingImageEnhanceUploadRequest implements AlipayUploadRequest<AlipayMarketingImageEnhanceUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 图片的byte字节数组。图片大小限制为2M。支持格式如下：png、jpg、jpeg、bmp、webp。
	 */
	private FileItem imageContent;

	/** 
	* 图片归属图空间目录id。不填时，默认归属到图空间根目录；填写时会保存到图片空间的目录id下；当图片需要保存到根目录下时传"0"。
	 */
	private String imageDirectoryId;

	/** 
	* 素材字段。本接口必须为图片类型的素材字段。
	 */
	private String materialField;

	/** 
	* 素材规范ID，用于标识具体场景下的素材规范，根据具体的使用场景获取对应的素材规范ID。
	 */
	private String materialSpecId;

	/** 
	* 表示是否需要优化图片。若选择需要优化图片，系统会根据原图进行优化，再根据素材规范校验；若选择不需要优化图片，系统对原图直接校验。校验通过则上传成功，校验不通过会返回具体错误原因。
	 */
	private Boolean needEnhance;

	/** 
	* 图片上传场景，分为默认素材规范场景和介质图片场景。
	 */
	private String uploadScene;

	public void setImageContent(FileItem imageContent) {
		this.imageContent = imageContent;
	}
	public FileItem getImageContent() {
		return this.imageContent;
	}

	public void setImageDirectoryId(String imageDirectoryId) {
		this.imageDirectoryId = imageDirectoryId;
	}
	public String getImageDirectoryId() {
		return this.imageDirectoryId;
	}

	public void setMaterialField(String materialField) {
		this.materialField = materialField;
	}
	public String getMaterialField() {
		return this.materialField;
	}

	public void setMaterialSpecId(String materialSpecId) {
		this.materialSpecId = materialSpecId;
	}
	public String getMaterialSpecId() {
		return this.materialSpecId;
	}

	public void setNeedEnhance(Boolean needEnhance) {
		this.needEnhance = needEnhance;
	}
	public Boolean getNeedEnhance() {
		return this.needEnhance;
	}

	public void setUploadScene(String uploadScene) {
		this.uploadScene = uploadScene;
	}
	public String getUploadScene() {
		return this.uploadScene;
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
		return "alipay.marketing.image.enhance.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("image_directory_id", this.imageDirectoryId);
		txtParams.put("material_field", this.materialField);
		txtParams.put("material_spec_id", this.materialSpecId);
		txtParams.put("need_enhance", this.needEnhance);
		txtParams.put("upload_scene", this.uploadScene);
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

	public Class<AlipayMarketingImageEnhanceUploadResponse> getResponseClass() {
		return AlipayMarketingImageEnhanceUploadResponse.class;
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

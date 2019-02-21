package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenMiniPoiCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.mini.poi.create request
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenMiniPoiCreateRequest implements AlipayUploadRequest<AlipayOpenMiniPoiCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 经营资质号
	 */
	private String certificate;

	/** 
	* 营业执照，同主体可以不传,最多5张，单张不能超过2M
	 */
	private FileItem fifthRelatedMaterial;

	/** 
	* 营业执照，同主体可以不传,最多5张，单张不能超过2M
	 */
	private FileItem firstRelatedMaterial;

	/** 
	* 营业执照，同主体可以不传,最多5张，单张不能超过2M
	 */
	private FileItem fourthRelatedMaterial;

	/** 
	* POI的具体地址信息，建议按照：省市区县街道门牌号的顺序精确描述地址
	 */
	private String poiAddress;

	/** 
	* 相关主体名称，需要与经营材料上的名称保持一致.若地点的相关资质与小程序账号主体一致，则不用填写
	 */
	private String relatedName;

	/** 
	* 营业执照，同主体可以不传,最多5张，单张不能超过2M
	 */
	private FileItem secondRelatedMaterial;

	/** 
	* 营业执照，同主体可以不传,最多5张，单张不能超过2M
	 */
	private FileItem thirdRelatedMaterial;

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public String getCertificate() {
		return this.certificate;
	}

	public void setFifthRelatedMaterial(FileItem fifthRelatedMaterial) {
		this.fifthRelatedMaterial = fifthRelatedMaterial;
	}
	public FileItem getFifthRelatedMaterial() {
		return this.fifthRelatedMaterial;
	}

	public void setFirstRelatedMaterial(FileItem firstRelatedMaterial) {
		this.firstRelatedMaterial = firstRelatedMaterial;
	}
	public FileItem getFirstRelatedMaterial() {
		return this.firstRelatedMaterial;
	}

	public void setFourthRelatedMaterial(FileItem fourthRelatedMaterial) {
		this.fourthRelatedMaterial = fourthRelatedMaterial;
	}
	public FileItem getFourthRelatedMaterial() {
		return this.fourthRelatedMaterial;
	}

	public void setPoiAddress(String poiAddress) {
		this.poiAddress = poiAddress;
	}
	public String getPoiAddress() {
		return this.poiAddress;
	}

	public void setRelatedName(String relatedName) {
		this.relatedName = relatedName;
	}
	public String getRelatedName() {
		return this.relatedName;
	}

	public void setSecondRelatedMaterial(FileItem secondRelatedMaterial) {
		this.secondRelatedMaterial = secondRelatedMaterial;
	}
	public FileItem getSecondRelatedMaterial() {
		return this.secondRelatedMaterial;
	}

	public void setThirdRelatedMaterial(FileItem thirdRelatedMaterial) {
		this.thirdRelatedMaterial = thirdRelatedMaterial;
	}
	public FileItem getThirdRelatedMaterial() {
		return this.thirdRelatedMaterial;
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
		return "alipay.open.mini.poi.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("certificate", this.certificate);
		txtParams.put("poi_address", this.poiAddress);
		txtParams.put("related_name", this.relatedName);
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
		params.put("fifth_related_material", this.fifthRelatedMaterial);
		params.put("first_related_material", this.firstRelatedMaterial);
		params.put("fourth_related_material", this.fourthRelatedMaterial);
		params.put("second_related_material", this.secondRelatedMaterial);
		params.put("third_related_material", this.thirdRelatedMaterial);
		return params;
	}

	public Class<AlipayOpenMiniPoiCreateResponse> getResponseClass() {
		return AlipayOpenMiniPoiCreateResponse.class;
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

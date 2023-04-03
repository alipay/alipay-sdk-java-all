package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenMiniAmpeProductCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.mini.ampe.product.create request
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 07:45:15
 */
public class AlipayOpenMiniAmpeProductCreateRequest implements AlipayUploadRequest<AlipayOpenMiniAmpeProductCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 行业类目
	 */
	private String categoryId;

	/** 
	* 设备类型
	 */
	private String deviceType;

	/** 
	* 设备产品名称, 必填，最大长度32，单oid下唯一
	 */
	private String productName;

	/** 
	* 产品图片二进制流，必填，最小为1k，最大不能超过5MB，图片格式只支持jpg，png
	 */
	private FileItem productPic;

	/** 
	* 场景码，申请后平台分配
	 */
	private String sceneCode;

	/** 
	* 出货量
	 */
	private Long shipQuantity;

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryId() {
		return this.categoryId;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getDeviceType() {
		return this.deviceType;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName() {
		return this.productName;
	}

	public void setProductPic(FileItem productPic) {
		this.productPic = productPic;
	}
	public FileItem getProductPic() {
		return this.productPic;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode() {
		return this.sceneCode;
	}

	public void setShipQuantity(Long shipQuantity) {
		this.shipQuantity = shipQuantity;
	}
	public Long getShipQuantity() {
		return this.shipQuantity;
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
		return "alipay.open.mini.ampe.product.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("category_id", this.categoryId);
		txtParams.put("device_type", this.deviceType);
		txtParams.put("product_name", this.productName);
		txtParams.put("scene_code", this.sceneCode);
		txtParams.put("ship_quantity", this.shipQuantity);
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
		params.put("product_pic", this.productPic);
		return params;
	}

	public Class<AlipayOpenMiniAmpeProductCreateResponse> getResponseClass() {
		return AlipayOpenMiniAmpeProductCreateResponse.class;
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

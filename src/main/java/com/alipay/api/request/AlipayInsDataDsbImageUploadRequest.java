package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayInsDataDsbImageUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ins.data.dsb.image.upload request
 * 
 * @author auto create
 * @since 1.0, 2017-11-10 14:37:15
 */
public class AlipayInsDataDsbImageUploadRequest implements AlipayUploadRequest<AlipayInsDataDsbImageUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 保险公司定损单号，唯一标识一个定损单的id
	 */
	private String estimateNo;

	/** 
	* 车架号
	 */
	private String frameNo;

	/** 
	* 图片二进制字节流，上传图片是文件提交方式的必须提供该字段。
提供可下载的图片url或图片存储拉取方式的保司可不传该字段
	 */
	private FileItem imageContent;

	/** 
	* 图像格式类型，目前仅支持jpg格式
	 */
	private String imageFormat;

	/** 
	* 图像文件名称
	 */
	private String imageName;

	/** 
	* 图像文件在存储上的路径，与蚂蚁接口负责人确定上传方式是图片url拉取、通过oss拉取等方式可行后传入该字段。
该字段与图片二进制流参数选传其一。
	 */
	private String imagePath;

	/** 
	* 图片扩展属性信息json格式,如照片拍摄参数等
	 */
	private String imageProperties;

	/** 
	* 图片来源描述，如weixin、app等
	 */
	private String imageSource;

	/** 
	* 照片存储类型，枚举值如下 
OSS-阿里云oss存储 
SELF-自建类型
	 */
	private String imageStoreType;

	/** 
	* 图片类型，比如：car_damage(车损图像)、certificate(证照图像)、material(资料图像)、other(其他图像)
	 */
	private String imageType;

	/** 
	* 车牌号
	 */
	private String licenseNo;

	/** 
	* 报案号,2017-10-12后接入的公司必传该字段
	 */
	private String reportNo;

	/** 
	* 照片拍摄时间，精确到秒，格式yyyyMMddHHmmss
	 */
	private String shootTime;

	public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}
	public String getEstimateNo() {
		return this.estimateNo;
	}

	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}
	public String getFrameNo() {
		return this.frameNo;
	}

	public void setImageContent(FileItem imageContent) {
		this.imageContent = imageContent;
	}
	public FileItem getImageContent() {
		return this.imageContent;
	}

	public void setImageFormat(String imageFormat) {
		this.imageFormat = imageFormat;
	}
	public String getImageFormat() {
		return this.imageFormat;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageName() {
		return this.imageName;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getImagePath() {
		return this.imagePath;
	}

	public void setImageProperties(String imageProperties) {
		this.imageProperties = imageProperties;
	}
	public String getImageProperties() {
		return this.imageProperties;
	}

	public void setImageSource(String imageSource) {
		this.imageSource = imageSource;
	}
	public String getImageSource() {
		return this.imageSource;
	}

	public void setImageStoreType(String imageStoreType) {
		this.imageStoreType = imageStoreType;
	}
	public String getImageStoreType() {
		return this.imageStoreType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getImageType() {
		return this.imageType;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}
	public String getReportNo() {
		return this.reportNo;
	}

	public void setShootTime(String shootTime) {
		this.shootTime = shootTime;
	}
	public String getShootTime() {
		return this.shootTime;
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
		return "alipay.ins.data.dsb.image.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("estimate_no", this.estimateNo);
		txtParams.put("frame_no", this.frameNo);
		txtParams.put("image_format", this.imageFormat);
		txtParams.put("image_name", this.imageName);
		txtParams.put("image_path", this.imagePath);
		txtParams.put("image_properties", this.imageProperties);
		txtParams.put("image_source", this.imageSource);
		txtParams.put("image_store_type", this.imageStoreType);
		txtParams.put("image_type", this.imageType);
		txtParams.put("license_no", this.licenseNo);
		txtParams.put("report_no", this.reportNo);
		txtParams.put("shoot_time", this.shootTime);
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

	public Class<AlipayInsDataDsbImageUploadResponse> getResponseClass() {
		return AlipayInsDataDsbImageUploadResponse.class;
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

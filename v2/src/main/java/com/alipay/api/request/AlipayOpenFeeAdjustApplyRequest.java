package com.alipay.api.request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenFeeAdjustApplyResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.fee.adjust.apply request
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:56
 */
public class AlipayOpenFeeAdjustApplyRequest implements AlipayUploadRequest<AlipayOpenFeeAdjustApplyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 服务商代申请特殊费率的商家支付宝账户
	 */
	private String account;

	/** 
	* 服务商代商家申请特殊费率的费率值（%），如0.38表示0.38%
	 */
	private String applicationFee;

	/** 
	* 其他支付方式费率证明或者业务补充说明，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem attachment;

	/** 
	* 证件有效期，格式：yyyy-MM-dd，长期有效传入：9999-12-31
	 */
	private Date certDateLimitation;

	/** 
	* 对应证件类型（certType）的证件号，如营业执照为营业执照号
	 */
	private String certNo;

	/** 
	* 对应证件的图片，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem certPic;

	/** 
	* 证件类型，枚举值为
餐饮服务许可证 FOOD_SERVICE_LICENSE，
食品卫生许可证 FOOD_HEALTH_LICENSE，
食品经营许可证 FOOD_BUSINESS_LICENSE，
食品流通许可证 FOOD_CIRCULATE_LICENSE，
食品生产许可证 FOOD_PRODUCTION_LICENS，
营业执照     DEFAULT_LICENSE，
烟草资质 TOBACCO_PRODUCTION_LICENSE
	 */
	private String certType;

	/** 
	* 市
	 */
	private String cityCode;

	/** 
	* 详细地址
	 */
	private String detailAddress;

	/** 
	* 区/县
	 */
	private String districtCode;

	/** 
	* 服务商代商家申请调整费率的产品码
	 */
	private String productCode;

	/** 
	* 省份
	 */
	private String provinceCode;

	/** 
	* 店铺内景图片，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem shopScenePic;

	/** 
	* 店铺门头照图片，最小5KB，图片格式必须为：png、bmp、gif、jpg、jpeg
	 */
	private FileItem shopSignPic;

	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccount() {
		return this.account;
	}

	public void setApplicationFee(String applicationFee) {
		this.applicationFee = applicationFee;
	}
	public String getApplicationFee() {
		return this.applicationFee;
	}

	public void setAttachment(FileItem attachment) {
		this.attachment = attachment;
	}
	public FileItem getAttachment() {
		return this.attachment;
	}

	public void setCertDateLimitation(Date certDateLimitation) {
		this.certDateLimitation = certDateLimitation;
	}
	public Date getCertDateLimitation() {
		return this.certDateLimitation;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo() {
		return this.certNo;
	}

	public void setCertPic(FileItem certPic) {
		this.certPic = certPic;
	}
	public FileItem getCertPic() {
		return this.certPic;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType() {
		return this.certType;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode() {
		return this.cityCode;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public String getDetailAddress() {
		return this.detailAddress;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictCode() {
		return this.districtCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode() {
		return this.productCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode() {
		return this.provinceCode;
	}

	public void setShopScenePic(FileItem shopScenePic) {
		this.shopScenePic = shopScenePic;
	}
	public FileItem getShopScenePic() {
		return this.shopScenePic;
	}

	public void setShopSignPic(FileItem shopSignPic) {
		this.shopSignPic = shopSignPic;
	}
	public FileItem getShopSignPic() {
		return this.shopSignPic;
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
		return "alipay.open.fee.adjust.apply";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("account", this.account);
		txtParams.put("application_fee", this.applicationFee);
		txtParams.put("cert_date_limitation", this.certDateLimitation);
		txtParams.put("cert_no", this.certNo);
		txtParams.put("cert_type", this.certType);
		txtParams.put("city_code", this.cityCode);
		txtParams.put("detail_address", this.detailAddress);
		txtParams.put("district_code", this.districtCode);
		txtParams.put("product_code", this.productCode);
		txtParams.put("province_code", this.provinceCode);
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
		params.put("attachment", this.attachment);
		params.put("cert_pic", this.certPic);
		params.put("shop_scene_pic", this.shopScenePic);
		params.put("shop_sign_pic", this.shopSignPic);
		return params;
	}

	public Class<AlipayOpenFeeAdjustApplyResponse> getResponseClass() {
		return AlipayOpenFeeAdjustApplyResponse.class;
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

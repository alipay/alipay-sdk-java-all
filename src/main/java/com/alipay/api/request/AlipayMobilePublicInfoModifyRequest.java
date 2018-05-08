package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMobilePublicInfoModifyResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.mobile.public.info.modify request
 * 
 * @author auto create
 * @since 1.0, 2017-09-01 20:55:35
 */
public class AlipayMobilePublicInfoModifyRequest implements AlipayRequest<AlipayMobilePublicInfoModifyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 服务窗名称，2-20个字之间；不得含有违反法律法规和公序良俗的相关信息；不得侵害他人名誉权、知识产权、商业秘密等合法权利；不得以太过广泛的、或产品、行业词组来命名，如：女装、皮革批发；不得以实名认证的媒体资质账号创建服务窗，或媒体相关名称命名服务窗，如：XX电视台、XX杂志等
	 */
	private String appName;

	/** 
	* 授权运营书，企业商户若为被经营方授权，需上传加盖公章的扫描件，请使用照片上传接口上传图片获得image_url
	 */
	private String authPic;

	/** 
	* 营业执照地址，建议尺寸 320 x 320px，支持.jpg .jpeg .png 格式，小于3M
	 */
	private String licenseUrl;

	/** 
	* 服务窗头像地址，建议尺寸 320 x 320px，支持.jpg .jpeg .png 格式，小于3M
	 */
	private String logoUrl;

	/** 
	* 服务窗欢迎语，200字以内，首次使用服务窗必须
	 */
	private String publicGreeting;

	/** 
	* 第一张门店照片地址，建议尺寸 320 x 320px，支持.jpg .jpeg .png 格式，小于3M
	 */
	private String shopPic1;

	/** 
	* 第二张门店照片地址
	 */
	private String shopPic2;

	/** 
	* 第三张门店照片地址
	 */
	private String shopPic3;

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName() {
		return this.appName;
	}

	public void setAuthPic(String authPic) {
		this.authPic = authPic;
	}
	public String getAuthPic() {
		return this.authPic;
	}

	public void setLicenseUrl(String licenseUrl) {
		this.licenseUrl = licenseUrl;
	}
	public String getLicenseUrl() {
		return this.licenseUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getLogoUrl() {
		return this.logoUrl;
	}

	public void setPublicGreeting(String publicGreeting) {
		this.publicGreeting = publicGreeting;
	}
	public String getPublicGreeting() {
		return this.publicGreeting;
	}

	public void setShopPic1(String shopPic1) {
		this.shopPic1 = shopPic1;
	}
	public String getShopPic1() {
		return this.shopPic1;
	}

	public void setShopPic2(String shopPic2) {
		this.shopPic2 = shopPic2;
	}
	public String getShopPic2() {
		return this.shopPic2;
	}

	public void setShopPic3(String shopPic3) {
		this.shopPic3 = shopPic3;
	}
	public String getShopPic3() {
		return this.shopPic3;
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
		return "alipay.mobile.public.info.modify";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("app_name", this.appName);
		txtParams.put("auth_pic", this.authPic);
		txtParams.put("license_url", this.licenseUrl);
		txtParams.put("logo_url", this.logoUrl);
		txtParams.put("public_greeting", this.publicGreeting);
		txtParams.put("shop_pic1", this.shopPic1);
		txtParams.put("shop_pic2", this.shopPic2);
		txtParams.put("shop_pic3", this.shopPic3);
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

	public Class<AlipayMobilePublicInfoModifyResponse> getResponseClass() {
		return AlipayMobilePublicInfoModifyResponse.class;
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

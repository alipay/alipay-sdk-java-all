package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenPublicLifeAccountCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.public.life.account.create request
 * 
 * @author auto create
 * @since 1.0, 2017-08-01 16:01:03
 */
public class AlipayOpenPublicLifeAccountCreateRequest implements AlipayUploadRequest<AlipayOpenPublicLifeAccountCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 背景图片，需上传图片原始二进制流，此图片显示在支付宝客户端生活号主页上方背景图位置，后缀是jpg或者jpeg，图片大小限制1mb
	 */
	private FileItem background;

	/** 
	* 生活号二级分类id，请按照以下分类进行填写，非以下分类账号请联系相应人员添加类别
综合媒体(INTEG)，新闻(NEWS)，科技(SCIENCE)，养生(WELLNESS)，财经(FINANCE)，情感(EMOTION)，美食(DELICACY)，搞笑(FUNNY)，娱乐(ENTERTM)，摄影(SHOOT)，影视(MOVIES)，教育(EDUCATE)，文艺(LITER)，时尚(FASHION)，动漫(COMIC)，美妆(COSMETIC)，体育(SPOTRS)，旅行(TRIP)，健身(BODYB)，星座(CONSTT)，音乐(ONGAKU)，母婴(MUNBABY)，公益(PUBLICW)，汽车(CARS)，地产(LAND)，数码(NUMERAL)，游戏(GAMES)，电视剧(TVPLAY)，宠物(PET)，其他(OTHERS)
	 */
	private String catagoryId;

	/** 
	* 联系人邮箱，可以是调用者的联系人邮箱
	 */
	private String contactEmail;

	/** 
	* 联系人电话，可以是调用者的联系人电话
	 */
	private String contactTel;

	/** 
	* 生活号简介，此内容显示在支付宝客户端生活号主页简介区块
	 */
	private String content;

	/** 
	* 客服电话，可以是电话号码，手机号码，400电话
	 */
	private String customerTel;

	/** 
	* 生活号名称，该名称会显示在支付宝客户端生活号主页上方
	 */
	private String lifeName;

	/** 
	* logo图片，需上传图片原始二进制流，此图片显示在支付宝客户端生活号主页上方位置，后缀是jpg或者jpeg，图片大小限制1mb
	 */
	private FileItem logo;

	/** 
	* 支付宝用户id，由支付宝同学提供用户id，为该生活号对应pid
	 */
	private String userId;

	public void setBackground(FileItem background) {
		this.background = background;
	}
	public FileItem getBackground() {
		return this.background;
	}

	public void setCatagoryId(String catagoryId) {
		this.catagoryId = catagoryId;
	}
	public String getCatagoryId() {
		return this.catagoryId;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	public String getContactTel() {
		return this.contactTel;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return this.content;
	}

	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}
	public String getCustomerTel() {
		return this.customerTel;
	}

	public void setLifeName(String lifeName) {
		this.lifeName = lifeName;
	}
	public String getLifeName() {
		return this.lifeName;
	}

	public void setLogo(FileItem logo) {
		this.logo = logo;
	}
	public FileItem getLogo() {
		return this.logo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
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
		return "alipay.open.public.life.account.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("catagory_id", this.catagoryId);
		txtParams.put("contact_email", this.contactEmail);
		txtParams.put("contact_tel", this.contactTel);
		txtParams.put("content", this.content);
		txtParams.put("customer_tel", this.customerTel);
		txtParams.put("life_name", this.lifeName);
		txtParams.put("user_id", this.userId);
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
		params.put("background", this.background);
		params.put("logo", this.logo);
		return params;
	}

	public Class<AlipayOpenPublicLifeAccountCreateResponse> getResponseClass() {
		return AlipayOpenPublicLifeAccountCreateResponse.class;
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

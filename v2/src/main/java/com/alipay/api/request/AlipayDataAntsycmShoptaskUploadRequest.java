package com.alipay.api.request;

import java.util.List;
import com.alipay.api.domain.CategoryRangeInfoDTO;
import com.alipay.api.domain.ShopAreaInfoDTO;
import com.alipay.api.domain.ShopIndustryInfoDTO;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayDataAntsycmShoptaskUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.data.antsycm.shoptask.upload request
 * 
 * @author auto create
 * @since 1.0, 2024-04-12 17:42:00
 */
public class AlipayDataAntsycmShoptaskUploadRequest implements AlipayUploadRequest<AlipayDataAntsycmShoptaskUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 商户品牌，默认填写不指定。
值有：
1、不指定
2、卡士
3、三得利
	 */
	private String brandName;

	/** 
	* 商户授权码
	 */
	private String businessCode;

	/** 
	* 见<a href="https://opendocs.alipay.com/pre-open/0c07mb">品类维表</a>，依照场景需求使用
	 */
	private List<String> category;

	/** 
	* 品类价格
	 */
	private List<CategoryRangeInfoDTO> categoryRange;

	/** 
	* 文件流
	 */
	private FileItem fileContent;

	/** 
	* 见<a href = "https://opendocs.alipay.com/pre-open/0bue7u">省市区信息表</a>，依照场景需求使用
	 */
	private List<ShopAreaInfoDTO> marketArea;

	/** 
	* 商户ID
	 */
	private String partnerId;

	/** 
	* 对应更新周期，每（周/月）N更新； once：无值要求； day：无值要求； week：周日=1，周六=7； month：1-31
	 */
	private Long scheduleTime;

	/** 
	* 更新周期
	 */
	private String scheduleType;

	/** 
	* 见<a href = "https://opendocs.alipay.com/pre-open/0bjxu7">行业信息表</a>， 依照场景需求使用
	 */
	private List<ShopIndustryInfoDTO> shopIndustry;

	/** 
	* 任务名称
	 */
	private String taskName;

	/** 
	* 任务类型
	 */
	private String taskType;

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandName() {
		return this.brandName;
	}

	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public String getBusinessCode() {
		return this.businessCode;
	}

	public void setCategory(List<String> category) {
		this.category = category;
	}
	public List<String> getCategory() {
		return this.category;
	}

	public void setCategoryRange(List<CategoryRangeInfoDTO> categoryRange) {
		this.categoryRange = categoryRange;
	}
	public List<CategoryRangeInfoDTO> getCategoryRange() {
		return this.categoryRange;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setMarketArea(List<ShopAreaInfoDTO> marketArea) {
		this.marketArea = marketArea;
	}
	public List<ShopAreaInfoDTO> getMarketArea() {
		return this.marketArea;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId() {
		return this.partnerId;
	}

	public void setScheduleTime(Long scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	public Long getScheduleTime() {
		return this.scheduleTime;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}
	public String getScheduleType() {
		return this.scheduleType;
	}

	public void setShopIndustry(List<ShopIndustryInfoDTO> shopIndustry) {
		this.shopIndustry = shopIndustry;
	}
	public List<ShopIndustryInfoDTO> getShopIndustry() {
		return this.shopIndustry;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getTaskType() {
		return this.taskType;
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
		return "alipay.data.antsycm.shoptask.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("brand_name", this.brandName);
		txtParams.put("business_code", this.businessCode);
		txtParams.put("category", this.category == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.category, true));
		txtParams.put("category_range", this.categoryRange == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.categoryRange, true));
		txtParams.put("market_area", this.marketArea == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.marketArea, true));
		txtParams.put("partner_id", this.partnerId);
		txtParams.put("schedule_time", this.scheduleTime);
		txtParams.put("schedule_type", this.scheduleType);
		txtParams.put("shop_industry", this.shopIndustry == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.shopIndustry, true));
		txtParams.put("task_name", this.taskName);
		txtParams.put("task_type", this.taskType);
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

	public Class<AlipayDataAntsycmShoptaskUploadResponse> getResponseClass() {
		return AlipayDataAntsycmShoptaskUploadResponse.class;
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

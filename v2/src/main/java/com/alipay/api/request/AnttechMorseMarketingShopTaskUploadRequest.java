package com.alipay.api.request;

import java.util.List;
import com.alipay.api.domain.CategoryRangeInfo;
import com.alipay.api.domain.ShopIndustryInfo;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AnttechMorseMarketingShopTaskUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: anttech.morse.marketing.shop.task.upload request
 * 
 * @author auto create
 * @since 1.0, 2023-08-03 15:19:34
 */
public class AnttechMorseMarketingShopTaskUploadRequest implements AlipayUploadRequest<AnttechMorseMarketingShopTaskUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 商户授权码
	 */
	private String bussinessCode;

	/** 
	* 如：饮料等
	 */
	private List<String> category;

	/** 
	* 品类区间范围
	 */
	private List<CategoryRangeInfo> categoryRange;

	/** 
	* 文件流
	 */
	private FileItem fileContent;

	/** 
	* 对应调度类别，每（周/月）N更新；
once：无值要求；
day：无值要求；
week：周日=1，周六=7；
month：1-31
	 */
	private Long scheduleTime;

	/** 
	* 调度类别
	 */
	private String scheduleType;

	/** 
	* 见<a href="https://opendocs.alipay.com/pre-open/08mkrg" target="_blank">空间商业智能可选行业信息表</a>，
依照场景需求使用
	 */
	private List<ShopIndustryInfo> shopIndustry;

	/** 
	* 任务名称
	 */
	private String taskName;

	/** 
	* 任务类型
	 */
	private String taskType;

	public void setBussinessCode(String bussinessCode) {
		this.bussinessCode = bussinessCode;
	}
	public String getBussinessCode() {
		return this.bussinessCode;
	}

	public void setCategory(List<String> category) {
		this.category = category;
	}
	public List<String> getCategory() {
		return this.category;
	}

	public void setCategoryRange(List<CategoryRangeInfo> categoryRange) {
		this.categoryRange = categoryRange;
	}
	public List<CategoryRangeInfo> getCategoryRange() {
		return this.categoryRange;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
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

	public void setShopIndustry(List<ShopIndustryInfo> shopIndustry) {
		this.shopIndustry = shopIndustry;
	}
	public List<ShopIndustryInfo> getShopIndustry() {
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
		return "anttech.morse.marketing.shop.task.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("bussiness_code", this.bussinessCode);
		txtParams.put("category", this.category == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.category, true));
		txtParams.put("category_range", this.categoryRange == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.categoryRange, true));
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

	public Class<AnttechMorseMarketingShopTaskUploadResponse> getResponseClass() {
		return AnttechMorseMarketingShopTaskUploadResponse.class;
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

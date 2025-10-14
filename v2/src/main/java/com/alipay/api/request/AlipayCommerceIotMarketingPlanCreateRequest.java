package com.alipay.api.request;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCommerceIotMarketingPlanCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.commerce.iot.marketing.plan.create request
 * 
 * @author auto create
 * @since 1.0, 2025-10-13 19:12:40
 */
public class AlipayCommerceIotMarketingPlanCreateRequest implements AlipayUploadRequest<AlipayCommerceIotMarketingPlanCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 投放设备bizTid列表,服务商所有的设备，取设备的bizTid
多个bizTid示例：["010100q0jl5X4o8LZQWAOUxu6GcrtPl4wR68wQerXVACt5EAaQISk4k","010100q0iZ5XP3eiSA25lhlyGq8dxPMOHe8Ae4s1BGptXegHN3fCQ1g"]
	 */
	private List<String> bizTids;

	/** 
	* 投放计划结束时间戳
	 */
	private Long endTime;

	/** 
	* 海报投放图片  电子海报投放可投3张 ,一次只能投一张，第二次追加 上限3张后续会进行覆盖 
支付结果页投放。只能投放1张图片 取file_content_1字段
	 */
	private FileItem fileContent1;

	/** 
	* 图片1横屏竖屏配置
  HORIZONTAL_SCREEN(1, "横屏"),
    VERTICAL_SCREEN(2, "竖屏")
	 */
	private Long hvScreen1;

	/** 
	* 投放计划名称
	 */
	private String planName;

	/** 
	* 投放计划优先级
	 */
	private Long priority;

	/** 
	* NORMAL_DISPLAY---电子海报,  可投3张图片，一次投一张，第二次追加，上限3张。后续投放会进行覆盖 
PAY_SUCCESS_RESULT---支付结果页。只能投放1张图片
MERCHANT_INFO_POSTER---商户信息海报
	 */
	private String spaceCode;

	/** 
	* 投放计划开始时间戳
	 */
	private Long startTime;

	public void setBizTids(List<String> bizTids) {
		this.bizTids = bizTids;
	}
	public List<String> getBizTids() {
		return this.bizTids;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}
	public Long getEndTime() {
		return this.endTime;
	}

	public void setFileContent1(FileItem fileContent1) {
		this.fileContent1 = fileContent1;
	}
	public FileItem getFileContent1() {
		return this.fileContent1;
	}

	public void setHvScreen1(Long hvScreen1) {
		this.hvScreen1 = hvScreen1;
	}
	public Long getHvScreen1() {
		return this.hvScreen1;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanName() {
		return this.planName;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}
	public Long getPriority() {
		return this.priority;
	}

	public void setSpaceCode(String spaceCode) {
		this.spaceCode = spaceCode;
	}
	public String getSpaceCode() {
		return this.spaceCode;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}
	public Long getStartTime() {
		return this.startTime;
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
		return "alipay.commerce.iot.marketing.plan.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_tids", this.bizTids == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.bizTids, true));
		txtParams.put("end_time", this.endTime);
		txtParams.put("hv_screen_1", this.hvScreen1);
		txtParams.put("plan_name", this.planName);
		txtParams.put("priority", this.priority);
		txtParams.put("space_code", this.spaceCode);
		txtParams.put("start_time", this.startTime);
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
		params.put("file_content_1", this.fileContent1);
		return params;
	}

	public Class<AlipayCommerceIotMarketingPlanCreateResponse> getResponseClass() {
		return AlipayCommerceIotMarketingPlanCreateResponse.class;
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

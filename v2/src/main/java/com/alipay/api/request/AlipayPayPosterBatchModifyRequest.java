package com.alipay.api.request;

import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayPayPosterBatchModifyResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.pay.poster.batch.modify request
 * 
 * @author auto create
 * @since 1.0, 2025-07-16 15:37:31
 */
public class AlipayPayPosterBatchModifyRequest implements AlipayUploadRequest<AlipayPayPosterBatchModifyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 用户设备投放范围变更覆盖
	 */
	private FileItem deviceFile;

	/** 
	* 编辑操作人
	 */
	private List<String> deviceIds;

	/** 
	* 海报结束时间
	 */
	private Date endTime;

	/** 
	* 海报图片链接
	 */
	private String imgUrl;

	/** 
	* 货柜对应的商家id
	 */
	private String merchantId;

	/** 
	* 是否进行活动下线
	 */
	private Boolean offline;

	/** 
	* 编辑操作人记录
	 */
	private String operator;

	/** 
	* 活动计划主键
	 */
	private Long planId;

	/** 
	* 开始时间
	 */
	private Date startTime;

	public void setDeviceFile(FileItem deviceFile) {
		this.deviceFile = deviceFile;
	}
	public FileItem getDeviceFile() {
		return this.deviceFile;
	}

	public void setDeviceIds(List<String> deviceIds) {
		this.deviceIds = deviceIds;
	}
	public List<String> getDeviceIds() {
		return this.deviceIds;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime() {
		return this.endTime;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId() {
		return this.merchantId;
	}

	public void setOffline(Boolean offline) {
		this.offline = offline;
	}
	public Boolean getOffline() {
		return this.offline;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getOperator() {
		return this.operator;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public Long getPlanId() {
		return this.planId;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime() {
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
		return "alipay.pay.poster.batch.modify";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("device_ids", this.deviceIds == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.deviceIds, true));
		txtParams.put("end_time", this.endTime);
		txtParams.put("img_url", this.imgUrl);
		txtParams.put("merchant_id", this.merchantId);
		txtParams.put("offline", this.offline);
		txtParams.put("operator", this.operator);
		txtParams.put("plan_id", this.planId);
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
		params.put("device_file", this.deviceFile);
		return params;
	}

	public Class<AlipayPayPosterBatchModifyResponse> getResponseClass() {
		return AlipayPayPosterBatchModifyResponse.class;
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

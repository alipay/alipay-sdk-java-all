package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMarketingToolTaskReceiveResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.marketing.tool.task.receive request
 * 
 * @author auto create
 * @since 1.0, 2020-05-06 17:57:24
 */
public class AlipayMarketingToolTaskReceiveRequest implements AlipayRequest<AlipayMarketingToolTaskReceiveResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 当完成任务（send）或者主动领奖（receive）且奖品决策方式为指定奖品决策时，需要传入的奖品ID。
	 */
	private String specificPrizeId;

	/** 
	* 阶段码，signup任务报名，send任务完成，receive主动领取。stagecode需要根据具体任务的不同类型（是否需要主动报名/用户触发还是事件触发）来传参。
	 */
	private String stageCode;

	/** 
	* 任务ID。
	 */
	private String taskId;

	/** 
	* 蚂蚁统一会员ID
	 */
	private String userId;

	public void setSpecificPrizeId(String specificPrizeId) {
		this.specificPrizeId = specificPrizeId;
	}
	public String getSpecificPrizeId() {
		return this.specificPrizeId;
	}

	public void setStageCode(String stageCode) {
		this.stageCode = stageCode;
	}
	public String getStageCode() {
		return this.stageCode;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId() {
		return this.taskId;
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

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.marketing.tool.task.receive";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("specific_prize_id", this.specificPrizeId);
		txtParams.put("stage_code", this.stageCode);
		txtParams.put("task_id", this.taskId);
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

	public Class<AlipayMarketingToolTaskReceiveResponse> getResponseClass() {
		return AlipayMarketingToolTaskReceiveResponse.class;
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

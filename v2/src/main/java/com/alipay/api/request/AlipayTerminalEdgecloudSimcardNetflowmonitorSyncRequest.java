package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayTerminalEdgecloudSimcardNetflowmonitorSyncResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.terminal.edgecloud.simcard.netflowmonitor.sync request
 * 
 * @author auto create
 * @since 1.0, 2026-04-28 19:37:48
 */
public class AlipayTerminalEdgecloudSimcardNetflowmonitorSyncRequest implements AlipayUploadRequest<AlipayTerminalEdgecloudSimcardNetflowmonitorSyncResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 当upload_monitor_scene为SIM_CARD_NETFLOW_DAY或SIM_CARD_POOL_NETFLOW_DAY时，biz_date格式为yyyymmdd。当upload_monitor_scene为SIM_CARD_NETFLOW_MONTH时，biz_date格式为yyyymm
	 */
	private String bizDate;

	/** 
	* 文件序列号从1开始递增，且必须连续递增
	 */
	private Long bizDateFileSeqId;

	/** 
	* 同步文件二进制字节流，必须是CSV文件，大小必须小于50M
	 */
	private FileItem fileContent;

	/** 
	* SIM_CARD_NETFLOW_DAY(sim卡流量天级别监控)
SIM_CARD_NETFLOW_MONTH(sim卡流量月级别监控)
SIM_CARD_POOL_NETFLOW_DAY(sim流量池天级别监控)
	 */
	private String uploadMonitorScene;

	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}
	public String getBizDate() {
		return this.bizDate;
	}

	public void setBizDateFileSeqId(Long bizDateFileSeqId) {
		this.bizDateFileSeqId = bizDateFileSeqId;
	}
	public Long getBizDateFileSeqId() {
		return this.bizDateFileSeqId;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setUploadMonitorScene(String uploadMonitorScene) {
		this.uploadMonitorScene = uploadMonitorScene;
	}
	public String getUploadMonitorScene() {
		return this.uploadMonitorScene;
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
		return "alipay.terminal.edgecloud.simcard.netflowmonitor.sync";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_date", this.bizDate);
		txtParams.put("biz_date_file_seq_id", this.bizDateFileSeqId);
		txtParams.put("upload_monitor_scene", this.uploadMonitorScene);
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

	public Class<AlipayTerminalEdgecloudSimcardNetflowmonitorSyncResponse> getResponseClass() {
		return AlipayTerminalEdgecloudSimcardNetflowmonitorSyncResponse.class;
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

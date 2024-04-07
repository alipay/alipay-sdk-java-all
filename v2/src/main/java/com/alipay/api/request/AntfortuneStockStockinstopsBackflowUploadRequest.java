package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AntfortuneStockStockinstopsBackflowUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: antfortune.stock.stockinstops.backflow.upload request
 * 
 * @author auto create
 * @since 1.0, 2024-03-12 17:02:00
 */
public class AntfortuneStockStockinstopsBackflowUploadRequest implements AlipayUploadRequest<AntfortuneStockStockinstopsBackflowUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 上传数据的压缩算法
	 */
	private String compressType;

	/** 
	* 上传文件的二进制流
	 */
	private FileItem fileContent;

	/** 
	* forward服务器的域名信息
	 */
	private String forwardHost;

	/** 
	* forward所在机房信息
	 */
	private String forwardRoom;

	/** 
	* forward发送的时间
	 */
	private String forwardTime;

	/** 
	* forward链路追踪Id
	 */
	private String forwardTrace;

	/** 
	* forward所在环境信息
	 */
	private String forwardZone;

	/** 
	* 机构名称
	 */
	private String instId;

	/** 
	* 业务数据类型
	 */
	private String msgType;

	public void setCompressType(String compressType) {
		this.compressType = compressType;
	}
	public String getCompressType() {
		return this.compressType;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setForwardHost(String forwardHost) {
		this.forwardHost = forwardHost;
	}
	public String getForwardHost() {
		return this.forwardHost;
	}

	public void setForwardRoom(String forwardRoom) {
		this.forwardRoom = forwardRoom;
	}
	public String getForwardRoom() {
		return this.forwardRoom;
	}

	public void setForwardTime(String forwardTime) {
		this.forwardTime = forwardTime;
	}
	public String getForwardTime() {
		return this.forwardTime;
	}

	public void setForwardTrace(String forwardTrace) {
		this.forwardTrace = forwardTrace;
	}
	public String getForwardTrace() {
		return this.forwardTrace;
	}

	public void setForwardZone(String forwardZone) {
		this.forwardZone = forwardZone;
	}
	public String getForwardZone() {
		return this.forwardZone;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstId() {
		return this.instId;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getMsgType() {
		return this.msgType;
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
		return "antfortune.stock.stockinstops.backflow.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("compress_type", this.compressType);
		txtParams.put("forward_host", this.forwardHost);
		txtParams.put("forward_room", this.forwardRoom);
		txtParams.put("forward_time", this.forwardTime);
		txtParams.put("forward_trace", this.forwardTrace);
		txtParams.put("forward_zone", this.forwardZone);
		txtParams.put("inst_id", this.instId);
		txtParams.put("msg_type", this.msgType);
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

	public Class<AntfortuneStockStockinstopsBackflowUploadResponse> getResponseClass() {
		return AntfortuneStockStockinstopsBackflowUploadResponse.class;
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

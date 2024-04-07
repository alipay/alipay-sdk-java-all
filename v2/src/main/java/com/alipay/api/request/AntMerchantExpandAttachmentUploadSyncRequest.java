package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AntMerchantExpandAttachmentUploadSyncResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: ant.merchant.expand.attachment.upload.sync request
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:31:11
 */
public class AntMerchantExpandAttachmentUploadSyncRequest implements AlipayUploadRequest<AntMerchantExpandAttachmentUploadSyncResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 附件的业务类型
	 */
	private String bizType;

	/** 
	* 附属信息，JSON格式
	 */
	private String extInfo;

	/** 
	* 文件字节流
	 */
	private FileItem fileContent;

	/** 
	* 文档静态格式
	 */
	private String fileFormat;

	/** 
	* 文件链接
	 */
	private String fileUrl;

	/** 
	* 备注
	 */
	private String memo;

	/** 
	* 附件单据号
	 */
	private String outBizNo;

	/** 
	* 分区
	 */
	private Long partNo;

	/** 
	* 附件的业务子类型
	 */
	private String subBizType;

	/** 
	* 附件子单据号
	 */
	private String subOutBizNo;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType() {
		return this.bizType;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo() {
		return this.extInfo;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}
	public String getFileFormat() {
		return this.fileFormat;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl() {
		return this.fileUrl;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setPartNo(Long partNo) {
		this.partNo = partNo;
	}
	public Long getPartNo() {
		return this.partNo;
	}

	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}
	public String getSubBizType() {
		return this.subBizType;
	}

	public void setSubOutBizNo(String subOutBizNo) {
		this.subOutBizNo = subOutBizNo;
	}
	public String getSubOutBizNo() {
		return this.subOutBizNo;
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
		return "ant.merchant.expand.attachment.upload.sync";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_type", this.bizType);
		txtParams.put("ext_info", this.extInfo);
		txtParams.put("file_format", this.fileFormat);
		txtParams.put("file_url", this.fileUrl);
		txtParams.put("memo", this.memo);
		txtParams.put("out_biz_no", this.outBizNo);
		txtParams.put("part_no", this.partNo);
		txtParams.put("sub_biz_type", this.subBizType);
		txtParams.put("sub_out_biz_no", this.subOutBizNo);
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

	public Class<AntMerchantExpandAttachmentUploadSyncResponse> getResponseClass() {
		return AntMerchantExpandAttachmentUploadSyncResponse.class;
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

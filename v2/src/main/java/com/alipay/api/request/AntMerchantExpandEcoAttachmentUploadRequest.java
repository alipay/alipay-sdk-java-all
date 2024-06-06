package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AntMerchantExpandEcoAttachmentUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: ant.merchant.expand.eco.attachment.upload request
 * 
 * @author auto create
 * @since 1.0, 2024-06-06 15:02:03
 */
public class AntMerchantExpandEcoAttachmentUploadRequest implements AlipayUploadRequest<AntMerchantExpandEcoAttachmentUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 附件的业务类型
	 */
	private String bizType;

	/** 
	* 外部平台编号
	 */
	private String busiPlatform;

	/** 
	* 文件内容，以文件流形式进行传输
	 */
	private FileItem fileContent;

	/** 
	* 文档格式
	 */
	private String fileFormat;

	/** 
	* 附件单据号（必填）订单号 (out_order_id)
	 */
	private String outOrderId;

	/** 
	* 图片序号，多个文件上传时，part_no按照0,1,2...递增（必填）
	 */
	private String partNo;

	/** 
	* 码图片附件
	 */
	private String subBizType;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType() {
		return this.bizType;
	}

	public void setBusiPlatform(String busiPlatform) {
		this.busiPlatform = busiPlatform;
	}
	public String getBusiPlatform() {
		return this.busiPlatform;
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

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId() {
		return this.outOrderId;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	public String getPartNo() {
		return this.partNo;
	}

	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}
	public String getSubBizType() {
		return this.subBizType;
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
		return "ant.merchant.expand.eco.attachment.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_type", this.bizType);
		txtParams.put("busi_platform", this.busiPlatform);
		txtParams.put("file_format", this.fileFormat);
		txtParams.put("out_order_id", this.outOrderId);
		txtParams.put("part_no", this.partNo);
		txtParams.put("sub_biz_type", this.subBizType);
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

	public Class<AntMerchantExpandEcoAttachmentUploadResponse> getResponseClass() {
		return AntMerchantExpandEcoAttachmentUploadResponse.class;
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

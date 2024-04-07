package com.alipay.api.request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayInsSceneInsserviceprodSerattachmentUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.serattachment.upload request
 * 
 * @author auto create
 * @since 1.0, 2023-11-16 13:56:49
 */
public class AlipayInsSceneInsserviceprodSerattachmentUploadRequest implements AlipayUploadRequest<AlipayInsSceneInsserviceprodSerattachmentUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 扩展信息，JSON字符串格式。该接口为通用接口，需要和增值服务中台的开发同学根据不同的业务约定不同的字段。
	 */
	private String bizData;

	/** 
	* 文件业务码(业务方自定义)
	 */
	private String fileBizCode;

	/** 
	* 文件内容
	 */
	private FileItem fileContent;

	/** 
	* 文件描述
	 */
	private String fileDesc;

	/** 
	* 文件名称
	 */
	private String fileName;

	/** 
	* 文件路径
	 */
	private String filePath;

	/** 
	* 文件大小，对应java里面File的length
	 */
	private String fileSize;

	/** 
	* 文件类型
	 */
	private String fileType;

	/** 
	* 文件的公网链接，机构可通过此链接向蚂蚁上传文件
	 */
	private String fileUrl;

	/** 
	* 外部业务号
	 */
	private String outBizNo;

	/** 
	* 业务单据号
	 */
	private String serBizNo;

	/** 
	* 服务业务类型
	 */
	private String serBizType;

	/** 
	* 上传时间
	 */
	private Date uploadTime;

	public void setBizData(String bizData) {
		this.bizData = bizData;
	}
	public String getBizData() {
		return this.bizData;
	}

	public void setFileBizCode(String fileBizCode) {
		this.fileBizCode = fileBizCode;
	}
	public String getFileBizCode() {
		return this.fileBizCode;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setFileDesc(String fileDesc) {
		this.fileDesc = fileDesc;
	}
	public String getFileDesc() {
		return this.fileDesc;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName() {
		return this.fileName;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFilePath() {
		return this.filePath;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileSize() {
		return this.fileSize;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileType() {
		return this.fileType;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl() {
		return this.fileUrl;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setSerBizNo(String serBizNo) {
		this.serBizNo = serBizNo;
	}
	public String getSerBizNo() {
		return this.serBizNo;
	}

	public void setSerBizType(String serBizType) {
		this.serBizType = serBizType;
	}
	public String getSerBizType() {
		return this.serBizType;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}
	public Date getUploadTime() {
		return this.uploadTime;
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
		return "alipay.ins.scene.insserviceprod.serattachment.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_data", this.bizData);
		txtParams.put("file_biz_code", this.fileBizCode);
		txtParams.put("file_desc", this.fileDesc);
		txtParams.put("file_name", this.fileName);
		txtParams.put("file_path", this.filePath);
		txtParams.put("file_size", this.fileSize);
		txtParams.put("file_type", this.fileType);
		txtParams.put("file_url", this.fileUrl);
		txtParams.put("out_biz_no", this.outBizNo);
		txtParams.put("ser_biz_no", this.serBizNo);
		txtParams.put("ser_biz_type", this.serBizType);
		txtParams.put("upload_time", this.uploadTime);
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

	public Class<AlipayInsSceneInsserviceprodSerattachmentUploadResponse> getResponseClass() {
		return AlipayInsSceneInsserviceprodSerattachmentUploadResponse.class;
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

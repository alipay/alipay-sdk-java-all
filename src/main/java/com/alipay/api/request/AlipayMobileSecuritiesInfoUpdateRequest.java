package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMobileSecuritiesInfoUpdateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.mobile.securities.info.update request
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobileSecuritiesInfoUpdateRequest implements AlipayUploadRequest<AlipayMobileSecuritiesInfoUpdateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 作者
	 */
	private String author;

	/** 
	* 文本正文
	 */
	private String content;

	/** 
	* Html格式正文
	 */
	private String html;

	/** 
	* 唯一标识
	 */
	private String identify;

	/** 
	* 原文链接
	 */
	private String link;

	/** 
	* 配图原图
	 */
	private FileItem originalPicture;

	/** 
	* 配图图注
	 */
	private String pictureComment;

	/** 
	* Html格式正文中配图图片位置标识
	 */
	private String pictureLocation;

	/** 
	* publish_time
	 */
	private String publishTime;

	/** 
	* 相关股票
	 */
	private String relevantStock;

	/** 
	* 新闻来源
	 */
	private String source;

	/** 
	* summary
	 */
	private String summary;

	/** 
	* title
	 */
	private String title;

	/** 
	* 更新时间
	 */
	private String updateTime;

	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return this.author;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return this.content;
	}

	public void setHtml(String html) {
		this.html = html;
	}
	public String getHtml() {
		return this.html;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}
	public String getIdentify() {
		return this.identify;
	}

	public void setLink(String link) {
		this.link = link;
	}
	public String getLink() {
		return this.link;
	}

	public void setOriginalPicture(FileItem originalPicture) {
		this.originalPicture = originalPicture;
	}
	public FileItem getOriginalPicture() {
		return this.originalPicture;
	}

	public void setPictureComment(String pictureComment) {
		this.pictureComment = pictureComment;
	}
	public String getPictureComment() {
		return this.pictureComment;
	}

	public void setPictureLocation(String pictureLocation) {
		this.pictureLocation = pictureLocation;
	}
	public String getPictureLocation() {
		return this.pictureLocation;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	public String getPublishTime() {
		return this.publishTime;
	}

	public void setRelevantStock(String relevantStock) {
		this.relevantStock = relevantStock;
	}
	public String getRelevantStock() {
		return this.relevantStock;
	}

	public void setSource(String source) {
		this.source = source;
	}
	public String getSource() {
		return this.source;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getSummary() {
		return this.summary;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateTime() {
		return this.updateTime;
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
		return "alipay.mobile.securities.info.update";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("author", this.author);
		txtParams.put("content", this.content);
		txtParams.put("html", this.html);
		txtParams.put("identify", this.identify);
		txtParams.put("link", this.link);
		txtParams.put("picture_comment", this.pictureComment);
		txtParams.put("picture_location", this.pictureLocation);
		txtParams.put("publish_time", this.publishTime);
		txtParams.put("relevant_stock", this.relevantStock);
		txtParams.put("source", this.source);
		txtParams.put("summary", this.summary);
		txtParams.put("title", this.title);
		txtParams.put("update_time", this.updateTime);
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
		params.put("original_picture", this.originalPicture);
		return params;
	}

	public Class<AlipayMobileSecuritiesInfoUpdateResponse> getResponseClass() {
		return AlipayMobileSecuritiesInfoUpdateResponse.class;
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

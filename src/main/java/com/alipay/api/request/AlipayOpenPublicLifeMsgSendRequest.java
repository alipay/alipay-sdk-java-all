package com.alipay.api.request;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenPublicLifeMsgSendResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.public.life.msg.send request
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicLifeMsgSendRequest implements AlipayUploadRequest<AlipayOpenPublicLifeMsgSendResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 消息分类，请传入对应分类编码值
	 */
	private String category;

	/** 
	* 消息正文，html原文或纯文本
	 */
	private String content;

	/** 
	* 消息背景图片（目前支持格式jpg, jpeg, bmp），需上传图片原始二进制流，图片最大1MB
	 */
	private FileItem cover;

	/** 
	* 消息概述
	 */
	private String desc;

	/** 
	* 媒体资讯类生活号消息类型
	 */
	private String msgType;

	/** 
	* 消息来源方附属信息，供搜索、推荐使用
publish_time（int）：消息发布时间，单位秒
keyword_list（String）: 文章的标签列表，英文逗号分隔
comment（int）：消息来源处评论次数
reward（int）：消息来源处打赏次数
is_recommended（boolean）：消息在来源处是否被推荐
is_news（boolean）：消息是否实时性内容
read（int）：消息在来源处被阅读次数
like（int）：消息在来源处被点赞次数
is_hot（boolean）：消息在来源平台是否是热门内容
share（int）：文章在来源平台的分享次数
deadline（int）：文章的失效时间，单位秒
	 */
	private String sourceExtInfo;

	/** 
	* 消息标题
	 */
	private String title;

	/** 
	* 来源方消息唯一标识；若不为空，根据此id和生活号id对消息去重；若为空，不去重
	 */
	private String uniqueMsgId;

	/** 
	* 生活号消息视频时长，单位：秒（视频类消息必填）
	 */
	private String videoLength;

	/** 
	* 视频类型消息中视频抽样关键帧截图，视频类消息选填
	 */
	private List<String> videoSamples;

	/** 
	* 视频大小，单位：KB（视频类消息必填）
	 */
	private String videoSize;

	/** 
	* 视频资源来源id（视频类消息必填），取值限定youku, miaopai, taobao, sina中的一个
	 */
	private String videoSource;

	/** 
	* 视频的临时链接（优酷来源的视频消息，该字段不能为空）
	 */
	private String videoTemporaryUrl;

	/** 
	* 生活号视频类消息视频id或url（视频类消息必填，根据来源区分）
	 */
	private String videoUrl;

	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory() {
		return this.category;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return this.content;
	}

	public void setCover(FileItem cover) {
		this.cover = cover;
	}
	public FileItem getCover() {
		return this.cover;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return this.desc;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getMsgType() {
		return this.msgType;
	}

	public void setSourceExtInfo(String sourceExtInfo) {
		this.sourceExtInfo = sourceExtInfo;
	}
	public String getSourceExtInfo() {
		return this.sourceExtInfo;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}

	public void setUniqueMsgId(String uniqueMsgId) {
		this.uniqueMsgId = uniqueMsgId;
	}
	public String getUniqueMsgId() {
		return this.uniqueMsgId;
	}

	public void setVideoLength(String videoLength) {
		this.videoLength = videoLength;
	}
	public String getVideoLength() {
		return this.videoLength;
	}

	public void setVideoSamples(List<String> videoSamples) {
		this.videoSamples = videoSamples;
	}
	public List<String> getVideoSamples() {
		return this.videoSamples;
	}

	public void setVideoSize(String videoSize) {
		this.videoSize = videoSize;
	}
	public String getVideoSize() {
		return this.videoSize;
	}

	public void setVideoSource(String videoSource) {
		this.videoSource = videoSource;
	}
	public String getVideoSource() {
		return this.videoSource;
	}

	public void setVideoTemporaryUrl(String videoTemporaryUrl) {
		this.videoTemporaryUrl = videoTemporaryUrl;
	}
	public String getVideoTemporaryUrl() {
		return this.videoTemporaryUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public String getVideoUrl() {
		return this.videoUrl;
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
		return "alipay.open.public.life.msg.send";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("category", this.category);
		txtParams.put("content", this.content);
		txtParams.put("desc", this.desc);
		txtParams.put("msg_type", this.msgType);
		txtParams.put("source_ext_info", this.sourceExtInfo);
		txtParams.put("title", this.title);
		txtParams.put("unique_msg_id", this.uniqueMsgId);
		txtParams.put("video_length", this.videoLength);
		txtParams.put("video_samples", this.videoSamples == null? null : new com.alipay.api.internal.util.json.JSONWriter().write(this.videoSamples, true));
		txtParams.put("video_size", this.videoSize);
		txtParams.put("video_source", this.videoSource);
		txtParams.put("video_temporary_url", this.videoTemporaryUrl);
		txtParams.put("video_url", this.videoUrl);
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
		params.put("cover", this.cover);
		return params;
	}

	public Class<AlipayOpenPublicLifeMsgSendResponse> getResponseClass() {
		return AlipayOpenPublicLifeMsgSendResponse.class;
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

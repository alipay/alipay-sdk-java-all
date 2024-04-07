package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 直播物料信息
 *
 * @author auto create
 * @since 1.0, 2021-07-29 17:29:28
 */
public class LiveContentInfo extends AlipayObject {

	private static final long serialVersionUID = 7795771852991662871L;

	/**
	 * 素材的业务类型，可以区分针对不同素材匹配不同的业务规则。
	 */
	@ApiField("biz_content_type")
	private String bizContentType;

	/**
	 * 物料类型
(TEXT:文本/PICTURE:图片/VOICE:语音/VIDEO:视频)
	 */
	@ApiField("content_file_type")
	private String contentFileType;

	/**
	 * 物料的唯一代码
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 物料风险信息列表
	 */
	@ApiListField("content_risk_info_list")
	@ApiField("live_content_risk_info")
	private List<LiveContentRiskInfo> contentRiskInfoList;

	/**
	 * 视频转换的文本的url地址
	 */
	@ApiField("content_url")
	private String contentUrl;

	/**
	 * 打点标签名称
	 */
	@ApiField("mark_lable_name")
	private String markLableName;

	public String getBizContentType() {
		return this.bizContentType;
	}
	public void setBizContentType(String bizContentType) {
		this.bizContentType = bizContentType;
	}

	public String getContentFileType() {
		return this.contentFileType;
	}
	public void setContentFileType(String contentFileType) {
		this.contentFileType = contentFileType;
	}

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public List<LiveContentRiskInfo> getContentRiskInfoList() {
		return this.contentRiskInfoList;
	}
	public void setContentRiskInfoList(List<LiveContentRiskInfo> contentRiskInfoList) {
		this.contentRiskInfoList = contentRiskInfoList;
	}

	public String getContentUrl() {
		return this.contentUrl;
	}
	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public String getMarkLableName() {
		return this.markLableName;
	}
	public void setMarkLableName(String markLableName) {
		this.markLableName = markLableName;
	}

}

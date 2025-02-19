package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蓝花火社区内容同步接口
 *
 * @author auto create
 * @since 1.0, 2025-01-22 16:51:07
 */
public class AlipayCommerceIcommunityContentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3892347965489371765L;

	/**
	 * 表示接口调用来源的场景码
	 */
	@ApiField("content_create_biz_scene")
	private String contentCreateBizScene;

	/**
	 * 同步的内容所关联的蓝花火兴趣社区小组id
	 */
	@ApiListField("content_link_group_ids")
	@ApiField("string")
	private List<String> contentLinkGroupIds;

	/**
	 * 内容所关联的媒体信息，表示当前内容除文字之外的图片或视频信息
	 */
	@ApiListField("content_media_info")
	@ApiField("icommunity_content_media_info")
	private List<IcommunityContentMediaInfo> contentMediaInfo;

	/**
	 * 内容发布时的IP地址，ipv4&ipv6均支持
	 */
	@ApiField("content_publish_ip")
	private String contentPublishIp;

	/**
	 * 发布内容的文本内容，可以为空
	 */
	@ApiField("content_text")
	private String contentText;

	/**
	 * 同步内容的内容标题
	 */
	@ApiField("content_title")
	private String contentTitle;

	/**
	 * 1."TEXT"表示纯文本类型
2."PIC_TEXT"表示图文类型
3."VIDEO"表示视频类型
4."RICH_TEXT"表示富文本类型
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 内容发布时的位置信息，包括经纬度。地址等信息。
	 */
	@ApiField("location_info")
	private IcommunityContentLocationInfo locationInfo;

	/**
	 * 该参数用于唯一标识一篇内容，生成规则由业务方自定
	 */
	@ApiField("out_content_id")
	private String outContentId;

	/**
	 * 内容发布者所在省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 该条内容的发布时间
	 */
	@ApiField("publish_time")
	private Date publishTime;

	/**
	 * 内容发布者id
	 */
	@ApiField("publisher_id")
	private String publisherId;

	/**
	 * 内容同步关联的话题唯一键列表
	 */
	@ApiListField("topic_id_list")
	@ApiField("string")
	private List<String> topicIdList;

	/**
	 * 发布内容关联的超链接列表
	 */
	@ApiListField("url_info_list")
	@ApiField("icommunity_content_url_index")
	private List<IcommunityContentUrlIndex> urlInfoList;

	public String getContentCreateBizScene() {
		return this.contentCreateBizScene;
	}
	public void setContentCreateBizScene(String contentCreateBizScene) {
		this.contentCreateBizScene = contentCreateBizScene;
	}

	public List<String> getContentLinkGroupIds() {
		return this.contentLinkGroupIds;
	}
	public void setContentLinkGroupIds(List<String> contentLinkGroupIds) {
		this.contentLinkGroupIds = contentLinkGroupIds;
	}

	public List<IcommunityContentMediaInfo> getContentMediaInfo() {
		return this.contentMediaInfo;
	}
	public void setContentMediaInfo(List<IcommunityContentMediaInfo> contentMediaInfo) {
		this.contentMediaInfo = contentMediaInfo;
	}

	public String getContentPublishIp() {
		return this.contentPublishIp;
	}
	public void setContentPublishIp(String contentPublishIp) {
		this.contentPublishIp = contentPublishIp;
	}

	public String getContentText() {
		return this.contentText;
	}
	public void setContentText(String contentText) {
		this.contentText = contentText;
	}

	public String getContentTitle() {
		return this.contentTitle;
	}
	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public IcommunityContentLocationInfo getLocationInfo() {
		return this.locationInfo;
	}
	public void setLocationInfo(IcommunityContentLocationInfo locationInfo) {
		this.locationInfo = locationInfo;
	}

	public String getOutContentId() {
		return this.outContentId;
	}
	public void setOutContentId(String outContentId) {
		this.outContentId = outContentId;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public Date getPublishTime() {
		return this.publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public String getPublisherId() {
		return this.publisherId;
	}
	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}

	public List<String> getTopicIdList() {
		return this.topicIdList;
	}
	public void setTopicIdList(List<String> topicIdList) {
		this.topicIdList = topicIdList;
	}

	public List<IcommunityContentUrlIndex> getUrlInfoList() {
		return this.urlInfoList;
	}
	public void setUrlInfoList(List<IcommunityContentUrlIndex> urlInfoList) {
		this.urlInfoList = urlInfoList;
	}

}

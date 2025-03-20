package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业主卡消息同步接口
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:33:51
 */
public class AlipayEbppCommunityOwnercardmsgSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5569364676377692386L;

	/**
	 * 产品类型：
OWNER_CARD 电子业主卡
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 城市code
	 */
	@ApiField("city")
	private String city;

	/**
	 * 社区code
	 */
	@ApiField("community")
	private String community;

	/**
	 * 社区底座小区短名
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * 区县code
	 */
	@ApiField("county")
	private String county;

	/**
	 * 过期时间，默认2099-12-31
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/**
	 * 消息id，若不为空则表示更新
	 */
	@ApiField("id")
	private String id;

	/**
	 * 是否置顶1-是，0-否
	 */
	@ApiField("is_top")
	private String isTop;

	/**
	 * 跳转链接
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 外部消息id
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 省code
	 */
	@ApiField("province")
	private String province;

	/**
	 * 发布时间
	 */
	@ApiField("publish_time")
	private String publishTime;

	/**
	 * 发布单位：如机构、街道、社区、业委会、物业
	 */
	@ApiField("publisher")
	private String publisher;

	/**
	 * 服务类型：
NOTICE 通知公告，
VOTE 投票表决，
FUNDING 经营性收支，
QUESTIONNAIRE 问卷调查
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 状态
ONLINE：在线
INVALID：失效
	 */
	@ApiField("status")
	private String status;

	/**
	 * 街道code
	 */
	@ApiField("street")
	private String street;

	/**
	 * 产品子类型：
HANGZHOU_OWNER_CARD
杭州房管局电子业主卡
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 个性化模板json格式：
NORMAL 通用类型
空
VOTE 投票表决
投票率 voteRate  （必填，数据类型：数字）
投票率数据日期 voteDate（ 必填，数据类型：日期，日期格式：yyyy-MM-dd HH:mm:ss）；
投票截止日期 voteEndDate（ 必填，数据类型：日期，日期格式：yyyy-MM-dd HH:mm:ss）

FUNDING 经营性收支
月份 month  (必填，数据类型：数字)
结余 balance (必填，数据类型：数字)
收入 income (必填，数据类型：数字)
支出 expenditure (必填，数据类型：数字)
	 */
	@ApiField("template_content")
	private String templateContent;

	/**
	 * 模板类型：
NORMAL通用类型
VOTE 投票类型
FUNDING 经营性收支类型
	 */
	@ApiField("template_type")
	private String templateType;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCommunity() {
		return this.community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

	public String getCounty() {
		return this.county;
	}
	public void setCounty(String county) {
		this.county = county;
	}

	public Date getExpiredTime() {
		return this.expiredTime;
	}
	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIsTop() {
		return this.isTop;
	}
	public void setIsTop(String isTop) {
		this.isTop = isTop;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getPublishTime() {
		return this.publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getPublisher() {
		return this.publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStreet() {
		return this.street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getTemplateContent() {
		return this.templateContent;
	}
	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}

	public String getTemplateType() {
		return this.templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}

package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公告发布
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:33:36
 */
public class AlipayEbppCommunityNoticePublishModel extends AlipayObject {

	private static final long serialVersionUID = 2628672862237127359L;

	/**
	 * 产品类型： OWNER_CARD 电子业主卡
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 城市code，例如 杭州市 330100000000
	 */
	@ApiField("city")
	private String city;

	/**
	 * 社区code，例如 清波门社区
	 */
	@ApiField("community")
	private String community;

	/**
	 * 区县code，例如 上城区 330102000000
	 */
	@ApiField("county")
	private String county;

	/**
	 * 详情页链接
	 */
	@ApiField("detail_link_url")
	private String detailLinkUrl;

	/**
	 * 过期时间，默认2099-12-31
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/**
	 * 是否置顶1-是，0-否
	 */
	@ApiField("is_top")
	private Long isTop;

	/**
	 * 列表页链接
	 */
	@ApiField("list_link_url")
	private String listLinkUrl;

	/**
	 * 公告类型
公示公告：NOTICE
投票类型：VOTE
问卷调查：QUESTIONNAIRE
	 */
	@ApiField("notice_type")
	private String noticeType;

	/**
	 * 外部小区号
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	/**
	 * 外部公告id
	 */
	@ApiField("out_notice_id")
	private String outNoticeId;

	/**
	 * 省code
	 */
	@ApiField("province")
	private String province;

	/**
	 * 发布单位：如机构、街道、社区、业委会、物业
	 */
	@ApiField("publisher")
	private String publisher;

	/**
	 * 街道code，例如 清波街道 330102001000
	 */
	@ApiField("street")
	private String street;

	/**
	 * 产品子类型： HANGZHOU_OWNER_CARD 杭州房管局电子业主卡
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 子公告类型
	 */
	@ApiField("sub_notice_type")
	private String subNoticeType;

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

	public String getCounty() {
		return this.county;
	}
	public void setCounty(String county) {
		this.county = county;
	}

	public String getDetailLinkUrl() {
		return this.detailLinkUrl;
	}
	public void setDetailLinkUrl(String detailLinkUrl) {
		this.detailLinkUrl = detailLinkUrl;
	}

	public Date getExpiredTime() {
		return this.expiredTime;
	}
	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public Long getIsTop() {
		return this.isTop;
	}
	public void setIsTop(Long isTop) {
		this.isTop = isTop;
	}

	public String getListLinkUrl() {
		return this.listLinkUrl;
	}
	public void setListLinkUrl(String listLinkUrl) {
		this.listLinkUrl = listLinkUrl;
	}

	public String getNoticeType() {
		return this.noticeType;
	}
	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}

	public String getOutCommunityId() {
		return this.outCommunityId;
	}
	public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
	}

	public String getOutNoticeId() {
		return this.outNoticeId;
	}
	public void setOutNoticeId(String outNoticeId) {
		this.outNoticeId = outNoticeId;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getPublisher() {
		return this.publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
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

	public String getSubNoticeType() {
		return this.subNoticeType;
	}
	public void setSubNoticeType(String subNoticeType) {
		this.subNoticeType = subNoticeType;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}

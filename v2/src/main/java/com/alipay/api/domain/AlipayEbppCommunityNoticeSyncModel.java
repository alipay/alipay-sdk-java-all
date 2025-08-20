package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区通知公告同步
 *
 * @author auto create
 * @since 1.0, 2023-04-23 14:30:28
 */
public class AlipayEbppCommunityNoticeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6323127762585511342L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 市，6位code
	 */
	@ApiField("city")
	private String city;

	/**
	 * 社区code
	 */
	@ApiField("community")
	private String community;

	/**
	 * 支付宝小区编码，由支付宝分配
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * 区县，6位code
	 */
	@ApiField("county")
	private String county;

	/**
	 * 详情链接
	 */
	@ApiField("detail_link_url")
	private String detailLinkUrl;

	/**
	 * 过期时间
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/**
	 * 是否置顶
	 */
	@ApiField("is_top")
	private Boolean isTop;

	/**
	 * 通知公告类型-
NOTICE　小区公告
PRIVATE_NOTICE　用户通用通知
JIAOFEI_NOTICE 缴费通知
INVOICE_NOTICE 开票通知
REMIND_NOTICE 催缴通知
VOTE 投票表决
FUNDING 经营性收支
QUESTIONNAIRE 问卷调查
	 */
	@ApiField("notice_type")
	private String noticeType;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 外部小区id
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	/**
	 * 省，6位code
	 */
	@ApiField("province")
	private String province;

	/**
	 * 发布单位：如机构、街道、社区、业委会、物业
	 */
	@ApiField("publisher")
	private String publisher;

	/**
	 * 起始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 街道code
	 */
	@ApiField("street")
	private String street;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
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

	public Boolean getIsTop() {
		return this.isTop;
	}
	public void setIsTop(Boolean isTop) {
		this.isTop = isTop;
	}

	public String getNoticeType() {
		return this.noticeType;
	}
	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getOutCommunityId() {
		return this.outCommunityId;
	}
	public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
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

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStreet() {
		return this.street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}

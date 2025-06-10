package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 舆情内容
 *
 * @author auto create
 * @since 1.0, 2024-03-05 13:51:36
 */
public class UserFeedbackResult extends AlipayObject {

	private static final long serialVersionUID = 1528861393534715289L;

	/**
	 * 与appid对应
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * appid
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 重要级别,目前支持PO/P1/E0/C0/C1
	 */
	@ApiField("biz_level_update")
	private String bizLevelUpdate;

	/**
	 * 客户端反馈
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 用户反馈所在地
	 */
	@ApiField("city")
	private String city;

	/**
	 * 当前反馈支付宝端版本
	 */
	@ApiField("clientproduct_version")
	private String clientproductVersion;

	/**
	 * 反馈意图
	 */
	@ApiField("cls_intention")
	private String clsIntention;

	/**
	 * 用户反馈的内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 用户反馈提交时间
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 用户反馈设备型号
	 */
	@ApiField("device_model")
	private String deviceModel;

	/**
	 * anteye平台打标舆情话题
	 */
	@ApiField("dm_subject")
	private String dmSubject;

	/**
	 * 用户反馈情感正负面
	 */
	@ApiField("emotion")
	private String emotion;

	/**
	 * 舆情处理的状态
	 */
	@ApiField("handle_status")
	private String handleStatus;

	/**
	 * 当前舆情的处理时间
	 */
	@ApiField("handle_time")
	private Date handleTime;

	/**
	 * anteye系统唯一id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 工号
	 */
	@ApiField("last_deal_emp_id")
	private String lastDealEmpId;

	/**
	 * 业务id
	 */
	@ApiField("new_category")
	private String newCategory;

	/**
	 * 业务名称
	 */
	@ApiField("new_category_name")
	private String newCategoryName;

	/**
	 * 用户的uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 手机系统
	 */
	@ApiField("os_type")
	private String osType;

	/**
	 * 手机系统版本
	 */
	@ApiField("os_version")
	private String osVersion;

	/**
	 * 图片的地址
	 */
	@ApiField("picture")
	private String picture;

	/**
	 * 反馈来源平台：
安卓系为1  苹果系为2  其他为3
	 */
	@ApiField("platform_id")
	private String platformId;

	/**
	 * replays日志平台id
	 */
	@ApiField("replays_id")
	private String replaysId;

	/**
	 * 舆情连接（anteye）
	 */
	@ApiField("url")
	private String url;

	/**
	 * 用户的uid
	 */
	@ApiField("userid")
	private String userid;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizLevelUpdate() {
		return this.bizLevelUpdate;
	}
	public void setBizLevelUpdate(String bizLevelUpdate) {
		this.bizLevelUpdate = bizLevelUpdate;
	}

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getClientproductVersion() {
		return this.clientproductVersion;
	}
	public void setClientproductVersion(String clientproductVersion) {
		this.clientproductVersion = clientproductVersion;
	}

	public String getClsIntention() {
		return this.clsIntention;
	}
	public void setClsIntention(String clsIntention) {
		this.clsIntention = clsIntention;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public String getDeviceModel() {
		return this.deviceModel;
	}
	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public String getDmSubject() {
		return this.dmSubject;
	}
	public void setDmSubject(String dmSubject) {
		this.dmSubject = dmSubject;
	}

	public String getEmotion() {
		return this.emotion;
	}
	public void setEmotion(String emotion) {
		this.emotion = emotion;
	}

	public String getHandleStatus() {
		return this.handleStatus;
	}
	public void setHandleStatus(String handleStatus) {
		this.handleStatus = handleStatus;
	}

	public Date getHandleTime() {
		return this.handleTime;
	}
	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getLastDealEmpId() {
		return this.lastDealEmpId;
	}
	public void setLastDealEmpId(String lastDealEmpId) {
		this.lastDealEmpId = lastDealEmpId;
	}

	public String getNewCategory() {
		return this.newCategory;
	}
	public void setNewCategory(String newCategory) {
		this.newCategory = newCategory;
	}

	public String getNewCategoryName() {
		return this.newCategoryName;
	}
	public void setNewCategoryName(String newCategoryName) {
		this.newCategoryName = newCategoryName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOsType() {
		return this.osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getOsVersion() {
		return this.osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getPicture() {
		return this.picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getReplaysId() {
		return this.replaysId;
	}
	public void setReplaysId(String replaysId) {
		this.replaysId = replaysId;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserid() {
		return this.userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

}

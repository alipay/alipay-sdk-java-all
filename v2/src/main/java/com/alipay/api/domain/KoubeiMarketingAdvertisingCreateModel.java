package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建广告接口
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:11:18
 */
public class KoubeiMarketingAdvertisingCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5417797457957614811L;

	/**
	 * 用户点击广告后，跳转URL地址，必须为https协议。广告类型为PIC时，需要设置该值。对于类型为URL不生效。
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 广告位标识码，目前开放的广告位是钱包APP/口碑TAB/商家详情页中，传值：SHOPPING_OPEN_BANNER
	 */
	@ApiField("ad_code")
	private String adCode;

	/**
	 * 广告展示规则。该规则用于商家设置对用户是否展示广告的校验条件，目前支持商家店铺规则。按业务要求应用对应规则即可。
	 */
	@ApiField("ad_rules")
	private String adRules;

	/**
	 * 广告内容，目前支持传入图片ID标识。如何获取图片ID参考图片上传接口：alipay.offline.material.image.upload。图片尺寸为1242px＊290px。
	 */
	@ApiField("content")
	private String content;

	/**
	 * 广告类型，目前只支持PIC.
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 投放广告结束时间，使用标准时间格式：yyyy-MM-dd HH:mm:ss，如果不设置，默认投放时间一个月
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 直接传入的是图片，目前该字段可以先忽略
	 */
	@ApiField("height")
	private String height;

	/**
	 * 投放广告开始时间，使用标准时间格式：yyyy-MM-dd HH:mm:ss，如果不设置，默认投放时间一个月
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getAdCode() {
		return this.adCode;
	}
	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}

	public String getAdRules() {
		return this.adRules;
	}
	public void setAdRules(String adRules) {
		this.adRules = adRules;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}

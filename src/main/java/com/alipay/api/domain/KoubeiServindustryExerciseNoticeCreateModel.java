package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文魄创建消息通知
 *
 * @author auto create
 * @since 1.0, 2020-06-18 11:51:41
 */
public class KoubeiServindustryExerciseNoticeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3371626133426131417L;

	/**
	 * 外部通知ID
	 */
	@ApiField("external_notice_id")
	private String externalNoticeId;

	/**
	 * 健身ID
	 */
	@ApiField("fitness_id")
	private String fitnessId;

	/**
	 * 有效期结束时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 有效期开始时间
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 跳转链接
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 跳转链接类型
	 */
	@ApiField("jump_url_type")
	private String jumpUrlType;

	/**
	 * 外部请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 消息子类型
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 通知模板动态参数
	 */
	@ApiField("template_args")
	private NoticeTemplateArgs templateArgs;

	/**
	 * 推送标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 消息类型
	 */
	@ApiField("type")
	private String type;

	public String getExternalNoticeId() {
		return this.externalNoticeId;
	}
	public void setExternalNoticeId(String externalNoticeId) {
		this.externalNoticeId = externalNoticeId;
	}

	public String getFitnessId() {
		return this.fitnessId;
	}
	public void setFitnessId(String fitnessId) {
		this.fitnessId = fitnessId;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getJumpUrlType() {
		return this.jumpUrlType;
	}
	public void setJumpUrlType(String jumpUrlType) {
		this.jumpUrlType = jumpUrlType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

	public NoticeTemplateArgs getTemplateArgs() {
		return this.templateArgs;
	}
	public void setTemplateArgs(NoticeTemplateArgs templateArgs) {
		this.templateArgs = templateArgs;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

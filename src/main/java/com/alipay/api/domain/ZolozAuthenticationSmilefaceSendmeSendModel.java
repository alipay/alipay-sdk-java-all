package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT模板消息服务
 *
 * @author auto create
 * @since 1.0, 2020-04-16 17:06:02
 */
public class ZolozAuthenticationSmilefaceSendmeSendModel extends AlipayObject {

	private static final long serialVersionUID = 2191953996112543581L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 活动ID，用于发送优惠券
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 可通过线下刷脸获取
	 */
	@ApiField("ftoken")
	private String ftoken;

	/**
	 * 推送消息到用户钱包中，并打开该小程序
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 跳转到小程序内的页面
	 */
	@ApiField("path")
	private String path;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFtoken() {
		return this.ftoken;
	}
	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

}

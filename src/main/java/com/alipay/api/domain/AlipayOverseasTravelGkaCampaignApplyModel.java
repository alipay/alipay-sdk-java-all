package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 苹果外部活动参加
 *
 * @author auto create
 * @since 1.0, 2018-12-03 16:00:37
 */
public class AlipayOverseasTravelGkaCampaignApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5861917593984211353L;

	/**
	 * 活动id，获取方式：联系支付宝运营同学获取（适用于支付宝平台活动，由合作伙伴调用触发）
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 客户端ip
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 用户设备信息
	 */
	@ApiField("device_info")
	private String deviceInfo;

	/**
	 * 外部传入的扩展信息，支付宝回调外部平台时会将其回传，方便外部作业务处理
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * rds嵌入页面的js收集的用户行为数据
	 */
	@ApiField("json_ua")
	private String jsonUa;

	/**
	 * 用户参与活动的手机号
	 */
	@ApiField("login_mobile")
	private String loginMobile;

	/**
	 * 支付宝用户uid：支付宝用户唯一标识。user_id、login_mobile两个参数至少有一个非空。使用优先级为 user_id > bind_mobile
	 */
	@ApiField("user_id")
	private String userId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getDeviceInfo() {
		return this.deviceInfo;
	}
	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getJsonUa() {
		return this.jsonUa;
	}
	public void setJsonUa(String jsonUa) {
		this.jsonUa = jsonUa;
	}

	public String getLoginMobile() {
		return this.loginMobile;
	}
	public void setLoginMobile(String loginMobile) {
		this.loginMobile = loginMobile;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请核身链接
 *
 * @author auto create
 * @since 1.0, 2023-07-17 16:05:07
 */
public class AlipayFundFlexiblestaffingAuthenticationApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2871351182285612555L;

	/**
	 * 授权跳转类型
	 */
	@ApiField("apply_link_type")
	private String applyLinkType;

	/**
	 * 核身完成跳转链接
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 如果入参传了back_url，则此参数也需要传入，参数只支持tinyapp、thirdapp、h5 三种格式。不传默认为tinyapp
	 */
	@ApiField("back_url_type")
	private String backUrlType;

	/**
	 * 业务场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 跳转渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 零工卡工牌信息
	 */
	@ApiField("employee_card_no")
	private String employeeCardNo;

	/**
	 * 超时时间，建议在距离接口请求时间2小时到3天之间。
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 商户端的唯一订单号，幂等关键参数。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 进行核身的主体信息
	 */
	@ApiField("principal_info")
	private ParticipantDTO principalInfo;

	/**
	 * 业务产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getApplyLinkType() {
		return this.applyLinkType;
	}
	public void setApplyLinkType(String applyLinkType) {
		this.applyLinkType = applyLinkType;
	}

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getBackUrlType() {
		return this.backUrlType;
	}
	public void setBackUrlType(String backUrlType) {
		this.backUrlType = backUrlType;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getEmployeeCardNo() {
		return this.employeeCardNo;
	}
	public void setEmployeeCardNo(String employeeCardNo) {
		this.employeeCardNo = employeeCardNo;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public ParticipantDTO getPrincipalInfo() {
		return this.principalInfo;
	}
	public void setPrincipalInfo(ParticipantDTO principalInfo) {
		this.principalInfo = principalInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}

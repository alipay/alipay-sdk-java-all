package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩卡营销活动发奖接口
 *
 * @author auto create
 * @since 1.0, 2023-12-07 10:15:51
 */
public class AnttechMorseMarketingRtaSendModel extends AlipayObject {

	private static final long serialVersionUID = 5222221371686527788L;

	/**
	 * 活动id描述具体给用户发奖的活动，预发奖时可以为空
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 身份证加密值，规则由业务确定，login_id_encryption、cert_encryption、mobile_encryption不能同时为空，优先级依次递减
	 */
	@ApiField("cert_encryption")
	private String certEncryption;

	/**
	 * 加密类型，参数值大写，如：SHA256或者SM3
	 */
	@ApiField("encryption_type")
	private String encryptionType;

	/**
	 * 扩展字段，保留扩展配置字段
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 支付宝登录账号，唯一确定发奖的支付宝账号信息，采用登录名用encryption_type加密方式加密获取的值，login_id_encryption、cert_encryption、mobile_encryption不能同时为空，优先级依次递减
	 */
	@ApiField("login_id_encryption")
	private String loginIdEncryption;

	/**
	 * 手机号码加密值，手机号以encryption_type加密方式加密获取的值，login_id_encryption、cert_encryption、mobile_encryption不能同时为空，优先级依次递减
	 */
	@ApiField("mobile_encryption")
	private String mobileEncryption;

	/**
	 * 外部业务号，业务的标识由商户生成，可以设置成订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商务项目ID，由摩斯同学配置并分配给调用方
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 摩斯营销发奖类型，明确本次调用是预发奖或者发奖，发奖环节可以配置验证预发奖验证，二段式降低发奖风险。参数值大写，【PREGRANT：预发奖；GRANT：发奖】
	 */
	@ApiField("send_type")
	private String sendType;

	/**
	 * 用户达标时间，精确到秒
	 */
	@ApiField("user_pass_time")
	private String userPassTime;

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getCertEncryption() {
		return this.certEncryption;
	}
	public void setCertEncryption(String certEncryption) {
		this.certEncryption = certEncryption;
	}

	public String getEncryptionType() {
		return this.encryptionType;
	}
	public void setEncryptionType(String encryptionType) {
		this.encryptionType = encryptionType;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getLoginIdEncryption() {
		return this.loginIdEncryption;
	}
	public void setLoginIdEncryption(String loginIdEncryption) {
		this.loginIdEncryption = loginIdEncryption;
	}

	public String getMobileEncryption() {
		return this.mobileEncryption;
	}
	public void setMobileEncryption(String mobileEncryption) {
		this.mobileEncryption = mobileEncryption;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getSendType() {
		return this.sendType;
	}
	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

	public String getUserPassTime() {
		return this.userPassTime;
	}
	public void setUserPassTime(String userPassTime) {
		this.userPassTime = userPassTime;
	}

}

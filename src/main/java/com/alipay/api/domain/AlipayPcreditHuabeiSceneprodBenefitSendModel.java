package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗金权益发放
 *
 * @author auto create
 * @since 1.0, 2020-12-16 21:35:19
 */
public class AlipayPcreditHuabeiSceneprodBenefitSendModel extends AlipayObject {

	private static final long serialVersionUID = 6299794281637835641L;

	/**
	 * 权益渠道，用于控制投放场景 帮还会场入会 member_huabei 店铺页面入会 member_tmall 帮还会场直播 live_huabei
	 */
	@ApiField("benefit_channel")
	private String benefitChannel;

	/**
	 * 权益ID，创建成功后返回
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 标识权益类型，花呗金：HB_POINT_BENEFIT
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * 业务传递时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 业务场景，后续更多新增请联系相关同学，入淘：HB_POINT_TAOBAO
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 活动实例ID
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 发放描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 创建权益的支付宝商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 请求来源
	 */
	@ApiField("request_from")
	private String requestFrom;

	/**
	 * 安全所需参数，如IP，UMID等
	 */
	@ApiField("security_content")
	private String securityContent;

	/**
	 * 支付宝的用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBenefitChannel() {
		return this.benefitChannel;
	}
	public void setBenefitChannel(String benefitChannel) {
		this.benefitChannel = benefitChannel;
	}

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getBenefitType() {
		return this.benefitType;
	}
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRequestFrom() {
		return this.requestFrom;
	}
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

	public String getSecurityContent() {
		return this.securityContent;
	}
	public void setSecurityContent(String securityContent) {
		this.securityContent = securityContent;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

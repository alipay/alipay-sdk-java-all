package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部权益同步
 *
 * @author auto create
 * @since 1.0, 2025-02-27 10:52:43
 */
public class AlipayOverseasTravelBenefitSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7666311661528851977L;

	/**
	 * 码值信息
	 */
	@ApiField("benefit_code_info")
	private BenefitCodeInfoDTO benefitCodeInfo;

	/**
	 * 权益投放信息，比如投放到哪些区域 \哪些店铺 \哪些品牌
	 */
	@ApiField("benefit_delivery_info")
	private BenefitDeliveryInfoDTO benefitDeliveryInfo;

	/**
	 * 权益展示信息
	 */
	@ApiField("benefit_display_info")
	private BenefitDisplayInfoDTO benefitDisplayInfo;

	/**
	 * 权益Id，统一权益池中权益的主键id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 包含了权益的总体数量，以及每个用户可以领取的次数限制，参考“附录-BenefitSendRuleDTO”信息
	 */
	@ApiField("benefit_send_rule")
	private BenefitSendRuleDTO benefitSendRule;

	/**
	 * EXCHANGE_VOUCHER：兑换券；SECRET_VOUCHER：码券；EXTERNAL_MERCHANT_VOUCHER;外部商家券
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * 权益详细内容，包含权益内容和权益的生效时间
	 */
	@ApiField("benefit_use_rule")
	private BenefitUseRuleDTO benefitUseRule;

	/**
	 * 权益描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 权益领取开始时间，在此时间之后该权益不能被用户领取，ISO8601格式
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商户信息
	 */
	@ApiField("merchant_info")
	private MerchantInfoDTO merchantInfo;

	/**
	 * 权益名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 权益来源，一般指权益提供方
	 */
	@ApiField("source")
	private String source;

	/**
	 * 权益领取开始时间，在此时间之前该权益不能被用户领取，ISO8601格式
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * ONLINE ：上线;PAUSE ：暂停;CLOSE : 关闭;TESTING ： 测试
	 */
	@ApiField("status")
	private String status;

	public BenefitCodeInfoDTO getBenefitCodeInfo() {
		return this.benefitCodeInfo;
	}
	public void setBenefitCodeInfo(BenefitCodeInfoDTO benefitCodeInfo) {
		this.benefitCodeInfo = benefitCodeInfo;
	}

	public BenefitDeliveryInfoDTO getBenefitDeliveryInfo() {
		return this.benefitDeliveryInfo;
	}
	public void setBenefitDeliveryInfo(BenefitDeliveryInfoDTO benefitDeliveryInfo) {
		this.benefitDeliveryInfo = benefitDeliveryInfo;
	}

	public BenefitDisplayInfoDTO getBenefitDisplayInfo() {
		return this.benefitDisplayInfo;
	}
	public void setBenefitDisplayInfo(BenefitDisplayInfoDTO benefitDisplayInfo) {
		this.benefitDisplayInfo = benefitDisplayInfo;
	}

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public BenefitSendRuleDTO getBenefitSendRule() {
		return this.benefitSendRule;
	}
	public void setBenefitSendRule(BenefitSendRuleDTO benefitSendRule) {
		this.benefitSendRule = benefitSendRule;
	}

	public String getBenefitType() {
		return this.benefitType;
	}
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	public BenefitUseRuleDTO getBenefitUseRule() {
		return this.benefitUseRule;
	}
	public void setBenefitUseRule(BenefitUseRuleDTO benefitUseRule) {
		this.benefitUseRule = benefitUseRule;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public MerchantInfoDTO getMerchantInfo() {
		return this.merchantInfo;
	}
	public void setMerchantInfo(MerchantInfoDTO merchantInfo) {
		this.merchantInfo = merchantInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

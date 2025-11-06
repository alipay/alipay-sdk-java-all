package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证信息
 *
 * @author auto create
 * @since 1.0, 2024-11-08 14:49:18
 */
public class CertificateQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 1471438863947176945L;

	/**
	 * 凭证实例的金额信息，在异常场景下可能为空，需要判断是否有值才可进行使用。
	 */
	@ApiField("amount_info")
	private CertificateInstanceAmountInfo amountInfo;

	/**
	 * 当前凭证是否可用，如传入门店id，则会判断当前门店、当前时间是否可使用此凭证；如未传入门店id，仅返回当前时间是否可使用。
	 */
	@ApiField("can_use")
	private String canUse;

	/**
	 * 用户凭证id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 三方码凭证券码。
	 */
	@ApiField("code")
	private String code;

	/**
	 * 商家侧核销对应的交易订单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 商品信息
	 */
	@ApiField("sku_info")
	private CertificateSkuInfo skuInfo;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 次卡详情，商品类型为次卡时该值必填
	 */
	@ApiField("times_card_info")
	private CertificateTimesCardInfo timesCardInfo;

	/**
	 * 核销规则
	 */
	@ApiField("use_rule_info")
	private CertificateUseRuleInfo useRuleInfo;

	/**
	 * 开始生效时间
	 */
	@ApiField("valid_begin_time")
	private Date validBeginTime;

	/**
	 * 过期时间
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	public CertificateInstanceAmountInfo getAmountInfo() {
		return this.amountInfo;
	}
	public void setAmountInfo(CertificateInstanceAmountInfo amountInfo) {
		this.amountInfo = amountInfo;
	}

	public String getCanUse() {
		return this.canUse;
	}
	public void setCanUse(String canUse) {
		this.canUse = canUse;
	}

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public CertificateSkuInfo getSkuInfo() {
		return this.skuInfo;
	}
	public void setSkuInfo(CertificateSkuInfo skuInfo) {
		this.skuInfo = skuInfo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public CertificateTimesCardInfo getTimesCardInfo() {
		return this.timesCardInfo;
	}
	public void setTimesCardInfo(CertificateTimesCardInfo timesCardInfo) {
		this.timesCardInfo = timesCardInfo;
	}

	public CertificateUseRuleInfo getUseRuleInfo() {
		return this.useRuleInfo;
	}
	public void setUseRuleInfo(CertificateUseRuleInfo useRuleInfo) {
		this.useRuleInfo = useRuleInfo;
	}

	public Date getValidBeginTime() {
		return this.validBeginTime;
	}
	public void setValidBeginTime(Date validBeginTime) {
		this.validBeginTime = validBeginTime;
	}

	public Date getValidEndTime() {
		return this.validEndTime;
	}
	public void setValidEndTime(Date validEndTime) {
		this.validEndTime = validEndTime;
	}

}

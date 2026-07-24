package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-15 17:52:54
 */
public class UserAvailableVoucher extends AlipayObject {

	private static final long serialVersionUID = 5688885642387265467L;

	/**
	 * 航司二字码，比如:MU|CA
	 */
	@ApiField("ac_code")
	private String acCode;

	/**
	 * 券生效时间
	 */
	@ApiField("active_time")
	private String activeTime;

	/**
	 * 到达机场三字码，该券的限制使用条件之一，正则匹配
	 */
	@ApiField("arr_airport_code")
	private String arrAirportCode;

	/**
	 * 出发机场三字码，该券的限制使用条件之一，正则匹配
	 */
	@ApiField("dep_airport_code")
	private String depAirportCode;

	/**
	 * 券可使用的航班起飞日期
	 */
	@ApiField("dep_date")
	private String depDate;

	/**
	 * 券失效时间
	 */
	@ApiField("expired_time")
	private String expiredTime;

	/**
	 * 券可使用的航班号,券可使用的限制条件之一，正则匹配
	 */
	@ApiField("flight_no")
	private String flightNo;

	/**
	 * 可使用的商户code，HUOLI、TONGCHNEG、VARI、FLIGGY、CH、TUNIU等等，该券的限制使用条件之一
	 */
	@ApiField("ota_code")
	private String otaCode;

	/**
	 * 券可使用的商户pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 核销规则
	 */
	@ApiField("promo_rules")
	private String promoRules;

	/**
	 * 支付宝机票券模版id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 优惠券金额
	 */
	@ApiField("voucher_amount")
	private String voucherAmount;

	/**
	 * 券描述
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 支付宝机票券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 支付宝机票券类型，比如COMMON通用券, DYNAMIC动态券
	 */
	@ApiField("voucher_source_type")
	private String voucherSourceType;

	public String getAcCode() {
		return this.acCode;
	}
	public void setAcCode(String acCode) {
		this.acCode = acCode;
	}

	public String getActiveTime() {
		return this.activeTime;
	}
	public void setActiveTime(String activeTime) {
		this.activeTime = activeTime;
	}

	public String getArrAirportCode() {
		return this.arrAirportCode;
	}
	public void setArrAirportCode(String arrAirportCode) {
		this.arrAirportCode = arrAirportCode;
	}

	public String getDepAirportCode() {
		return this.depAirportCode;
	}
	public void setDepAirportCode(String depAirportCode) {
		this.depAirportCode = depAirportCode;
	}

	public String getDepDate() {
		return this.depDate;
	}
	public void setDepDate(String depDate) {
		this.depDate = depDate;
	}

	public String getExpiredTime() {
		return this.expiredTime;
	}
	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getFlightNo() {
		return this.flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getOtaCode() {
		return this.otaCode;
	}
	public void setOtaCode(String otaCode) {
		this.otaCode = otaCode;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPromoRules() {
		return this.promoRules;
	}
	public void setPromoRules(String promoRules) {
		this.promoRules = promoRules;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getVoucherAmount() {
		return this.voucherAmount;
	}
	public void setVoucherAmount(String voucherAmount) {
		this.voucherAmount = voucherAmount;
	}

	public String getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherSourceType() {
		return this.voucherSourceType;
	}
	public void setVoucherSourceType(String voucherSourceType) {
		this.voucherSourceType = voucherSourceType;
	}

}

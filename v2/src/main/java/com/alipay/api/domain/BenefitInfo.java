package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝积分会员权益信息
 *
 * @author auto create
 * @since 1.0, 2022-11-09 17:57:44
 */
public class BenefitInfo extends AlipayObject {

	private static final long serialVersionUID = 8863764876427944872L;

	/**
	 * 权益信息id
	 */
	@ApiField("benefit_info_id")
	private String benefitInfoId;

	/**
	 * 权益名称
	 */
	@ApiField("benefit_name")
	private String benefitName;

	/**
	 * 权益中文名称
	 */
	@ApiField("benefit_name_cn")
	private String benefitNameCn;

	/**
	 * 权益类型(会员等级: MemberGrade)
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * 权益发放时间
	 */
	@ApiField("dispatch_dt")
	private Date dispatchDt;

	/**
	 * 权益失效时间
	 */
	@ApiField("end_dt")
	private Date endDt;

	/**
	 * 权益生效时间
	 */
	@ApiField("start_dt")
	private Date startDt;

	/**
	 * 权益当前状态     
* 待生效：WAIT
* 生效：VALID
* 失效：INVALID
	 */
	@ApiField("status")
	private String status;

	public String getBenefitInfoId() {
		return this.benefitInfoId;
	}
	public void setBenefitInfoId(String benefitInfoId) {
		this.benefitInfoId = benefitInfoId;
	}

	public String getBenefitName() {
		return this.benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

	public String getBenefitNameCn() {
		return this.benefitNameCn;
	}
	public void setBenefitNameCn(String benefitNameCn) {
		this.benefitNameCn = benefitNameCn;
	}

	public String getBenefitType() {
		return this.benefitType;
	}
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	public Date getDispatchDt() {
		return this.dispatchDt;
	}
	public void setDispatchDt(Date dispatchDt) {
		this.dispatchDt = dispatchDt;
	}

	public Date getEndDt() {
		return this.endDt;
	}
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public Date getStartDt() {
		return this.startDt;
	}
	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

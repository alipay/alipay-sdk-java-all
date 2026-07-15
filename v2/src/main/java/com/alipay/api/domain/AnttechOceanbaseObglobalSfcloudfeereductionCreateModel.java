package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * saleforce券申请提交
 *
 * @author auto create
 * @since 1.0, 2026-06-15 19:12:55
 */
public class AnttechOceanbaseObglobalSfcloudfeereductionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3452536818577151652L;

	/**
	 * 申请理由
	 */
	@ApiField("apply_reason")
	private String applyReason;

	/**
	 * 申请BD工号
	 */
	@ApiField("bd_work_no")
	private String bdWorkNo;

	/**
	 * 备注
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * null
	 */
	@ApiListField("competitor_list")
	@ApiField("sale_force_competitor_d_t_o")
	private List<SaleForceCompetitorDTO> competitorList;

	/**
	 * 券结束时间
	 */
	@ApiField("coupon_end_time")
	private Date couponEndTime;

	/**
	 * 券名称
	 */
	@ApiField("coupon_name")
	private String couponName;

	/**
	 * 券开始时间
	 */
	@ApiField("coupon_start_time")
	private Date couponStartTime;

	/**
	 * 券有效期（自定义时间/券发至账户时间当日开始）
	 */
	@ApiField("coupon_validity_type")
	private String couponValidityType;

	/**
	 * 商机累计ARR
	 */
	@ApiField("cumulative_arr")
	private String cumulativeArr;

	/**
	 * 面值
	 */
	@ApiField("denomination")
	private String denomination;

	/**
	 * 商机编码
	 */
	@ApiField("leads_code")
	private String leadsCode;

	/**
	 * OB的uid
	 */
	@ApiField("ob_passport_id")
	private String obPassportId;

	/**
	 * null
	 */
	@ApiListField("pain_spot_list")
	@ApiField("string")
	private List<String> painSpotList;

	/**
	 * 减免理由
	 */
	@ApiField("reduction_reason")
	private String reductionReason;

	/**
	 * 站点（国内站/国际站）
	 */
	@ApiField("region")
	private String region;

	/**
	 * salesForce侧唯一幂等键
	 */
	@ApiField("sales_force_id")
	private String salesForceId;

	/**
	 * 三方uid
	 */
	@ApiField("third_party_passport_id")
	private String thirdPartyPassportId;

	/**
	 * 选择券发至账户时间当日开始时天数
	 */
	@ApiField("time_value")
	private Long timeValue;

	public String getApplyReason() {
		return this.applyReason;
	}
	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

	public String getBdWorkNo() {
		return this.bdWorkNo;
	}
	public void setBdWorkNo(String bdWorkNo) {
		this.bdWorkNo = bdWorkNo;
	}

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<SaleForceCompetitorDTO> getCompetitorList() {
		return this.competitorList;
	}
	public void setCompetitorList(List<SaleForceCompetitorDTO> competitorList) {
		this.competitorList = competitorList;
	}

	public Date getCouponEndTime() {
		return this.couponEndTime;
	}
	public void setCouponEndTime(Date couponEndTime) {
		this.couponEndTime = couponEndTime;
	}

	public String getCouponName() {
		return this.couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public Date getCouponStartTime() {
		return this.couponStartTime;
	}
	public void setCouponStartTime(Date couponStartTime) {
		this.couponStartTime = couponStartTime;
	}

	public String getCouponValidityType() {
		return this.couponValidityType;
	}
	public void setCouponValidityType(String couponValidityType) {
		this.couponValidityType = couponValidityType;
	}

	public String getCumulativeArr() {
		return this.cumulativeArr;
	}
	public void setCumulativeArr(String cumulativeArr) {
		this.cumulativeArr = cumulativeArr;
	}

	public String getDenomination() {
		return this.denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public String getLeadsCode() {
		return this.leadsCode;
	}
	public void setLeadsCode(String leadsCode) {
		this.leadsCode = leadsCode;
	}

	public String getObPassportId() {
		return this.obPassportId;
	}
	public void setObPassportId(String obPassportId) {
		this.obPassportId = obPassportId;
	}

	public List<String> getPainSpotList() {
		return this.painSpotList;
	}
	public void setPainSpotList(List<String> painSpotList) {
		this.painSpotList = painSpotList;
	}

	public String getReductionReason() {
		return this.reductionReason;
	}
	public void setReductionReason(String reductionReason) {
		this.reductionReason = reductionReason;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getSalesForceId() {
		return this.salesForceId;
	}
	public void setSalesForceId(String salesForceId) {
		this.salesForceId = salesForceId;
	}

	public String getThirdPartyPassportId() {
		return this.thirdPartyPassportId;
	}
	public void setThirdPartyPassportId(String thirdPartyPassportId) {
		this.thirdPartyPassportId = thirdPartyPassportId;
	}

	public Long getTimeValue() {
		return this.timeValue;
	}
	public void setTimeValue(Long timeValue) {
		this.timeValue = timeValue;
	}

}

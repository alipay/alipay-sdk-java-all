package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 收益分配租赁交易登记
 *
 * @author auto create
 * @since 1.0, 2023-06-28 19:30:21
 */
public class AnttechBlockchainFinanceIncomeLeaseSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8748326954389621931L;

	/**
	 * 租赁交易登记流水号，用于幂等校验
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 收益分配产品码，可联系产品或运营同学获取
	 */
	@ApiField("distribution_pro_no")
	private String distributionProNo;

	/**
	 * 租赁合同文件id，根据租赁合同文件上传后返回fileId提供
	 */
	@ApiField("lease_contract_file_id")
	private String leaseContractFileId;

	/**
	 * 租赁合同编号，请根据实际租赁合同编号提供
	 */
	@ApiField("lease_contract_no")
	private String leaseContractNo;

	/**
	 * 租赁物列表
	 */
	@ApiListField("leaseholds")
	@ApiField("leaseholds")
	private List<Leaseholds> leaseholds;

	/**
	 * 相关方列表，主要提供：出租方、承租方，其中出租方必填
	 */
	@ApiListField("related_parties")
	@ApiField("related_parties")
	private List<RelatedParties> relatedParties;

	/**
	 * 每期租金，单位：元，框架租赁合同可不填
	 */
	@ApiField("rent_per_period_amount")
	private String rentPerPeriodAmount;

	/**
	 * 租金结算周期，结合租金结算周期单位提供完整的租金结算周期信息，请提供整数，不带小数点
	 */
	@ApiField("rent_settlement_period")
	private String rentSettlementPeriod;

	/**
	 * 租金结算周期单位，结合租金结算周期提供完整的租金结算周期信息，按枚举值提供
	 */
	@ApiField("rent_settlement_period_unit")
	private String rentSettlementPeriodUnit;

	/**
	 * 租金结算方式，按枚举值填写
	 */
	@ApiField("rent_settlement_type")
	private String rentSettlementType;

	/**
	 * 租金总额，按实际租赁交易合同租金总额填写，单位：元，框架租赁合同可不填
	 */
	@ApiField("rent_summary_amount")
	private String rentSummaryAmount;

	/**
	 * 交易生效时间，根据实际交易发生时间填写，时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("trade_effect_time")
	private Date tradeEffectTime;

	/**
	 * 交易失效时间，根据实际交易失效时间填写，日期格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("trade_expired_time")
	private Date tradeExpiredTime;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getDistributionProNo() {
		return this.distributionProNo;
	}
	public void setDistributionProNo(String distributionProNo) {
		this.distributionProNo = distributionProNo;
	}

	public String getLeaseContractFileId() {
		return this.leaseContractFileId;
	}
	public void setLeaseContractFileId(String leaseContractFileId) {
		this.leaseContractFileId = leaseContractFileId;
	}

	public String getLeaseContractNo() {
		return this.leaseContractNo;
	}
	public void setLeaseContractNo(String leaseContractNo) {
		this.leaseContractNo = leaseContractNo;
	}

	public List<Leaseholds> getLeaseholds() {
		return this.leaseholds;
	}
	public void setLeaseholds(List<Leaseholds> leaseholds) {
		this.leaseholds = leaseholds;
	}

	public List<RelatedParties> getRelatedParties() {
		return this.relatedParties;
	}
	public void setRelatedParties(List<RelatedParties> relatedParties) {
		this.relatedParties = relatedParties;
	}

	public String getRentPerPeriodAmount() {
		return this.rentPerPeriodAmount;
	}
	public void setRentPerPeriodAmount(String rentPerPeriodAmount) {
		this.rentPerPeriodAmount = rentPerPeriodAmount;
	}

	public String getRentSettlementPeriod() {
		return this.rentSettlementPeriod;
	}
	public void setRentSettlementPeriod(String rentSettlementPeriod) {
		this.rentSettlementPeriod = rentSettlementPeriod;
	}

	public String getRentSettlementPeriodUnit() {
		return this.rentSettlementPeriodUnit;
	}
	public void setRentSettlementPeriodUnit(String rentSettlementPeriodUnit) {
		this.rentSettlementPeriodUnit = rentSettlementPeriodUnit;
	}

	public String getRentSettlementType() {
		return this.rentSettlementType;
	}
	public void setRentSettlementType(String rentSettlementType) {
		this.rentSettlementType = rentSettlementType;
	}

	public String getRentSummaryAmount() {
		return this.rentSummaryAmount;
	}
	public void setRentSummaryAmount(String rentSummaryAmount) {
		this.rentSummaryAmount = rentSummaryAmount;
	}

	public Date getTradeEffectTime() {
		return this.tradeEffectTime;
	}
	public void setTradeEffectTime(Date tradeEffectTime) {
		this.tradeEffectTime = tradeEffectTime;
	}

	public Date getTradeExpiredTime() {
		return this.tradeExpiredTime;
	}
	public void setTradeExpiredTime(Date tradeExpiredTime) {
		this.tradeExpiredTime = tradeExpiredTime;
	}

}

package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 贴息咨询卡券权益模型
 *
 * @author auto create
 * @since 1.0, 2025-12-25 10:19:59
 */
public class VoucherSubsidyModel extends AlipayObject {

	private static final long serialVersionUID = 7135565123332949564L;

	/**
	 * 该张券适用的银行机构，供信用卡分期组装参数时使用
	 */
	@ApiListField("applicable_inst_id_list")
	@ApiField("string")
	private List<String> applicableInstIdList;

	/**
	 * 剩余可使用次数
	 */
	@ApiField("available_count")
	private String availableCount;

	/**
	 * 折后对客费率，小数形式
	 */
	@ApiField("discount_buyer_rate")
	private Long discountBuyerRate;

	/**
	 * 失效日期
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 类免息卡折扣比例
	 */
	@ApiField("fee_discount_ratio")
	private Long feeDiscountRatio;

	/**
	 * 支持的分期产品场景列表
	 */
	@ApiListField("fq_product_scene_list")
	@ApiField("string")
	private List<String> fqProductSceneList;

	/**
	 * 是否积分类型
	 */
	@ApiField("fq_subsidy_point_operation")
	private Boolean fqSubsidyPointOperation;

	/**
	 * 是否国补折扣券
	 */
	@ApiField("government_subsidy_plat_from_discount")
	private Boolean governmentSubsidyPlatFromDiscount;

	/**
	 * 信用卡分期-折扣券对应机构价格方案key
	 */
	@ApiField("inst_price_code")
	private String instPriceCode;

	/**
	 * 分期期数
	 */
	@ApiField("install_num")
	private String installNum;

	/**
	 * 最小核销数
	 */
	@ApiField("min_write_off_num")
	private Long minWriteOffNum;

	/**
	 * 是否在收银台展示无限次描述(折扣券配置选择是的时候才是true，其他场景都是false，具体是否展示由使用方控制)
	 */
	@ApiField("show_desc_cashier")
	private Boolean showDescCashier;

	/**
	 * 使用场景
	 */
	@ApiField("used_scenes")
	private String usedScenes;

	/**
	 * 类免息卡ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 类免息卡名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 类免息卡产品码
	 */
	@ApiField("voucher_product_code")
	private String voucherProductCode;

	public List<String> getApplicableInstIdList() {
		return this.applicableInstIdList;
	}
	public void setApplicableInstIdList(List<String> applicableInstIdList) {
		this.applicableInstIdList = applicableInstIdList;
	}

	public String getAvailableCount() {
		return this.availableCount;
	}
	public void setAvailableCount(String availableCount) {
		this.availableCount = availableCount;
	}

	public Long getDiscountBuyerRate() {
		return this.discountBuyerRate;
	}
	public void setDiscountBuyerRate(Long discountBuyerRate) {
		this.discountBuyerRate = discountBuyerRate;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getFeeDiscountRatio() {
		return this.feeDiscountRatio;
	}
	public void setFeeDiscountRatio(Long feeDiscountRatio) {
		this.feeDiscountRatio = feeDiscountRatio;
	}

	public List<String> getFqProductSceneList() {
		return this.fqProductSceneList;
	}
	public void setFqProductSceneList(List<String> fqProductSceneList) {
		this.fqProductSceneList = fqProductSceneList;
	}

	public Boolean getFqSubsidyPointOperation() {
		return this.fqSubsidyPointOperation;
	}
	public void setFqSubsidyPointOperation(Boolean fqSubsidyPointOperation) {
		this.fqSubsidyPointOperation = fqSubsidyPointOperation;
	}

	public Boolean getGovernmentSubsidyPlatFromDiscount() {
		return this.governmentSubsidyPlatFromDiscount;
	}
	public void setGovernmentSubsidyPlatFromDiscount(Boolean governmentSubsidyPlatFromDiscount) {
		this.governmentSubsidyPlatFromDiscount = governmentSubsidyPlatFromDiscount;
	}

	public String getInstPriceCode() {
		return this.instPriceCode;
	}
	public void setInstPriceCode(String instPriceCode) {
		this.instPriceCode = instPriceCode;
	}

	public String getInstallNum() {
		return this.installNum;
	}
	public void setInstallNum(String installNum) {
		this.installNum = installNum;
	}

	public Long getMinWriteOffNum() {
		return this.minWriteOffNum;
	}
	public void setMinWriteOffNum(Long minWriteOffNum) {
		this.minWriteOffNum = minWriteOffNum;
	}

	public Boolean getShowDescCashier() {
		return this.showDescCashier;
	}
	public void setShowDescCashier(Boolean showDescCashier) {
		this.showDescCashier = showDescCashier;
	}

	public String getUsedScenes() {
		return this.usedScenes;
	}
	public void setUsedScenes(String usedScenes) {
		this.usedScenes = usedScenes;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public String getVoucherProductCode() {
		return this.voucherProductCode;
	}
	public void setVoucherProductCode(String voucherProductCode) {
		this.voucherProductCode = voucherProductCode;
	}

}

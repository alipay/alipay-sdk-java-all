package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改支付方式
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:20:43
 */
public class KoubeiCateringPosPaymodeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7536747424921162842L;

	/**
	 * 是否记账（false:否；true:是）
	 */
	@ApiField("accounting")
	private Boolean accounting;

	/**
	 * 是否启用（false:关闭；true:开启）
	 */
	@ApiField("enabled")
	private Boolean enabled;

	/**
	 * 固定面额
	 */
	@ApiField("fixed_amount")
	private String fixedAmount;

	/**
	 * 是否固定面额（false:否；true:是）
	 */
	@ApiField("fixed_switch")
	private Boolean fixedSwitch;

	/**
	 * 计入实收比例
	 */
	@ApiField("income_ratio")
	private String incomeRatio;

	/**
	 * 修改前的支付方式名称
	 */
	@ApiField("old_pay_name")
	private String oldPayName;

	/**
	 * 支付类型（
CASH:现金;
BANK_CARD:银行卡;
ALIPAY:支付宝;
WX:微信;
HANGING_ACCOUNT:挂账;
FREE_ORDER:免单;
VOUCHER:票券;
TAKEOUT:外卖;
OTHER:其他
）
	 */
	@ApiField("pay_code")
	private String payCode;

	/**
	 * 修改后的支付方式名称
	 */
	@ApiField("pay_name")
	private String payName;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 支付排序
	 */
	@ApiField("sort")
	private Long sort;

	/**
	 * 是否系统（false:否；true:是）
	 */
	@ApiField("system")
	private Boolean system;

	public Boolean getAccounting() {
		return this.accounting;
	}
	public void setAccounting(Boolean accounting) {
		this.accounting = accounting;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getFixedAmount() {
		return this.fixedAmount;
	}
	public void setFixedAmount(String fixedAmount) {
		this.fixedAmount = fixedAmount;
	}

	public Boolean getFixedSwitch() {
		return this.fixedSwitch;
	}
	public void setFixedSwitch(Boolean fixedSwitch) {
		this.fixedSwitch = fixedSwitch;
	}

	public String getIncomeRatio() {
		return this.incomeRatio;
	}
	public void setIncomeRatio(String incomeRatio) {
		this.incomeRatio = incomeRatio;
	}

	public String getOldPayName() {
		return this.oldPayName;
	}
	public void setOldPayName(String oldPayName) {
		this.oldPayName = oldPayName;
	}

	public String getPayCode() {
		return this.payCode;
	}
	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	public String getPayName() {
		return this.payName;
	}
	public void setPayName(String payName) {
		this.payName = payName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

	public Boolean getSystem() {
		return this.system;
	}
	public void setSystem(Boolean system) {
		this.system = system;
	}

}

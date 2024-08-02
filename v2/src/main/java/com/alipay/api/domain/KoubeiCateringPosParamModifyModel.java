package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改门店参数设置
 *
 * @author auto create
 * @since 1.0, 2018-11-21 10:40:34
 */
public class KoubeiCateringPosParamModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7389334376137795662L;

	/**
	 * 账单金额位数
	 */
	@ApiField("carry_rule")
	private String carryRule;

	/**
	 * 就餐模式（ takeMeal：取餐模式（默认）； foodDelivery：送餐模式 ）
	 */
	@ApiField("dining_mode")
	private String diningMode;

	/**
	 * 是否开通饿了么（false：否；true：是）
	 */
	@ApiField("open_ele")
	private Boolean openEle;

	/**
	 * 异常操作原因（false：否；true：是）
	 */
	@ApiField("reason_flag")
	private Boolean reasonFlag;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 是否有桌台（false:否；true:是）
	 */
	@ApiField("table_flag")
	private Boolean tableFlag;

	/**
	 * 金额尾数规则（
yuan：元；
horn：角；
cent：分（默认）
）
	 */
	@ApiField("tail_number_rule")
	private String tailNumberRule;

	/**
	 * 外卖是否自动接单（false：否；true：是）
	 */
	@ApiField("takeout_auto_receipt")
	private Boolean takeoutAutoReceipt;

	public String getCarryRule() {
		return this.carryRule;
	}
	public void setCarryRule(String carryRule) {
		this.carryRule = carryRule;
	}

	public String getDiningMode() {
		return this.diningMode;
	}
	public void setDiningMode(String diningMode) {
		this.diningMode = diningMode;
	}

	public Boolean getOpenEle() {
		return this.openEle;
	}
	public void setOpenEle(Boolean openEle) {
		this.openEle = openEle;
	}

	public Boolean getReasonFlag() {
		return this.reasonFlag;
	}
	public void setReasonFlag(Boolean reasonFlag) {
		this.reasonFlag = reasonFlag;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Boolean getTableFlag() {
		return this.tableFlag;
	}
	public void setTableFlag(Boolean tableFlag) {
		this.tableFlag = tableFlag;
	}

	public String getTailNumberRule() {
		return this.tailNumberRule;
	}
	public void setTailNumberRule(String tailNumberRule) {
		this.tailNumberRule = tailNumberRule;
	}

	public Boolean getTakeoutAutoReceipt() {
		return this.takeoutAutoReceipt;
	}
	public void setTakeoutAutoReceipt(Boolean takeoutAutoReceipt) {
		this.takeoutAutoReceipt = takeoutAutoReceipt;
	}

}

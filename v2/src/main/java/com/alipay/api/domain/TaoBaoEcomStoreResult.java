package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 淘宝场景金融专项数据结果集
 *
 * @author auto create
 * @since 1.0, 2024-12-23 14:28:34
 */
public class TaoBaoEcomStoreResult extends AlipayObject {

	private static final long serialVersionUID = 4859553791758623193L;

	/**
	 * 行政处罚（市监）信息列表
	 */
	@ApiListField("case_info_list")
	@ApiField("pen_case_info")
	private List<PenCaseInfo> caseInfoList;

	/**
	 * 电商店铺信息列表
	 */
	@ApiListField("ecom_shop_info")
	@ApiField("tao_bao_ecom_store_info")
	private List<TaoBaoEcomStoreInfo> ecomShopInfo;

	/**
	 * 失信被执行人信息列表
	 */
	@ApiListField("punish_break_list")
	@ApiField("punish_break_info")
	private List<PunishBreakInfo> punishBreakList;

	/**
	 * 被执行人信息列表
	 */
	@ApiListField("punished_list")
	@ApiField("punished_info")
	private List<PunishedInfo> punishedList;

	/**
	 * 法定代表人信息
	 */
	@ApiListField("ry_pos_fr_list")
	@ApiField("related_performance_info")
	private List<RelatedPerformanceInfo> ryPosFrList;

	public List<PenCaseInfo> getCaseInfoList() {
		return this.caseInfoList;
	}
	public void setCaseInfoList(List<PenCaseInfo> caseInfoList) {
		this.caseInfoList = caseInfoList;
	}

	public List<TaoBaoEcomStoreInfo> getEcomShopInfo() {
		return this.ecomShopInfo;
	}
	public void setEcomShopInfo(List<TaoBaoEcomStoreInfo> ecomShopInfo) {
		this.ecomShopInfo = ecomShopInfo;
	}

	public List<PunishBreakInfo> getPunishBreakList() {
		return this.punishBreakList;
	}
	public void setPunishBreakList(List<PunishBreakInfo> punishBreakList) {
		this.punishBreakList = punishBreakList;
	}

	public List<PunishedInfo> getPunishedList() {
		return this.punishedList;
	}
	public void setPunishedList(List<PunishedInfo> punishedList) {
		this.punishedList = punishedList;
	}

	public List<RelatedPerformanceInfo> getRyPosFrList() {
		return this.ryPosFrList;
	}
	public void setRyPosFrList(List<RelatedPerformanceInfo> ryPosFrList) {
		this.ryPosFrList = ryPosFrList;
	}

}

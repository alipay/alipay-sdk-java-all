package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 淘宝场景金融专项数据结果集
 *
 * @author auto create
 * @since 1.0, 2025-02-08 10:59:21
 */
public class TaoBaoEcomStoreResult extends AlipayObject {

	private static final long serialVersionUID = 7532556656327239359L;

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
	 * 法人维度店铺指标数据
	 */
	@ApiField("fr_shop_index_info")
	private FrShopIndexInfo frShopIndexInfo;

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

	public FrShopIndexInfo getFrShopIndexInfo() {
		return this.frShopIndexInfo;
	}
	public void setFrShopIndexInfo(FrShopIndexInfo frShopIndexInfo) {
		this.frShopIndexInfo = frShopIndexInfo;
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

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 加油站开票参数
 *
 * @author auto create
 * @since 1.0, 2026-10-15 22:54:10
 */
public class IndustryInvoiceRefinedOilGasStation extends AlipayObject {

	private static final long serialVersionUID = 8589795639451992532L;

	/**
	 * 加油卡发票号码列表
	 */
	@ApiListField("gas_card_invoice_no_list")
	@ApiField("string")
	private List<String> gasCardInvoiceNoList;

	/**
	 * 开票环节
	 */
	@ApiField("gas_card_invoice_stage")
	private String gasCardInvoiceStage;

	/**
	 * 加油站特定要素明细列表
	 */
	@ApiListField("gas_station_list")
	@ApiField("industry_invoice_gas_station_info")
	private List<IndustryInvoiceGasStationInfo> gasStationList;

	public List<String> getGasCardInvoiceNoList() {
		return this.gasCardInvoiceNoList;
	}
	public void setGasCardInvoiceNoList(List<String> gasCardInvoiceNoList) {
		this.gasCardInvoiceNoList = gasCardInvoiceNoList;
	}

	public String getGasCardInvoiceStage() {
		return this.gasCardInvoiceStage;
	}
	public void setGasCardInvoiceStage(String gasCardInvoiceStage) {
		this.gasCardInvoiceStage = gasCardInvoiceStage;
	}

	public List<IndustryInvoiceGasStationInfo> getGasStationList() {
		return this.gasStationList;
	}
	public void setGasStationList(List<IndustryInvoiceGasStationInfo> gasStationList) {
		this.gasStationList = gasStationList;
	}

}

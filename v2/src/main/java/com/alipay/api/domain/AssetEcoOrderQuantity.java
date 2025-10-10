package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态供应商订单数量明细
 *
 * @author auto create
 * @since 1.0, 2025-08-07 19:31:46
 */
public class AssetEcoOrderQuantity extends AlipayObject {

	private static final long serialVersionUID = 8861295387339194717L;

	/**
	 * 生态供应商编号
	 */
	@ApiField("eco_code")
	private String ecoCode;

	/**
	 * 生态供应商名称
	 */
	@ApiField("eco_name")
	private String ecoName;

	/**
	 * 有效小蓝环订单数量
	 */
	@ApiField("eco_nfc_order_count")
	private String ecoNfcOrderCount;

	/**
	 * 有效订单数量
	 */
	@ApiField("eco_order_count")
	private String ecoOrderCount;

	/**
	 * 售卖模式
	 */
	@ApiField("sales_model")
	private String salesModel;

	/**
	 * 统计日期
	 */
	@ApiField("statistical_date")
	private String statisticalDate;

	public String getEcoCode() {
		return this.ecoCode;
	}
	public void setEcoCode(String ecoCode) {
		this.ecoCode = ecoCode;
	}

	public String getEcoName() {
		return this.ecoName;
	}
	public void setEcoName(String ecoName) {
		this.ecoName = ecoName;
	}

	public String getEcoNfcOrderCount() {
		return this.ecoNfcOrderCount;
	}
	public void setEcoNfcOrderCount(String ecoNfcOrderCount) {
		this.ecoNfcOrderCount = ecoNfcOrderCount;
	}

	public String getEcoOrderCount() {
		return this.ecoOrderCount;
	}
	public void setEcoOrderCount(String ecoOrderCount) {
		this.ecoOrderCount = ecoOrderCount;
	}

	public String getSalesModel() {
		return this.salesModel;
	}
	public void setSalesModel(String salesModel) {
		this.salesModel = salesModel;
	}

	public String getStatisticalDate() {
		return this.statisticalDate;
	}
	public void setStatisticalDate(String statisticalDate) {
		this.statisticalDate = statisticalDate;
	}

}

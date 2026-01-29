package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 维保时间与产品类型数据
 *
 * @author auto create
 * @since 1.0, 2025-10-16 15:51:54
 */
public class LeadsProductTypeDTO extends AlipayObject {

	private static final long serialVersionUID = 5686171981261371464L;

	/**
	 * 维保开始时间
	 */
	@ApiField("activation_start_date_time")
	private Date activationStartDateTime;

	/**
	 * 维保结束时间
	 */
	@ApiField("amortization_end_date_time")
	private Date amortizationEndDateTime;

	/**
	 * 公司名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 主键或唯一ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品名称
	 */
	@ApiField("offline_commodity_description")
	private String offlineCommodityDescription;

	/**
	 * 产品模式
	 */
	@ApiField("product_model")
	private String productModel;

	public Date getActivationStartDateTime() {
		return this.activationStartDateTime;
	}
	public void setActivationStartDateTime(Date activationStartDateTime) {
		this.activationStartDateTime = activationStartDateTime;
	}

	public Date getAmortizationEndDateTime() {
		return this.amortizationEndDateTime;
	}
	public void setAmortizationEndDateTime(Date amortizationEndDateTime) {
		this.amortizationEndDateTime = amortizationEndDateTime;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getOfflineCommodityDescription() {
		return this.offlineCommodityDescription;
	}
	public void setOfflineCommodityDescription(String offlineCommodityDescription) {
		this.offlineCommodityDescription = offlineCommodityDescription;
	}

	public String getProductModel() {
		return this.productModel;
	}
	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

}

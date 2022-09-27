package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销结果类型
 *
 * @author auto create
 * @since 1.0, 2020-08-18 14:29:56
 */
public class MarketResult extends AlipayObject {

	private static final long serialVersionUID = 8786939856251356246L;

	/**
	 * 营销信息列表
	 */
	@ApiListField("price_detail_list")
	@ApiField("price_detail_d_t_o")
	private List<PriceDetailDTO> priceDetailList;

	/**
	 * 用于区分营销场景，例如打车星巴克
	 */
	@ApiField("scene")
	private String scene;

	public List<PriceDetailDTO> getPriceDetailList() {
		return this.priceDetailList;
	}
	public void setPriceDetailList(List<PriceDetailDTO> priceDetailList) {
		this.priceDetailList = priceDetailList;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}

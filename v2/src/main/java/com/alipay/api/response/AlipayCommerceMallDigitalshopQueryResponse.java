package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DigitalShopInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.mall.digitalshop.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-18 19:22:28
 */
public class AlipayCommerceMallDigitalshopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5826642723247737837L;

	/** 
	 * 商圈下数字化门店信息列表
	 */
	@ApiListField("digital_shop_list")
	@ApiField("digital_shop_info")
	private List<DigitalShopInfo> digitalShopList;

	/** 
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	/** 
	 * 商圈名称，eg：上海长宁来福士广场
	 */
	@ApiField("mall_name")
	private String mallName;

	public void setDigitalShopList(List<DigitalShopInfo> digitalShopList) {
		this.digitalShopList = digitalShopList;
	}
	public List<DigitalShopInfo> getDigitalShopList( ) {
		return this.digitalShopList;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getMallId( ) {
		return this.mallId;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getMallName( ) {
		return this.mallName;
	}

}

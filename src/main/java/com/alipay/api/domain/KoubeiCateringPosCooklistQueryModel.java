package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询门店菜谱
 *
 * @author auto create
 * @since 1.0, 2018-11-16 16:51:44
 */
public class KoubeiCateringPosCooklistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4315564327358953573L;

	/**
	 * 菜谱业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取商圈店铺分类
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:14:04
 */
public class KoubeiMarketingDataShopCategoryGetModel extends AlipayObject {

	private static final long serialVersionUID = 7346523182246259265L;

	/**
	 * 该参数标识需要返回几个分类，多余的分类将会放于other字段中，最大值传入50，默认值10
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 商圈ID
	 */
	@ApiField("mall_id")
	private String mallId;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 库存量单位描述对象
 *
 * @author auto create
 * @since 1.0, 2017-03-17 17:48:10
 */
public class SkuDescInfo extends AlipayObject {

	private static final long serialVersionUID = 2389537696133151274L;

	/**
	 * 城市行政代码，用于不同城市定价时使用，默认价格使用-1
	 */
	@ApiField("city")
	private String city;

	/**
	 * 第三方商户定义的外部属性值Id,多个id用英文逗号分隔
	 */
	@ApiField("out_pv_id")
	private String outPvId;

	/**
	 * 商户库存量单位id.由外部商户生成,保证同一个商品下的id是唯一，只支持数字、字母和下划线
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getOutPvId() {
		return this.outPvId;
	}
	public void setOutPvId(String outPvId) {
		this.outPvId = outPvId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

}

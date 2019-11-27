package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 库存量单位描述对象
 *
 * @author auto create
 * @since 1.0, 2018-06-26 14:23:36
 */
public class SkuDescInfo extends AlipayObject {

	private static final long serialVersionUID = 4369163525284512136L;

	/**
	 * 城市行政代码，用于不同城市定价时使用，默认价格使用-1
	 */
	@ApiField("city")
	private String city;

	/**
	 * 第三方扩展id，用于区分到位无需感知的属性，比如商圈等信息（消费者下单时需要配合3.3.3反查SKU接口确定具体sku）
	 */
	@ApiField("ext_id")
	private String extId;

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

	/**
	 * 标品属性id，标品是指到位标准化的类目商品， sku的属性已经由到位事先定义好（见附录2）
	 */
	@ApiField("standard_pv_id")
	private String standardPvId;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getExtId() {
		return this.extId;
	}
	public void setExtId(String extId) {
		this.extId = extId;
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

	public String getStandardPvId() {
		return this.standardPvId;
	}
	public void setStandardPvId(String standardPvId) {
		this.standardPvId = standardPvId;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业码业务订单同步订单商品信息
 *
 * @author auto create
 * @since 1.0, 2025-06-05 14:30:55
 */
public class EcOrderGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 8149845894654393797L;

	/**
	 * 商品扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("ec_order_ext_info")
	private List<EcOrderExtInfo> extInfo;

	/**
	 * 订单所包含的商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	public List<EcOrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<EcOrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

}

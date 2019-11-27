package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作的店铺对象信息
 *
 * @author auto create
 * @since 1.0, 2017-10-27 18:16:12
 */
public class OuterShopDO extends AlipayObject {

	private static final long serialVersionUID = 3611167479185358543L;

	/**
	 * ISV系统中与口碑店铺shop_id关联的ISV店铺主键，口碑系统会根据shop_id+outer_id+type保存一条数据，来唯一标示口碑店铺与哪些ISV的店铺建立了关联关系。
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 口碑店铺ID，一般情况商家订购ISV服务插件后，ISV会建立口碑店铺与ISV店铺的关联关系。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 如果已经在上传的无需修改，后续接入直接传入ISV的域名。口碑系统会根据shop_id+outer_id+type保存一条数据，来唯一标示口碑店铺与哪些ISV的店铺建立了关联关系，所以传入各自ISV的域名可以有效的区分掉不同的ISV，一旦设置就不能再次变化。
	 */
	@ApiField("type")
	private String type;

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

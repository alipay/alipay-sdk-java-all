package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序商品详情查询接口
 *
 * @author auto create
 * @since 1.0, 2023-04-17 22:30:15
 */
public class AlipayOpenAppItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5546347476145823328L;

	/**
	 * 支付平台侧商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 是否查询编辑版本，0查询在线版本，1查询编辑版本。默认为0
	 */
	@ApiField("need_edit_spu")
	private Long needEditSpu;

	/**
	 * 商家侧商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Long getNeedEditSpu() {
		return this.needEditSpu;
	}
	public void setNeedEditSpu(Long needEditSpu) {
		this.needEditSpu = needEditSpu;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

}

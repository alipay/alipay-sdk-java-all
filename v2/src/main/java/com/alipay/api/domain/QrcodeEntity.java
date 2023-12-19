package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 桌台二维码关联
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:21:08
 */
public class QrcodeEntity extends AlipayObject {

	private static final long serialVersionUID = 1615229985175883284L;

	/**
	 * 桌台ID
	 */
	@ApiField("desk_id")
	private String deskId;

	/**
	 * 二维码的ID，不传时则为删除（这时候必须有relation_id，删除该relation_id）
	 */
	@ApiField("qrcode_id")
	private String qrcodeId;

	/**
	 * 已经绑定的二维码关系ID  新增不传，修改删除传
	 */
	@ApiField("relation_id")
	private String relationId;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getDeskId() {
		return this.deskId;
	}
	public void setDeskId(String deskId) {
		this.deskId = deskId;
	}

	public String getQrcodeId() {
		return this.qrcodeId;
	}
	public void setQrcodeId(String qrcodeId) {
		this.qrcodeId = qrcodeId;
	}

	public String getRelationId() {
		return this.relationId;
	}
	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}

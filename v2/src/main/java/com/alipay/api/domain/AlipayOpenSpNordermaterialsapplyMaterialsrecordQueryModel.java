package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰点餐物料铺设回传查询
 *
 * @author auto create
 * @since 1.0, 2026-05-29 10:42:47
 */
public class AlipayOpenSpNordermaterialsapplyMaterialsrecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7683948485779435321L;

	/**
	 * 门店业务ID
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 门店业务ID
	 */
	@ApiField("shop_biz_id")
	private String shopBizId;

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getShopBizId() {
		return this.shopBizId;
	}
	public void setShopBizId(String shopBizId) {
		this.shopBizId = shopBizId;
	}

}

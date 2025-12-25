package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业同步的商品自助上新申请表结果
 *
 * @author auto create
 * @since 1.0, 2025-10-27 15:29:59
 */
public class AlipayMsaasMediarecogMmportalPtcnewgoodsapplySyncModel extends AlipayObject {

	private static final long serialVersionUID = 8612799515491648464L;

	/**
	 * 行业同步的商品自助上新申请表入参
	 */
	@ApiListField("list")
	@ApiField("ptc_new_goods_apply_request_vo")
	private List<PtcNewGoodsApplyRequestVo> list;

	public List<PtcNewGoodsApplyRequestVo> getList() {
		return this.list;
	}
	public void setList(List<PtcNewGoodsApplyRequestVo> list) {
		this.list = list;
	}

}

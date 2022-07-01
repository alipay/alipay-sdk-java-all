package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务投放修改
 *
 * @author auto create
 * @since 1.0, 2022-04-21 14:44:48
 */
public class AlipayOpenAppServicePromoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6524785249176965527L;

	/**
	 * 服务场景素材具体内容列表
	 */
	@ApiListField("promo_contents")
	@ApiField("promo_content_biz_v_o")
	private List<PromoContentBizVO> promoContents;

	/**
	 * 服务场景素材记录ID
	 */
	@ApiField("promo_record_id")
	private String promoRecordId;

	public List<PromoContentBizVO> getPromoContents() {
		return this.promoContents;
	}
	public void setPromoContents(List<PromoContentBizVO> promoContents) {
		this.promoContents = promoContents;
	}

	public String getPromoRecordId() {
		return this.promoRecordId;
	}
	public void setPromoRecordId(String promoRecordId) {
		this.promoRecordId = promoRecordId;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务投放申请
 *
 * @author auto create
 * @since 1.0, 2021-10-22 14:22:24
 */
public class AlipayOpenAppServicePromoApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2631579131521252667L;

	/**
	 * 展台ID
	 */
	@ApiField("promo_booth_id")
	private String promoBoothId;

	/**
	 * 具体内容列表
	 */
	@ApiListField("promo_contents")
	@ApiField("promo_content_biz_v_o")
	private List<PromoContentBizVO> promoContents;

	/**
	 * 实体的编码列表
	 */
	@ApiField("promo_entity_codes")
	private String promoEntityCodes;

	/**
	 * 实体类型。枚举值如下： MINI_APP("MINI_APP", "小程序"), STD_SERVICE("STD_SERVICE", "标准化服务"), SERVICE_BACK_CATALOG("SERVICE_BACK_CATALOG", "服务类目")
	 */
	@ApiField("promo_entity_type")
	private String promoEntityType;

	public String getPromoBoothId() {
		return this.promoBoothId;
	}
	public void setPromoBoothId(String promoBoothId) {
		this.promoBoothId = promoBoothId;
	}

	public List<PromoContentBizVO> getPromoContents() {
		return this.promoContents;
	}
	public void setPromoContents(List<PromoContentBizVO> promoContents) {
		this.promoContents = promoContents;
	}

	public String getPromoEntityCodes() {
		return this.promoEntityCodes;
	}
	public void setPromoEntityCodes(String promoEntityCodes) {
		this.promoEntityCodes = promoEntityCodes;
	}

	public String getPromoEntityType() {
		return this.promoEntityType;
	}
	public void setPromoEntityType(String promoEntityType) {
		this.promoEntityType = promoEntityType;
	}

}

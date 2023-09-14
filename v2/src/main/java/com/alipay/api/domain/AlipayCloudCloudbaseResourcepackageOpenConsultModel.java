package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开通资源包询价
 *
 * @author auto create
 * @since 1.0, 2023-09-05 15:36:18
 */
public class AlipayCloudCloudbaseResourcepackageOpenConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4338262589115362323L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 购买时长(月)
	 */
	@ApiField("purchase_month")
	private Long purchaseMonth;

	/**
	 * 资源包规格编码
 - public_cloudd_cd_cn_free_bag
 - public_cloudd_cd_cn_base_bag
 - public_cloudd_cd_cn_standard_bag
 - public_cloudd_cd_cn_pro_bag
 - public_cloudd_cd_cn_ent_bag
 - public_cloudd_cd_cn_flagship_bag
	 */
	@ApiField("spec_code")
	private String specCode;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public Long getPurchaseMonth() {
		return this.purchaseMonth;
	}
	public void setPurchaseMonth(Long purchaseMonth) {
		this.purchaseMonth = purchaseMonth;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

}

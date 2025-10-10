package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景结果，每个场景对应一个对象，对象中值为各场景的特殊结果，如闪购场景下
"sceneResult": {
	"aacProspectFlashSale": {
              "price": "金额，单位：分"
        }
}
 *
 * @author auto create
 * @since 1.0, 2025-09-15 14:42:18
 */
public class SceneResult extends AlipayObject {

	private static final long serialVersionUID = 7747765376783415762L;

	/**
	 * 闪购发奖结果，其中price为其中子字段，代表发奖金额，单位为：分
	 */
	@ApiField("aac_prospect_flash_sale")
	private AACProspectFlashSaleResult aacProspectFlashSale;

	public AACProspectFlashSaleResult getAacProspectFlashSale() {
		return this.aacProspectFlashSale;
	}
	public void setAacProspectFlashSale(AACProspectFlashSaleResult aacProspectFlashSale) {
		this.aacProspectFlashSale = aacProspectFlashSale;
	}

}

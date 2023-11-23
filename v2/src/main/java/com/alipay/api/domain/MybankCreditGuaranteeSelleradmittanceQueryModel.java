package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AE提前收款卖家信息查询
 *
 * @author auto create
 * @since 1.0, 2022-02-15 15:25:08
 */
public class MybankCreditGuaranteeSelleradmittanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5675195874897745769L;

	/**
	 * AE卖家sellerLoginID
	 */
	@ApiField("seller_login_id")
	private String sellerLoginId;

	/**
	 * 会员站点：AE:速卖通，ALIPAY:支付宝，MYBANK:网商银行，TAOBAO：淘宝，B2B_CN：中文站，B2B_EN：国际站
	 */
	@ApiField("site")
	private String site;

	public String getSellerLoginId() {
		return this.sellerLoginId;
	}
	public void setSellerLoginId(String sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

}

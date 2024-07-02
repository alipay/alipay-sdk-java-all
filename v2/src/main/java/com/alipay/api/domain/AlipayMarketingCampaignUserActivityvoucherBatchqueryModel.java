package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户批量查询已领取的商户券
 *
 * @author auto create
 * @since 1.0, 2021-08-04 17:35:04
 */
public class AlipayMarketingCampaignUserActivityvoucherBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4232449361445246738L;

	/**
	 * 场景码：默认(DEFAULT)
	 */
	@ApiListField("scene_code")
	@ApiField("string")
	private List<String> sceneCode;

	/**
	 * 券状态：
可使用(ENABLED)，已核销(即完全使用，USED)，已过期(EXPIRED)
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	public List<String> getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(List<String> sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

}

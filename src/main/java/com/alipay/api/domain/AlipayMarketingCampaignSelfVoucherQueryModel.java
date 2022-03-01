package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝商户券信息查询
 *
 * @author auto create
 * @since 1.0, 2021-07-13 14:20:41
 */
public class AlipayMarketingCampaignSelfVoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7838496739789335597L;

	/**
	 * 场景码：默认(DEFAULT) 
场景码与业务类型强相关，接入时候请务必和支付宝技术对接人确认。需要传入特定业务场景的场景码
	 */
	@ApiListField("scene_code")
	@ApiField("string")
	private List<String> sceneCode;

	/**
	 * 券ID(券唯一标识, 发券接口返回参数)
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public List<String> getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(List<String> sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}

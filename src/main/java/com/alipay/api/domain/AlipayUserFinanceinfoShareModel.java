package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 背景：户帐分离项目可能导致会员基本信息和资金类信息将不再紧耦合，且考虑到与本类似的接口（alipay.user.userinfo.share）已十分臃肿，再加入新的功能将降低接口可用性，因此新增本接口给商户查询支付宝会员资金类信息。第一版将支持信用卡卡号（已脱敏）及发卡行信息查询。
外部商户通过授权，调用该接口获取支付宝域会员资金类相关信息。
 *
 * @author auto create
 * @since 1.0, 2016-03-16 16:54:09
 */
public class AlipayUserFinanceinfoShareModel extends AlipayObject {

	private static final long serialVersionUID = 4369779294387398555L;

	/**
	 * 支付宝会员的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

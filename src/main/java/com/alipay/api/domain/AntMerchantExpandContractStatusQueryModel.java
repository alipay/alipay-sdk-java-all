package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商家在线自助签约状态
 *
 * @author auto create
 * @since 1.0, 2021-08-30 13:36:06
 */
public class AntMerchantExpandContractStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4184354945717243813L;

	/**
	 * 签约类型：商家开放签约枚举类型，固定值：AUTHORIZE_OPEN_PREPAID
	 */
	@ApiField("sign_biz_from")
	private String signBizFrom;

	public String getSignBizFrom() {
		return this.signBizFrom;
	}
	public void setSignBizFrom(String signBizFrom) {
		this.signBizFrom = signBizFrom;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员资产
 *
 * @author auto create
 * @since 1.0, 2018-11-29 17:44:32
 */
public class MemberAssetModel extends AlipayObject {

	private static final long serialVersionUID = 1851436348573541397L;

	/**
	 * 权益类型，目前只支持2种。
BALANCE：金额 
POINT：积分
	 */
	@ApiField("type")
	private String type;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

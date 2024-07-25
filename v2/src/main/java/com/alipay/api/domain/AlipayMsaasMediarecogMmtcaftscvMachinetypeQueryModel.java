package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 视觉货柜机型查询
 *
 * @author auto create
 * @since 1.0, 2022-09-26 11:17:46
 */
public class AlipayMsaasMediarecogMmtcaftscvMachinetypeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1745235316399495234L;

	/**
	 * 类型(0:商品库机型, 1:摆放模板机型)
	 */
	@ApiField("type")
	private Long type;

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}

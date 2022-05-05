package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询生活号用户是否存在快捷绑卡
 *
 * @author auto create
 * @since 1.0, 2021-02-05 14:14:59
 */
public class AlipayOpenPublicUserExpressQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5431223114594569597L;

	/**
	 * 银行机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}

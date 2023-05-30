package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店活动下架
 *
 * @author auto create
 * @since 1.0, 2018-10-25 16:02:34
 */
public class AlipayOpenMiniShopActivityCancelModel extends AlipayObject {

	private static final long serialVersionUID = 7524871123873815386L;

	/**
	 * 业务处理流水号，调用活动创建接口时返回
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

}

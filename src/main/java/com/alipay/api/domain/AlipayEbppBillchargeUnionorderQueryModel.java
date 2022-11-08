package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主订单查询
 *
 * @author auto create
 * @since 1.0, 2022-11-08 09:57:28
 */
public class AlipayEbppBillchargeUnionorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3564157737872777657L;

	/**
	 * 外部订单id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 来源渠道
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

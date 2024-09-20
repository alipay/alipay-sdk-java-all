package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建小程序管理员虚拟 ID
 *
 * @author auto create
 * @since 1.0, 2024-04-03 11:58:36
 */
public class AlipayOpenMiniInneraccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7829925869479253299L;

	/**
	 * 业务类型
	 */
	@ApiField("client_type")
	private String clientType;

	/**
	 * 外部业务主体ID
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	public String getClientType() {
		return this.clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询企业详情
 *
 * @author auto create
 * @since 1.0, 2025-10-23 10:03:16
 */
public class AlipayCommerceEcEnterpriseInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4669889727219362688L;

	/**
	 * 企业id,从企业注册等接口获取，和out_biz_no参数二选一，都传优先取企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 服务商生成的请求唯一流水号/业务幂等号，和enterprise_id参数二选一，都传优先取企业id
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * BC客户群入群状态咨询接口
 *
 * @author auto create
 * @since 1.0, 2022-09-20 19:26:57
 */
public class AlipaySocialBaseBcgroupJoinedConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4813332526313248978L;

	/**
	 * 商家/分组维度的业务标识ID
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * BC客户群租户ID，找产品/技术同学咨询业务所对应的租户ID
	 */
	@ApiField("tenant_id")
	private Long tenantId;

	/**
	 * 支付宝用户的唯一标识，以2088开头的16位数字。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public Long getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

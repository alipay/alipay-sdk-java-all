package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询资金单据流水信息
 *
 * @author auto create
 * @since 1.0, 2026-09-17 10:25:25
 */
public class AlipayDataDataserviceAdBudgetapplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4629389269264635663L;

	/**
	 * 第三方申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 商家标志，用于权限校验
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}

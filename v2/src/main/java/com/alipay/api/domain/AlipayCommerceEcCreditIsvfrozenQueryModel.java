package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授信冻结额度查询
 *
 * @author auto create
 * @since 1.0, 2024-10-16 13:32:42
 */
public class AlipayCommerceEcCreditIsvfrozenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3212836717452671315L;

	/**
	 * 企业统一社会信用代码
	 */
	@ApiField("enterprise_code")
	private String enterpriseCode;

	/**
	 * 企业码内部自动生成企业唯一标识
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 商户冻结单号，银行幂等字段
	 */
	@ApiField("out_freeze_no")
	private String outFreezeNo;

	public String getEnterpriseCode() {
		return this.enterpriseCode;
	}
	public void setEnterpriseCode(String enterpriseCode) {
		this.enterpriseCode = enterpriseCode;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOutFreezeNo() {
		return this.outFreezeNo;
	}
	public void setOutFreezeNo(String outFreezeNo) {
		this.outFreezeNo = outFreezeNo;
	}

}

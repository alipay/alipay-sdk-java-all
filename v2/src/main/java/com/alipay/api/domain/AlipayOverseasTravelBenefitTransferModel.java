package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益状态切换
 *
 * @author auto create
 * @since 1.0, 2022-11-17 18:07:24
 */
public class AlipayOverseasTravelBenefitTransferModel extends AlipayObject {

	private static final long serialVersionUID = 1528978194844578471L;

	/**
	 * 权益同步时传递的统一权益池权益id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 业务幂等号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * ONLINE代表上线
PAUSE代表暂停权益
	 */
	@ApiField("status")
	private String status;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

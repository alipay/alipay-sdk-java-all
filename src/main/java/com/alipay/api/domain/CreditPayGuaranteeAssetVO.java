package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 担保资产视图
 *
 * @author auto create
 * @since 1.0, 2020-10-20 22:04:22
 */
public class CreditPayGuaranteeAssetVO extends AlipayObject {

	private static final long serialVersionUID = 8886945976355834627L;

	/**
	 * 信用支付基础视图
	 */
	@ApiField("base_info")
	private CreditPayAssetBaseVO baseInfo;

	/**
	 * 代偿方案
	 */
	@ApiField("compensate_detail")
	private CreditPayCompensateDetailVO compensateDetail;

	/**
	 * 担保期限
	 */
	@ApiField("guar_term")
	private Long guarTerm;

	/**
	 * 担保期限类型(D-日，M-月，Y-年)
	 */
	@ApiField("guar_term_type")
	private String guarTermType;

	public CreditPayAssetBaseVO getBaseInfo() {
		return this.baseInfo;
	}
	public void setBaseInfo(CreditPayAssetBaseVO baseInfo) {
		this.baseInfo = baseInfo;
	}

	public CreditPayCompensateDetailVO getCompensateDetail() {
		return this.compensateDetail;
	}
	public void setCompensateDetail(CreditPayCompensateDetailVO compensateDetail) {
		this.compensateDetail = compensateDetail;
	}

	public Long getGuarTerm() {
		return this.guarTerm;
	}
	public void setGuarTerm(Long guarTerm) {
		this.guarTerm = guarTerm;
	}

	public String getGuarTermType() {
		return this.guarTermType;
	}
	public void setGuarTermType(String guarTermType) {
		this.guarTermType = guarTermType;
	}

}

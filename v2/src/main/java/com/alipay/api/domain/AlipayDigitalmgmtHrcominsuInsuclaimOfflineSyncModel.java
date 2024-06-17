package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 供应商同步线下理赔数据
 *
 * @author auto create
 * @since 1.0, 2023-07-28 17:46:41
 */
public class AlipayDigitalmgmtHrcominsuInsuclaimOfflineSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7119936187558455431L;

	/**
	 * data_key+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("data_key")
	private String dataKey;

	/**
	 * insurant_birthday+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiListField("insu_claim_vos")
	@ApiField("insu_claim_record_vo")
	private List<InsuClaimRecordVo> insuClaimVos;

	public String getDataKey() {
		return this.dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public List<InsuClaimRecordVo> getInsuClaimVos() {
		return this.insuClaimVos;
	}
	public void setInsuClaimVos(List<InsuClaimRecordVo> insuClaimVos) {
		this.insuClaimVos = insuClaimVos;
	}

}

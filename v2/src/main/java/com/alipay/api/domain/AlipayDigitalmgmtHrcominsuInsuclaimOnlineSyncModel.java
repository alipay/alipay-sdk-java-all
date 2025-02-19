package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步理赔进度
 *
 * @author auto create
 * @since 1.0, 2023-07-28 17:46:32
 */
public class AlipayDigitalmgmtHrcominsuInsuclaimOnlineSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1445712298936733424L;

	/**
	 * data_key+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("data_key")
	private String dataKey;

	/**
	 * insu_claim_vos+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
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

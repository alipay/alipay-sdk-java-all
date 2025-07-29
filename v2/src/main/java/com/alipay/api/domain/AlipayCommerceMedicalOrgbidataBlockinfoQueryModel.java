package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询安诊儿驾驶舱看板机构维度数据统计信息
 *
 * @author auto create
 * @since 1.0, 2025-05-13 19:43:39
 */
public class AlipayCommerceMedicalOrgbidataBlockinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1733683612633257457L;

	/**
	 * 数据聚合的天数，eg:1d，一天
7d,七天
30d,一个月
	 */
	@ApiField("aggr_day")
	private String aggrDay;

	/**
	 * 机构统计聚合数:可选类型如下：
 "org_aggr_statistics",
"org_statistics_detail"
	 */
	@ApiField("block_type")
	private String blockType;

	/**
	 * 查询汇总数据的日期，eg:20250501,2025年5月1日
	 */
	@ApiField("data_dt")
	private String dataDt;

	/**
	 * 机构的统一社会信用码
	 */
	@ApiField("scc")
	private String scc;

	public String getAggrDay() {
		return this.aggrDay;
	}
	public void setAggrDay(String aggrDay) {
		this.aggrDay = aggrDay;
	}

	public String getBlockType() {
		return this.blockType;
	}
	public void setBlockType(String blockType) {
		this.blockType = blockType;
	}

	public String getDataDt() {
		return this.dataDt;
	}
	public void setDataDt(String dataDt) {
		this.dataDt = dataDt;
	}

	public String getScc() {
		return this.scc;
	}
	public void setScc(String scc) {
		this.scc = scc;
	}

}

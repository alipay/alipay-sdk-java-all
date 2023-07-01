package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息母板查询接口
 *
 * @author auto create
 * @since 1.0, 2023-02-27 14:37:15
 */
public class AlipayOpenMiniMessageTemplatelibBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1432384722239953671L;

	/**
	 * 若需要查询带push的消息模板则传true，否则传false
	 */
	@ApiField("has_push")
	private Boolean hasPush;

	/**
	 * 一级行业类目，以XS开头的行业编码。
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 归属于行业类目下的行业场景
	 */
	@ApiField("industry_scenario")
	private String industryScenario;

	/**
	 * 分页查询参数，分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询参数，分页大小，规定最大分页大小为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 可选两种类型，长期性订阅传long_term_subscribe，一次性订阅传one_time_subscribe
	 */
	@ApiField("scene_rule")
	private String sceneRule;

	public Boolean getHasPush() {
		return this.hasPush;
	}
	public void setHasPush(Boolean hasPush) {
		this.hasPush = hasPush;
	}

	public String getIndustryCode() {
		return this.industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getIndustryScenario() {
		return this.industryScenario;
	}
	public void setIndustryScenario(String industryScenario) {
		this.industryScenario = industryScenario;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSceneRule() {
		return this.sceneRule;
	}
	public void setSceneRule(String sceneRule) {
		this.sceneRule = sceneRule;
	}

}

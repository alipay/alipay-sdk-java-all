package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费单位基础信息透出
 *
 * @author auto create
 * @since 1.0, 2022-06-20 17:25:09
 */
public class AlipayEbppEbppInstotherconfigUseModel extends AlipayObject {

	private static final long serialVersionUID = 1834719322382967425L;

	/**
	 * 一级业务，新增的时候必传。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构，新增的时候必传，如果配置销账机构维度此字段设置为(ALL)。
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 销账机构，新增的时候必传。
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/**
	 * 新增的时候必传。
支持类型列表
BILLKEY_FIND_TIPS：查找户号电话信息；PAY_RULE：缴费规则；
INST_COVERAGE_AREA 机构覆盖区域
	 */
	@ApiField("config_type")
	private String configType;

	/**
	 * 配置内容, json格式
	 */
	@ApiField("content")
	private String content;

	/**
	 * 分页查询的时候当前页数，默认第一页
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 主键，修改的时候必传。
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 操作类型  增删改查  （add，delete，update，select）
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 分页查询的时候单页最大个数，默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * PRE/ONLINE
增加的时候必传
	 */
	@ApiField("status")
	private String status;

	/**
	 * 二级业务，新增的时候必传。
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getChargeoffInst() {
		return this.chargeoffInst;
	}
	public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}

	public String getConfigType() {
		return this.configType;
	}
	public void setConfigType(String configType) {
		this.configType = configType;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}

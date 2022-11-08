package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 杂项配置数据对象
 *
 * @author auto create
 * @since 1.0, 2022-06-20 11:41:18
 */
public class OtherConfigVo extends AlipayObject {

	private static final long serialVersionUID = 6127548687861198989L;

	/**
	 * 一级业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 销账机构
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/**
	 * BILLKEY_FIND_TIPS：查找户号电话信息；PAY_RULE：缴费规则； INST_COVERAGE_AREA 机构覆盖区域
	 */
	@ApiField("config_type")
	private String configType;

	/**
	 * 配置内容, json格式
	 */
	@ApiField("content")
	private String content;

	/**
	 * 创建日期
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 主键
	 */
	@ApiField("id")
	private Long id;

	/**
	 * PRE/ONLINE 增加的时候必传
	 */
	@ApiField("status")
	private String status;

	/**
	 * 二级业务类型
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

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
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

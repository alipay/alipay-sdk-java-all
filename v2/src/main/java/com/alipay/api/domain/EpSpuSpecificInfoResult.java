package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业SPU品类专用的信息结果集
 *
 * @author auto create
 * @since 1.0, 2024-10-23 16:27:17
 */
public class EpSpuSpecificInfoResult extends AlipayObject {

	private static final long serialVersionUID = 2582145592756765216L;

	/**
	 * 经营类型
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 企业18位统一社会信用代码
	 */
	@ApiField("credit_code")
	private String creditCode;

	/**
	 * 企业名称
	 */
	@ApiField("ent_name")
	private String entName;

	/**
	 * 登记状态
	 */
	@ApiField("ent_status")
	private String entStatus;

	/**
	 * 企业类型
	 */
	@ApiField("ent_type")
	private String entType;

	/**
	 * 成立日期（yy-MM-dd）
	 */
	@ApiField("es_date")
	private String esDate;

	/**
	 * 法定代表人
	 */
	@ApiField("fr_name")
	private String frName;

	/**
	 * 经营范围
	 */
	@ApiField("oprt_scope")
	private String oprtScope;

	/**
	 * 注册地址
	 */
	@ApiField("reg_addr")
	private String regAddr;

	/**
	 * 注册资本（单位：万元）
	 */
	@ApiField("reg_cap")
	private String regCap;

	/**
	 * 企业15位注册号
	 */
	@ApiField("reg_no")
	private String regNo;

	/**
	 * 登记机关
	 */
	@ApiField("reg_org")
	private String regOrg;

	/**
	 * 企业产品列表
	 */
	@ApiListField("spu_list")
	@ApiField("ep_spu_specific_info")
	private List<EpSpuSpecificInfo> spuList;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getCreditCode() {
		return this.creditCode;
	}
	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

	public String getEntName() {
		return this.entName;
	}
	public void setEntName(String entName) {
		this.entName = entName;
	}

	public String getEntStatus() {
		return this.entStatus;
	}
	public void setEntStatus(String entStatus) {
		this.entStatus = entStatus;
	}

	public String getEntType() {
		return this.entType;
	}
	public void setEntType(String entType) {
		this.entType = entType;
	}

	public String getEsDate() {
		return this.esDate;
	}
	public void setEsDate(String esDate) {
		this.esDate = esDate;
	}

	public String getFrName() {
		return this.frName;
	}
	public void setFrName(String frName) {
		this.frName = frName;
	}

	public String getOprtScope() {
		return this.oprtScope;
	}
	public void setOprtScope(String oprtScope) {
		this.oprtScope = oprtScope;
	}

	public String getRegAddr() {
		return this.regAddr;
	}
	public void setRegAddr(String regAddr) {
		this.regAddr = regAddr;
	}

	public String getRegCap() {
		return this.regCap;
	}
	public void setRegCap(String regCap) {
		this.regCap = regCap;
	}

	public String getRegNo() {
		return this.regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getRegOrg() {
		return this.regOrg;
	}
	public void setRegOrg(String regOrg) {
		this.regOrg = regOrg;
	}

	public List<EpSpuSpecificInfo> getSpuList() {
		return this.spuList;
	}
	public void setSpuList(List<EpSpuSpecificInfo> spuList) {
		this.spuList = spuList;
	}

}
